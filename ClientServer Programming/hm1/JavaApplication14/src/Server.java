
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Math; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        try {
         
            ServerSocket ser=new  ServerSocket(2023);
            Socket Cl1=ser.accept();
            Socket Cl2=ser.accept();
            
            
            DataInputStream in1=new DataInputStream(Cl1.getInputStream());
            DataInputStream in2=new DataInputStream(Cl2.getInputStream());
            
            
            double r = 0;
            
            while(true){
                // String input = in1.readUTF();
                int ch = Integer.parseInt(in1.readUTF());
                int ch2 = Integer.parseInt(in2.readUTF());
                
                
                String arr[] = in1.readUTF().split(" ");
                String arr2[] = in2.readUTF().split(" ");

                
                
                if(ch==1||ch2==1){
                    // case 1:
                    if(ch==1){
                        r=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
                        System.out.println(r);
                        break;
                    }
                     if(ch2==1){
                        r=Integer.parseInt(arr2[0])+Integer.parseInt(arr2[1]);
                        System.out.println(r);
                        break;
                        
                    }
                    
                }
                
                
                else if(ch==2||ch2==2){
                    //case 2:
                    if(ch==2){ 
                        r=Integer.parseInt(arr[0])-Integer.parseInt(arr[1]);
                        System.out.println(r);
                        break;
                    }
                     if(ch2==2){
                        r=Integer.parseInt(arr2[0])-Integer.parseInt(arr2[1]);
                        System.out.println(r);
                        break;
                    }
                    
                }
                
                
                else if(ch==3||ch2==3){
                    // case 3:
                    if(ch==3){
                        r=Integer.parseInt(arr[0])*Integer.parseInt(arr[1]);
                        System.out.println(r);
                        break;
                    }
                    if(ch2==3){
                        r=Integer.parseInt(arr2[0])*Integer.parseInt(arr2[1]);
                        System.out.println(r);
                        break;
                        
                        
                    }
                    
                    
                }
                
                else if(ch==4||ch2==4){
                    //case 4:
                    if(ch==4){
                        r=Integer.parseInt(arr[0])/Integer.parseInt(arr[1]);
                        System.out.println(r);
                        break;
                    }   
                     if(ch==4){
                        r=Integer.parseInt(arr2[0])/Integer.parseInt(arr2[1]);
                        System.out.println(r);
                        break;
                        
                        
                    }
                }
                
                
                
                
                
                else  if(ch==5||ch2==5){
                    // case 5:
                    if(ch==5){
                        int num=Integer.parseInt(arr[0]);
                        r=(int) Math.sqrt(num);
                        System.out.println(r);
                        break;
                    }
                     if(ch2==5){
                        int num=Integer.parseInt(arr2[0]);
                        r=(int) Math.sqrt(num);
                        System.out.println(r);
                        break;
                    }
                }
                

                
                else if(ch==6||ch2==6){
                    //case 6:
                    if(ch==6){
                        int sum=0;
                        for(int i=0;i<arr.length;i++){
                            sum+=Integer.parseInt(arr[i]);
                        }
                        r= sum/arr.length;
                        System.out.println(r);
                        break;
                    }
                    
                     if(ch2==6){
                        int sum=0;
                        for(int i=0;i<arr2.length;i++){
                            sum+=Integer.parseInt(arr2[i]);
                        }
                        r= sum/arr2.length;
                        System.out.println(r);
                        break;
                    }    
                }
                
                
                
                
                
                
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
           
            
            } 
 
            

        
        
        
    }