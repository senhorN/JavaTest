package felino;

import java.util.Objects;

public class Gato {
    private String Nome;
    private Integer Idade;
    private String Cor;



    public Gato(String nome, String cor, Integer idade)
    {
        this.Nome = nome;
        this.Cor = cor;
        this.Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(Nome, gato.Nome) && Objects.equals(Idade, gato.Idade) && Objects.equals(Cor, gato.Cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, Idade, Cor);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", Cor='" + Cor + '\'' +
                '}';
    }
}
