/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author MOHIT AGARWAL
 */
public class Datagramnew {
    
    public static void main(String[] args){
        try{
            DatagramSocket ds = new DatagramSocket(3000);  
            byte[] buf = new byte[1024];  
            DatagramPacket dp = new DatagramPacket(buf, 1024);  
            ds.receive(dp);  
            String str = new String(dp.getData(), 0, dp.getLength());  
            System.out.println(str);  
            ds.close();  
        }catch(Exception e){
            
        }
    }
}
