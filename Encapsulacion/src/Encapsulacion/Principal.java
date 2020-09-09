package Encapsulacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear objeto usuario
		
		Usuario miUsuario = new Usuario("Daniel");
		
		
		//Imprimir estado del objeto
		
		System.out.println(miUsuario);
		
		System.out.println(miUsuario.activado);
		
		//Activacion de usuario
		
		miUsuario.activarUsuario();
		
		
	}

}
