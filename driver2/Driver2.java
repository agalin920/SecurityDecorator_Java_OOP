package driver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver2 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		System.out.println("Enter Password:");
		
		//Interface due to the fact that the authentication method can change
		IPasswordValidator pv = new PasswordValidator();
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ));
		String password = null;
		try {
		   
			password = br.readLine ();
		   
		   if ( password!= null && pv.autenticar(password))
			   System.out.println("Bienvenido!... Usuario");
		   else
		   	  System.out.println("Usuario no autorizado!");
		}
		catch ( IOException ioe ) {		   
		}
	}
}
