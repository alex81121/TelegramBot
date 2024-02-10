import java.util.Scanner;

public class pole {
    public static void main(String[] args) {
       
        String[] myArray = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Zadejte hodnotu prvku 
            
            " + (i + 1) + ": ");
            myArray[i] = scanner.nextLine();
        }
        
        System.out.println("Seznam vyplnenych poli:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Zivel " + (i + 1) + ": " + myArray[i]);
        }
        scanner.close();
    }
}
