import Classes.Cargo;
import Classes.Cliente;
import Classes.Endereco;
import Classes.Funcionario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("João", new Date(101, 10, 15), 123,
                new Endereco("Rua África", "123", "João Classes.Pessoa"), "88998877", new Cargo("Diretor"), 1330d,
                new Date(122, 10, 15));

        func1.toString();
        func1.cadastrar();
        func1.obterIdade();
        func1.promover("Diretor");
        System.out.printf("O salário de %s é de R$%.2f", func1.getNome(), func1.getSalario());
        System.out.println("\n");

        Cliente cli1 = new Cliente("1", "Pedro", new Date(92, 1, 13), new Endereco("Rua África", "123", "João Classes.Pessoa"),
                "89785632", "Analista");

        cli1.toString();
        cli1.cadastrar();
        cli1.obterIdade();
        System.out.printf("A profissão de %s é %s", cli1.getNome(), cli1.getProfissao());




    }
}