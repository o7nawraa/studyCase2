import java.util.Scanner;
public class studyCase2 {

    static String[][] customerData = new String[100][7];
    static String[] menu = { "Black Coffe", "Latte ", "Teh Tarik ", "Noodle "};
    static int [] prices = {15000, 22000, 12000, 18000};
    static int name;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
                System.out.println("Exiting Program. Have Nice Day!");
                return;

            default:
                System.out.print("Invalid Choice. Re-input The Number : ");
            }
        }

public static void addOrder(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Customer Name: ");
            customerData[name][0] = sc.nextLine();
            System.out.print("Enter Table number: ");
            customerData[name][1] = sc.nextLine();
            System.out.println();
    
            menuList();  
            name++;
} 

public static void menuList(){
    Scanner sc = new Scanner(System.in);
    int totalPrice = 0;
    int choice, quantity, existingQuantity;

    System.out.println("=== MENU KAFE ===");
    for (int i = 0; i<menu.length; i++){
        System.out.println((i+1) + ". " + menu[i] + " - " + prices[i]);
    }

    while (true) {
        System.out.print("Choose Menu (Enter menu number, or 0 to exit): ");
        choice = sc.nextInt();
        
            if (choice < 0 || choice > 4) {
                System.out.println("Invalid Number of Menu."); 
                System.out.println();
                continue; 
            }

            if (choice == 0) {
                break;
            }

        while (true) {
            System.out.print("Enter the number of items for " + menu[choice - 1] + ": ");
            quantity = sc.nextInt();

            if (quantity<0) {
                System.out.println("invalid menu choice, please try again");
                continue;
            }
            
            if(customerData[name][choice+1] == null){
                customerData[name][choice+1] = String.valueOf(quantity); 
            } else {
                existingQuantity = Integer.parseInt(customerData[name][choice+1]);
                customerData[name][choice+1] = String.valueOf(existingQuantity + quantity);
            }
            totalPrice += prices[choice - 1] * quantity;
            break;
        }
        System.out.println();
    }

    System.out.println("Order successfully added.");
    System.out.println("Total Prices: Rp " + totalPrice);
    System.out.println();
}
    

public static void displayOrder(){
    if(customerData[0][0] == null){
        System.out.println("There is No Order.");
        System.out.println();
        return;
    }

    System.out.println("\n===LIST ORDER===");
    for(int i = 0; i < name; i++) {
        if(customerData[i][0] == null) {
            break;
        }

        System.out.println("Customer Name: " + customerData[i][0]);
        System.out.println("Table Number: " + customerData[i][1]);

        System.out.println("Order Detail: ");
        int totalPrice = 0;

        for (int j = 2; j < 6; j++) {
            if(customerData[i][j] == null) {
                continue;
            } else {
                int quantity = Integer.parseInt(customerData[i][j]);
                int price = prices[j - 2] * quantity;
                totalPrice += price;
                    
                System.out.println(" - " + menu[j-2] + " X " + quantity + " = " + price);
            }
            } 
            System.out.println("Total Order Price: " + totalPrice);
            System.out.println("-----------------------------");
            System.out.println();

        }
    }
}
