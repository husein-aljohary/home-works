/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.Scanner;

/**
 *
 * @author user
 */

  public class JavaApplication13 {
  public static void main(String[] args) {
  Book[] allBooks = new Book[3];
   int total =0;
 
   while(true) {
        System.out.println("Choose 1 to insert a new book.");
        System.out.println("Choose 2 to history books.");
        System.out.println("Choose 3 to check the equality of first and last books in the array.");
        System.out.println("Choose 0 to exit.");
                
        
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
    switch(select)
   {
        
   case 1:
     System.out.println("Please enter the title :");
     String title = input.next();
     input.nextLine();


     System.out.println("Please enter the price :");
     double price = input.nextDouble();
     
     System.out.println("Please enter the type :");
     String category = input.next();
            while(!(category.equalsIgnoreCase("historical") ||
            category.equalsIgnoreCase("Health") || 
            category.equalsIgnoreCase("academic")))
            {
                System.out.println("wrong type.");
                category = input.nextLine();
            }
     
     
     System.out.println("Please enter the Author name :");
     String authorName = input.next();
     input.nextLine();

     
     System.out.println("Please enter his/her gender :");
     String gender = input.next();
        while(!(gender.equalsIgnoreCase("male") ||
         gender.equalsIgnoreCase("female")))
        {
            System.out.println("wrong gender.");
            gender = input.nextLine();
        }
     

  Author newAuthor = new Author(authorName, gender);
  Book newBook = new Book(title, price, category, newAuthor);
  allBooks[total] = newBook;
  total++;
  System.out.println("The allBooks array contains :");
  for(Book book : allBooks)
             {
   if(book != null)
         {
        System.out.println(book.toString());
    }
   }
     System.out.println();
   break;
   
   
   case 2:
   
    System.out.println("The history book/s is/are: ");
        for(int i=0;i<total;i++) {
        if(allBooks[i] instanceof Book) {
        Book s = (Book)allBooks[i];
        if(s.getCategory().equalsIgnoreCase("Historical")) {
        System.out.println(s);
        }
       }
      }
  break;
  
  
  case 3:  
     Book b1 = allBooks[0];
     Book b2 = allBooks[2];
      if(b1 == null) {
    System.out.println("Please add first book to list.");
          }
      if(b2 == null) {
    System.out.println("Please add last book to list.");
    }
    boolean isEqual = b1.equals(b2);
    
    if(isEqual) {
   System.out.println(b1.title+" equal to "+b2.title);
        }
     else
           {
        System.out.println(b1.title+" not equal to "+b2.title);
    }

     break;
     
     case 0:
     return;
     default:
         System.out.println("wrong choice");
     break;
             }
        }
    }
  }
