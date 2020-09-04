package ArrayMedia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int miArray[] = {2,3,4,5,6,7};
		int sumatorio = 0;
		
		
		for (int posicion = 0; posicion < miArray.length; posicion++) {
			sumatorio = sumatorio + miArray[posicion];
		}
		
		double media = sumatorio / miArray.length;

		System.out.println("La media es: " + media);
	}

}
