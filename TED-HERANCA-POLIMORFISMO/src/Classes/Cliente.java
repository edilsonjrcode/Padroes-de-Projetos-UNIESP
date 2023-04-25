package Classes;

import java.util.Date;

public class Cliente extends Pessoa {
    private String codigo;
    private String profissao;

    public Cliente(String codigo, String nome, Date dataNascimento, Endereco endereco, String telContato, String profissao) {
        super(nome, dataNascimento, endereco, telContato);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        String retorno =  "Classes.Cliente [codigo=" + codigo + ", nome=" + getNome() + ", dataNascimento=" + getDataNascimento()
                + ", endereco=" + getEndereco() + ", profissao=" + profissao + "]";
        System.out.println(retorno);
        return retorno;
    }

}
