package contenedora;

public class Paquete {
	
	private Double alto;
	private Double ancho;
	private Double profundo;
	private String ciudad;
	private Double peso;
	
	
	public Paquete(Double alto, Double ancho, Double profundo,String ciudad , double peso) {
		
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
		this.ciudad=ciudad;
		this.peso=peso;
	}
	
	
	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}


	public double calcularVolumen() {
		return alto*ancho*profundo;
	}


	public Double getAlto() {
		return alto;
	}


	public void setAlto(Double alto) {
		this.alto = alto;
	}


	public Double getAncho() {
		return ancho;
	}


	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}


	public Double getProfundo() {
		return profundo;
	}


	public void setProfundo(Double profundo) {
		this.profundo = profundo;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	

}
