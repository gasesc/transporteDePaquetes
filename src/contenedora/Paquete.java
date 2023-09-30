package contenedora;

public class Paquete {
	
	private Double alto;
	private Integer ancho;
	private Double profundo;
	private String ciudad;
	
	
	public Paquete(Double alto, Integer ancho, Double profundo,String ciudad) {
		
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
		this.ciudad=ciudad;
	}


	public Double getAlto() {
		return alto;
	}


	public void setAlto(Double alto) {
		this.alto = alto;
	}


	public Integer getAncho() {
		return ancho;
	}


	public void setAncho(Integer ancho) {
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
