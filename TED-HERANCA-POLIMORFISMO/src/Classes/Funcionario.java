package Classes;

import Classes.Cargo;
import Classes.Endereco;

import java.util.Date;

public class Funcionario extends Pessoa {
    private Integer matricula;
    private Cargo cargo;
    private Double salario;
    private Date dataAdmissao;

    // Construtores
    public Funcionario(String nome, Date dataNascimento, Integer matricula, Endereco endereco, String telContato, Cargo cargo, Double salario, Date dataAdmissao) {
        super(nome, dataNascimento, endereco, telContato);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    // Getters e Setters
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    // Métodos
    public void reajustarSalario(double porcentagem) {
        double novoSalario = this.salario * porcentagem;
        System.out.println("O novo salário é R$" + novoSalario);
    }

    public void promover(String cargoNovo) {
        this.cargo.setNomeCargo(cargoNovo);
        System.out.println("O funcionário foi promovido a " + cargoNovo);
    }

    @Override
    public String toString() {
        String retorno = "Classes.Funcionario{" +
                "matricula=" + matricula +
                ", cargo=" + cargo +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao +
                '}';
        System.out.println(retorno);
        return retorno;
    }
}

