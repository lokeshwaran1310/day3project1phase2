package models;

import interfaces.Taxable;
public class PartTimeEmployee extends Employee implements Taxable{
    private int hr;
    private double sal;
    public PartTimeEmployee(String name,String dept,int hr,double sal){
        super(name,dept);
        this.hr=hr;
        this.sal=sal;
    }
    public int getHr() {
        return hr;
    }

    public double getSal() {
        return sal;
    }
    @Override
    public double calculatesalary(){
        return getHr()*sal;
    }

    @Override
    public double calculateTax() {
        return (calculatesalary() * 0.1); // Assuming a tax rate of 10% for part-time employees
    }


    @Override
    public void getdetails() {
        System.out.print("[Id: "+getId()+"]");
        System.out.print("PartTime- " + getName());
        System.err.print("| Dept: "+getDept());
        System.out.print("| Salary: $" + getSal());
        System.out.println("| Tax: " + calculateTax());

    }
}
   
    

