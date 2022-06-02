package herencia;

public abstract class Cuenta {

	private double saldo = 0;
	private String titular;

	public Cuenta(String titular) {
		this.setTitular(titular);
	}

	protected abstract boolean haySaldoSuficiente(double monto);

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

	public void transferir(Cuenta cuentaDestino, double monto) {
		if (esMontoValido(monto) && this.haySaldoSuficiente(monto))
			cuentaDestino.depositar(this.extraer(monto));
	}

	protected void setSaldo(double saldo) {
		if (esMontoValido(saldo))
			this.saldo = saldo;
	}

	protected boolean esMontoValido(double monto) {
		return monto > 0;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

}
