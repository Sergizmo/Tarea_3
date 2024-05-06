import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaManipuladorTest {
    
    CadenaManipulador cadena;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
	System.out.println("Llamando a setUpBeforeClass con la etiqueta @BeforeAll");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
	
	System.out.println("Llamando a tearDownAfterClass con la etiqueta @AfterAll");
    }

    @BeforeEach
    void setUp() throws Exception {
	System.out.println("Llamando a setUp con la etiqueta @BeforeEach");
	
	cadena = new CadenaManipulador();
    }

    @AfterEach
    void tearDown() throws Exception {
	System.out.println("Llamando a tearDown con la etiqueta @AfterEach");
    }

    @Test
    void testInvertirCadena() { // Cadena de texto normal
	
	assertEquals("aloh", cadena.invertirCadena("hola"));

    }
    
    @Test
    void testInvertirCadena2() { // Introduzco números y espacios
	
	assertEquals("T5a loh", cadena.invertirCadena("hol a5T"));

    }
    
    
    @Test
    void testCadenaNula() { // Uso una cadena nula que tiene que dar error
	
	try {
	     cadena.invertirCadena(null);
	     fail();

	} 
	catch (Exception e) {
	
	    assertEquals("La cadena no puede ser nula", e.getMessage());

	}   
	
	
    }
    
    @Test
    void testContarVocales() { // Contar vocales normal
	
	assertEquals(2, cadena.contarVocales("hola"));

    }
    
    @Test
    void testContarVacio() { // Vocales en cadena vacía
	
	assertEquals(0, cadena.contarVocales(""));

    }
    
    @Test
    void testContarSinVocales() { // Cadena sin vocales
	
	assertEquals(0, cadena.contarVocales("trdfdsf"));

    }
    
    @Test
    void testVocalesNula() { // Uso una cadena nula que tiene que dar error
	
	try {
	     cadena.contarVocales(null);
	     fail();

	} 
	catch (Exception e) {
	
	    assertEquals("La cadena no puede ser nula", e.getMessage());

	}   
	
    }

}
