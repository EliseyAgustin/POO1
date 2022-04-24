package videoclub;

public interface Entregable extends Comparable<Entregable>{

	public abstract void entregar();
	public abstract void devolver();
	public abstract boolean isEntregado();
	
}
