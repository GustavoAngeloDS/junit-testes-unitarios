package appTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import app.StringUtil;

public class StringUtilTest {
	
	@Before
	public void beforeTest() {
		System.out.println("Iniciando testes --> \n");
	}
	
	@After
	public void afterTest() {
		System.out.println("Testes finalizados \n");
	}
	
	@Test
	public void testIsInvalid() {
		Boolean b;
		
		b = StringUtil.isInvalid("ABC");
		assertFalse(b);
		
		b = StringUtil.isInvalid("");
		assertTrue(b);
		
		b = StringUtil.isInvalid(null);
		assertTrue(b);
	}
	
	@Test
	public void testReverseString() {
		String s;
		
		s = StringUtil.reverseString("ABC");
		assertEquals("CBA", s);
		
		s = StringUtil.reverseString(null);
		assertNull(s);
	}
}
