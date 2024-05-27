package TestesOnLine;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        Boolean terminar = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (terminar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque < saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saque);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    double deposito = scanner.nextDouble();
                    if (deposito > 1) {

                    } else {
                        saldo= scanner.nextDouble();
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;

                default:
                    System.out.println("Programa encerrado.");
                    terminar = false;

            }

        }

    }
}