head	1.1;
access;
symbols;
locks; strict;
comment	@# @;


1.1
date	2004.08.17.08.34.45;	author lsundar;	state Exp;
branches;
next	;


desc
@@


1.1
log
@Java Source files mainly generated from JavaCC, JavaCC files to be added later
@
text
@
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class MainFrame extends JFrame{
    JTextPane inputArea;
    JTextPane outputArea;
    JTextArea outputText;
    JScrollPane inputPanel;
    JScrollPane outputPanel;
    StyledDocument inputDoc;
    StyledDocument outputDoc;
    JMenuBar optionsMenu;
    JPanel optionsPanel;
    JToolBar optionsToolbar;
    JFileChooser fc;
    Style fontStyle;

    MainFrame()
    {
              super("Visai Neri");
              fc=new JFileChooser();
              fc.setCurrentDirectory(new File("./"));
              addMenu();
              getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
              inputDoc=new DefaultStyledDocument();
              inputArea=new JTextPane(inputDoc);
              inputArea.setFont(new Font("MylaiTSC",Font.PLAIN,16));
              inputPanel=new JScrollPane(inputArea);
              inputPanel.setPreferredSize(new Dimension(250,350));
              inputPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder("Input Text")));
              outputDoc=new DefaultStyledDocument();
              outputArea=new JTextPane(outputDoc);
              fontStyle=outputArea.addStyle("Error",null);
              StyleConstants.setForeground(fontStyle,Color.red);
              StyleConstants.setBold(fontStyle,true);
              fontStyle=outputArea.addStyle("Success",null);
              StyleConstants.setForeground(fontStyle,Color.blue);
              StyleConstants.setBold(fontStyle,true);
              StyleConstants.setItalic(fontStyle,true);
              fontStyle=outputArea.addStyle("Status",null);
              StyleConstants.setForeground(fontStyle,Color.black);
              //outputText=new JTextArea(10,30);
              outputPanel=new JScrollPane(outputArea);
              outputPanel.setPreferredSize(new Dimension(250,30));
              outputPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder("Output")));
              addToolbar();
              getContentPane().add(inputPanel);
              getContentPane().add(outputPanel);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setSize(500,600);
              setVisible(true);
    }

    private void openFile()
    {
         int returnVal=fc.showOpenDialog(getContentPane());
         if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                if(file.exists()){
                    inputArea.setText("");
                    try {
                        FileReader fReader=new FileReader(file);
                        BufferedReader bReader=new BufferedReader(fReader);
                        String text=new String("");
                        String temp;
                        temp = bReader.readLine();
                         while(temp!=null){
                             text+=temp;
                             text+="\n";
                             temp=bReader.readLine();
                         }
                        inputArea.setText(text);
                        bReader.close();
                    }
                    catch(FileNotFoundException e)
                    {

                    }
                    catch(IOException e)
                    {

                    }

                }

         }
    }


    private void saveFile()
    {
               boolean saved=false;
               while(!saved){
               int returnVal = fc.showSaveDialog(getContentPane());
               if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    if(file.exists()){
                        int n = JOptionPane.showConfirmDialog(
                        fc,
                         "Doing this will replace the existing file",
                        "Ensure",
                        JOptionPane.YES_NO_OPTION);
                        if(n==0){
                            try {
                                PrintWriter printer=new PrintWriter(new FileWriter(file));
                                printer.write(inputArea.getText());
                                printer.close();
                                saved=true;
                            } catch (IOException e1) {
                                 e1.printStackTrace();
                              }
                        }
                    }
                    else{
                        try {
                            PrintWriter printer=new PrintWriter(new FileWriter(file));
                            printer.write(inputArea.getText());
                            printer.close();
                            saved=true;
                        } catch (IOException e1) {
                            e1.printStackTrace();
                          }
                    }
              }
              else{
                   saved=true;
               }
    }
    }

    private void addMenu()
    {
              optionsMenu=new JMenuBar();
              JMenu menu;
              JMenuItem menuItem;
              menu =new JMenu("File");
              menuItem=new JMenuItem("Open");
              menuItem.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent evt)
                  {
                      openFile();
                  }
              }
              );
              menu.add(menuItem);
              menuItem=new JMenuItem("Save");
              menuItem.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent evt)
                  {
                      saveFile();
                  }
              }
              );
              menu.add(menuItem);
              menuItem=new JMenuItem("Exit");
              menuItem.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent evt)
                  {
                      System.exit(0);
                  }
              }
              );
              menu.add(menuItem);
              optionsMenu.add(menu);
              menu=new JMenu("Actions");
              menuItem=new JMenuItem("Parse");
              menuItem.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent evt)
                  {
                    parseVenpa();
                  }
              });
              menu.add(menuItem);
              menuItem=new JMenuItem("Clear");
              menuItem.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent evt)
                  {
                    clearText();
                  }
              });
              menu.add(menuItem);
              optionsMenu.add(menu);
              setJMenuBar(optionsMenu);
    }

    private void addToolbar()
    {
              optionsToolbar=new JToolBar();
              optionsToolbar.setFloatable(false);
              optionsToolbar.setLayout(new BoxLayout(optionsToolbar,BoxLayout.X_AXIS));
              JButton button;
              button=new JButton("LOAD");
              button.addActionListener(new ActionListener()
              {
                public void actionPerformed(ActionEvent evt)
                {
                    openFile();
                }
              });
              optionsToolbar.add(button);
              button=new JButton("SAVE");
              button.addActionListener(new ActionListener()
              {
                public void actionPerformed(ActionEvent evt)
                {
                    saveFile();
                }
              });
              optionsToolbar.add(button);
              button=new JButton("PARSE");
              button.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent evt)
                  {
                        parseVenpa();
                  }
              });
              optionsToolbar.add(button);
              button=new JButton("CLEAR");
              button.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent evt)
                  {
                       clearText();
                  }
              });
              optionsToolbar.add(button);
              optionsToolbar.add(Box.createHorizontalGlue());
              getContentPane().add(optionsToolbar);
    }

    private void parseVenpa()
    {
        PrintWriter printer=null;
        outputArea.setText("");


        try {
                printer = new PrintWriter(new FileWriter("Venpa.bare"));
                printer.write(inputArea.getText());
                printer.close();
            } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            TsciiParser.entryPoint("Venpa.bare",outputDoc);
            ParserThalai.entryPoint("output.b4",outputArea);
            FiniteStateMachine fsm = new FiniteStateMachine(outputArea);
			try 
			{
				StyledDocument outputDoc= (StyledDocument) outputArea.getDocument();
				outputDoc.insertString(outputDoc.getLength(),"Given verse(s) satisfies the CFG for Venpa. For more Information regarding CFG for Venpa refer:\n Context Free Grammar for Natural Language Constructs - An implementation for Venpa Class of Tamil Poetry(URL:http://www.infitt.org/ti2003/papers/19_raman.pdf)",outputDoc.getStyle("Success"));
			} 
			catch (BadLocationException e) 
			{
				e.printStackTrace();
			}

        } catch (Exception pe)
        {
			try 
			{
				StyledDocument outputDoc= (StyledDocument) outputArea.getDocument();
				outputDoc.insertString(outputDoc.getLength(),"Given verse(s) do(es) not satisfy the CFG for Venpa.\n",outputDoc.getStyle("Error"));
				outputDoc.insertString(outputDoc.getLength(),"For more Information regarding CFG for Venpa refer:\n Context Free Grammar for Natural Language Constructs - An implementation for Venpa Class of Tamil Poetry(URL:http://www.infitt.org/ti2003/papers/19_raman.pdf)",outputDoc.getStyle("Success"));
			} 
			catch (BadLocationException e) 
			{
				e.printStackTrace();
			}
        }




    }

    private void clearText()
    {
        inputArea.setText("");
		outputArea.setText("");
    }

    public static void main(String args[])
    {
        JDialog.setDefaultLookAndFeelDecorated(true);
        setDefaultLookAndFeelDecorated(true);
        new MainFrame();
    }


}
@
