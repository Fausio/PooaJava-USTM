
import java.util.ArrayList;
import java.util.Scanner;
 
import Aula_1.Models.Estudante;

public class GestaoDePauta {

    public static void main(String[] args) {

        System.out.println("\n\nBem Vindo!\n\n 1 --> Criar Estudantes \n 2 --> Sair do sistema\n\n");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option < 0 || option > 2) {

            System.out.println("\n\nValor Opcao Invalida\n\n");

        } else if (option == 2) {

            System.out.println("\n\n...FIM...\n\n");
            System.exit(0);

        } else if (option == 1) {

            // region C 1
            System.out.println("\n\nAdicione a quantidade de estudates por criar\n\n");
            int qtd = sc.nextInt();

            ArrayList<Estudante> objs = new ArrayList<Estudante>();

            for (int i = 1; i <= qtd; i++) {

                System.out.println("\n\nAdicione o nome do " + i + " Estudante\n\n");
                String ArrayName = sc.next();
                Estudante E = new Estudante(ArrayName);
                E.SetNumber(i);
                objs.add(E);

            }

            for (Estudante var : objs) {
                System.out.println(var.toString());
            }

            System.out.println(
                    "\n\n 1 --> Adicionar notas de frequencia de Cada estudante e calcular a media  \n 2 --> Adicionar notas de frequencia de Todos estudante e calcular a media\n\n 2 -->  Sair do Sistema\n");

            int NoteOptions = sc.nextInt();

            if (NoteOptions < 0 || NoteOptions > 2) {

                System.out.println("\n\nValor Opcao Invalida\n\n");

            } else if (option == 3) {
                System.out.println("\n\n...FIM...\n\n");
                System.exit(0);
            } else if (option == 1) {

                System.out.println("\n\n...Escolha o estudante pelo numero...\n\n");
                int studantNumber = sc.nextInt();

                System.out.println("\n\n...Adicione a nota 1...\n\n");
                Double nota1 = sc.nextDouble();

                System.out.println("\n\n...Adicione a nota 2...\n\n");
                Double nota2 = sc.nextDouble();

                objs.get(studantNumber - 1).CalcAverage(nota1, nota2);
                System.out.println(objs.get(studantNumber - 1).toString());

            } else if (option == 2) {

                for (int i = 0; i <= objs.size(); i++) {
                    System.out.println("\n\n...Adicione a nota 1 do estudante " + objs.get(i).getNumber() + "...\n\n");
                    Double nota1 = sc.nextDouble();

                    System.out.println("\n\n...Adicione a nota 2 do estudante " + objs.get(i).getNumber() + "...\n\n");
                    Double nota2 = sc.nextDouble();

                    objs.get(i).CalcAverage(nota1, nota2);
                }

                for (Estudante estudante : objs) {
                    System.out.println(estudante.toString());
                }
            }

            sc.close();
        }

    }

}