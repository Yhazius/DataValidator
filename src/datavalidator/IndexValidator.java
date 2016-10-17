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

        System.out.println("==============================");
        System.out.println("DADES PERSONALS:");
        dV.validateName();
        System.out.println("Name: "+dV.getName());
        dV.validateDNI();
        System.out.println("DNI: "+dV.getDNI());
        dV.validateAge();        
        System.out.println("Age: "+dV.getAge());
        dV.validateWeight();
        System.out.println("Weight: "+dV.getStringWeight());
        dV.validateSex();        
        System.out.println("Sex: "+dV.getSex());
        dV.validateMarStatus();        
        System.out.println("Marital Status: "+dV.getMarStatus());
        dV.validateEmail();
        System.out.println("Email: "+dV.getEmail());
    }
}
