package comparators;

public class Persona {
	private Integer dni;
	private String Apeneom;
	private Integer edad;
	
	
	public Persona(Integer dni, String apeneom, Integer edad) {
		super();
		this.dni = dni;
		Apeneom = apeneom;
		this.edad = edad;
	}
	
	public Integer getDni() {
		return dni;
	}

	public String getApeneom() {
		return Apeneom;
	}

	public Integer getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "[dni=" + dni + ", Apeneom=" + Apeneom + ", edad=" + edad + "]";
	}

	
	
}


