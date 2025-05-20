package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	
	TrianguloRectangulo defecto = new TrianguloRectangulo();
	TrianguloRectangulo t1 = new TrianguloRectangulo(2, 2);
	
	@Test
	void testHipotenusaDefecto() {
		
		double resultadoObtenido = defecto.hipotenusa();
		double resultadoEsperado = 1.4142135623730950488016887242097;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testHipotenusaT1() {
		
		double resultadoObtenido = t1.hipotenusa();
		double resultadoEsperado = 2.8284271247461900976033774484194;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testAreaDefecto() {
		
		double resultadoObtenido = defecto.area();
		double resultadoEsperado = 0.5;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testAreaT1() {
		
		double resultadoObtenido = t1.area();
		double resultadoEsperado = 2.0;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testPerimetroDefecto() {
		
		double resultadoObtenido = defecto.perimetro();
		double resultadoEsperado = 3.414213562373095;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testPerimetroT1() {
		
		double resultadoObtenido = t1.perimetro();
		double resultadoEsperado = 6.82842712474619;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testExcepcion(){
		Exception excepcion = assertThrows (IllegalArgumentException.class,
		  () -> new TrianguloRectangulo(0, 1)
		);
		String mensajeEsperado = "Los valores introducidos no son validos";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}


}
