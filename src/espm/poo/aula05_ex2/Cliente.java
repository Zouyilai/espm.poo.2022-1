package espm.poo.aula05_ex2;

public abstract class Cliente {
    //nao permite criação de objeto do tipo Cliente -> apenas PJ e PF

    private String nome;
    private String sobrenome;
    private Conta conta;

    public Cliente(){
        this.conta = new Conta(this); // this = cliente
    }

    public void setNome(String nome) {
        String[] nomes = nome.split(" ");
        this.nome = nomes[0];
        this.sobrenome = nomes[nomes.length-1];
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString(){
        return "{ nome: " + nome +
                " conta: "+ conta + " }";
    }
}
