package espm.poo.ExHeranca.exercicioHeranca1;

public class AlunoFundamental extends Aluno {
    private int serie;

    public AlunoFundamental(long ra, String nome, int serie, double nota1, double nota2){
        super(ra, nome, nota1, nota2);
        this.serie = serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }
 
    public double calcularMedia(){
        double media = (getNota1()+getNota2())/2;
        return media;
    }

    @Override
    public String toString() {
        return "{Fundamenta, RA: "+getRa()+", Nome: "+getNome()+", Série: "+getSerie()+", Média: "+calcularMedia()+"}";
    }

}
