/** Eh. Wachs package namespace */
package testing.advancedclasses;

import cs40s.CS40S;
import cs40s.s;

/**
 * EhWachs.java - a representation of Eh. Wachs himself
 * @author Mr. Wachs
 * @since Mr. Wachs
 * @instructor Mr. Wachs
 */
public class EhWachs extends ComputerScienceTeacher//Eh.Wachs=CompterScienceTeacher
{
    // same constructor as Eh. Wachs
    /**
    * The class constructor for Eh Wachs
    * @param name Eh. Wachs himself's name
    * @param age Eh. Wachs himself's age
    * @param isMale Eh. Wachs himself's gender
    */
    public EhWachs(String name, int age, boolean isMale) // Eh. Wachs parameteres
    {
        super(name, age, isMale);
        // the super class of Eh. Wachs
    }
    
    /**
    * String representation of Eh. Wachs
    * @return the string version of Eh. Wachs
    */
    @Override
    public String toString() // no parameters needed for this Mr. Wachs
    {
        return "Wachs " + super.toString();
        // 