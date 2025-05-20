package clases;
/**
 * Clase TrianguloRectangulo
 */
public class TrianguloRectangulo {
	private double a;
	private double b;
	private double c;
	
	/**
	 * Crea un triangulo rectangulo con valores predeterminados (a y b valen 1)
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c = this.hipotenusa();
	}
	
	/**
	 * Crea un triangulo rectangulo con valores introducidos por el usuario
	 * @param a Primer cateto introducido por el usuario en metros
	 * @param b Segundo cateto introducido por el usuario en metros
	 * @throws IllegalArgumentException Excepcion en caso de valores invalidos
	 */
	public TrianguloRectangulo(double a, double b) throws IllegalArgumentException{
		if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Los valores introducidos no son validos");
		}else {
			this.a = a;
			this.b = b;
			this.c = this.hipotenusa();
		}
	}
	
	/**
	 * Metodo para calcular el area del triangulo
	 * @return el area en metros cuadrados
	 */
	public double area() {
		return ( (this.a * this.b) / 2 );
	}
	
	/**
	 * Metodo para calcular la hipotenusa del triangulo
	 * @return la longitud de la hipotenusa en metros
	 */
	public double hipotenusa() {
		return Math.sqrt((Math.pow(this.a, 2)) + (Math.pow(this.b, 2)));
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public void setA(double newA) {
		this.a = newA;
	}
	
	public void setB(double newB) {
		this.b = newB;
	}
	
	public void setC(double newC) {
		this.c = newC;
	}
	
	@Override
	public String toString() {
		String mensaje = "Triangulo: ";
		mensaje += "\n\tCateto A: " + this.a;
		mensaje += "\n\tCateto B: " + this.b;
		mensaje += "\n\tHipotenusa C: " + this.c;
		
		return mensaje;
	}
}
