package espm.poo.aula05_ex2;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    private static Banco banco = null;
    
    public static void main(String[] args){

        banco = new Banco("ESPM Bank");
        
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.print("ESPM > ");
            String input = scan.nextLine().trim().toLowerCase(); //tirar espaço-> trim()

            if("".equals(input)){
            } else if("exit".equals(input)) {
                exit = true;
            } else if("help".equals(input)){
                help();
            } else if("list".equals(input)){
                listCostumers(banco);
            } else if("add".equals(input)){
                addCostumer(banco);
            } else {
                System.err.println("Comando inválido!");
            }
            
        }

        System.out.println("Bye!");
    }

    private static void help(){
        System.out.println("Sistema de clientes");
        System.out.println("-------------------");
        System.out.println("add  -> Cadastar cliente");
        System.out.println("list -> Listar cliente");
        System.out.println("del  -> Apaga cliente");
        System.out.println("find -> Localizar cliente");
        System.out.println();
        System.out.println("exit -> Sair do sistema");
        
    }

    private static void listCostumers(Banco banco){//passa o objeto como referência 
        
        
        banco.getClientes().forEach(c -> System.out.println(c));
        
        /*for(Cliente c : banco.getClientes()){ 
            System.out.println(c); //-> mesma função
        }*/

    }//passar -> set; pegar -> get
    
    private static void addCostumer(Banco banco) {
        Scanner scan = new Scanner(System.in);

        Cliente c = new Cliente();

        String nome, cpf;

        System.out.print("Nome: ");
        nome = scan.nextLine();

        System.out.print("CPF: ");
        cpf = scan.nextLine();

        c.setNome(nome);
        c.setCpf(cpf);

        banco.addCliente(c);
        //System.out.println("Nome: " + c.getNome());
        //System.out.println("CPF: " + c.getCpf());
        
        
    }
}
