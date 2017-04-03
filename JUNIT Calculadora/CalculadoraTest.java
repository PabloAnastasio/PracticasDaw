package JUNIT;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora Calculadora;
	
	@Before
	public void antesDelTest()
	{
		Calculadora = new Calculadora();
		System.out.println("Reiniciando la calculadora...");
	}
	
	
	
	@Test
	public void sumartest() {
		
		float resultadoSuma=Calculadora.sumar(2, 4);
		System.out.println("2 + 4 = " + Calculadora.sumar(2, 4));
		assertEquals("Método sumarTest" , 6.0, resultadoSuma, 0);
	
	}
	
	@Test
		public void restartest() {
		
		float resultadoResta=Calculadora.restar(2, 4);
		System.out.println("2 - 4 = " + Calculadora.restar(2, 4));
		assertEquals("Método restarTest" , -2.0, resultadoResta, 0);
	
	}
	
	@Test
		public void multiplicartest() {
		
		float resultadoMultiplicar=Calculadora.multiplicar(2, 4);
		System.out.println("2 * 4 = " + Calculadora.multiplicar(2, 4));
		assertEquals("Método multiplicarTest" , 8, resultadoMultiplicar, 0);

	}	
	
	@Test
	public void dividirtest() {

	float resultadoDividir=Calculadora.dividir(2, 4);
	System.out.println("2 / 4 = " + Calculadora.dividir(2, 4));
	assertEquals("Método multiplicarTest" , 0.5, resultadoDividir, 0);

}	
}
