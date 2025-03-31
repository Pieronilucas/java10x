package Desafios.Tentativas.Desafio05;

public class ContaPoupanca extends ContaBancaria {
    private double saldo;
    public ContaPoupanca(double saldo) {

    }
    @Override
    public double depositar(double valor) {
        return saldo += (valor*0.99);
    }
}
