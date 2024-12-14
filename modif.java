

import java.util.Scanner;

public class modif {
    static ArrayList<String[]> customerData = new ArrayList<>();
    static String[] menu = {"Black Coffee", "Latte", "Teh Tarik", "Noodle"};
    static int[] prices = {15000, 22000, 12000, 18000};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===MAIN MENU===");
            System.out.println("1. Add Order");
            System.out.println("2. Display Order");
            System.out.println("3. Exit");
            System.out.print("Choose Menu = ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    addOrder();
                    break;
                case 2:
                    displayOrder();
                    break;
                case 3:
                    System.out.println("Exiting Program. Have a Nice Day!");
                    return;
                default:
                    System.out.println("Invalid Choice. Re-input The Number: ");
            }
        }
    }

    public static void addOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter Table Number: ");
        String tableNumber = sc.nextLine();
        System.out.println();

        menuList(customerName, tableNumber);
    }

    public static void menuList(String customerName, String tableNumber) {
        Scanner sc = new Scanner(System.in);
        int choice, quantity;

        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + prices[i]);
        }

        while (true) {
            System.out.print("Choose Menu (Enter menu number, or 0 to exit): ");
            choice = sc.nextInt();

            if (choice < 0 || choice > menu.length) {
                System.out.println("Invalid menu number.");
                continue;
            }

            if (choice == 0) {
                break;
            }

            System.out.print("Enter the number of items for " + menu[choice - 1] + ": ");
            quantity = sc.nextInt();

            if (quantity <= 0) {
                System.out.println("Invalid quantity. Please try again!");
                continue;
            }

            String[] order = {customerName, tableNumber, menu[choice - 1], String.valueOf(quantity), String.valueOf(prices[choice - 1])};
            customerData.add(order);
        }

        System.out.println("Order successfully added.");
        System.out.println();
    }

    public static void displayOrder() {
        if (customerData.isEmpty()) {
            System.out.println("There is no order.");
            System.out.println();
            return;
        }

        System.out.println("\n=== LIST ORDER ===");
        for (String[] order : customerData) {
            System.out.println("Customer Name: " + order[0]);
            System.out.println("Table Number: " + order[1]);
            System.out.println("Order: " + order[2] + " x " + order[3] + " = Rp " + (Integer.parseInt(order[3]) * Integer.parseInt(order[4])));
            System.out.println("-----------------------------");
        }
    }
}

    

