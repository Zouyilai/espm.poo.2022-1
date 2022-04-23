package espm.poo.ExHeranca.exercicioHeranca2;

public class EmpregadoHorista extends Empregado {
    
    int totalDeHoraTrabalhadas;
    double valorDaHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalDeHoraTrabalhadas, double valorDaHoraTrabalhada){
        super(matricula, nome);
        this.totalDeHoraTrabalhadas = totalDeHoraTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public int getTotalDeHoraTrabalhadas() {
        return totalDeHoraTrabalhadas;
    }

    public void setTotalDeHoraTrabalhadas(int totalDeHoraTrabalhadas) {
        this.totalDeHoraTrabalhadas = totalDeHoraTrabalhadas;
    }

    public double getValorDaHoraTrabalhada() {
        return valorDaHoraTrabalhada;
    }

    public void setValorDaHoraTrabalhada(double valorDaHoraTrabalhada) {
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public double calcularSalario(){
        return totalDeHoraTrabalhadas * valorDaHoraTrabalhada;
    }

    @Override
    public String toString() {
        return "{EH, Matricula: "+getMatricula()+", Nome: "+getNome()+", Salário: R$"+calcularSalario()+"}";
    }
}
