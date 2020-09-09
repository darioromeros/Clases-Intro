package Encapsulacion;

import java.util.Date;

public class Usuario {

	public String nombre;
	private boolean activado;
	public Date fechaActivacion;
	
	public Usuario(String nombre) {
		
		this.nombre = nombre;
		this.activado = false;
	}
	
	String mensaje = "Usuario: " + this.nombre + ""{
		
		if(this.activado) {
			return mensaje + "fecha de activacion: " + this.fechaActivacion;
		}
		
		return mensaje;
	}
	
	//metodo getter
	public boolean getActivado() {
		return this.activado;
	}
	
	//metodo setter
	public void activarUsuario() {
		this.activado = true;
		this.fechaActivacion = new date();
	}
}
