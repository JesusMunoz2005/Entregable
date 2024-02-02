package u4.u5.entregable;

public abstract class Agrupacion{

int TotalAgrupaciones;	
protected static String nombre;
protected static String autor;
protected static String autorMusica;
protected static String autorLetras;
protected static String tipo;
	
Agrupacion(){
TotalAgrupaciones++;
this.nombre=nombre;	
this.autor=autor;
this.autorMusica=autorMusica;
this.autorLetras=autorLetras;
this.tipo=tipo;
}

public abstract void cantar_la_presentacion();	

public String mostrar_tipo() {
	return null;
 }

public int compareTo(Integrante o) {
	
	return 0;
}
}

