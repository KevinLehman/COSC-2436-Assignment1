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
public class Person 
{
    //Private Members
    private String name;
    private String address;
    private String email;
    private String phone;
    
    //Public Constructor	
    public Person (String name, String address, String email, String phone)
    {
       this.name = name;
       this.address = address;
       this.email = email;
       this.phone = phone;
    }

    //Getters and setters	
    
    public void setName(String name)
    {
        this.name = name;
    } 
    
    public String getName()
    {
        return name;
    }        
    
    public void setAddress(String address)
    {
        this.address = address;
    }       
    
    public String getAddress()
    {
        return address;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }        
    
    public String getEmail()
    {
        return email;
    }        
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }        
    
    public String getPhone()
    {
        return phone;
    }  
    
    //Overridden toStrine method to return the correct classification for output
    @Override
    public String toString()
    {
        return getClass().getCanonicalName() + " " + getName();
    }        
}
