package espm.poo.ExHeranca.exercicioHeranca2;

public class EmpregadoComissionado extends Empregado {
    
    private double totalDeVendas;
    private double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao){
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    public double calcularSalario(){
        return (getTotalDeVendas() * getComissao()) / 100;
    }


    @Override
    public String toString() {
        return "{EC, Matricula: "+getMatricula()+", Nome: "+getNome()+", Salário: R$"+calcularSalario()+"}";
    }

}
