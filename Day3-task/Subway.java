import java.util.*;

public class Subway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins = 0;
        int choice;

        do {
            System.out.println("\n1.Jump  2.Slide  3.Left  4.Right  5.Collect Coin  0.Exit");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Jumped!");
                    break;
                case 2:
                    System.out.println("Slid!");
                    break;  
                case 3:
                    System.out.println("Moved Left!");
                    break;
                case 4:
                    System.out.println("Moved Right!");
                    break;
                case 5:
                    coins++;
                    System.out.println("Coin collected!");
                    break;
                case 0:
                    System.out.println("Game Over!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Total Coins: " + coins);

        } while(choice != 0);
    }
}
