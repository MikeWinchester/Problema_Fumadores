import java.util.ArrayList;
import java.util.Random;


public class Prueba{

    static ArrayList<Fumador> fumadores = new ArrayList<Fumador>();
    static ArrayList<String> ingredientes = new ArrayList<>();
    static Agente agente = new Agente(ingredientes);

    public static void main(String[] args) {

        crearFumadores();
        agente.colocarIngredientes();
        validacion_1();

    }

    public static void crearFumadores(){

        llenarIngredientes();

        Random rand = new Random();
        int h=ingredientes.size();
        
        for(int i=0;i<3;i++){
            int random = rand.nextInt(h);
            Fumador fumador = new Fumador(ingredientes.get(random), (i+1));
            fumadores.add(fumador);
            ingredientes.remove(random);
            h--;
        }

        for (Fumador fumador : fumadores) {
            System.out.println(fumador.toString());
        }

        llenarIngredientes();
    }

    public static void llenarIngredientes(){

        ingredientes.clear();
        ingredientes.add("tabaco");
        ingredientes.add("papel");
        ingredientes.add("fósforos");
    }

    public static void validacion_1(){

        llenarIngredientes();
        ArrayList<String> ingredientes_agente = agente.ingredientesAleatorios();

        for (Fumador fumador : fumadores){
            if((fumador.getIngrediente() != ingredientes_agente.get(0))&&
                (fumador.getIngrediente() != ingredientes_agente.get(1))){
                fumador.Fumar();
                }else{
                    fumador.Esperar();
                }
        }
    }
}
