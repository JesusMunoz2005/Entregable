package u4.u5.entregable;

import java.util.Arrays;

public abstract class COAC extends AgrupacionOficial{

private COAC(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
	}

protected static Agrupacion[] agrupaciones=new Agrupacion[5];
	
public static void inscribir_agrupacion(AgrupacionOficial agrupacion) {
	int i=0;
	while ((agrupaciones[i]!=null)&&(i<agrupaciones.length)) {
		i++;
	}
	agrupaciones[i]=agrupacion;
}

public static boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
	boolean eliminado = false;
	
	for (int j = 0; j < agrupaciones.length; j++) {
		if(agrupaciones[j]==agrupacion) {
			agrupaciones[j]=null;
			eliminado= true;
		}else {
			eliminado= false;
	}
	}
	return eliminado;
}

public void ordenar_por_puntos() {
	Arrays.sort(agrupaciones);
}

public void ordenar_por_nombre() {
	Arrays.sort(agrupaciones);
}

public void ordenar_por_autor() {
	Arrays.sort(agrupaciones);
}

}
