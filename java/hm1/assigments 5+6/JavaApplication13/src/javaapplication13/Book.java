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
public class Book {
    
   String title;
   private double price;
   String category;
   private Author authorName;

    public Book(String title, double price, String category, Author authorName) {
        this.title = title;
        this.price = price;
        
        if(!(category.equalsIgnoreCase("historical") ||
                category.equalsIgnoreCase("Health")||
                category.equalsIgnoreCase("academic") )) {
        System.out.println("wrong category.");
                return ;
            }
        this.category = category;
        this.authorName = authorName;
    }
    

    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if(!(category.equalsIgnoreCase("historical") ||
                category.equalsIgnoreCase("Health")||
                category.equalsIgnoreCase("academic") )) {
        System.out.println("wrong category.");
                return ;
            }
        this.category = category;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    
    
    
    
    @Override
    public String toString() {
        return  title + " "+ price  + " "+ category + " "+  authorName ;
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
//        final Book other = (Book) obj;
//        if (!Objects.equals(this.title, other.title)) {
//            return false;
//        }
//        return true;
//    }
   
   
   @Override
public boolean equals(Object book) {
Book bookThat = (Book)book;
if(this.getTitle() == bookThat.getTitle()) {
return true;
}
return false;
}




   
    
    
}
