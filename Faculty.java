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
import java.util.*;

public class Faculty extends Employee
{
    //Private Members
    private Rank rank;
    private ArrayList<String> hours = new ArrayList<>();
    
    //Public Constructor
    public Faculty(String name, String address, String email, String phone, String office, int salary, MyDate hireDate, Rank rank, ArrayList<String> hours)
    {
        super(name, address, email, phone, office, salary, hireDate);
        setRank(rank);
        setHours(hours);
    }        
    
    //Getters and setters
    public void setRank(Rank rank)
    {
        this.rank = rank;
    }        
    
    public Rank getRank()
    {
        return rank;
    }        
    
    public void setHours(ArrayList<String> hours)
    {
        this.hours = hours;
    } 
    
    public ArrayList<String> getHours()
    {
        return hours;
    }
    
    //Overridden toString method for returning the correct classification for output
    @Override
    public String toString()
    {
        return getClass().getCanonicalName() + " " + getName();
    }                   

    
}
