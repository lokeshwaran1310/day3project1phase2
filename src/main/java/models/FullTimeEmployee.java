package models;

import interfaces.Taxable;
public class FullTimeEmployee extends Employee implements Taxable {
    private double sal;
    public FullTimeEmployee(String name,String dept,double sal) {
        super(name,dept);
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public double calculatesalary() {
        return sal;
    }
    

    @Override
    public double calculateTax() {
        return sal * 0.2; 
    }

    @Override
    public void getdetails() {
        System.out.print("[Id: "+getId()+"]");
        System.out.print("FullTime- " + getName());
         System.err.print("| Dept: "+getDept());
        System.out.print("| Salary: $" + getSal());
        System.out.println("| Tax: " + calculateTax());
    }
}