package Controle;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import Entidade.Sensor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ctrRede {

    private Vector rede = new Vector();
    private final String arquivo = "rede.dat";
    Map<String, Object> meta = new HashMap<>();
    Configurador config = new Configurador();
    
    public void addSensor(Sensor sensor) throws Exception {
        rede.add(sensor);
        meta.put(sensor.getTipo(), sensor.getValue());
        config.publish(meta);
        gravaRede();}

    public void retornaSensores(int valorRede) {
        Sensor aux;
        for (int i = 0; i < rede.size(); i++) {
            aux = (Sensor) rede.elementAt(i);
            if (aux.getRedeID() == valorRede) {
               config.publicaRede(aux);
            }
        }
    }

    public void gravaRede() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream(arquivo);
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(rede);
        objOS.flush();
        objOS.close();}

    public void recuperaRede() throws Exception {
        File objFile = new File(arquivo);
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream(arquivo);
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            rede = (Vector) objIS.readObject();
            objIS.close();
        }
    }
}

