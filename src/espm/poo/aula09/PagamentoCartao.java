package espm.poo.aula09;

public class PagamentoCartao extends Pagamento {

    private double comissao;

    public PagamentoCartao(double valor, double comissao){
        super(valor);
        this.comissao = comissao;
    }

    @Override
    protected double calcularTotal(){
        return super.getValor() + comissao;
    }
    
}
