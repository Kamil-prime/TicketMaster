import java.util.ArrayList;
import java.util.Scanner;

public class TicketMasterDriver {

    public static Boolean tickHigh = false;
    public static Boolean tickLow = false;
    public static Boolean AtoZ = false;
    public static Boolean ZtoA = false;
    public static Boolean byCity = false;
    public static Boolean quit = false;
    static Scanner scanner = new Scanner(System.in);

    public static void typeSort(ArrayList <Show> lines) {

        while (!quit) {
            System.out.println("1. Search by City\n2. Sort by Performer (A-Z)\n3. Sort by Performer (Z-A)\n4. Sort by Price (low - high)\n5. Sort by Price (high - low)\n6. Quit\n");
            System.out.println("Enter a number between 1 and 6");
            try {
                int ans = Integer.parseInt(scanner.nextLine());
                if (ans > 6){
                    System.out.println("Invalid entry, out of range.\n");
                    typeSort(lines);
                }else {
                    if (ans == 1){
                        byCity = true;
                    } else if (ans == 2) {
                        AtoZ = true;
                    } else if (ans == 3) {
                        ZtoA = true;
                    } else if (ans == 4) {
                        tickLow = true;
                    } else if (ans == 5) {
                        tickHigh = true;
                    } else if (ans == 6) {
                        System.out.println("\nThank you for using our Kiosk.\nHave a great day!");
                        quit = true;
                    }
                }
                TicketMaster.sortIt(lines);
            } catch (Exception e) {
                System.out.println("Invalid entry, you must enter an integer.\n");
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t\t********* Welcome to Ticket Master Kiosk *********\nYou may search our shows by city as well as sort the shows by performer and ticket price.");
        System.out.println("1. Search by City\n2. Sort by Performer (A-Z)\n3. Sort by Performer (Z-A)\n4. Sort by Price (low - high)\n5. Sort by Price (high - low)\n6. Quit");

    }
}
