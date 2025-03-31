package Desafios.Tentativas.Desafio05;

public class ContaCorrente extends ContaBancaria {
    private double saldo;
    public ContaCorrente(double saldo) {}

    @Override
    public double depositar(double valor) {
       return saldo += valor;
    }

}
