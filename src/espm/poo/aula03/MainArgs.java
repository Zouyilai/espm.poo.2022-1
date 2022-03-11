package espm.poo.aula03;

import java.util.Arrays;

public class MainArgs {
    public static void main(String[] args){
        for(String a: args){
            System.out.println(a);
        }

        for(int i = 0; i< args.length; i++){
            System.out.println(args[i]);
        }

        Arrays.asList(args).forEach(a -> System.out.println(a));
    }
}
