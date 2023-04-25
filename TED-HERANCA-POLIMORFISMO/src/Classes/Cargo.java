package Classes;

public class Cargo {
    private String nomeCargo;

    public Cargo() {
    }

    public Cargo(String nome) {
        this.nomeCargo = nome;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nome) {
        this.nomeCargo = nome;
    }

    @Override
    public String toString() {
        return "Classes.Cargo{" +
                "nomeCargo='" + nomeCargo + '\'' +
                '}';
    }
}