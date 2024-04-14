package Dominio;

public class Lampada {

    private String nome;
    private String tipo;
    private String marca;
    private int voltagem;
    private double custo;
    private boolean ativa;

    public Lampada(String nome, String marca, int voltagem, double custo){

        this.nome = nome;
        this.marca = marca;
        this.voltagem = voltagem;
        this.custo = custo;

    }

    public Lampada(){

    }

    
    public void desligarLampada(){
        setAtiva(false);
    }
    
    public void ligarLampada(){
        setAtiva(true);
    }
    
    private void setAtiva(boolean ativa){
        this.ativa = ativa;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca){

        this.marca = marca;

    }
 
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
}
