package Controle;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import Entidade.Sensor;

public class ctrRede {

    private Vector rede = new Vector();
    Map<String, Object> meta = new HashMap<>();
    Configurador config = new Configurador();

    public void addSensor(Sensor sensor) {
        rede.add(sensor);
        meta.put(sensor.getTipo(), sensor.getValue());
        config.publish(meta);
    }

    public void retornaSensores(int valorRede) {
        Sensor aux;
        for (int i = 0; i < rede.size(); i++) {
            aux = (Sensor) rede.elementAt(i);
            if (aux.getRedeID() == valorRede) {
                System.out.println(aux.getID());
            }
        }
    }
}
