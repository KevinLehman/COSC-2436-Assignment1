/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg1;

/**
 *
 * @author kevin.lehman
 */
public class Student extends Person
{
    //Private Members
    private Status status;
    
    //Public Constructor        
    public Student (String name, String address, String email, String phone, Status status)        
    {
        super(name, address, email, phone);
        setStatus(status);
    }
    
    //Getters and Setters
    public void setStatus(Status status)
    {
        this.status = status;
    }     
    
    public Status getClassification()
    {
        return status;
    }    
    
    //Overridden toString method for returning the correct classification for output
    @Override
    public String toString()
    {
        return getClass().getCanonicalName() + " " + getName();
    }                   
}
