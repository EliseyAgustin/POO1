package encapsulamiento;

public class CajaDeAhorro {
	
	private String titularDeLaCuenta;
	private double saldo;
	
	public CajaDeAhorro(String titularDeLaCuenta) {
		this.saldo = 0;
	}
	
	public String obtenerTitular(){
		return titularDeLaCuenta;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void depositar(double monto) {
		if(monto>0)
			saldo+=monto;
		else throw new Error("Monto Mal Ingresado");
	}
	
	public boolean extraer(double monto) {
		if(monto<=0) throw new Error("Monto Invalido");
		if(monto>0 && monto<=saldo) {
			saldo = monto;
			return true;
		}
		else System.out.println("Saldo insuficiente, ingrese un monto inferior/igual a $"+saldo);
			return false;
	}

}



