package SistemaBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int criaId(int numAnterior, int id) {
        id = numAnterior += 1;
        numAnterior = id;
        return id;
    }

    public static void main(String[] args) {
        int numAnterior = 0;
        Scanner scanner = new Scanner(System.in);
        int escolha;

        int num = criaId(numAnterior, 0);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(num, "João", "joao1234", 12344321, 0, 0, 0, 0));

        do {
            System.out.println("O que queres? ");
            System.out.println("1 - logar'");
            System.out.println("2 - registrar");
            System.out.println("3 - sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Login();
                    break;
                case 2:
                    Registrar();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);

                default:
                    System.err.println("Digite uma opção valida");
            }
        } while (escolha != 3);
        scanner.close();
    }

    public static void Login() {
        System.out.println("Logando");
    }

    public static void Registrar() {
        System.out.println("Registro");

    }
}