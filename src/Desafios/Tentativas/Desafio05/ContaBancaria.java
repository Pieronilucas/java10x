package Desafios.Tentativas.Desafio05;

public abstract class ContaBancaria implements Conta {
        private double saldo;
        public ContaBancaria() {

        }

        @Override
        public void consultarSaldo() {
            System.out.println("Saldo: " + getSaldo());
        }

        public double getSaldo() {
            return saldo;
        }

}
