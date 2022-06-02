package herencia;

public class CuentaCorriente extends Cuenta {
	
	private  final double DESCUBIERTO;

	public CuentaCorriente(String titular, double descubierto) {
		super(titular);
		this.DESCUBIERTO = descubierto;
	}

	@Override
	protected boolean haySaldoSuficiente(double monto) {
		return (this.getSaldo() + this.getDescubierto()) >= monto;
	}

	public double getDescubierto() {
		return this.DESCUBIERTO;
	}

}