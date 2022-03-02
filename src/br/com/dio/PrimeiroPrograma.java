package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        livro livro1 = new livro("O problema dos 3 corpos",300);
        System.out.println(livro1);

        /*int a = 2;
        int b = 3;
        System.out.println("Olá mundo! " + (a+b));*/
    }
}

class livro {
    private String nome;
    private String numPaginas;

    public livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = String.valueOf(numPaginas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}
