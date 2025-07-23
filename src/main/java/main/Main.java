package main;
import java.util.ArrayList;
import java.util.List;

import models.Employee;
import models.FullTimeEmployee;
import models.PartTimeEmployee;
import utils.TaxReportGenerator;
public class Main {
    public static void main(String[] args) {
        List<Employee>l1=new ArrayList<>();
        FullTimeEmployee e1 = new FullTimeEmployee("lokesh","hr",10000);
        FullTimeEmployee e2 = new FullTimeEmployee("hari", "manager",9000);
        FullTimeEmployee e3 = new FullTimeEmployee("Raju","SE",60000);
        FullTimeEmployee e4 = new FullTimeEmployee("hari", "Db manager",50000);
        FullTimeEmployee e5 = new FullTimeEmployee("mukesh","Vp",16000);
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);
        l1.add(e5);
        PartTimeEmployee p1 = new PartTimeEmployee("akilesh","SE",4,700);
         PartTimeEmployee p2 = new PartTimeEmployee("magesh","Db manager",5,800);
          PartTimeEmployee p3 = new PartTimeEmployee("murugesh","eee",4,900);
           PartTimeEmployee p4 = new PartTimeEmployee("dinesh","eie",6,600);
            PartTimeEmployee p5 = new PartTimeEmployee("vignesh","it",3,700);
         l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p4);
        l1.add(p5);
        TaxReportGenerator tx=new TaxReportGenerator(l1);
        System.out.println("EMPLOYEE DETAILS");
        tx.dipemp();
        System.err.println("--------------------------------------------------------");
        tx.totaltax();
         System.err.println("--------------------------------------------------------");
       System.out.println("SORTED EMPLOYEE DETAILS");
        tx.sortemp();
         System.err.println("--------------------------------------------------------");
         tx.group();
       
    }
}
