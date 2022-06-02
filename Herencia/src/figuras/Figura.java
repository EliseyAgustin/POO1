package figuras;

public abstract class Figura {
	
	private String color;
	public Figura (String color) { 
	this.color=color;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public abstract double getPerimetro();
	
	
	public abstract double getArea();
	
	public abstract String queSoy();

}
