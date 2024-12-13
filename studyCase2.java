import java.util.Scanner;
public class studyCase2 {

    static String[][] customerData = new String[5][6];
    static String[] menu = { "Black Coffe", "Latte", "Teh Tarik", "Noddle"};
    static int[] prices = {15000, 22000, 12000, 18000};
    static int name;
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("===Main Menu===");
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
            
            // case 2:
            //     displayOrder();
            //     break;
            
            case 3:
                System.out.println("Have Nice Day!");
                return;

            default:
                System.out.print("Invalid Choice. Re-input The Number : ");
            }
        }
    }   

public static void addOrder(){
    while (true) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Customer Name: ");
            customerData[name][0] = sc.nextLine();
            System.out.print("Enter Table number: ");
            customerData[name][1] = sc.nextLine();
            System.out.println();
    
            menuList();  
            name++;
            return;
    }
} 

public static void menuList(){
    Scanner sc = new Scanner(System.in);
    int totalPrice = 0;
    int choice, quantity;
    System.out.println("=== MENU KAFE ===");
    for (int i = 0; i<menu.length; i++){
        System.out.println((i+1) + ". " + menu[i] + " = " + prices[i]);
    }
    while (true) {
        System.out.print("Choose Menu (Enter menu number, or 0 to exit): ");
        choice = sc.nextInt();
        
            if (choice < 0 || choice>=4) {
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
            if (quantity<=0) {
                System.out.println("invalid menu choice, please try again");
                continue;
            }
            customerData[name][choice] = String.valueOf(quantity);
            break;
        }
        totalPrice += prices[choice - 1] * quantity;
    }

    System.out.println("Order successfully added.");
    System.out.println("Total Prices: Rp " + totalPrice);

    name++;
    System.out.println();
    

        }
    }

