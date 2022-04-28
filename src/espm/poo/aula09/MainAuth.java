package espm.poo.aula09;

import java.util.ArrayList;
import java.util.List;

public class MainAuth {
    
    public static void main(String[] args) {
        
        Cliente nereu = new Cliente("Nereu");
        Funcionario lucas = new Diretor(001);
        Diretor zou = new Diretor(002);

        Usuario usu1 = new Cliente("rodrigo");

        List<Usuario> l = new ArrayList<>();

        l.add(nereu);
        l.add((Usuario)lucas);
        l.add(zou);
        l.add(usu1);

        for(Usuario u: l){
            System.out.println(u.getUsername());
        }
    }
}
