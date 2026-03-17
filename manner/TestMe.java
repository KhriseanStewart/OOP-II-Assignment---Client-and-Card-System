package manner;

import realm.Client;
import realm.Card;
import java.util.Scanner;

public class TestMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client Clobj1 = new Client();

        System.out.println("Enter client ID number:");
        Clobj1.setIdNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter first name:");
        Clobj1.setFirstName(scanner.nextLine());
        System.out.println("Enter last name:");
        Clobj1.setLastName(scanner.nextLine());
        System.out.println("Enter age:");
        Clobj1.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter card number:");
        int cardNumber = scanner.nextInt();
        System.out.println("Enter balance:");
        double balance = scanner.nextDouble();
        System.out.println("Enter PIN:");
        int pin = scanner.nextInt();
        System.out.println("Enter card status (true/false):");
        boolean status = scanner.nextBoolean();

        Card card = new Card(cardNumber, balance, pin, status);
        Clobj1.setCard(card);

        System.out.println("\n--- All contents of Client object ---");
        Clobj1.display();

        System.out.println("\n--- Card information only ---");
        Clobj1.getCard().display();

        System.out.println("\n--- Updating card: status=true, card number=45678 ---");
        Clobj1.getCard().setStatus(true);
        Clobj1.getCard().setCardNumber(45678);
        Clobj1.getCard().display();

        scanner.close();
    }
}
