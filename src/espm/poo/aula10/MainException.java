package espm.poo.aula10;

public class MainException {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 5;
        double media = (n1 + n2) / 0; //infinity -> double -> ponto flutuante
        System.out.println(media);
        System.out.println(1/0); //erro -> Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
