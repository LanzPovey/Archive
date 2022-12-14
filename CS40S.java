/** package class namespace */
package numnumb;

/**
 * Project     : NumNumbe
 * Description : A program
 * Author      : Lanz Povey
 * Date        : Mar 19th 2018 (updated)
 * Instructor  : Mr. Wachs
 */
    
public class numNumb 
{
    final static String LINE_BREAK    = "\n";
    final static String LINE_BREAK_X2 = "\n\n";
    final static String SPACER    = "      ";
    final static String SPACER_X2 = "            ";
    final static String SPACER_X3 = "                  ";
    final static String SPACER_X4 = "                        ";
    final static String LINE_BREAK_S    = "\n      ";
    final static String SPACED_LINE_BREAK_X2 = "\n      \n      ";
    /**
     * The main method of the application
     * @param args command line arguments (don't worry, they aren't used here)
     */
    public static void main(String args[])
    {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l',
                           'm','n','o','p','q','r','s','t','u','v','w','x',
                           'y','z'};
        
        s.outputc();
        s.output("Welcome to a magical world called number land" + SPACER);
        String choose = s.input("Greetings young traveller... " + LINE_BREAK_S
                + "Will you be the unraveller..." + LINE_BREAK_S + SPACER
                + "Grasping the not-so-young mysteries" + LINE_BREAK_S + SPACER_X2
                + "Willowed in life's histories" + LINE_BREAK_S + SPACER_X3);
        s.sout(choose + " starts with the letter " + choose.charAt(0));
        if (choose.charAt(0) == alphabet[0] || choose.charAt(0) == alphabet[1] ||
            choose.charAt(0) == alphabet[2] || choose.charAt(0) == alphabet[4] ||
            choose.charAt(0) == alphabet[5] || choose.charAt(0) == alphabet[5] ||
            choose.charAt(0) == alphabet[6] ) 
        {
            s.sout("Therefore, reAdd() was chosen");
            reAdd(s.tryParse(choose));
        }
        if (choose.charAt(0) == alphabet[7]  || choose.charAt(0) == alphabet[8 ] ||
            choose.charAt(0) == alphabet[9]  || choose.charAt(0) == alphabet[10] ||
            choose.charAt(0) == alphabet[11] || choose.charAt(0) == alphabet[12] ||
            choose.charAt(0) == alphabet[13] )
        {
            s.sout("Therefore, reMinus() was chosen");
            reAdd(s.tryParse(choose));
        }
        
        if (choose.charAt(0) == alphabet[14] || choose.charAt(0) == alphabet[15] ||
            choose.charAt(0) == alphabet[16] || choose.charAt(0) == alphabet[17] ||
            choose.charAt(0) == alphabet[18] || choose.charAt(0) == alphabet[19] ||
            choose.charAt(0) == alphabet[20] ) 
        {
            s.sout("Therefore, reMultiply() was chosen");
            reAdd(s.tryParse(choose));
        }
        
        if (choose.charAt(0) == alphabet[21] || choose.charAt(0) == alphabet[22] ||
            choose.charAt(0) == alphabet[23] || choose.charAt(0) == alphabet[24] ||
            choose.charAt(0) == alphabet[25] ) 
        {
            s.sout("Therefore, reDivide() was chosen");
            reAdd(s.tryParse(choose));
        }
        else // I really don't want to format the whole ASCII list ok?
        {
            s.sout("Therefore, reAdd() was the chosen one");
            reAdd(s.tryParse(choose));
        }
        
//reAdd();
//        if (choose.charAt(0) == "e" || choose.charAt(0) == "f" ||
//            choose.charAt(0) == "g" || choose.charAt(0) == "h" ||
//            choose.charAt(0) == "i" || choose.charAt(0) == "j" );
                        
        String choice = s.input("Here's a question for you..."   + LINE_BREAK_S
              + "What's you're favorite number?" + LINE_BREAK_X2);
        s.output("Jump for joy"      + LINE_BREAK_S
               + "For one day"       + LINE_BREAK_S + SPACER
               + "You will have "    + LINE_BREAK_S + SPACER_X2
               + choice + " apples"  + LINE_BREAK_S );
        s.output("The dentists"      + LINE_BREAK_S + SPACER
               + "They fear you"     + LINE_BREAK_S + SPACER_X2
               + "Here is how many"  + LINE_BREAK_S);
               
        reMinus(s.tryParse(choice));
        
        s.output("Now"     + LINE_BREAK_S + SPACER
               + " time"    + LINE_BREAK_S + SPACER_X2
               + "  for"     + LINE_BREAK_S + SPACER_X3
               + "   the"     + LINE_BREAK_S + SPACER_X4
               + "    orthodentists");
    }

    /**
     * A recursive counter that continually subtracts from a user-specified
     * number until it is under 0.
     * @param i the int that's being counted recursively
     */
    public static void reMinus(int i)
    {
        if (i<1) return;
        reMinus(i-1);
        s.output("Run a rust"   + LINE_BREAK_S
               + "Run a thrust" + LINE_BREAK_S + SPACER
               + "For this dentist " + i + " here"  + LINE_BREAK_S + SPACER_X2
               + "His fear is a must"); 
        System.out.println("Dentist in fear #" + i);
    }
    
    public static void reMultiply(int i)
    {
        if (i<1) return;
        reMultiply(i*(int)0.9);
        s.output("Run a rust"   + LINE_BREAK_S
               + "Run a thrust" + LINE_BREAK_S + SPACER
               + "For this dentist " + i + " here"  + LINE_BREAK_S + SPACER_X2
               + "His fear is a must"); 
        System.out.println("Dentist in fear #" + i);
    }
    
    public static void reAdd(int i)
    {
        if (i<1) return;
        reAdd(i+1);
        s.output("Run a rust"   + LINE_BREAK_S
               + "Run a thrust" + LINE_BREAK_S + SPACER
               + "For this dentist " + i + " here"  + LINE_BREAK_S + SPACER_X2
               + "His fear is a must"); 
        System.out.println("Dentist in fear #" + i);
    }
    
    public static void reDivide(int i)
    {
        if (i<1) return;
        reDivide(i/1);
        s.output("Run a rust"   + LINE_BREAK_S
               + "Run a thrust" + LINE_BREAK_S + SPACER
               + "For this dentist " + i + " here"  + LINE_BREAK_S + SPACER_X2
               + "His fear is a must"); 
        System.out.println("Dentist in fear #" + i);
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        