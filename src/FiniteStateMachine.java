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
@import javax.swing.*;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import java.io.*;

public class FiniteStateMachine {
	private final char Thaema = '0';
	private final char Pulima = '1';
	private final char Karuvilam = '2';
	private final char Koovilam = '3';
	
	private final char Thaemangai = '4';
	private final char Pulimangai = '5';
	private final char Karuvilangai = '6';
	private final char Koovilangai = '7';

	private final char Naal = 'N';
	private final char Malar = 'M';
	private final char Kaasu = 'K';
	private final char Pirappu = 'P';

	private final char Kutriyalugaram = 'Z';

	private int state = 0;

	public FiniteStateMachine(JTextPane outputArea) throws Exception{
		int val;
		int kuralNo=0;
        boolean error = false;
        boolean isKutriyalugaram = false;
			InputStreamReader in = new InputStreamReader(new FileInputStream("output2thalai"));

			while ( (val = in.read()) != -1 ) {

				if(val == Kutriyalugaram)
				{
					isKutriyalugaram = true;
				}
				else
				{
					switch (state) {
					case 0:
						switch (val) {
							case Thaema:
							case Pulima:
									state = 1;
									break;

							case Koovilam:
							case Karuvilam:
							case Thaemangai:
							case Pulimangai:
							case Karuvilangai:
							case Koovilangai:
									state = 2;
									break;
							case 10:
									break;
							default:
                                   	StyledDocument doc=(StyledDocument)outputArea.getDocument();
                                    doc.insertString(doc.getLength(),"Error at kural no::"+kuralNo+"\n",doc.getStyle("Error"));
                                    doc.insertString(doc.getLength(),"Expecting Thema|Pulima|Koovilam|Karuvilam|Thaemangai|Pulimangai|Karuvilangai|Koovilangai.\n",doc.getStyle("Error"));
                                    error=true;
                                    throw new Exception("Expecting Thema|Pulima|Koovilam|Karuvilam|Thaemangai|Pulimangai|Karuvilangai|Koovilangai.");

						}
						break;

					case 1:
						switch(val) {
							case Pulima:
									state=1;
									break;

							case Pulimangai:
							case Karuvilam:
							case Karuvilangai:
									state=2;
									break;

							case Malar:
							case Pirappu:
									state=3;
									break;

							default:
									if(isKutriyalugaram)
									{isKutriyalugaram = false;}
									else
									{
										StyledDocument doc=(StyledDocument)outputArea.getDocument();
                                        doc.insertString(doc.getLength(),"Error at kural no::"+kuralNo+"\n",doc.getStyle("Error"));
                                        doc.insertString(doc.getLength(),"Expecting MaaMunNirai.Received MaaMunNer\n",doc.getStyle("Error"));
                                        error=true;
                                        throw new Exception("Expecting MaaMunNirai.Received MaaMunNer");

									}


						 }
						break;

					case 2:
						switch(val){
							case Thaema:
									state=1;
									break;

							case Thaemangai:
							case Koovilam:
							case Koovilangai:
									state=2;
									break;

							case Naal:
						        case Kaasu:
									state=3;
									break;
							default:
									if(isKutriyalugaram)
                                        {isKutriyalugaram = false;}
									else
									{
									    StyledDocument doc=(StyledDocument)outputArea.getDocument();
                                        doc.insertString(doc.getLength(),"Error at kural no::"+(kuralNo-1)+"\n",doc.getStyle("Error"));
                                        doc.insertString(doc.getLength(),"Expecting VilaMunNer or KaiMunNer\n",doc.getStyle("Error"));
                                        error=true;
                          				throw new Exception("Expecting VilaMunNer or KaiMunNer");

									}

							}
						break;



					case 3:
							if(val == 13)
							{
								state = 0;
								kuralNo++;
							}
							else
							{
                                StyledDocument doc=(StyledDocument)outputArea.getDocument();
                                doc.insertString(doc.getLength(),"Error at kural no::"+kuralNo+"\n",doc.getStyle("Error"));
                                doc.insertString(doc.getLength(),"Invalid state\n",doc.getStyle("Error"));
                                error=true;
                           		throw new Exception("Invalid state");

                            }
							break;


				}

				if((char)val == Kutriyalugaram)
				{
					isKutriyalugaram = true;
				}

			}
		}        
	}
}

		
@
