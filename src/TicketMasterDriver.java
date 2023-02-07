import java.util.Scanner;

public class TicketMasterDriver {

    private static Boolean tickHigh = false;
    private static Boolean tickLow = false;
    private static Boolean AtoZ = false;
    private static Boolean ZtoA = false;
    private static Boolean byCity = false;
    private static Boolean quit = false;
    static Scanner scanner = new Scanner(System.in);

    public static void typeSort() {
        System.out.println("\t\t\t\t********* Welcome to Ticket Master Kiosk *********\nYou may search our shows by city as well as sort the shows by performer and ticket price.");
        System.out.println("1. Search by City\n2. Sort by Performer (A-Z)\n3.Sort by Performer (Z-A)\n4. Sort by Price (low - high)\n5. Sort by Price (high - low)\n6. Quit\n");
        while (!quit) {
            System.out.println("Enter a number between 1 and 6");
            try {
                int ans = Integer.parseInt(scanner.nextLine());
                if (ans > 6){
                    System.out.println("Invalid entry, out of range.");
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
                        quit = true;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid entry, you must enter an integer.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t\t********* Welcome to Ticket Master Kiosk *********\nYou may search our shows by city as well as sort the shows by performer and ticket price.");
        System.out.println("1. Search by City\n2. Sort by Performer (A-Z)\n3. Sort by Performer (Z-A)\n4. Sort by Price (low - high)\n5. Sort by Price (high - low)\n6. Quit");

    }
}
