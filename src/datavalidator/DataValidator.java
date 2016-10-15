/*
 * This class will be used to create the functions that validates the data @params
 */
package datavalidator;

/** 
 * @author Joan Fernández & Jonathan Lozano
 * @version 1.0
 * @param 
 */
public class DataValidator {
    private String name;
    private String DNI;
    private int year;
    private String age;
    private double weight;
    private String stringWeight;
    private String sex;
    private String marStatus;
    private String email;

    /**
     * This is the DataValidator constructor with params to validate
     * @param name This is the user name. It has a name and at least one surname
     * @param DNI This is a spanish identity card. It has 8 numbers and a letter
     * @param year User age. This is a integer number
     * @param weight User weight. This is a float number
     * @param sex User sex. We have two options: Home i dona
     * @param marStatus User marital status. We have two options: Solter, casat i altres
     * @param email This is a user email. This has to be email format.
     */
    public DataValidator(String name, String DNI, int year, double weight, String sex, String marStatus, String email) {
        this.name = name;
        this.DNI = DNI;
        this.year = year;
        this.weight = weight;
        this.sex = sex;
        this.marStatus = marStatus;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void setAge(String age) {
        this.age = age;
    }

    public void setWeigth(int weight) {
        this.weight = weight;
    }
    
    public void setStringWeight(String stringWeight) {
        this.stringWeight = stringWeight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMarStatus(String marStatus) {
        this.marStatus = marStatus;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getDNI() {
        return DNI;
    }

    public int getYear() {
        return year;
    }
    
    public String getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    
    public String getStringWeight() {
        return stringWeight;
    }

    public String getSex() {
        return sex;
    }

    public String getMarStatus() {
        return marStatus;
    }

    public String getEmail() {
        return email;
    }
    
    /**
     * This function validate a correct format name. 
     * Save four different Strings. If name is empty or null. If name is a 
     * numeric value. If name is missing surname or the correct name.
     */
    public void validateName(){        
        if(name.isEmpty()||name==null) name = "Empty or null name";        
        if(!isNumeric(name)){
            if(name.contains(" ")) {
            } else {
                name = "Missing surname";
            }
        }else{
            name =  "Name isn't a numeric value";
        }      
    }
    /**
     * This function validate a correct DNI format and a correct DNI letter. 
     */
    public void validateDNI(){
        if(DNI.length()!=9){
            DNI = "Wrong DNI size";    
        }else{
            try{
                String letter = DNI.substring(8);
                String pattern= "^[a-zA-Z]*$";        
                if(letter.matches(pattern)){
                    int num = Integer.parseInt(DNI.substring(0,8));
                    int resto = num%23;
                    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

                    if(letter.charAt(0) == letras.charAt(resto)){                                      
                    }else{
                        DNI = "Wrong DNI letter";    
                    }                
                }else{
                    DNI = "Invalid DNI letter";               
                }  
            }catch(Exception ex){
                DNI = "Insert a valid DNI format";                
            }
        }       
    }
    
    /**
     * This function validate a age between 1 and 100 years. 
     */
    public void validateAge(){
        if (valuesBetween((double)year,1,100)) age = Integer.toString(year);
        else age = "Invalid age";         
    }
        
    /**
     * This function validate a weight between 30 and 200 kilograms. 
     */
    public void validateWeight(){
        if (valuesBetween(weight,30,200)) stringWeight = String.valueOf(weight);
        else stringWeight = "Invalid weight";         
    }    
    
    /**
     * This function validate a correct number between two others
     * @param var is a variable to validate
     * @param one is a minimal number
     * @param two is a max number
     * @return true if number is between others two numbers or false isn't.
     */
    public boolean valuesBetween(double var, double one, double two){
        if(var>=one && var<=two){
            return true;
        }else {            
            return false;
        }
    }
    
    /**
     * This function validate a numeric String.
     * @param input is the string to check.
     * @return true is a numeric string or false isn't.
     */
    public boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e) {
            // s is not numeric
            return false;
        }
    }
}
