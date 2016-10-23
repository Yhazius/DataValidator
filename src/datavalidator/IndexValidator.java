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
        String age;
        String weight;
        String sex;
        String marStatus;
        String email;
        
        DataValidator dV = new DataValidator();
        
        System.out.println("USER INFO");
        System.out.print("Enter name and at least one surname: ");
        dV.setName(scr.nextLine());
        name=dV.validateName();
        
        System.out.print("Enter your DNI: ");
        dV.setDNI(scr.next());
        DNI=dV.validateDNI();
        
        System.out.print("Enter your age: ");
        dV.setYear(scr.nextInt());
        age=dV.validateAge(); 
        
        System.out.print("Enter your weight: ");
        dV.setWeigth(scr.nextFloat());
        weight=dV.validateWeight();
        
        System.out.print("Enter your sex (Home/Dona): ");
        dV.setSex(scr.next());
        sex=dV.validateSex();
        
        System.out.print("Enter your marital status (Casat/Solter/Altre): ");
        dV.setMarStatus(scr.next());
        marStatus=dV.validateMarStatus(); 
        
        System.out.print("Enter your email: ");
        dV.setEmail(scr.next());
        email=dV.validateEmail();
        
        

        System.out.println("==============================");
        System.out.println("DADES PERSONALS:");
        System.out.println("Name: "+name);
        System.out.println("DNI: "+DNI);       
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);       
        System.out.println("Sex: "+sex);           
        System.out.println("Marital Status: "+marStatus);        
        System.out.println("Email: "+email);
    }
}
