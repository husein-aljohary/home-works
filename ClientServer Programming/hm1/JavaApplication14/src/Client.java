
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Socket cli=new Socket("localhost", 2023);
            
            Scanner input=new Scanner(System.in);
            DataOutputStream out=new DataOutputStream(cli.getOutputStream());

            
            
            while(true){
            System.out.println("if you want: Add numbers write 1, Subtract numbers write 2, Multiplication numbers write 3");
            System.out.println("Division numbers write 4, Sqr root number write 5, Calculate Average 6, close the program write end");
            

            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("END"))
            break;

            

            out.writeUTF(choice);
            
            System.out.println("enter the numbers");
            String numbers = input.nextLine();
            out.writeUTF(numbers);
            
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
