import java.util.Scanner;
public class studyCase2 {
    static String[][] customerData = new String[5][6];
    static String[] menu = { "Black Coffe", "Latte", "Teh Tarik", "Noddle"};
    static int[] prices = {15000, 22000, 12000, 18000};
    static int name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===MENU UTAMA===");
        System.out.println("1. Add Order");
        System.out.println("2. Display Order");
        System.out.println("3. Exit");
        System.out.println("Choose Menu = ");
        int choice = sc.nextInt();

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



public static void addOrder(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cutomer Name: ");
        customerData[name][0] = sc.nextLine();
        System.out.println("Enter Table number: ");
        customerData[name][1] = sc.nextLine();
        menuList();  
        name++;
  }

public static void menuList(){
    Scanner sc = new Scanner(System.in);
    System.out.println("===MENU KAFE===");
    for (int i = 0; i<menu.length; i++){
        System.out.println((i+1) + ". " + menu[i] + " = " + prices[i]);
    }

    System.out.println("Choose menu (enter menu number or 0 to exit)");
    int menuNum = sc.nextInt();

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
        }
        System.out.println("Total Order : " + totalOrder);
        return;
} 
}
}