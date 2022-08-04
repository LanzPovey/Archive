//package encrypt;
import javax.swing.JOptionPane;
import java.util.Scanner;

import java.util.NoSuchElementException;
public class Encrypt
{
    // final static APP_TITLE = "Encrypto-matic";
    static char letterStart;
    static char letterEnd;
    static int count;
    //static String txt;
    
    public static void main(String[] args)
    {
        char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l'
                                   + 'm','n','o','p','q','r','s','t','u','v','w','x'
                                   + 'y','z'};
        //JOptionPane.showMessageDialog("Welcome to the " + APP_TITLE + "!");
        //System.out.println("Welcome to the " + APP_TITLE + "!");
        System.out.println("=== Welcome to the " + "Encrypto-matic" + "! ===");
        
        reset();
        regularAlphabet4(alphabet);
        reset();
        reverseAlphabet(alphabet);
        
        reset();;
        //alphabetReminder(alphabet);
        reset();
        System.out.println("-> Reverse Alphabet <-");
        reverseAlphabet4(alphabet);
        
        reset();
		characterMethod();
		reset();
        ASCIIMethod();
        
        reset();
        System.out.println("=== Thank you for using the " + "Encrypto-matic" + "! ===");
    }
    
    /**
     * The intro and ending wrapper prompt for the between(char a, char b) method.
     */ 
    public static void characterMethod()
    {
        System.out.println("-> Character Method <-");
        System.out.println("Choose which letter to start from...");
        letterStart = 'e';
        System.out.println(">Starting letter = "  + letterStart);
        System.out.println("Choose which letter to end from...");
        letterEnd   = 'l';
        System.out.println(">Ending letter   = "  + letterEnd);
        between(letterStart,letterEnd);
        System.out.println("There are " + count   + " letters in between of " 
                         + letterStart  + " and " + letterEnd);
        //Integer.toString(count)

    }
    
    /**
     * The intro and ending wrapper prompt for the betweenASCII(char a, char b) method.
     */ 
    public static void ASCIIMethod()
    {
        System.out.println("-> ASCII Method <-");
        System.out.println("Choose which letter to start from...");
        letterStart = 'e';
        System.out.println(">Starting letter = " + letterStart);
        System.out.println("Choose which letter to end from...");
        letterEnd   = 'l';
        System.out.println(">Ending letter   = " + letterEnd);
        betweenASCII(letterStart,letterEnd);
        System.out.println("There are " + count   + " letters in between of " 
                         + letterStart  + " and " + letterEnd);
        //Integer.toString(count)
    }
    
    /**
     * Displays the characters that are between char a and char b.
     * (Uses count to keep track of how many recursions take place)
     * (A.K.A: The number of characters between char a and char b)
    */
    public static void between(char a, char b)
    {
        count = count + 1; // count++;
        System.out.println(a);
        if (a < b)
        {
            between((char) (a+1), b); // recursive case
            
        }// base case
    }
    
    /**
     * Displays the characters that are between char a and char b
     * (based on their # position on the ASCII table)
     * (Uses count to keep track of how many recursions take place)
     * (A.K.A: The number of characters between char a and char b)
    */
    public static void betweenASCII(char a, char b)
    {
        count = count + 1; // count++;
        if (a==b) System.out.println(b+1);
        else
        {
            System.out.println(a+1);
            betweenASCII((char)(a+1), b);
        }
        // base case
    }
    
    /**
     * Because I don't want to sing the alphabet over and over again
     * in my head while working on this project...
     * Uses a for (4) loop to travel through the array char[] alphabet ()
    */
    public static void regularAlphabet4(char alphabet[])
    {
        System.out.println("-> Regular Alphabet <-");
        for (int i = alphabet.length-1; i <= 0; i++) System.out.print(alphabet[i]);
    }
    
    public static void reverseAlphabet4(char alphabet[])
    {
        System.out.println("-> Reverse Alphabet 4 <-");
        for (int i = alphabet.length-1; i >= 0 ; i--) System.out.print(alphabet[i]);
    }
    
    public static void reverseAlphabet(char alphabet[])
    {
        count = alphabet.length-1;
        count = count - 1;
        for (int i = alphabet.length-1; i >= 0 ; i--) 
        if (count >=0) System.out.print("done" + alphabet[i]);
        else
        {
            reverseAlphabet(alphabet);
            System.out.print(alphabet[i]);
        }
    }
    
    /**
     * A method that resets the recursion count
     * + adds a line break to the System.output.
    */
    public static void reset()
    {
        count = 0;
        System.out.println("");
    }
}