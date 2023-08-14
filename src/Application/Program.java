package Application;

import Entities.Users;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String name = scanner.nextLine();
        System.out.println("Qual o número da sua conta?");
        int accountNumber = scanner.nextInt();

        Users user1;

        System.out.println("Deseja realizar seu primeiro depósito agora\nY-SIM\nN-NÃO");
        char firstDeposit = scanner.next().charAt(0);

        if (firstDeposit == 'y') {
            System.out.println("Qual valor deseja depositar?");
            double initialDeposit = scanner.nextDouble();
            // inicialização de um objeto utilizando um construtor com 3 parâmetros (sobrecarga)
            user1 = new Users(name,accountNumber,initialDeposit);
        }
        else {
            // inicialização de um objeto utilizando um construtor com 2 parâmetros (sobrecarga)
            user1 = new Users(name,accountNumber);
        }

        System.out.println(user1);
        System.out.println("Qual o valor do depósito?");
        user1.depositar(scanner.nextDouble());
        System.out.println(user1);

        System.out.println("Qual valor deseja sacar?");
        user1.sacar(scanner.nextDouble());
        System.out.println(user1);

        // utilização de encapsaulamento para troca de nomes do obejto
        System.out.println("Digite o novo nome");
        user1.setName(scanner.next());
        System.out.println(user1);

        scanner.close();

    }
}
