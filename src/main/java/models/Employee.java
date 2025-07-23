package models;
import interfaces.Taxable;
public abstract class Employee implements Taxable{
    private String name;
    private static int cnt=100;
    private int id;
    private String dept;
    public Employee(String name,String dept){
        this.name=name;
        this.dept=dept;
        this.id=cnt++;
    }

public String getName() {
    return name;
}

public int getId() {
    return id;
}

public void setName(String name) {
    this.name = name;
}
public abstract double calculatesalary();
public abstract void getdetails();

    public String getDept() {
        return dept;
    }

}


