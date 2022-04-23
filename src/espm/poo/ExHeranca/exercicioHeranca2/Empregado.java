package espm.poo.ExHeranca.exercicioHeranca2;

public class Empregado {
    private long matricula;
    private String nome;

    public Empregado(long matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
