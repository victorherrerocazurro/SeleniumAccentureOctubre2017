package es.accenture.holamundoconselenium;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraRangosDatosValidosUT {

	// Rangos de Datos de Prueba 
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{1, 1, 2},
			{1, 2, 3}
		});
	}
	
	private Calculadora sut;
	
	//2-Datos de prueba
	//	Entrada
	private int a;
	private int b;
	//	Entorno
	//		NO HAY, estamos en Unitarias, en todo caso habra Mocks
	//	ResultadoEsperado
	private int resultadoEsperado;
	
	public CalculadoraRangosDatosValidosUT(int a, int b, int resultadoEsperado) {
		super();
		this.a = a;
		this.b = b;
		this.resultadoEsperado = resultadoEsperado;
	}

	@Before
	public void init(){
		//1-SUT
		sut = new Calculadora();
	}
	
	@Test
	public void testDatosCorrectos() throws Exception {
		//3-Ejecutamos
		int resultadoObtenido = sut.suma(a, b);
		
		//4-Comprobar/Validar que el resultado obtenido esta dentro de 
		//los margenes aceptables
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		//5-borrar la sentencia de fail
		//fail("Not yet implemented");
	}
}
