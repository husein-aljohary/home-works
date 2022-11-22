package javaapplication111111111;


import javaapplication111111111.Person;

public final class Employee extends Person {
    private String type;
    private double salary;
    public Employee() {
         super();
        }
        
public Employee(String type,double salary) {
    this.salary=salary;
    if(!(type.equalsIgnoreCase("Full Time") ||
        type.equalsIgnoreCase("Part Time") || 
        type.equalsIgnoreCase("Casual") || 
        type.equalsIgnoreCase("Outworkers"))) {
        System.out.println("wrong Employee type.");
            return ;
         }
            this.type=type;
        }
             
    public Employee(String name,String gender,long ssn,String type,double salary) {
        super(name,gender,ssn);
        this.salary=salary;
        if(!(type.equalsIgnoreCase("Full Time") || 
                type.equalsIgnoreCase("Part Time") || 
                type.equalsIgnoreCase("Casual") || 
                type.equalsIgnoreCase("Outworkers"))) {
            System.out.println("wrong Employee type.");
                return ;
                }
        this.type=type;
        }
         
        public String getType() {
                return type;
        }
        public void setType(String type) {
            if(!(type.equalsIgnoreCase("Full Time") || 
                    type.equalsIgnoreCase("Part Time") || 
                    type.equalsIgnoreCase("Casual") || 
                    type.equalsIgnoreCase("Outworkers"))) {
                System.out.println("wrong Employee type.");
                return ;
                }
                this.type = type;
        }
        
        public double getSalary() {
                return salary;
        }
        public void setSalary(double salary) {
                this.salary = salary;
        }
        
        @Override
        public boolean equals(Object obj) {
                Employee e = (Employee)obj;
                if(this.getSsn()==e.getSsn())
                        return true;
                else
                        return false;
        }
        @Override
        public String toString() {
                return super.getName()+" "+super.getSsn()+" "+super.getGender()+" "+this.type+" "+this.salary;
        }
        
}