package espm.poo.ExHeranca.exercicioHeranca1;

public class AlunoPosGraduacao extends Aluno {
    private String curso;

    public AlunoPosGraduacao(long ra, String nome, String curso, double nota1, double nota2){
        super(ra, nome, nota1, nota2);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public double calcularMedia(){
        double media = getNota1() * 0.4 + getNota2() * 0.6;
        return media;
    }

    @Override
    public String toString() {
        return "{Pós Graduação, RA: "+getRa()+", Nome: "+getNome()+", Curso: "+getCurso()+", Média: "+calcularMedia()+"}";
    }

}
