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
@/* Generated By:JavaCC: Do not edit this line. Kural.java */
public class Kural implements KuralConstants {
        private static int count = 0;

        public static void main(String[] args) throws ParseException {
        try {
                        Kural parser = null;
                        if (args.length == 0) {
                                parser = new Kural(System.in);
                        }
                        else {
                                System.out.println("Reading from file: "+args[0]);
                                parser = new Kural(new java.io.FileInputStream(args[0]));
                        }
                        parser.Input();
                }
                catch (ParseException pe) {
                        System.out.println(count+" kurals parsed successfully");
                        System.out.println("Error in kural number "+(count+1));
                        pe.printStackTrace();
                }
                catch (Exception e) {
                        e.printStackTrace();
                }
        }

  static final public void Input() throws ParseException {
    Venpa();
                System.out.println("Success");
    jj_consume_token(0);
  }

  static final public void Venpa() throws ParseException {
    label_1:
    while (true) {
      if (jj_2_1(2147483647)) {
        ;
      } else {
        break label_1;
      }
      Kural();
                        System.out.println("Kural Success"+ ++count);
    }
  }

  static final public void Kural() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SPACE:
      jj_consume_token(SPACE);
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    Adi();
    jj_consume_token(NEWLINE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SPACE:
      jj_consume_token(SPACE);
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    Eetradi();
    jj_consume_token(NEWLINE);
                System.out.println("Venpa");
  }

  static final public void Adi() throws ParseException {
    Seer();
    jj_consume_token(SPACE);
    Seer();
    jj_consume_token(SPACE);
    Seer();
    jj_consume_token(SPACE);
    Seer();
  }

  static final public void Eetradi() throws ParseException {
    Seer();
    jj_consume_token(SPACE);
    Seer();
    jj_consume_token(SPACE);
    Eetruseer();
                System.out.println("Eetradi Successful");
  }

  static final public void Seer() throws ParseException {
    if (jj_2_2(2147483647)) {
      Moovasai();
                System.out.println("Seer");
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KURIL:
      case NEDIL:
        Eerasai();
                System.out.println("Seer");
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void Eetruseer() throws ParseException {
    if (jj_2_3(2147483647)) {
      Pirappu();
    } else if (jj_2_4(2147483647)) {
      Malar();
    } else if (jj_2_5(2147483647)) {
      Kaasu();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KURIL:
      case NEDIL:
        Naal();
                System.out.println("Eetuseer");
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void Eerasai() throws ParseException {
    if (jj_2_6(2147483647)) {
      Karuvilam();
    } else if (jj_2_7(2147483647)) {
      Pulima();
    } else if (jj_2_8(2147483647)) {
      Koovilam();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KURIL:
      case NEDIL:
        Thaema();
                System.out.println("EErasai");
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void Moovasai() throws ParseException {
    if (jj_2_9(2147483647)) {
      Karuvilangai();
    } else if (jj_2_10(2147483647)) {
      Pulimangai();
    } else if (jj_2_11(2147483647)) {
      Koovilangai();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KURIL:
      case NEDIL:
        Thaemangai();
                System.out.println("Moovasai");
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void Thaema() throws ParseException {
    Ner();
    Ner();
                System.out.println("Thaema");
  }

  static final public void Pulima() throws ParseException {
    Nirai();
    Ner();
                System.out.println("Pulima");
  }

  static final public void Karuvilam() throws ParseException {
    Nirai();
    Nirai();
                System.out.println("Karuvilam");
  }

  static final public void Koovilam() throws ParseException {
    Ner();
    Nirai();
                System.out.println("Koovilam");
  }

  static final public void Thaemangai() throws ParseException {
    Thaema();
    Ner();
                System.out.println("Theamangai");
  }

  static final public void Pulimangai() throws ParseException {
    Pulima();
    Ner();
                System.out.println("Pulimangai");
  }

  static final public void Karuvilangai() throws ParseException {
    Karuvilam();
    Ner();
                System.out.println("Karuvilangai");
  }

  static final public void Koovilangai() throws ParseException {
    Koovilam();
    Ner();
                System.out.println("Koovilangai");
  }

  static final public void Naal() throws ParseException {
    Ner();
                System.out.println("Naal");
  }

  static final public void Malar() throws ParseException {
    Nirai();
                System.out.println("Malar");
  }

  static final public void Kaasu() throws ParseException {
    Ner();
    Ner();
                System.out.println("Kaasu");
  }

  static final public void Pirappu() throws ParseException {
    Nirai();
    Ner();
                System.out.println("Pirappu");
  }

  static final public void Ner() throws ParseException {
        Token t = null;
        String val = new String();
    if (jj_2_12(2)) {
      t = jj_consume_token(KURIL);
                val +=  t.image;
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OTRU:
        t = jj_consume_token(OTRU);
                        val += t.image;
        break;
      default:
        jj_la1[6] = jj_gen;
        ;
      }
                System.out.println("Ner. Val="+val);
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NEDIL:
        t = jj_consume_token(NEDIL);
                val += t.image;
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OTRU:
          t = jj_consume_token(OTRU);
                        val += t.image;
          break;
        default:
          jj_la1[7] = jj_gen;
          ;
        }
                System.out.println("Ner. Val = "+val);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void Nirai() throws ParseException {
    if (jj_2_13(3)) {
      jj_consume_token(KURIL);
      jj_consume_token(KURIL);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OTRU:
        jj_consume_token(OTRU);
        break;
      default:
        jj_la1[9] = jj_gen;
        ;
      }
                System.out.println("Nirai");
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KURIL:
        jj_consume_token(KURIL);
        jj_consume_token(NEDIL);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OTRU:
          jj_consume_token(OTRU);
          break;
        default:
          jj_la1[10] = jj_gen;
          ;
        }
                System.out.println("Nirai");
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_1();
    jj_save(0, xla);
    return retval;
  }

  static final private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_2();
    jj_save(1, xla);
    return retval;
  }

  static final private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_3();
    jj_save(2, xla);
    return retval;
  }

  static final private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_4();
    jj_save(3, xla);
    return retval;
  }

  static final private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_5();
    jj_save(4, xla);
    return retval;
  }

  static final private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_6();
    jj_save(5, xla);
    return retval;
  }

  static final private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_7();
    jj_save(6, xla);
    return retval;
  }

  static final private boolean jj_2_8(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_8();
    jj_save(7, xla);
    return retval;
  }

  static final private boolean jj_2_9(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_9();
    jj_save(8, xla);
    return retval;
  }

  static final private boolean jj_2_10(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_10();
    jj_save(9, xla);
    return retval;
  }

  static final private boolean jj_2_11(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_11();
    jj_save(10, xla);
    return retval;
  }

  static final private boolean jj_2_12(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_12();
    jj_save(11, xla);
    return retval;
  }

  static final private boolean jj_2_13(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_13();
    jj_save(12, xla);
    return retval;
  }

  static final private boolean jj_3_1() {
    if (jj_3R_2()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_16() {
    if (jj_3R_25()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(SPACE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_25()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(SPACE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_25()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(SPACE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_25()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_9() {
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_23()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_15() {
    if (jj_scan_token(SPACE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_2() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_15()) jj_scanpos = xsp;
    else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_16()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(NEWLINE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    xsp = jj_scanpos;
    if (jj_3R_17()) jj_scanpos = xsp;
    else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_18()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(NEWLINE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_28() {
    if (jj_scan_token(KURIL)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(NEDIL)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_37()) jj_scanpos = xsp;
    else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_7() {
    if (jj_3R_23()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_23()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_13() {
    if (jj_scan_token(KURIL)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(KURIL)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_14()) jj_scanpos = xsp;
    else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_23() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_13()) {
    jj_scanpos = xsp;
    if (jj_3R_28()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_38() {
    if (jj_scan_token(OTRU)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_8() {
    if (jj_3R_23()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_13() {
    if (jj_scan_token(OTRU)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_11() {
    if (jj_3R_12()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_10() {
    if (jj_3R_11()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_36() {
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_29() {
    if (jj_scan_token(NEDIL)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_38()) jj_scanpos = xsp;
    else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_9() {
    if (jj_3R_10()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_22() {
    if (jj_3R_27()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_24() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_12()) {
    jj_scanpos = xsp;
    if (jj_3R_29()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_21() {
    if (jj_3R_12()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_12() {
    if (jj_scan_token(KURIL)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_13()) jj_scanpos = xsp;
    else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_20() {
    if (jj_3R_11()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_3() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_19()) {
    jj_scanpos = xsp;
    if (jj_3R_20()) {
    jj_scanpos = xsp;
    if (jj_3R_21()) {
    jj_scanpos = xsp;
    if (jj_3R_22()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_19() {
    if (jj_3R_10()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_8() {
    if (jj_3R_9()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_7() {
    if (jj_3R_8()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_6() {
    if (jj_3R_7()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_4() {
    if (jj_3R_23()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_44() {
    if (jj_3R_36()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_6() {
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_43() {
    if (jj_3R_9()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_42() {
    if (jj_3R_8()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_41() {
    if (jj_3R_7()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_39() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_41()) {
    jj_scanpos = xsp;
    if (jj_3R_42()) {
    jj_scanpos = xsp;
    if (jj_3R_43()) {
    jj_scanpos = xsp;
    if (jj_3R_44()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_5() {
    if (jj_3R_6()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_4() {
    if (jj_3R_5()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_5() {
    if (jj_3R_23()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_3() {
    if (jj_3R_4()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_40() {
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_35() {
    if (jj_3R_40()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_34() {
    if (jj_3R_6()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_33() {
    if (jj_3R_5()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_32() {
    if (jj_3R_4()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_26() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_32()) {
    jj_scanpos = xsp;
    if (jj_3R_33()) {
    jj_scanpos = xsp;
    if (jj_3R_34()) {
    jj_scanpos = xsp;
    if (jj_3R_35()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_12() {
    if (jj_3R_9()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3_2() {
    if (jj_3R_3()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_17() {
    if (jj_scan_token(SPACE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_10() {
    if (jj_3R_7()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_31() {
    if (jj_3R_39()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_30() {
    if (jj_3R_3()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_25() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_30()) {
    jj_scanpos = xsp;
    if (jj_3R_31()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_11() {
    if (jj_3R_8()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_37() {
    if (jj_scan_token(OTRU)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_14() {
    if (jj_scan_token(OTRU)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_18() {
    if (jj_3R_25()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(SPACE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_25()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_scan_token(SPACE)) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_26()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static final private boolean jj_3R_27() {
    if (jj_3R_36()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    if (jj_3R_24()) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) return false;
    return false;
  }

  static private boolean jj_initialized_once = false;
  static public KuralTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  static public Token token, jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static public boolean lookingAhead = false;
  static private boolean jj_semLA;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static {
      jj_la1_0();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x20,0x20,0xc,0xc,0xc,0xc,0x10,0x10,0x8,0x10,0x10,0x4,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[13];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  public Kural(java.io.InputStream stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new KuralTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static public void ReInit(java.io.InputStream stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public Kural(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new KuralTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public Kural(KuralTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public void ReInit(KuralTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static final private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    return (jj_scanpos.kind != kind);
  }

  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  static final public Token getToken(int index) {
    Token t = lookingAhead ? jj_scanpos : token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.Vector jj_expentries = new java.util.Vector();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Enumeration enum = jj_expentries.elements(); enum.hasMoreElements();) {
        int[] oldentry = (int[])(enum.nextElement());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.addElement(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  static public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[7];
    for (int i = 0; i < 7; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 7; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  static final public void enable_tracing() {
  }

  static final public void disable_tracing() {
  }

  static final private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 13; i++) {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
          }
        }
        p = p.next;
      } while (p != null);
    }
    jj_rescan = false;
  }

  static final private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

                //020 0000 0201 02002 020 00202 00
}
@
