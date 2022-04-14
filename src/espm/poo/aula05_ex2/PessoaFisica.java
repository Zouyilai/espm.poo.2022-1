package espm.poo.aula05_ex2;

public class PessoaFisica extends Cliente{
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "{nome: "+ getNome() + ", cpf: "+getCpf()+"}";
    }
}
