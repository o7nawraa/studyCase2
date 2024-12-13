import java.util.Scanner;
public class studyCase2 {

    static String[][] customerData = new String[5][6];
    static String[] menu = { "Black Coffee", "Latte", "Teh Tarik", " Fried Noddle"};
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
                System.out.println("Invalid Choice. Re-input The Number : ");
                System.out.println();
            }
        }
    }   

public static void addOrder(){
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.print("Enter Cutomer Name: ");
        customerData[name][0] = sc.nextLine();

        System.out.print("Enter Table number: ");
        customerData[name][1] = sc.nextLine();
        System.out.println();

        menuList();  


        // name++;
    }
   
    
}


public static void menuList(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n=== MENU CAFE ===");
    int choice, quantity;
    for (int i = 0; i<menu.length; i++){
        System.out.println((i+1) + ". " + menu[i] + " = " + prices[i]);
    }
    System.out.println();
    
    int totalPrice = 0;
    while (true) {
    System.out.print("Choose Menu (Enter menu number, or 0 to exit): ");
    choice = sc.nextInt();
    
    if (choice == 0) {
        break;  
    }
    
    if (choice < 1 || choice > 4) {
        System.out.println("Invalid menu choice, please try again.");
        continue;
    }
     
    System.out.print("Enter the number of items for " + menu[choice - 1] + ": ");
    quantity = sc.nextInt();
    totalPrice += prices[choice - 1] * quantity;
    
    customerData[name][choice] = String.valueOf(quantity);
    
    }
    
    System.out.println("Order successfully added.");
    System.out.println("Total Prices: Rp: " + totalPrice);
    
    System.out.println();
   
            } 
        }


