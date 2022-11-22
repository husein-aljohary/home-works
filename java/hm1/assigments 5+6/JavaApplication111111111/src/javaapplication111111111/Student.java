package javaapplication111111111;


import javaapplication111111111.Person;

public class Student extends Person{ 
        private String major;
        private int yearofReg;
        private long ID;
        public Student(){
                super();
        }
        
    public Student(String major,int year,long ID) {
        this.yearofReg=year;
        this.ID=ID;
        if(!(major.equalsIgnoreCase("Computer Science") ||
            major.equalsIgnoreCase("Computer Engineering") || 
            major.equalsIgnoreCase("Software Engineering") || 
            major.equalsIgnoreCase("Computer Information System") ||
            major.equalsIgnoreCase("Network Engineering and Security")))
         {
            System.out.println("wrong Major.");
             return ;
                }
        this.major=major;
        }
          
        public Student(String name,String gender,long ssn,String major,int year,long ID) {
            super(name,gender,ssn);
            this.yearofReg=year;
            this.ID=ID;
            if(!(major.equalsIgnoreCase("Computer Science") ||
                    major.equalsIgnoreCase("Computer Engineering") || 
                    major.equalsIgnoreCase("Software Engineering") ||
                    major.equalsIgnoreCase("Computer Information System") || 
                    major.equalsIgnoreCase("Network Engineering and Security"))) {
                System.out.println("wrong Major.");
                return ;
                }
             this.major=major;
        }
        
        public String getMajor() {
                return major;
        }
        public void setMajor(String major) {
                if(!(major.equalsIgnoreCase("Computer Science") || 
                    major.equalsIgnoreCase("Computer Engineering") || 
                    major.equalsIgnoreCase("Software Engineering") || 
                    major.equalsIgnoreCase("Computer Information System") ||
                    major.equalsIgnoreCase("Network Engineering and Security"))) {
                    System.out.println("wrong Major.");
                        return ;
                }
                this.major = major;
        }

        public int getYearofReg() {
                return yearofReg;
        }
        public void setYearofReg(int yearofReg) {
                this.yearofReg = yearofReg;
        }

        public long getID() {
                return ID;
        }
        public void setID(long ID) {
                this.ID = ID;
        }
        @Override
        public boolean equals(Object obj) {
                Student s = (Student)obj;
                if(this.ID==s.getID())
                        return true;
                return false;
        }

        @Override
        public String toString() {
                return super.getName()+" "+super.getSsn()+" "+super.getGender()+" "+this.major+" "+this.ID+" "+this.yearofReg;
        }
                
}
