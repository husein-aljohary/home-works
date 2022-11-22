package javaapplication111111111;

public abstract class Person {
        
        private String name;
        private String gender;
        private long ssn=0;

        public Person() {
        }

        public Person(String name, String gender,long ssn) {
            this.name=name;
            this.ssn=ssn; 
            if(!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))) {
                System.out.println("wrong Gender.");
                return ;
            }
            this.gender=gender;
        }


        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public String getGender() {
                return gender;
        }
        public void setGender(String gender) {
                if(!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))) {
                        System.out.println("wrong Gender.");
                        return ;
                }
                        
                this.gender = gender;
        }

        public long getSsn() {
                return ssn;
        }
        public void setSsn(long ssn) {
                this.ssn = ssn;
        }
        @Override
        public boolean equals(Object obj) {
            Person p = (Person)obj;
            if(this.name.equals(p.getName()) && this.ssn==p.getSsn())
                return true;
                return false;
        }

        @Override
        public String toString() {
                return "Person [name=" + name + ", gender=" + gender + ", ssn=" + ssn + "]";
        }
        
}
