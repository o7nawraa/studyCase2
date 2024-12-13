import java.util.Scanner;
public class studyCase2 {
    static String[][] customerData = new String[5][5];
    static String[] menu = { "Black Coffe = ", "Latte = ", "Teh Tarik = ", "Noddle = "};
    static int name;
    static double[] prices = {15000, 22000, 12000, 18000};

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

} 

}
