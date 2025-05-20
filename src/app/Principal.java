package app;
import clases.TrianguloRectangulo;

public class Principal {
	TrianguloRectangulo t1 = new TrianguloRectangulo(2, 2);
	TrianguloRectangulo defecto = new TrianguloRectangulo();
	
	double areaT1 = t1.area();
	double areaDefecto = defecto.area();
	
	double perimT1 = t1.perimetro();
	double perimDefecto = defecto.perimetro();
}
