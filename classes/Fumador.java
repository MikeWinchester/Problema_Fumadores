public class Fumador{

    private String ingrediente;
    private int numero;

    

    public Fumador(String ingrediente, int numero) {
        this.ingrediente = ingrediente;
        this.numero = numero;
    }

    public void Fumar(){
        System.out.println("El fumador "+ numero + " ha comenzado a fumar.");
    }

    public void Esperar(){
        System.out.println("El fumador "+ numero + " está en la sala de espera.");
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "El fumador " + numero + " tiene " + ingrediente + ".";
    }

    
}