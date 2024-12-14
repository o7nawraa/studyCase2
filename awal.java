import java.util.Scanner;
public class awal {
    static String[][] customerData = new String[5][6];
    static String[] menu = { "Black Coffe", "Latte ", "Teh Tarik ", "Noddle "};
    static int [] prices = {15000, 22000, 12000, 18000};
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
                System.out.println("Exiting Program. Have Nice Day!");
                return;

            default:
                System.out.println("Invalid Choice. Re-input The Number : ");
        }
    }   
}
public static void addOrder(){
    while(true) {
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
        System.out.println((i+1) + ". " + menu[i] + " - " + prices[i]);
    }
        while(true) {
            System.out.print("Choose Menu(Enter menu number, or 0 to exit): ");
            choice = sc.nextInt();

            if (choice < 0 || choice > menu.length) {
                System.out.println("Invalid number of menu.");
                System.out.println();
                continue;
            }

            if (choice == 0) {
                break;  
            }
    
            while(true) {
            System.out.print("Enter The Number of Items for " + menu[choice - 1] + ": ");
            quantity = sc.nextInt();
            if(quantity<=0) {
                System.out.println("Invalid Menu Choice, Please Try Again!");
                continue;
            }
            if (customerData[name][choice + 1] == null) {
                customerData[name][choice + 1] = String.valueOf(quantity);
            }else{
                int existingQuantity = Integer.parseInt(customerData[name][choice + 1]);
                customerData[name][choice + 1] = String.valueOf(existingQuantity + quantity);
                break;
            }
            }    
        
            totalPrice += prices[choice - 1] * quantity;
            
    
        }
        System.out.println("Order succesfully added");
        System.out.println("Total prices: Rp " + totalPrice);
        

        System.out.println();
        name++;

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
            continue;
        }

        System.out.println("Customer Name: " + customerData[i][0]);
        System.out.println("Table Number: " + customerData[i][1]);

        System.out.println("Order Detail: ");
        int totalPrice = 0;

        for (int j = 2; j < 6; j++) {
            if(customerData[i][j] != null) {
                int quantity = Integer.parseInt(customerData[i][j]);
                customerData[0][2] = String.valueOf(quantity);
                
                int price = prices[j - 2] * quantity;
                totalPrice += price;
                System.out.println(" - " + menu[j-2] + " X " + quantity + " = " + price);
                    
                }
            } 
            System.out.println("Total Order Price: " + totalPrice);
            System.out.println("-----------------------------");
        }
    }
}
    

