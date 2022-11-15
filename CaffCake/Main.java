package CaffCake;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String welcome = """
                       ───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───
                       ───█▒▒░░░░░░░░░▒▒█───
                       ────█░░█░░░░░█░░█────
                       ─▄▄──█░░░▀█▀░░░█──▄▄─
                       █░░█─▀▄░░░░░░░▄▀─█░░█
                █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█
                  ░░  WELCOME TO CAFFCAKE BOX  ░░
                █▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█  \n\n""";
        System.out.println("\n\n" + welcome);
        String options = """
                █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█
                █        ░░░░      MENU      ░░░░       █
                █                                       █
                █  1 - Brownie              39.0 Baht   █
                █  2 - Banoffee             50.0 Baht   █
                █  3 - Cheesecake           79.0 Baht   █
                █  4 - Coconut Cookie       89.0 Baht   █
                █  5 - Crepe Cake           79.0 Baht   █
                █  6 - Chocolate Cake       69.0 Baht   █
                █  7 - Orangecake           65.0 Baht   █
                █  8 - Redvelvet Cake       90.0 Baht   █
                █  9 - Strawberry Cake      75.0 Baht   █
                █ 10 - Macarons             85.0 Baht   █
                █                                       █
                █▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█\n""";
        System.out.println(options);
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();
        System.out.print("Enter Your Name : ");
        String cName = scanner.next();
        System.out.print("Enter Phone Number : ");
        String pNum = scanner.next();
        customer.setName(cName);
        customer.setPhoneNumber(pNum);

        while (true) {
            System.out.print("Hello " + customer.getName() + "!!!  Please Enter  Number of Menu (Example 1) : ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Brownie", 39.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 2) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Banoffee", 50.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 3) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Chesecake ", 79.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 4) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Coconut Cookie", 89.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 5) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Crepe Cake", 79.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 6) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Chocolate Cake ", 69.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 7) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Orangecake", 65.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 8) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("RedvelvetCake", 90.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 9) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Strawberry Cake", 75.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else if (choice == 10) {
                System.out.print("Enter your Amout : ");
                int amoutNum = scanner.nextInt();
                Menu menu = new Menu("Macarons", 85.0, amoutNum);
                System.out.print(menu.printBill(customer.getName(), customer.getPhoneNumber()));
                break;
            } else {
                System.out.print("""
                        \n
                        █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█
                        █  ░░ Please Enter Only Number  1-10 ░░ █
                        █▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█\n
                            """);
            }
        }
        scanner.close();
    }
}
