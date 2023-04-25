package Classes;

import Classes.Endereco;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private String telContato;

    public Pessoa() {
    }

    public Pessoa(String nome, Date dataNascimento, Endereco endereco, String telContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telContato = telContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelContato() {
        return telContato;
    }

    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void cadastrar() {
        System.out.println("Usuário Cadastrado!");
    }

    public Integer obterIdade() {
        Date data = new Date();
        Integer idade = data.getYear() - dataNascimento.getYear();
        System.out.println("A idade de " + getNome() + " é de " + idade + " anos.");
        return idade;
    }

    @Override
    public String toString() {
        String retorno =  "Classes.Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                ", telContato='" + telContato + '\'' +
                '}';
        System.out.println(retorno);
        return retorno;
    }
}