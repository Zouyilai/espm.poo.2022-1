package espm.poo.ExHeranca.exercicioHeranca1;

public class AlunoGraduacao extends Aluno{
    private String curso;
    private double integrativa;

    public AlunoGraduacao(long ra, String nome, String curso, double nota1, double nota2, double integrativa){
        super(ra, nome, nota1, nota2);
        this.curso = curso;
        this.integrativa = integrativa;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setIntegrativa(double integrativa) {
        this.integrativa = integrativa;
    }

    public String getCurso() {
        return curso;
    }

    public double getIntegrativa() {
        return integrativa;
    }

    public double calcularMedia(){
        double mediaA = (getNota1()+getNota2())/2;
        double media = mediaA * 0.7 + getIntegrativa() * 0.3;
        return media;
    }

    @Override
    public String toString() {
        return "{Graduação, RA: "+getRa()+", Nome: "+getNome()+", Curso: "+getCurso()+", Média: "+calcularMedia()+"}";
    }


}
