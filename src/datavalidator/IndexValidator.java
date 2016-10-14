/*
 * This class will be used to inicialize the data and call the functions that will validate them.
 */
package datavalidator;

import java.util.Scanner;

/**
 * @author Joan Fernández & Jonathan Lozano
 * @version 1.0
 */
public class IndexValidator {
    Scanner scr = new Scanner(System.in);
    
    public static void main (String [] args)
    {
        IndexValidator ex = new IndexValidator();
        ex.run();
        
    }
    /** Works like the main and prevents static problems
     * @author Joan Fernández & Jonathan Lozano
     * @version 1.0
     */
    private void run()
    {
        String name;
        String DNI;
        int year;
        int weigth;
        String sex;
        String marStatus;
        String email;
    }
}
