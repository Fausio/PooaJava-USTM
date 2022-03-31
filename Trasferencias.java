import Aula_1.Models.Conta;
import java.util.Random;
import java.util.Scanner;
 

public class Trasferencias {

    public static void main(String[] args) {

        System.out.println("\n\nBem Vindo!\n\n 1 --> Fazer trasferencias \n 2 --> Sair do sistema\n\n");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        sc.close();

        if (option < 0 || option < 2) {

            System.out.println("Valor Opção Invalida");

        } else if (option == 2) {

            System.out.println("...FIM...");
            System.exit(0);

        } else if (option == 1) {

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

            // 2a
            System.out.println(c1.toString());
            System.out.println("\n");
            System.out.println(c2.toString());

            // 2b 
            if (c1.equals(c2)) {
                System.out.println("Sim, As contas são iguais");
            } else {
                System.out.println("Não, As  contas não são iguais");
            }

             // 2c
             System.out.println("Adicione o valor que pretende trasferir para a conta 2");
             Double valeuToTrasfer = sc1.nextDouble();
             c1.transfer(c2, valeuToTrasfer)   ;

             System.out.println(c1.toString());
             System.out.println("\n");
             System.out.println(c2.toString());


            sc1.close();
        }

    }

}
