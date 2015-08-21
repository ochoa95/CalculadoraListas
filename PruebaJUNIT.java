#pruebas de jUnit
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PruebaJUNIT {
	private Circular<Double> nstack;
	private SimplementeEnlazada<Double> n1stack;
	private DoblementeEnlazada<Double> n2stack;
	private vector<Double> n3stack;
	private arrayList<Double> n4stack;
	
	@Before
	public void start()
	{
		nstack = new Circular<Double>();
		n1stack = new SimplementeEnlazada<Double>();
		n2stack = new DoblementeEnlazada<Double>();
		n3stack = new vector<Double>(10);
		n4stack = new arrayList<Double>(10);
		nstack.push(1.0);
		n1stack.push(1.0);
		n2stack.push(1.0);
		n3stack.push(1.0);
		n4stack.push(1.0);
		
		
	}
	@Test
	public void test1() throws Exception {
		assertEquals(1.0, nstack.pop(),0);
	}
}
