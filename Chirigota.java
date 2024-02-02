package u4.u5.entregable;

public class Chirigota extends AgrupacionOficial implements Callejera{

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private int numCuples;
	private int puntos;
	
	
	Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int numCuples, int puntos){
	super( nombre,autor,autorMusica,autorLetras,tipo);
	this.nombre=nombre;	
	this.autor=autor;
	this.autorMusica=autorMusica;
	this.autorLetras=autorLetras;
	this.tipo=tipo;
	this.numCuples=numCuples;
	this.puntos=puntos;
	}
	
	Chirigota(){
		super();
		this.nombre="LA CASA";	
		this.autor="Alberto";
		this.autorMusica="Javier";
		this.autorLetras="Maria";
		this.tipo="personas";
		this.numCuples=3;
		this.puntos=23;
		}


	@Override
	public void cantar_la_presentacion() {
	System.out.println("Cantando la presentacion de el Cuarteto, con el nombre "+nombre);
	}
	
	@Override
	public String mostrar_tipo() {
	return "La Chirigota va de "+tipo;	
	}
	
	@Override
	public String caminito_del_falla() {
		return "La Chirigota va cominito del falla";
	}

	public String amo_a_escucha() {
		
		return "Amo a escucha la Chirigota "+nombre;
	}

	public String getNombre() {
		return nombre;
	}

	

	public String getAutor() {
		return autor;
	}

	

	public String getAutorMusica() {
		return autorMusica;
	}

	

	public String getAutorLetras() {
		return autorLetras;
	}

	

	public String getTipo() {
		return tipo;
	}

	

	public int getNumCuples() {
		return numCuples;
	}

	
	public int getPuntos() {
		return puntos;
	}

	@Override
	public String toString() {
		return "Chirigota [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", numCuples=" + numCuples + ", puntos=" + puntos + "]";
	}

	
	
}
