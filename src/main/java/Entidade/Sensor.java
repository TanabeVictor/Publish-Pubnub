package Entidade;

public class Sensor {
    private String ID;
    private String tipo;
    private int redeID;
    private String mensagem;
    private int value;
    
    public Sensor(String ID, String tipo, int redeID, String mensagem, int value){
        this.mensagem = mensagem;
        this.ID = ID;
        this.tipo = tipo;
        this.value = value;
        this.redeID = redeID;}

    public String getMensagem(){
        return this.mensagem;}
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;}

     public String getID(){
        return this.ID;}
    
    public void setID(String ID){
        this.ID = ID;}
    
     public String getTipo(){
        return this.tipo;}
    
    public void setTipo(String tipo){
        this.tipo = tipo;}
    
     public int getValue(){
        return this.value;}
    
    public void setValue(int value){
        this.value = value;}
    
    public int getRedeID(){
        return this.redeID;}
    
    public void setRedeID(int redeID){
        this.redeID = redeID;}}
