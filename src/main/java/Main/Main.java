package Main;

import Controle.Configurador;
import Entidade.Rede;
import Entidade.Sensor;
import Listeners.PrintNameAnimalAddedListener;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main (String[] args) {
        // Create the zoo to store animals
        Rede rede1 = new Rede();
        String teste = null;
// Register a listener to be notified when an animal is added
        rede1.registerAnimalAddedListener(new PrintNameAnimalAddedListener());
        // Add an animal notify the registered listeners
        Configurador config = new Configurador();
        while(teste != "Sair"){
        teste = JOptionPane.showInputDialog("Digite uma mensagem: ");
        config.publish(teste);
        }
        
        rede1.addSensor(new Sensor("Sensor 1"));
    }
}
