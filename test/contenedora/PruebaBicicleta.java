package contenedora;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaBicicleta {

	@Test
	public void queSePuedaCargarUnPaquete() {
		Bicicleta bici =new Bicicleta(null);
		Paquete paquete1=new Paquete(0.1, 0.1,0.1 ,"catan",5);
		
	    Boolean resultadoObtenido=bici.agregarPaquete(paquete1);
		assertTrue(resultadoObtenido);
		
	}
	
	@Test
	public void siLabiciNoTieneDestinoQueTomeElDestinoDelPaquete() {
		Bicicleta bici =new Bicicleta(null);
		Paquete paquete1=new Paquete(0.1, 0.1,0.1 ,"catan",5);
	
		Boolean valorEsperado=bici.agregarPaquete(paquete1);
		assertTrue(valorEsperado);
	}
	

}
