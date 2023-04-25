package Classes;

public class Endereco {
    private String nome;
    private String numero;
    private String cidade;

    public Endereco() {

    }

    public Endereco(String nome, String numero, String cidade) {
        this.nome = nome;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Classes.Endereco [nome=" + nome + ", numero=" + numero + ", cidade=" + cidade + "]";
    }

}
