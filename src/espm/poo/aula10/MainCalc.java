package espm.poo.aula10;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.print("a: ");
                double a = scanner.nextDouble();
                System.out.print("b: ");
                double b = scanner.nextDouble();
                scanner.nextLine();
                String op = null;
                
                try{
                    op = input("operacao [+-/*^]: [!]", "-", "/", "+", "^", "*", "!");
                } catch (ESPMException e){
                    System.err.println("Entrada inválida: "+ e.getMessage());
                    //throw e;
                    throw new RuntimeException(e.getMessage(), e);
                }
                
                if(op.equals("!")){
                    break;
                }
        
                double x = op.equals("-") ? sub(a, b) :
                        op.equals("+") ? add(a, b) :
                        op.equals("*") ? mul(a, b) :
                        op.equals("/") ? div((int) a, (int) b) :
                        op.equals("^") ? exp(a, b) :
                        0;

                System.out.println(a + op + b + " = " + x);

            } catch (ArithmeticException e){ // |InputMismatchException
                e.printStackTrace();
                System.err.println("Erro na operção "+ e.getMessage());
            } catch (InputMismatchException e){
                e.printStackTrace();
                System.err.println("Erro na entrada "+ e.getMessage());
                scanner.nextLine();
            } catch (Exception e){
                e.printStackTrace();
                System.err.println("Erro "+ e.getMessage());
            } finally {
                System.out.println("Operação ok ou exceção tratada!");
            }
        } 
    }

    private static String input(String msg, String... possibles) throws ESPMException{
        final Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        String line = scanner.nextLine().trim();
        
        for(String item: Arrays.asList(possibles)){
            if(item.equals(line)){
                return item;
            }
        }
        throw new ESPMException(line);
    }

    private static double sub(double a, double b) {
        return a - b;
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double mul(double a, double b) {
        return a * b;
    }

    private static double div(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return Double.POSITIVE_INFINITY;
        }
    }

    private static double exp(double a, double b) {
        return Math.pow(a, b);
    }

}
