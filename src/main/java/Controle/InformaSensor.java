package Controle;

import Controle.AddSensor;
import Entidade.Sensor;

public class InformaSensor implements AddSensor {
    Configurador config = new Configurador();
        
    @Override
    public void adicionaSensor(Sensor Sensor) {
        config.publish("Adicionado novo sensor na rede: '" + Sensor.getID() + "'"+ " Tipo: '"+ Sensor.getTipo()+"'");
    }
}