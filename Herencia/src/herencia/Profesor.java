package herencia;

public class Profesor extends Persona {

	double salario;
	
	public Profesor(String nombre, int DNI, double salario) {
		super(nombre, DNI);
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + "Profesor con salario: " + this.salario;
		
	}

}