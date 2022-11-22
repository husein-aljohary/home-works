package javaapplication13;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Author {
    String name;
    private String gender;

    public Author(String name, String gender) {
        this.name = name;
        
     if(!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))) {
        System.out.println("wrong Gender.");
     return ;
            }
        this.gender = gender;
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

    @Override
    public String toString() {
        return " " + name + " " + gender;
    }


    
    
    
    
    
    
    
    
    

    
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Author other = (Author) obj;
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        if (!Objects.equals(this.gender, other.gender)) {
//            return false;
//        }
//        return true;
//    }
    @Override
public boolean equals(Object author) {
Author authorThat = (Author)author;
if(this.getName() == authorThat.getName() && this.getGender() == authorThat.getGender()) {
return true;
}
return false;
}
    
    
 




}
