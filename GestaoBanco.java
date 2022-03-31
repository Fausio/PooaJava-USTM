import Aula_1.Models.Conta;

import java.util.Random;
import java.util.Scanner;

public class GestaoBanco {

    public static void main(String[] args) {

        System.out.println("\n\nBem Vindo!\n\n 1 --> Criar a conta\n 2 --> Sair do sistema\n\n");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
 

        if (option < 0 || option > 2) {

            System.out.println("Valor Opção Invalida");

        } else if (option == 2) {

            System.out.println("...FIM...");
            System.exit(0);

        } else if (option == 1) {

            Conta c = new Conta(); 

            System.out.println("Escreva o numero da conta");
            String name = sc.next();

            c.SetNumConta(new Random().nextInt(1000));
            c.SetNome(name);

            // 1a
            System.out.println("Adicione o valor de deposito");
            double deposit = sc.nextDouble();
            c.deposit(deposit);
            System.out.println(c.toString());

            //1b
            System.out.println("Adicione o valor de levantamento");
            double withdraw = sc.nextDouble();
            c.withdraw(withdraw);
            System.out.println(c.toString());

            sc.close();
        }
    }
}
