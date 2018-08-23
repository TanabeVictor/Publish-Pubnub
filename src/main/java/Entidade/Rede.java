
package Entidade;

import Listeners.AddSensor;
import java.util.ArrayList;
import java.util.List;

public class Rede {
    private List<Sensor> sensores = new ArrayList<>();
    private List<AddSensor> listeners = new ArrayList<>();
    
    public void addSensor(Sensor sensor) {
        // Add the animal to the list of animals
        this.sensores.add(sensor);
        // Notify the list of registered listeners
        this.notifyAnimalAddedListeners(sensor);}
    
    public void registerAnimalAddedListener (AddSensor listener) {
        // Add the listener to the list of registered listeners
        this.listeners.add(listener);}
    
    public void unregisterAnimalAddedListener (AddSensor listener) {
        // Remove the listener from the list of the registered listeners
        this.listeners.remove(listener);}
    
    protected void notifyAnimalAddedListeners (Sensor sensor) {
        // Notify each of the listeners in the list of registered listeners
        this.listeners.forEach(listener -> listener.adicionaSensor(sensor));}}
