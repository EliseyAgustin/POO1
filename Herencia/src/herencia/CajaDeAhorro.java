package herencia;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(String titular) {
		super(titular);

	}

	@Override
	protected boolean haySaldoSuficiente(double monto) {
		return this.getSaldo() >= monto;
	}

}
