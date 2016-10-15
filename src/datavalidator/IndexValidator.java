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
        double weight;
        String sex;
        String marStatus;
        String email;
        
        System.out.println("USER INFO");
        System.out.print("Enter name and at least one surname: ");
        name=scr.nextLine();
        System.out.print("Enter your DNI: ");
        DNI=scr.next();
        System.out.print("Enter your age: ");
        year=scr.nextInt();
        System.out.print("Enter your weight: ");
        weight=scr.nextFloat();
        System.out.print("Enter your sex (Home/Dona): ");
        sex=scr.next();
        System.out.print("Enter your marital status (Casat/Solter/Altre): ");
        marStatus=scr.next();
        System.out.print("Enter your email: ");
        email=scr.next();
        
        DataValidator dV = new DataValidator(name, DNI, year, weight, sex, marStatus, email);
        
        dV.validateName();
        dV.validateDNI();
        dV.validateAge();
        dV.validateWeight();
        
        System.out.println(dV.getName());        
        System.out.println(dV.getDNI());        
        System.out.println(dV.getAge());      
        System.out.println(dV.getStringWeight());
        
        
        
    }
}
