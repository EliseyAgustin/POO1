package encapsulamiento;

public class CuentaCorriente {
	
	private double saldo = 0;
	private String titular;
	private final double DESCUBIERTO;

	public CuentaCorriente(String titular, double descubierto) {
		this.titular = titular;
		this.DESCUBIERTO = descubierto;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
	public void depositar(double monto) {
		if (esMontoValido(monto))
			setSaldo(this.getSaldo() + monto);
	}
	
	public double extraer(double monto) {
		if (esMontoValido(monto) && haySaldoSuficiente(monto)) {
			this.saldo -= monto;
			return monto;
		} else
			return 0;

	}
	
	private void setSaldo(double saldo) {
		if (esMontoValido(saldo))
			this.saldo = saldo;
	}
	
	private boolean esMontoValido(double monto) {
		return monto > 0;
	}
	
	private boolean haySaldoSuficiente(double monto) {
		return (this.getSaldo() + this.getDescubierto()) >= monto;
	}

	public double getDescubierto() {
		return this.DESCUBIERTO;
	}
	
	
}


