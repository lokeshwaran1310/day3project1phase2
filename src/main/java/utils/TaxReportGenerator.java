package utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Employee;
public class TaxReportGenerator {
    List<Employee> li;
    Map<String,List<Employee>> m=new HashMap<>();
    double tottax=0;
    public TaxReportGenerator(List<Employee> l1){
        this.li=l1;
    }
    int tot=0;
    public void dipemp(){
        for(Employee en:li){
            en.getdetails();
        }
    }
    public void sortemp(){
         li.sort((e1, e2) -> Double.compare(e2.calculateTax(), e1.calculateTax()));
         dipemp();
    }


   public void totaltax(){
    for(Employee en:li){
            tot+=en.calculateTax();
        }
       System.out.println("Total Tax Collected: "+tot);
   }
   public void group(){
     for(Employee ent :li){
        if(m.containsKey(ent.getDept())){
            List<Employee> l=m.get(ent.getDept());
            l.add(ent);
            m.put(ent.getDept(),l);
        }
        else{
            List<Employee> lh=new ArrayList<>();
            lh.add(ent);
            m.put(ent.getDept(),lh);
        }
     }
     System.out.println("EMPLOYEE LIST BASED ON DEPARTMENT: ");
     System.out.println();
     for(Map.Entry <String,List<Employee>> enty:m.entrySet()){
         System.out.println("DEPARTMENT: "+enty.getKey()+" ");
         System.out.println("EMPLOYEE DETAILS: ");
         List<Employee> lis=enty.getValue();
         for(Employee x:lis){
            x.getdetails();
         }
         System.out.println("------------------------------------------------------------------------------------------------");
     }
        for(Map.Entry <String,List<Employee>> enty:m.entrySet()){
         List<Employee>lt= m.get(enty.getKey());
         for(Employee entk:lt){
            tottax+=entk.calculateTax();
         }
         System.out.println("*Total Tax for the Department "+enty.getKey()+" is "+tottax);
         tottax=0;
     
        }
   }
}