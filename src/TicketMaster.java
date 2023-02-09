import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class TicketMaster {

    /**
     *
     * @return returns an Arraylist of Show objects after reading data from the text file using buffered-reader
     */
    public static ArrayList<Show> startShows() {
        ArrayList<Show> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("showData.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                //lines.add(line);

                String[] toAdd = new String[0];
                for (int i = 0; i < line.length(); i++) {
                    toAdd = line.split(" ");
                    ;
                }
                toAdd[3] = toAdd[3].replace("_", " ");
                toAdd[3] = toAdd[3].replace(",", " ");
                toAdd[4] = toAdd[4].replace("_", " ");
                Show act = new Show(toAdd[0], Double.parseDouble(toAdd[1]), Integer.parseInt(toAdd[2]), toAdd[3], toAdd[4]);
                lines.add(act);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        System.out.println("\t\t\t\t********* Welcome to Ticket Master Kiosk *********\nYou may search our shows by city as well as sort the shows by performer and ticket price.\n");

        return lines;
    }

    /**
     *
     * @param lines  The Arraylist of Show objects created using startShows that will be sorted according to the method of sorting or search selected.
     */
    public  static void sortIt(ArrayList<Show> lines) {
        if (TicketMasterDriver.tickLow) {
            for (int i = 1; i < lines.size(); i++) {
                Show key = lines.get(i);
                int j = i - 1;

                while (j >= 0 && lines.get(j).getPrice() > key.getPrice()) {
                    lines.set(j + 1, lines.get(j));
                    j = j - 1;
                }
                lines.set(j + 1, key);
            }
            Show.printArray(lines);
        }
        if (TicketMasterDriver.tickHigh) {
            for (int i = 1; i < lines.size(); i++) {
                Show key = lines.get(i);
                int j = i - 1;

                while (j >= 0 && lines.get(j).getPrice() < key.getPrice()) {
                    lines.set(j + 1, lines.get(j));
                    j = j - 1;
                }
                lines.set(j + 1, key);
            }
            Show.printArray(lines);
        }  if (TicketMasterDriver.AtoZ) {
            for (int i = 0; i < lines.size() - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < lines.size(); j++) {
                    if (lines.get(j).getPerformer().compareTo(lines.get(minIndex).getPerformer()) < 0) {
                        minIndex = j;
                    }
                }
                Show temp = lines.get(minIndex);
                lines.set(minIndex, lines.get(i));
                lines.set(i, temp);
            }
            Show.printArray(lines);
        } if (TicketMasterDriver.ZtoA) {
            for (int i = 0; i < lines.size() - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < lines.size(); j++) {
                    if (lines.get(j).getPerformer().compareTo(lines.get(maxIndex).getPerformer()) > 0) {
                        maxIndex = j;
                    }
                }
                Show temp = lines.get(maxIndex);
                lines.set(maxIndex, lines.get(i));
                lines.set(i, temp);
            }
            Show.printArray(lines);
        }  if (TicketMasterDriver.byCity) {
            System.out.println("\nWhat city would you like to search for?");
            String city = TicketMasterDriver.scanner.nextLine();
            ArrayList<Show> result = new ArrayList<>();
            for (Show cities : lines) {
                if (cities.getCity().equalsIgnoreCase(city)) {
                    result.add(cities);
                }
            }
            if (result.isEmpty()){
                System.out.println("\nIm sorry there are no shows in " + city + ".\n");
            }
            else{
                Show.printArray(result);
            }

        }
        TicketMasterDriver.tickHigh = false;
        TicketMasterDriver.tickLow = false;
        TicketMasterDriver.byCity = false;
        TicketMasterDriver.AtoZ = false;
        TicketMasterDriver.ZtoA = false;

    }

    public static void main(String[] args) {
        ArrayList <Show> lines = TicketMaster.startShows();
        TicketMasterDriver.typeSort(lines);


    }

}
