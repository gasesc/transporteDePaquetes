package contenedora;

import java.util.ArrayList;
import java.util.List;

public class Bicicleta {
	private String ciudad;
	private final Integer CANTIDAD_MAXIMA_DE_PAQUETES = 2;
	private ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
	private Double pesoTotal = 0.0;

	public Bicicleta(String ciudad) {
		super();
		this.ciudad = ciudad;
	}

	public Boolean agregarPaquete(Paquete paquete) {
		boolean resultado = false;
		if (paquetes.size() < 2 && calcularPesoYvolumen(paquete) && cargarDestino(paquete)) {
			paquetes.add(paquete);
			resultado = true;
		} else if (paquetes.size() < 2 && calcularPesoYvolumen(paquete) && ciudad == paquete.getCiudad()) {
			paquetes.add(paquete);
			resultado = true;
		}

		return resultado;
	}

	public Boolean cargarDestino(Paquete paquete) {
		boolean sePudo = false;
		if (this.ciudad == null) {
			this.ciudad = paquete.getCiudad();
			sePudo = true;
		}
		return sePudo;

	}

	public Boolean calcularPesoYvolumen(Paquete paquete) {
		Boolean sePuede = false;
		double contador = pesoTotal;
		contador += paquete.getPeso();
		if (paquete.calcularVolumen() < 0.125 && contador < 15) {
			this.pesoTotal += paquete.getPeso();
			sePuede = true;
		}
		return sePuede;
	}

}
