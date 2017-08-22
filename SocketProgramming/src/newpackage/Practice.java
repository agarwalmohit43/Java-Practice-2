/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author MOHIT AGARWAL
 */
public class Practice {
    public static void main(String[] args) {
        	try {
			//ServerSocket ss=new ServerSocket(6666);
			Socket s=new Socket("localhost",6666);
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			String str="",str2="";
			while(!str.equals("stop")){
				str2=br.readLine();
				dout.writeUTF(str2);
				dout.flush();
                                str=din.readUTF();
				System.out.println("Client Says: "+str);
				
				
				
			}
			
			din.close();
			dout.close();
			s.close();
			//ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
