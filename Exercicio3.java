import Aula_1.Models.Conta;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        // region C 1
        System.out.println("Adicione o nome da Conta 1");
        String name1 = sc1.next();

        System.out.println("Adicione o Saldo da Conta 1");
        Double valeu1 = sc1.nextDouble();

        Conta c1 = new Conta(new Random().nextInt(1000), name1);
        c1.Setsaldo(valeu1);
        // endregion

        // region C 2
        System.out.println("Adicione o nome da Conta 2");
        String name2 = sc1.next();

        System.out.println("Adicione o Saldo da Conta 2");
        Double valeu2 = sc1.nextDouble();

        Conta c2 = new Conta(new Random().nextInt(1000), name2);
        c2.Setsaldo(valeu2);
        // endregion

        System.out.println( "\n\n 1 --> Efetur um deposito na conta 1\n 2 --> Efetur um deposito na conta 2 \n 3 --> Efetur um levantamento na conta 1\n 4 --> Efetur um levantamento na conta 2\n\n");
 
        sc1.close();
    }

}