package espm.poo.aula05_ex2;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;

    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome; //this -> atributo
        this.clientes = new ArrayList<>(); //inicializado com lista 0
        this.contas = new ArrayList<>();
    }

    public void addCliente(Cliente c){
        this.clientes.add(c);
        this.contas.add(c.getConta());
    }

    public List<Cliente> getClientes(){
        return clientes;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas(){
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
}
