package driver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver4 {
	
	public static void main(String[] args) {
		
		/* Creando recursos de fabricacion */
		FabricaObjetos myFabricaObjetos = new FabricaObjetos();
		
		/* Fabrica */
		IPasswordValidator pv = (IPasswordValidator)myFabricaObjetos.fabricar("password.validador");
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ));
				
		System.out.println("Hello World");
		System.out.println("Enter Password:");
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
