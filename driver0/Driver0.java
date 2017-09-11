package driver0;

public class Driver0 {
	
	public static void main(String[] args) {
			
		FabricaObjetos myFabricaObjetos = new FabricaObjetos();
		
		Cerveza myChela = (Cerveza) myFabricaObjetos.fabricar("driver0.Cerveza");		
		myChela.tomar();
		
		Animal myPerro = (Animal) myFabricaObjetos.fabricar("driver0.Perro");
		myPerro.jugar();
		
		Animal myGato = (Animal) myFabricaObjetos.fabricar("driver0.Gato");
		myGato.jugar();
		
	}	
}
