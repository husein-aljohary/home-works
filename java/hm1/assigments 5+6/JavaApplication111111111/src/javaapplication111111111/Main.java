/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111111111;

//import java.util.Scanner;


import java.util.Scanner;

public class Main { 
    
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

    static void numbers() {
        System.out.println("Choose 1 to insert a new student.");
        System.out.println("Choose 2 to insert a new employee.");
        System.out.println("Choose 3 to retrieve the maximum salary.");
        System.out.println("Choose 4 to retrieve all software engineering students.");
        System.out.println("Choose 0 to exit.");
        }
         
    static void all(Person[] allP,int size) {
        System.out.println("The allPersons array contains:");
          for(int i=0;i<size;i++)
              System.out.println(allP[i]);
              System.out.println();
        }
       
       
       
    
    public static void main(String[] args) {
        Person[] allPersons = new Person[5];
        Scanner input = new Scanner(System.in); 
        String name = "";
        long ssn=0;
        String gender="";
        int total=0;
                
    while(true) {
        numbers();
        int select = Integer.parseInt(input.nextLine());

    switch(select) {
        case 1:
        if(total>=5) {
        System.out.println("Sorry You reached maximum length.");
            break;
                    }
        
           System.out.println("Please enter the name");
           name = input.nextLine();
                  input.nextLine();

           System.out.println("Please enter the SSN:");
           ssn = Long.parseLong(input.nextLine());
                 
                                
           System.out.println("Please enter the gender:");
           gender=input.nextLine();
           while(!val(gender)) { 
           System.out.print("wrong gender: ");
           gender = input.next();
           if(val(gender)) {
           break;
           }
       }
                                

            System.out.println("Please enter the major:");
            String major = input.nextLine();
                while(!(major.equalsIgnoreCase("Computer Science") ||
                major.equalsIgnoreCase("Computer Engineering") || 
                major.equalsIgnoreCase("Software Engineering") || 
                major.equalsIgnoreCase("Computer Information System") ||
                major.equalsIgnoreCase("Network Engineering and Security")))
                {
                    System.out.println("wrong Major.");
                    major = input.nextLine();
                }
            
     
            
            System.out.println("Please enter the id:");
            long ID = Long.parseLong(input.nextLine());
            
            System.out.println("Please enter the year of registration in the university:");
            int year = Integer.parseInt(input.nextLine());
            
            Student st = new Student(name, gender, ssn, major, year, ID);
            allPersons[total++]=st;
            all(allPersons,total);
             break;
                                
                                
        case 2:
        if(total>=5) {
        System.out.println("Sorry You reached maximum length.");
          break;
                  }
            
            System.out.println("Please enter the name");
            name = input.nextLine();
            
            System.out.println("Please enter the SSN:");
            ssn = Long.parseLong(input.nextLine());
            
            System.out.println("Please enter the gender:");
            gender=input.nextLine();
                       while(!val(gender)) { 
           System.out.print("wrong gender: ");
           gender = input.next();
           if(val(gender)) {
           break;
           }
       }
            
            System.out.println("Please enter the type of employee:");
            String type= input.nextLine();
                while(!(type.equalsIgnoreCase("Full Time") ||
                type.equalsIgnoreCase("Part Time") || 
                type.equalsIgnoreCase("casual") || 
                type.equalsIgnoreCase("Outworkers")))
                {
                    System.out.println("wrong type.");
                    type = input.nextLine();
                }
            
            
            System.out.println("Please enter the salary:");
            double salary = Double.parseDouble(input.nextLine());
            
            Employee em = new Employee(name, gender, ssn, type, salary);
            allPersons[total++]=em;
            all(allPersons,total);
         break;
         
         case 3:
            double max = Double.MIN_VALUE;
            Employee a = null;
            for(int i=0;i<total;i++) {
                if(allPersons[i] instanceof Employee) {
                Employee e = (Employee)allPersons[i];
                    if(e.getSalary()>max) {
                    max = e.getSalary();
                    a = e;
                   }
                }
             }
            System.out.println("Employee with the maximum salary is:");
            System.out.println(a);
        break;
        
        case 4:
            System.out.println("The student/s with software engineering major is/are:");
            for(int i=0;i<total;i++) {
                if(allPersons[i] instanceof Student) {
                Student s = (Student)allPersons[i];
                    if(s.getMajor().equalsIgnoreCase("Software engineering")) {
                     System.out.println(s);
                   }
               }
           }
        case 0:
        return;
        default :
           System.out.println("wrong Choice number:");
           System.out.println();
                   }
            }
        
        }
        

       
}

    










    

