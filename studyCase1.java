 import java.util.Scanner;

    public class studyCase1 {
    static String[][] dataStudents = new String[100][5];
    static String[] column = {"Name: ", "NIM: ", "Type: ","Level: ", "Year: " };
    static int row;

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    while (true) {
        System.out.println("===STUDENT ACHIEVEMENT RECORD===");
        System.out.println("1. ADD ACHIEVMENT DATA");
        System.out.println("2. DISPLAY ALL ACHIEVMENT");
        System.out.println("3. ANALYSIS OF ACHIEVMENT BY TYPE");
        System.out.println("4. EXIT");
        
        System.out.print("Choose Menu : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                addAchievementData();
                break;
        
            case 2:
                displayData();
                break;
            
            case 3:
                achievementAnalysis();
                break;

            case 4:
                System.out.println("Exiting The Program. Thankyou :)");
                return;

            default :
            System.out.println("Invalid Menu Choose. Input The Right Number");
            System.out.println();
            }
        }
    }
    
    public static void addAchievementData(){
    Scanner sc = new Scanner(System.in);
        System.out.println("\n===ADD ACHIEVEMENT DATA===");
        System.out.print("Input Students Name : ");
        dataStudents[row][0]= sc.nextLine();
    
        System.out.print("Input Students NIM : ");
        dataStudents[row][1] = sc.nextLine();
        
        System.out.print("Input Achievement Type : ");
        dataStudents[row][2] = sc.nextLine();
    
    while (true) {
        System.out.print("Input Achievement Level (Local/National/International) : ");
        String achievementLevel = sc.nextLine();
        
        if(achievementLevel.equalsIgnoreCase("local") && achievementLevel.equalsIgnoreCase("National") &&
        achievementLevel.equalsIgnoreCase("International")){
        dataStudents[row][3] = achievementLevel;
        break;
        } else {
        System.out.println("Invalid Data. Re-input Data!");
       }
    }

    while (true) {
        System.out.print("Input Year of Achievement (2010-2024) : ");
        int achievementYear = sc.nextInt();
        if (achievementYear >= 2010 && achievementYear <= 2024) {
            System.out.println("The Data is Successfully Added!");
            dataStudents[row][4]= String.valueOf(achievementYear);
            System.out.println();
            break;
        } else {
            System.out.println("Invalid year. Re-input year!");
        }
    }
    row++;
}

    public static void displayData(){
    if(dataStudents[0][0] == null){
        System.out.println("There is No Achievement Data.");
        System.out.println();
        return;
    }

    System.out.println("\n===LIST OF ALL ACHIEVEMENTS===");
    for(int row = 0; row < dataStudents.length; row++){
        for(int j = 0; j < dataStudents[row].length; j++){
            if(dataStudents[row][j] == null){
                System.out.println();
                break;
            } else {
                System.out.print(column[j]+dataStudents[row][j]);
                System.out.print(" | ");
            }
        }
        if(dataStudents[row][0] == null){
            break;
        }
        System.out.println();
    }
}

    public static void achievementAnalysis(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n===ACHIEVEMENT ANALYSIS===");
    System.out.print("Input the Type of Achievement You Want to Analyze : ");
    String achievement = sc.nextLine();
    boolean found = false;

    System.out.println("\n===Achievement Analysis Results===");
    for(int i = 0; i < row; i++){
        if (dataStudents[i][2].equalsIgnoreCase(achievement)) {
            System.out.println(column[0] + dataStudents[i][0] + " | " 
                            + column[1] + dataStudents[i][1] + " | " 
                            + column[3] + dataStudents[i][3] + " | " 
                            + column[4] + dataStudents[i][4]);
            found = true;
        } 
    } 
        if (!found) {
        System.out.println("Empty Data.");
    }
    System.out.println();
    }
}
    
    

