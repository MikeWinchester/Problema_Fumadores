import java.util.ArrayList;
import java.util.Random;

public class Agente {

    private ArrayList<String> ingredientes_agente = new ArrayList<>();
    private ArrayList<String> ingredientes_escogidos = new ArrayList<>();

    public Agente(ArrayList<String> ingredientes_agente) {
        this.ingredientes_agente = ingredientes_agente;
    }

    public ArrayList<String> ingredientesAleatorios(){
        Random rand = new Random();
        int random1 = rand.nextInt(this.ingredientes_agente.size());
        String ingrediente1 = this.ingredientes_agente.get(random1);
        this.ingredientes_agente.remove(random1);
        int random2 = rand.nextInt(this.ingredientes_agente.size());
        String ingrediente2 = this.ingredientes_agente.get(random2);
        ingredientes_escogidos.add(ingrediente1);
        ingredientes_escogidos.add(ingrediente2);

        return ingredientes_escogidos;
    }

    public void colocarIngredientes(){
        System.out.println("El agente ha colocado " + ingredientesAleatorios().get(0) 
         + " y " + ingredientesAleatorios().get(1) + " sobre la mesa.");
    }

    

    



    
}
