package u4.u5.entregable;

public class Cuarteto extends AgrupacionOficial implements Callejera{

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private int numMiembros;
	private int puntos;
	
	
	Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int numMiembros, int puntos){
	super(nombre,autor,autorMusica,autorLetras,tipo);
	this.nombre=nombre;	
	this.autor=autor;
	this.autorMusica=autorMusica;
	this.autorLetras=autorLetras;
	this.tipo=tipo;
	this.numMiembros=numMiembros;
	this.puntos=puntos;
	}

	Cuarteto(){
		this.nombre="La selva";	
		this.autor="Alberto";
		this.autorMusica="Javier";
		this.autorLetras="Maria";
		this.tipo="Animales";
		this.numMiembros=6;
		this.puntos=14;
		}
	
	

	@Override
	public String toString() {
		return "Cuarteto [nombre=" + this.nombre + ", autor=" + this.autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", numMiembros=" + numMiembros + ", puntos=" + puntos + "]";
	}

	@Override
	public void cantar_la_presentacion() {
	System.out.println("Cantando la presentacion de el Cuarteto, con el nombre "+nombre);
	}
	
	@Override
	public String mostrar_tipo() {
	return "El Cuarteto va de "+tipo;	
	}
	
	@Override
	public String caminito_del_falla() {
		return "El Cuarteto va cominito del falla";
	}
	

	public String amo_a_escucha() {
		
		return "Amo a escucha el Cuarteto "+nombre;
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

	public int getNumMiembros() {
		return numMiembros;
	}

	public int getPuntos() {
		return puntos;
	}
	
}
