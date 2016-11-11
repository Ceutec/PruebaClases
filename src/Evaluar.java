import static org.junit.Assert.*;

import org.junit.Test;

public class Evaluar {

	@Test
	public void testHerencia()
	{
		Restaurante r = new Restaurante(10,20,"A");
		if(!(r instanceof Lugar))
			fail("");
		
		Parque r2 = new Parque(10,20,30);
		if(!(r2 instanceof Lugar))
			fail("");
	}
	
	@Test
	public void testConstructores()
	{
		Lugar f = new Lugar(1,2);
		assertEquals("", 1, f.posicion_x);
		assertEquals("", 2, f.posicion_y);
		
		Restaurante f2 = new Restaurante(11,12,"B");
		assertEquals("", 11, f2.posicion_x);
		assertEquals("", 12, f2.posicion_y);
		assertEquals("", "B", f2.horario);
		
		Parque f3 = new Parque(11,22,33);
		assertEquals("", 11, f3.posicion_x);
		assertEquals("", 22, f3.posicion_y);
		assertEquals("", 33, f3.tamano);
	}
	
	@Test
	public void testGetYSets()
	{		
		Restaurante f2 = new Restaurante(11,12,"B");
		f2.setHorario("C");
		assertEquals("", "C", f2.getHorario());
		
		Parque f3 = new Parque(11,12,13);
		f3.setTamano(15);
		assertEquals("", 15, f3.getTamano());
		
	}
	
	@Test
	public void testAmpliar()
	{
		Parque f3 = new Parque(11,12,13);
		f3.ampliarTamano(5);
		assertEquals("", 18, f3.getTamano());
		
	}

}
