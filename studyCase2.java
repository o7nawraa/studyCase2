import java.util.Scanner;
public class studyCase2 {
    static String[][] customerData = new String[5][5];
    static String[] menu = { "Black Coffe = ", "Latte = ", "Teh Tarik = ", "Noddle = "};

    static int name;
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===MENU UTAMA===");
        System.out.println("1. Add Order");
        System.out.println("2. Display Order");
        System.out.println("3. Exit");
        System.out.print("Choose Menu = ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addOrder();
                break;
            case 2:
                // displayOrder();
                break;
            case 3:
                System.out.println("Have Nice Day!");
                return;

            default:
                System.out.println("Invalid Choice. Re-input The Number : ");
        }
    }   

public static void addOrder(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        customerData[name][0] = sc.nextLine();
        System.out.print("Enter Table number: ");
        customerData[name][1] = sc.nextLine();
        menuList();  
        name++;
  }

public static void menuList(){

} 


}
