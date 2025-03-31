package Intermediario.Records;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Fulano", 1);
        System.out.println(funcionario1);
        System.out.println(funcionario1.id());
        System.out.println(funcionario1.name());
    }
}
