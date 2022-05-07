package encapsulamiento;

public class TarjetaBaja {
	
	public static void main(String args[]) {
		TarjetaBaja miTarjeta = new TarjetaBaja(50.0);
		miTarjeta.cargar(20.0);
		System.out.println(miTarjeta.obtenerSaldo());
	}
	
	public static final double PRECIO_VIAJE_COLECTIVO = 12.5;
	public static final double PRECIO_VIAJE_SUBTE = 20.5;

	private double saldo;
	private int contadorViajesEnColectivo;
	private int contadorViajesEnSubte;

	public TarjetaBaja(double saldoInicial){
		this.saldo = saldoInicial;
		this.contadorViajesEnSubte=0;
		this.contadorViajesEnColectivo=0;
	}

	public double obtenerSaldo(){
		return this.saldo;
	}

	public void cargar(double importeAcargar){
		this.saldo += importeAcargar;
	}

	public void pagarViajeEnColectivo(){
		if(this.saldo >= PRECIO_VIAJE_COLECTIVO){
			this.saldo -= PRECIO_VIAJE_COLECTIVO;
			this.contadorViajesEnColectivo++;
		}
		else System.out.println("Saldo insuficiente");
	}

	public void pagarViajeEnSubte(){
		if(this.saldo >= PRECIO_VIAJE_SUBTE){
			this.saldo -= PRECIO_VIAJE_SUBTE;
			this.contadorViajesEnSubte++;
		}
		else System.out.println("Saldo insuficiente");
	}

	public int contarViajes(){
		return this.contadorViajesEnSubte + this.contadorViajesEnColectivo;
	}

	public int contarViajesEnColectivo(){
		return this.contadorViajesEnColectivo;
	}

	public int contarViajesEnSubte(){
		return this.contadorViajesEnSubte;
	}

}


