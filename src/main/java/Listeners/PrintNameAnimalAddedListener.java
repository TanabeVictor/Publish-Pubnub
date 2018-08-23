package Listeners;

import Entidade.Sensor;

public class PrintNameAnimalAddedListener implements AddSensor {
   
    @Override
    public void adicionaSensor(Sensor Sensor) {
        System.out.println("Adicionado novo sensor na rede: '" + Sensor.getMensagem() + "'");
    }
}