package br.com.primeup.example.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
	
	@Before
	public void init(){}
	
	@Test
    public void testConcatenate() {
        Cliente client = new Cliente("PrimeUp", TipoDeInstituicao.PRIVADA);
     
        String result = client.obterNomeCompleto();
        
        assertEquals("PrimeUpPRIVADA", result);

    }
	
}
