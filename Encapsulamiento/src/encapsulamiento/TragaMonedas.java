package encapsulamiento;

public class TragaMonedas {
	private Tambor t1 = new Tambor();
	private Tambor t2 = new Tambor();
	private Tambor t3 = new Tambor();
	
	public String toString() {
		return "["+ t1.getposicion()+"]"+
		       "["+ t2.getposicion()+"]"+
		       "["+ t3.getposicion()+"]";
	}
	
	public void activar() {
		t1.girar();
		t2.girar();
		t3.girar();
	}
	
	public boolean entregaPremio() {
		return (t1.getposicion() == t2.getposicion())
		&& (t1.getposicion() == t3.getposicion());
	}
	
	public static void main(String[] args) {
		TragaMonedas Traga = new TragaMonedas();
		int intentos= 1;
		System.out.println(Traga);
		Traga.activar();
		System.out.println(Traga);
		while(! Traga.entregaPremio()) {
			intentos++;
			Traga.activar();
		}
		System.out.println(intentos);
		System.out.println(Traga);
	}

}

