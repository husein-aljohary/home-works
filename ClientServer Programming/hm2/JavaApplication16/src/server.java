
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
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
public class server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        for (int i=3000;i<3051;i++){
        
        try {
           
                   Random r = new Random();
       int R= r.nextInt((3050 - 3000) + 1) + 3000;
            
            ServerSocket server1=new ServerSocket(R);
            if(true){
            Socket cl1=server1.accept();
            
                DataInputStream input=new DataInputStream(cl1.getInputStream());
                input.readUTF();
                input.readUTF();
                
                DataOutputStream out=new DataOutputStream(cl1.getOutputStream());
                out.writeUTF("Hello Server. I was able to connect to your open port");
                out.writeUTF("the randomly selected port"+R);
                out.writeUTF("I am closing all open sockets and input and output ports");
                
                cl1.close();
                input.close();
                out.close();
            
        
            }
            
            

        
        
        
       


    
}       catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
            
}
        
    }
        
    }
}
