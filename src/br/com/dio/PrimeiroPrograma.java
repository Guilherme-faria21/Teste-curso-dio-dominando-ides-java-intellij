package br.com.dio;


import br.com.dio.model.gato;



public class PrimeiroPrograma {

    public static void main(String[] args) {
       gato Gato = new gato();
        System.out.println(Gato);

        /*int a = 30;
        int " + (a+b)); b = 50;
        System.out.println("Hello world!);*/

    }
}

class livro {
    private String nome;
    private Integer nmrpaginas;

    public livro(String nome, Integer nmrpaginas) {
        this.nome = nome;
        this.nmrpaginas = nmrpaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNmrpaginas() {
        return nmrpaginas;
    }

    public void setNmrpaginas(Integer nmrpaginas){
        this.nmrpaginas = nmrpaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", nmrpaginas=" + nmrpaginas +
                '}';
    }
}
