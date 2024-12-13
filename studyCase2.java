import java.util.Scanner;
public class studyCase2 {

    static String[][] customerData = new String[5][6];
    static String[] menu = { "Black Coffee", "Latte", "Teh Tarik", " Fried Noddle"};
    static int[] prices = {15000, 22000, 12000, 18000};
    static int name;
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

<<<<<<<<< Temporary merge branch 1
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
            }
        }
    }   

public static void addOrder(){
    Scanner sc = new Scanner(System.in);
<<<<<<<<< Temporary merge branch 1
        System.out.print("Enter Cutomer Name: ");
=========
        System.out.print("\nEnter Cutomer Name: ");
>>>>>>>>> Temporary merge branch 2
        customerData[name][0] = sc.nextLine();
        System.out.print("Enter Table number: ");
        customerData[name][1] = sc.nextLine();
        System.out.println();

        menuList();  
        
        
    int totalPrice = 0;
    while (true) {
        System.out.print("Choose Menu (Enter menu number, or 0 to exit): ");
        int choice = sc.nextInt();

        if (choice == 0) {
            break;  
        }

        if (choice < 1 || choice > 4) {
            System.out.println("Invalid menu choice, please try again.");
            continue;
        }
         
        System.out.print("Enter the number of items for " + menu[choice - 1] + ": ");
        int quantity = sc.nextInt();
        totalPrice += prices[choice - 1] * quantity;

        customerData[name][choice] = String.valueOf(quantity);
        
    }

    System.out.println("Order successfully added.");
    System.out.println("Total Prices: Rp " + totalPrice);

    name++;
    System.out.println();

}
  

public static void menuList(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n=== MENU KAFE ===");
    for (int i = 0; i<menu.length; i++){
        System.out.println((i+1) + ". " + menu[i] + " = " + prices[i]);
    }

    System.out.print("\nChoose menu (enter menu number or 0 to exit) : ");
    int menuNum = sc.nextInt();
<<<<<<<<< Temporary merge branch 1

    switch (menuNum) {
        case 1:
            System.out.println("Enter the Number of Items " + menu[0]);
            customerData[name][3] = sc.nextLine();
            break;

        case 2 :
            System.out.println("Enter the Number of Items " + menu[1]);
            customerData[name][4] = sc.nextLine();
            break;

        case 3 :
        System.out.println("Enter the Number of Items " + menu[2]);
        customerData[name][5] = sc.nextLine();
        
        case 4 :
        System.out.println("Enter the Number of Items " + menu[3]);
        customerData[name][6] = sc.nextLine();
        break;

        default:
            break;
    }

    if (menuNum == 0) {
        System.out.println("YeAy! Your order was successfully added");
        int totalOrder = 0;
        for(int i = 0; i < customerData.length; i++){
            for (int j = 3; j <=6; j++){
                int order = Integer.parseInt(customerData[i][j]);
                totalOrder += order*prices[j];
            }
=========
    while (true) {
        switch (menuNum) {
            case 1:
                System.out.print("Enter the Number of Items " + menu[0]);
                customerData[name][3] = String.valueOf(sc.nextInt());
                break;
    
            case 2 :
                System.out.print("Enter the Number of Items " + menu[1]);
                customerData[name][4] = String.valueOf(sc.nextInt());
                break;
    
            case 3 :
                System.out.print("Enter the Number of Items " + menu[2]);
                customerData[name][5] = String.valueOf(sc.nextInt());
    
            case 4 :
                System.out.print("Enter the Number of Items " + menu[3]);
                customerData[name][6] = sc.nextLine();
                break;
    
            default:
                break;
>>>>>>>>> Temporary merge branch 2
        }

        int totalOrder = 0;
        while (true) {
            if (menuNum == 0) {
                System.out.println("Yeay! Your order was successfully added");
                for(int i = 0; i < customerData.length; i++){
                    for (int j = 3; j <=6; j++){
                        int order = Integer.parseInt(customerData[i][j]);
                        totalOrder += order*prices[j];
                    }
                }
                System.out.println("Total Order : " + totalOrder);
                return;   
                //coba
            } 
        }
    }
}
}
// tambahan

