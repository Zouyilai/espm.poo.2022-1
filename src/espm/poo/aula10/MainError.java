package espm.poo.aula10;

public class MainError {
    public static void main(String[] args) {
        int n = 100000 , m = 100000;
        double [][] matriz = new double[n][m];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Chegou ao final..."); //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }
}
