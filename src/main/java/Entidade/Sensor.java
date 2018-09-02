package Entidade;

public class Sensor {

    private String ID, tipo, mensagem;
    private int redeID, value;

    public Sensor(String ID, String tipo, int redeID, String mensagem, int value) {
        this.mensagem = mensagem;
        this.ID = ID;
        this.tipo = tipo;
        this.value = value;
        this.redeID = redeID;
    }

    //Criação dos Setter's da Entidade Sensor
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRedeID(int redeID) {
        this.redeID = redeID;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //Criação dos Getter's da Entidade Sensor
    public String getID() {
        return this.ID;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getValue() {
        return this.value;
    }

    public int getRedeID() {
        return this.redeID;
    }
}
