import java.util.Scanner;
public class modif2 {

    static String[][] customerData = new String[100][5];
    static String[] menu = {"Black Coffee", "Latte", "Teh Tarik", "Noodle"};
    static int[] prices = {15000, 22000, 12000, 18000};
    static int name = 0;
    
    
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
        int totalPrice = 0;

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
            
            customerData[name][0] = customerName;
            customerData[name][1] = tableNumber;
            customerData[name][2] = menu[choice - 1];
            customerData[name][3] = String.valueOf(quantity);
            customerData[name][4] = String.valueOf(prices[choice - 1]);
            
            name++;
            totalPrice += prices[choice-1] * quantity;
        }
        
        System.out.println("Order successfully added.");
        System.out.println("Total prices: Rp " + totalPrice);
        System.out.println();
    }

    public static void displayOrder() {
        System.out.println("\n=== LIST ORDER ===");
        boolean[] displayed = new boolean[name];
        
        if (name == 0) {
            System.out.println("There is no order.");
            System.out.println();
            return;
        }

        
        for (int i = 0; i < name; i++) {
            if (displayed[i]) {
                continue;
            }
            String customerName = customerData[i][0];
            System.out.println("Customer Name: " + customerName);
            System.out.println("Table Number: " + customerData[i][1]);
            System.out.println("Detail Order: ");

            int TotalPrice = 0;

            for (int j = i; j < name; j++) {
                if (customerData[j][0].equals(customerName)) {
                    int quantity = Integer.parseInt(customerData[j][3]);
                    int price = Integer.parseInt(customerData[j][4]);

                    int itemTotal = quantity * price;

                    System.out.println(" - " + customerData[j][2] + " X " + quantity + " = Rp " + itemTotal);
                    TotalPrice += itemTotal;
                    displayed[j] = true;
                    

                }
            }
            System.out.println("Total Order Price: Rp " + TotalPrice);
            System.out.println("-----------------------------");

        }
    }
}

