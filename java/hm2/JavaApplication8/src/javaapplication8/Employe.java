

package javaapplication8;

import java.util.ArrayList;
import java.util.Scanner;



public class Employe {
  
  
   static Scanner input= new Scanner(System.in);
   static ArrayList<Employee>  l1  = new ArrayList<Employee>();

   public static void main(String[] args) {



   }

   public static void number() {
    System.out.println("Press 1 to insert a new employee.");
    System.out.println("Press 2 to delete an employee from the system.");
    System.out.println("Press 3 to find the employee with a minimum salary.");
    System.out.println("Press 4 to find all the employees with Casual type.");
    System.out.println("Press 5 to find the total paid money as a salary for all employees.");
    System.out.println("Please enter your choice number: ");
    int ch = input.nextInt();
      

       switch(ch) {
       case 1:
           insert();
           System.out.println();
//           System.out.println(l1);
//           System.out.println();
           number();
           break;
          
       case 2:
           delete();
           System.out.println();
//           System.out.println(l1);
//           System.out.println();
           number();
           break;
          
       case 3:
           min();
           System.out.println();
//           System.out.println(l1);
//           System.out.println();
           number();
           break;
          
       case 4:
           casual();
           System.out.println();
//           System.out.println(l1);
//           System.out.println();
           number();
           break;
          
       case 5:
           total();
           System.out.println();
//           System.out.println(l1);
//           System.out.println();
           number();
           break;
          
       case 0:
           return;
          
       default :
           System.out.println("wrong Choice number:");
           System.out.println();
           number();
       } 
   }
  
   
      public static void insert() {
         if(l1.size()!=5){

          /////////
       System.out.print("Please enter the name: ");
       String name = input.nextLine();
       input.nextLine();
       
       System.out.print("Please enter the ssn: ");
       long ssn = input.nextLong();
       input.nextLine();
       
       System.out.print("Please enter the gender: ");
       String gender = input.next();
       while(!val(gender)) { 
           System.out.print("wrong gender: ");
           gender = input.next();
           if(val(gender)) {
           break;
           }
       }

       System.out.print("Please enter the type of employee: ");
       String type = input.next();
       while(!val2(type)) {
       System.out.print("wrong type ");
       type = input.next();
       if(val2(type)) {
            break;
           }
       }

       System.out.print("Please enter the salary: ");
       double salary = input.nextDouble();

       Employee emp = new Employee( name, ssn, gender, type, salary);
       l1 .add(emp);
       System.out.print("The allEmp array contains:");
         
    //    System.out.print(allEmp);
           for(int ll = 0; ll < l1.size(); ll++) {   
           System.out.println(l1.get(ll));
}
           
         } 
   ///////////////////////        
         else System.out.println("sorry, you reach the maximum length");
   
   }
   
      
      public static void delete() {
     System.out.print("Enter the SSN of Employee which you want to delete : ");
     long ssn = input.nextLong();
       for(int i=0;i< l1 .size();i++) {
           
           Employee emp = l1 .get(i);
           if(emp.essn(ssn)) {
              l1 .remove(i);
              System.out.println("The allEmp array contains:");
    for(int j = 0; j < l1.size(); j++) {   
    System.out.println(l1.get(j));
}
               return;
           }

       }
       System.out.println("sorry, the system didn’t find this employee");
   }
   
      
      
   public static void min() {
       int index = 0;
       double min = Integer.MAX_VALUE;
       for(int i=0;i< l1 .size();i++) {
       Employee emp = l1 .get(i);
           if(emp.getsalary() < min) {
               index = i;
               min = emp.getsalary(); 
           }

       }
 
System.out.println("The employee/s with the minimum salary is/are: ");
Employee emp = l1 .get(index);
System.out.print(emp.toString());
//System.out.print(l1 .get(index));

   }
      
   
      public static void casual() {
       System.out.println("The employee/s with the Casual type is/are:");
       for(int i=0;i< l1 .size();i++) {
               Employee emp = l1 .get(i); 
           if(emp.etype("Casual")) {
               System.out.print(emp.toString()); 
           } 
           else if(emp.etype("casual")) {
               System.out.print(emp.toString()); 
           }
           }
   }
      
  
   public static void total() {
       double total = 0;
       for(int i=0;i< l1 .size();i++) {
           Employee emp = l1 .get(i);
           total += emp.getsalary();   
       }
    System.out.println("The total amount of money paid for employees is "+total+"jd");
   }
  
 

   public static boolean val2(String type) {
       if(type.equalsIgnoreCase("Full-time")) {
           return true;
       }
       else if(type.equalsIgnoreCase("Part-time")) {
           return true;
       }
       else if(type.equalsIgnoreCase("Casual")) {
           return true;
       }
       else if(type.equalsIgnoreCase("Out-Workers")) {
           return true;
       }
       else {
           return false;
       }
   }
  
   
   public static boolean val(String gender) {
       if(gender.equalsIgnoreCase("Male")) {
           return true;
       }     
if(gender.equalsIgnoreCase("Female")) {
           return true;
       }

else {
     
   return false;
}
      
   }
  

}


class Employee{
   String name;
   long ssn;
   String gender;
   String type;
   double salary;
  
   public Employee(String name, long ssn, String gender,String type, double salary) {
      
       this.name = name;
       this.ssn = ssn;
       this.gender = gender;
       this.type = type;
       this.salary = salary;
   }
  
  
   public String getname() {    
       return name;    
   }
public void setname(String name) {     
       this.name = name;  
   }
public boolean ename(String empname) {
   if(name.equals(empname)) {
       return true;
   }
   return false;
}


public long getssn() {
   return ssn;
}
public void setssn(long ssn) {
   this.ssn = ssn;
}
public boolean essn(long empssn) {
   if(ssn == empssn) {
       return true;
   }
   return false;
}


public String getgender() {
   return gender;
}
public void setgender(String gender) {
   this.gender = gender;
}
public boolean egender(String g) {
   if(gender.equals(g)) {
       return true;
   }
   return false;
}


public String gettype() { 
   return type;
}
public void settype(String type) {
   this.type = type;
}
public boolean etype(String emptype) {
   if(type.equals(emptype)) {
       return true;
   }
   return false;
}



public double getsalary() {
   return salary;
}
public void setsalary(double salary) {
   this.salary = salary;
}
public boolean esalary(double empsalary) {
  
   if(salary == empsalary) {
       return true;
   }
   return false;
}


public String toString() {
   String a = "";
   a=name+" "+ssn+" "+gender+" "+type+" "+salary;

   return a;
}

}







