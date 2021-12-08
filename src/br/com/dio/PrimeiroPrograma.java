package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args){

       /* int a = 10;
        int b = 3;
        System.out.println("Hello World!!!" + (a+b));*/

        Gato gato = new Gato();

        System.out.println(gato);

        //Livro livro1 = new Livro(nome "Java Básico", numPagina 300);
        Livro livro = new Livro();
        livro.setNome("Java Básico");
        livro.setNumPagina(300);

        System.out.println(livro);

    }
}
class Livro {
    private String nome;
    private Integer numPagina;

    public Livro() {
    }

    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPagina, livro.numPagina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPagina);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}
