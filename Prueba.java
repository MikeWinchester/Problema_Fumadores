import java.util.ArrayList;
import java.util.*;

public class Prueba{

    static ArrayList<Fumador> fumadores = new ArrayList<Fumador>();
    static ArrayList<String> ingredientes = new ArrayList<>();

    public static void main(String[] args) {

        crearFumadores();

    }

    public static void crearFumadores(){

        Random rand = new Random();
        int h=3;

        ingredientes.add("Tabaco");
        ingredientes.add("Papel");
        ingredientes.add("Fósforos");

        
        for(int i=0;i<3;i++){
            int random = rand.nextInt(h);
            Fumador fumador = new Fumador(ingredientes.get(random), (i+1));
            fumadores.add(fumador);
            ingredientes.remove(random);
            h--;
        }
        
        System.out.println("FUMADORES DISPONIBLES");
        System.out.println("---------------------");
        for (Fumador f : fumadores){
            System.out.println("Fumador " + f.getNumero() + ", ingrediente: " + f.getIngrediente());
            
        }
    }
}
