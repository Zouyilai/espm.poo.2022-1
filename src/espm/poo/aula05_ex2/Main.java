package espm.poo.aula05_ex2;

import java.util.Scanner;


public class Main {

    private static Banco banco = null;
    
    public static void main(String[] args){

        banco = new Banco("ESPM Bank");
        
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            try{
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
                } else if("find".equals(input)){
                    throw new UnsupportedOperationException(); //levantar exceção o código para
                } else {
                    System.err.println("Comando inválido!");
                }
                
            } catch(UnsupportedOperationException e) {
                e.printStackTrace(); //tente (try) -> exceção (catch)
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
        
        banco.getClientes().forEach(c -> {
            
            if(c instanceof PessoaFisica){
                PessoaFisica pf = (PessoaFisica) c;
                System.out.println(pf);
            } else if (c instanceof PessoaJuridica){
                PessoaJuridica pj = (PessoaJuridica) c;
                System.out.println(pj);
            }
            /*String tp = c instanceof PessoaFisica ? "f": "j";
            System.out.println(tp +" "+ c);*/

        });
        
        /*for(Cliente c : banco.getClientes()){ 
            System.out.println(c); //-> mesma função
        }*/

    }//passar -> set; pegar -> get
    
    private static void addCostumer(Banco banco) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = scan.nextLine();

        TipoPessoa tipoPessoa = inputTipoCliente();

        Cliente c = null;
        switch(tipoPessoa) {
            case Fisica:
                System.out.print("CPF: ");
                String cpf = scan.nextLine();

                PessoaFisica pf = new PessoaFisica();

                pf.setCpf(cpf);
                c = pf;
                break;
            case Juridica:
                PessoaJuridica pj = new PessoaJuridica();

                System.out.print("CNPJ: ");
                String cnpj = scan.nextLine();

                pj.setCnpj(cnpj);
                c = pj;
                break;
        }


        //c.setCpf(cpf);

        c.setNome(nome);

        banco.addCliente(c);
        //System.out.println("Nome: " + c.getNome());
        //System.out.println("CPF: " + c.getCpf());
        
    }


    private static TipoPessoa inputTipoCliente(){
        Scanner scan = new Scanner(System.in);

        String tp = "";

        while(!tp.equals("j") && !tp.equals("f")){

            System.out.println("Tipo do Cliente? [F|J]");
            tp = scan.nextLine().toLowerCase();

            if(!tp.equals("j") && !tp.equals("f")){
                System.out.println("F: Pessoa Física | J: Pessoa Jurídica");
            }
        }

        return tp.equals("f") ? TipoPessoa.Fisica : TipoPessoa.Juridica;
    }
}
