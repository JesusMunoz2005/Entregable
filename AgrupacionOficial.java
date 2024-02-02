package u4.u5.entregable;

public class AgrupacionOficial extends Agrupacion {

	protected static Integrante[] integrantes=new Integrante[5];
	
	protected AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
	super();
	}

	public AgrupacionOficial() {
	}

	public static void insertar_integrante(Integrante inte) {
		int i=0;
		while ((integrantes[i]!=null)&&(i<integrantes.length)) {
			i++;
		}
		integrantes[i]=inte;
	}
	
	public static boolean eliminar_integrante(Integrante inte) {
		boolean añadido = false;
		
		for (int j = 0; j < integrantes.length; j++) {
			if(integrantes[j]==inte) {
				añadido= true;
			}else {
			añadido= false;
		}
		
		}
		return añadido;
	}
	
	public String caminito_del_falla() {
		return null;
	}

	@Override
	public void cantar_la_presentacion() {		
	}
	
	@Override
	public String toString() {
		return null;
	}

	
}
