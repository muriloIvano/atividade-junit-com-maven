package one.digitalinnovation;

public class ContaPessoa extends Pessoa{
    private double saldo;

    public ContaPessoa(String nome, int idade, double saldo) {
        super(nome, idade);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Saldo em conta: R$"+ saldo);
    }
    public void sacar(double valor){
        saldo -= valor;
        System.out.println("Saldo em conta: R$"+ saldo);
    }
    public void exibirSaldo(){
        System.out.println("Saldo em conta: R$"+ saldo);
    }
}
