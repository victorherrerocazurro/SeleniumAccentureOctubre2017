package es.accenture.holamundoconselenium;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraValidacionesIncorrectasUT {

	private Calculadora sut;
	
	@Before
	public void init(){
		//1-SUT
		sut = new Calculadora();
	}
	
	@Test(expected=Exception.class)
	public void testDatosIncorrectos() throws Exception {
		//2-Datos de prueba
		//	Entrada
		int a = 0; //dato incorrecto
		int b = 1;
		//	Entorno
		//		NO HAY, estamos en Unitarias, en todo caso habra Mocks
		//	ResultadoEsperado
		//		No hace falta definir ninguno porque se lanzara una excepcion
		
		//3-Ejecutamos
		sut.suma(a, b);
		
		//4-Comprobar/Validar que el resultado obtenido esta dentro de 
		//los margenes aceptables
		//		No ponemos aserto, porque se incluye en la anotacion Test
		
		
		//5-borrar la sentencia de fail
		//fail("Not yet implemented");
	}

}
