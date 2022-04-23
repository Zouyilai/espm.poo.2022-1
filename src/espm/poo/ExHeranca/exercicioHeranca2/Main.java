package espm.poo.ExHeranca.exercicioHeranca2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();
    
        EmpregadoComissionado ec = new EmpregadoComissionado(111, "zou", 100, 100);
        empregados.add(ec);

        EmpregadoHorista eh = new EmpregadoHorista(112, "lilia", 100, 200);
        empregados.add(eh);

        for(int i = 0; i < empregados.size(); i++){
            System.out.println(empregados.get(i));
        }

    }
    
}
