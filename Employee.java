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
public class Employee extends Person
{
    //Private Members
    private String office;
    private int salary;
    private MyDate hireDate;
    
    //Public constructor
    public Employee(String name, String address, String email, String phone, String office, int salary, MyDate hireDate)
    {
        super(name, address, email, phone);
        setOffice(office);
        setSalary(salary);
        setDate(hireDate);
    }
    
    //Getters and setters
    public void setOffice(String office)
    {
        this.office = office;
    }        
    public String getOffice()
    {
        return office;
    }        
    public void setSalary(int salary)
    {
        this.salary = salary;
    }        
    public int getSalary()
    {
        return salary;
    }        
    public void setDate(MyDate hireDate)
    {
        this.hireDate = hireDate;
    }        
    public MyDate getDate()
    {
        return hireDate;
    }        
   
    //Overriden toString method to return to correct classification for output
    @Override
    public String toString()
    {
        return getClass().getCanonicalName() + " " + getName();
    }                   

}
