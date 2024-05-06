import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaManipuladorTest2 {
    
    CadenaManipulador cadena;
    int num;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
	
	System.out.println("Antes de todo");
	
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
	
	System.out.println("Despues de todo");
    }

    @BeforeEach
    void setUp() throws Exception {
	
	cadena  = new CadenaManipulador();
    }

    @AfterEach
    void tearDown() throws Exception {
	
	System.out.println("Prueba "+num);
    }

    @Test
    void testInvertirCadena() {
	
	num =1;
	assertEquals("rrrw",cadena.invertirCadena("wrrr"));
    }

    @Test
    void testContarVocales() {
	num=2;
	assertEquals(0,cadena.contarVocales("wrrr"));
	
	try {
	
	assertEquals(0, cadena.contarVocales(null));
	fail();
	
	}catch (Exception e) {
	    assertEquals("La cadena no puede ser nula", e.getMessage());
	}
	    
	    
    }

}
