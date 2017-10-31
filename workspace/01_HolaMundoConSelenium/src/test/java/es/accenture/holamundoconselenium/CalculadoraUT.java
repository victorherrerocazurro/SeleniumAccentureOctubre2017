package es.accenture.holamundoconselenium;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraUT {

	@Test
	public void test() {
		//1-SUT
		Calculadora sut = new Calculadora();
		
		//2-Datos de prueba
		//	Entrada
		int a = 1;
		int b = 1;
		//	Entorno
		//		NO HAY, estamos en Unitarias, en todo caso habra Mocks
		//	ResultadoEsperado
		int resultadoEsperado = 2;
		
		//3-Ejecutamos
		int resultadoObtenido = sut.suma(a, b);
		
		//4-Comprobar/Validar que el resultado obtenido esta dentro de 
		//los margenes aceptables
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		
		//5-borrar la sentencia de fail
		//fail("Not yet implemented");
	}

}
