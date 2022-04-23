package espm.poo.ExHeranca.exercicioHeranca1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        AlunoFundamental af = new AlunoFundamental(111, "A", 9, 10, 9);
        alunos.add(af);

        AlunoGraduacao ag = new AlunoGraduacao(222, "B", "Adm", 8, 10, 9);
        alunos.add(ag);

        AlunoPosGraduacao ap = new AlunoPosGraduacao(333, "C", "RI", 9, 10);
        alunos.add(ap);

        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i));
        }


    }
}
