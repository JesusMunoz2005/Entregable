package u4.u5.entregable;

public class main {
public static void main(String[] args) {
	
Cuarteto cuarteto1=new Cuarteto("La selva", "alberto",  "Javier", "Maria","Animales", 10, 6);

System.out.println(cuarteto1.toString());

cuarteto1.cantar_la_presentacion();

System.out.println(cuarteto1.caminito_del_falla());

System.out.println(cuarteto1.amo_a_escucha());

System.out.println("-----------------------");

Integrante inte1=new Integrante(2, 40, "Gines");

System.out.println(inte1.toString());


AgrupacionOficial.insertar_integrante(inte1);

System.out.println(AgrupacionOficial.integrantes[1]);

System.out.println(AgrupacionOficial.eliminar_integrante(inte1));

COAC.inscribir_agrupacion(cuarteto1);

System.out.println(COAC.agrupaciones[1]);

COAC.eliminar_agrupacion(cuarteto1);

System.out.println("--------------");

System.out.println();
 }
}
