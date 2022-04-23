package espm.poo.ExHeranca.exercicioHeranca1;

public class Aluno {
    private long ra;
    private String nome;
    private double nota1, nota2;

    public Aluno(long ra, String nome, double nota1, double nota2){
        this.ra = ra;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public long getRa() {
        return ra;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
