package diadelasemana;

public class Diadelasemana {

	 private final String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
	
	
	public String obtenerDia(int d) {
	if(d>7 || d<1)throw new Error("Ingresa bien los datos cabeza de termo");
	return dias[d-1];
	
}

}