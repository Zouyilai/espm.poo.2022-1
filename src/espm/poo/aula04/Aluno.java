package espm.poo.aula04;

public class Aluno {
    
    Integer ra = null;
    String nome = null;

    public Aluno(Integer ra, String nome){
        this.nome = nome;
        this.ra = ra;
    }

    @Override //método pai
    public String toString() {
        return "{ra: "+ ra + ", nome: " + nome + "}";
        //return super.toString(); //super = pai da classe (object), se não configurar aqui, a impressão será da posição de memoria
    }

    public double media(double... notas){
        double soma = 0;
        for(double n: notas){
            soma += n;
        }
        return (float) (soma/notas.length);
        //return Arrays.stream(notas).average().getAsDouble();
    }

    public boolean equals(Object obj){
        return obj != null
            && obj instanceof Aluno
            && ra.equals(((Aluno) obj).ra);
    }

    @Override
    public int hashCode(){
        return ra.hashCode();
    }
}
