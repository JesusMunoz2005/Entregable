package u4.u5.entregable;

public class Romancero extends AgrupacionOficial implements Callejera{

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private String tematica;
	
	
	Romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipo, String tematica){
	super(nombre,autor,autorMusica,autorLetras,tipo);
	this.nombre=nombre;	
	this.autor=autor;
	this.autorMusica=autorMusica;
	this.autorLetras=autorLetras;
	this.tipo=tipo;
	this.tematica=tematica;
	}
	
	Romancero(){
		this.nombre="Navidad en Sevilla";	
		this.autor="Alberto";
		this.autorMusica="Javier";
		this.autorLetras="Maria";
		this.tipo="Navidad";
		
		}
	
	

	@Override
	public String toString() {
		return "Romancero [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", tematica=" + tematica + "]";
	}
	
	@Override
	public void cantar_la_presentacion() {
	System.out.println("Cantando la presentacion de el Romancero, con el nombre "+nombre);
	}
	
	@Override
	public String mostrar_tipo() {
	return "El Romancero va de "+tipo;	
	}
	
	@Override
	public String caminito_del_falla() {
		return "El Romancero va cominito del falla";
	}
	

	public String amo_a_escucha() {
		
		return "Amo a escucha el Romancero"+nombre;
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

	public String getTematica() {
		return tematica;
	}
	
	
}
