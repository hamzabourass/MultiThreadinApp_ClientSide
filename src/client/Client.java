package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//etablire une connexion avec le serveur 
			Socket s = new Socket("localhost",243);
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			Scanner clavier = new Scanner(System.in);
			System.out.println("Give a Number");
			int nb = clavier.nextInt();
			os.write(nb);
			int rep = is.read();
			System.out.println("Response = " + rep);

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}