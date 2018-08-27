package Main;

import Controle.Configurador;
import Views.Principal;

public class Main {
    
    public static void main (String[] args) {
        // Create the zoo to store animals
        Principal principal = new Principal();
        // Register a listener to be notified when an animal is added
        // Add an animal notify the registered listeners
        
        //rede1.addSensor(new Sensor("Sensor 1"));      
        principal.setVisible(true);
    }
}
