import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class TicketMaster {

    public static ArrayList<Show>  startShows(){
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
                toAdd[3]= toAdd[3].replace("_"," ");
                toAdd[3]= toAdd[3].replace(","," ");
                toAdd[4]= toAdd[4].replace("_"," ");
                Show act = new Show(toAdd[0], Double.parseDouble(toAdd[1]), Integer.parseInt(toAdd[2]), toAdd[3], toAdd[4]);
                lines.add(act);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return lines;
    }

    public
}
