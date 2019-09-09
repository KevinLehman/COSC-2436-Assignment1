/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg1;

/**
 *
 * @author user
 */
public class Staff extends Employee 
{
    //Private Members
    private String title;
    
    //Public Constructor
    public Staff (String name, String address, String email, String phone, String office, int salary, MyDate hireDate, String title)
    {
        super(name, address, email, phone, office, salary, hireDate);
        setTitle(title);
    }     
    
    //Getters and Setters
    public void setTitle(String title)
    {
        this.title = title;
    }        
    
    public String getTitle()
    {
        return title;
    }   
    
    //Overriden toString method to return the correct classification for output
    @Override
    public String toString()
    {
        return getClass().getCanonicalName() + " " + getName();
    }                   
}
