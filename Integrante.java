package u4.u5.entregable;

public class Integrante extends Agrupacion{

	private int numero_participante;
	private int edad;
	private String localidad;
	
	
	Integrante(int numero_participante, int edad, String localidad){
	super();
	this.numero_participante=numero_participante;
	this.edad=edad;
	this.localidad=localidad;
	}


	@Override
	public void cantar_la_presentacion() {
		// TODO Auto-generated method stub
		
	}

	public int getNumero_participante() {
		return numero_participante;
	}

	public void setNumero_participante(int numero_participante) {
		this.numero_participante = numero_participante;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	@Override
	public String toString() {
		return "Integrante [numero_participante=" + numero_participante + ", edad=" + edad + ", localidad=" + localidad
				+ "]";
	}
	
	
	
}
