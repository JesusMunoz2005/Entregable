package u4.u5.entregable;

public class Comparsa extends AgrupacionOficial{

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private String empresaAtrezzo;
	private int puntos;
	
	
	Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipo, String empresaAtrezzo, int puntos){
	super(nombre,autor,autorMusica,autorLetras,tipo);
	this.empresaAtrezzo=empresaAtrezzo;
	this.puntos=puntos;
	}
	
	Comparsa(){
		super();
		this.nombre="Clase de mates";	
		this.autor="Alberto";
		this.autorMusica="Javier";
		this.autorLetras="Maria";
		this.tipo="Colegio";
		this.empresaAtrezzo="Disfraces Muñoz";
		this.puntos=20;
		}

	

	@Override
	public String toString() {
		return "Comparsa [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", empresaAtrezzo=" + empresaAtrezzo + ", puntos=" + puntos + "]";
	}

	@Override
	public void cantar_la_presentacion() {
	System.out.println("Cantando la presentacion de la Comparsa, con el nombre "+nombre);
	}
	
	@Override
	public String mostrar_tipo() {
	return "La Comparsa va de "+tipo;	
	}
	
	@Override
	public String caminito_del_falla() {
		return "La comparsa va cominito del falla";
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

	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public int getPuntos() {
		return puntos;
	}
	
	
}
