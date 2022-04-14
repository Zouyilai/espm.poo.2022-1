package espm.poo.aula08;

public class Livro {
    String titulo;
    final Autor a; // final -> não permite alteração do atributo 

    public Livro(String titulo, String nome, String cidade) {
        this.titulo = titulo;
        a = new Autor(nome, cidade);
    }
}
