package Dominio;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private boolean status;
    private boolean isEspecial;
    private double limiteEspecial;

    public ContaCorrente(int numero, double saldo, boolean status, boolean isEspecial, double limiteEspecial){
        this(numero, saldo);
        this.status = status;
        this.isEspecial = isEspecial;
        this.limiteEspecial = limiteEspecial;
    }
    public ContaCorrente(int numero, double saldo, boolean isEspecial, double limiteEspecial){
        this(numero, saldo);
        this.isEspecial = isEspecial;
        this.limiteEspecial = limiteEspecial;
    }
    public ContaCorrente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public ContaCorrente(){
    }
    
    //FULL
    public double saque(double valordosaque){
        if(this.saldo >= valordosaque){
            this.saldo -= valordosaque;
            System.out.println("Saque concluído!");
            return valordosaque;
        } else if(isEspecial){
            double limite = this.limiteEspecial + this.saldo;
            if (limite >= valordosaque) {
                this.saldo -= valordosaque;
                System.out.println("Saque com cheque especial realizado!");
                return valordosaque;
            }else{
                System.out.println("Saque com cheque especial insuficiente!");
                return 0;
            }
        }
        else{
            System.out.println("Saque não realizado, saldo insuficiente!");
            return 0;
        }
    }

    //FULL
    public void deposito(double valordodeposito){
        this.saldo += valordodeposito;
        System.out.println("O depósito de R$" + valordodeposito + " foi concluido!\n Seu valor atual na conta é de:\nR$" + this.saldo);
    }

    //FULL
    public void consultarSaldo(){
        System.out.println("Seu saldo atual é de R$" + this.saldo);
    }

    //FULL
    public void consultarEspecial(){
        if (this.saldo < 0) {
            System.out.println("O cheque especial está sendo utilizado!");
        }else{
            System.out.println("O cheque especial não está sendo utilizado!");
        }
    }

    
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getNumero() {
        return this.numero;
    }
    public boolean isEspecial() {
        return this.isEspecial;
    }
    public double getLimite() {
        return this.limiteEspecial;
    }

    
    
}
