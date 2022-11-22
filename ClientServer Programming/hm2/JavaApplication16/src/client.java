
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
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
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
for(int i=3000;i<3051;i++){
       
        try {
            
            Random r = new Random();
       int R= r.nextInt((3050 - 3000) + 1) + 3000;
       if(i==R){
       break;
       
       }     
       
            Socket client1=new Socket("localhost", R);
            
            
           DataOutputStream out=new DataOutputStream(client1.getOutputStream());
            out.writeUTF("Hello Server. I was able to connect to your open port");
            out.writeUTF("the port number is"+R);
            
            DataInputStream in=new DataInputStream(client1.getInputStream());
            in.readUTF();
            in.readUTF();
            in.readUTF();
            
               client1.close();
                in.close();
                out.close();
        
                  
            
            
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
}
        
    }
    
}
