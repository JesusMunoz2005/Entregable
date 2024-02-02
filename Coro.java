package u4.u5.entregable;

public class Coro extends AgrupacionOficial {
	
	private int numBandurrias;
	private int numGuitarras;
	private int puntos;
	
	
	Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int numBandurrias, int numGuitarras, int puntos){
	super(nombre,autor,autorMusica,autorLetras,tipo);
	this.nombre=nombre;	
	this.autor=autor;
	this.autorMusica=autorMusica;
	this.autorLetras=autorLetras;
	this.tipo=tipo;
	this.numBandurrias=numBandurrias;
	this.numGuitarras=numGuitarras;
	this.puntos=puntos;
	}
	
	Coro(){
		super();
		this.nombre="Avion sin control";	
		this.autor="Alberto";
		this.autorMusica="Javier";
		this.autorLetras="Maria";
		this.tipo="Aviones";
		this.numGuitarras=2;
		this.numBandurrias=1;
		this.puntos=19;
		}

	
	
	@Override
	public String toString() {
		return "Coro [numBandurrias=" + numBandurrias + ", numGuitarras=" + numGuitarras + ", puntos=" + puntos + "]";
	}

	@Override
	public void cantar_la_presentacion() {
	System.out.println("Cantando la presentacion de el Coro, con el nombre "+nombre);
		
	}
	
	@Override
	public String mostrar_tipo() {
	return "El Coro va de "+tipo;	
	}
	
	@Override
	public String caminito_del_falla() {
		return "El Coro va cominito del falla";
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

	public int getNumBandurrias() {
		return numBandurrias;
	}

	public int getNumGuitarras() {
		return numGuitarras;
	}

	public int getPuntos() {
		return puntos;
	}
	
}
