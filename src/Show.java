import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Math;
import java.text.DecimalFormat;


public class Show {


    private String date;
    private double price;
    private int quant;
    private String performer;
    private String city;

    public Show(String date,double price,int quant,String performer, String city){
        this.city=city;
        this.date=date;
        this.price=price;
        this.quant=quant;
        this.performer=performer;
    }
  /**  public static ArrayList<Show> startShows() {
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
**/
    public static void main(String[] args) {
        TicketMasterDriver.typeSort();
        ArrayList <Show> lines = TicketMaster.startShows();
        /*
        System.out.println(lines.getClass().getSimpleName());
        System.out.println(lines.size());
        */
        printArray(lines);
        /*
            for (Show i : lines){
            System.out.println(i.toString());
             }
            System.out.println(lines.toString());
            */

    }

    public static void printArray(ArrayList <Show> lines){
        System.out.println("Date\t\t\tPrice\t\tQty\t\tPerformer\t\t\t\tCity");
        System.out.println("--------------------------------------------------------------------------");
        for (Show i : lines){
            System.out.println(i.toString());
        }
    }


    @Override
    public String toString() {
        if (this.getPerformer().contains("Justin") || this.getPerformer().contains("Chantal")) {
            return this.getDate() + "\t\t$" + this.getPrice() + "\t\t" + this.getQuant() + "\t\t" + this.getPerformer() + "\t\t\t" + this.getCity();
        } else if (this.getPerformer().contains("Arijit") || this.getPerformer().contains("Sean") || this.getPerformer().contains("Travis") || this.getPerformer().contains("Bobby") || this.getPerformer().contains("Yogi") || this.getPerformer().contains("Grande") ) {
            return this.getDate() + "\t\t$" + this.getPrice() + "\t\t" + this.getQuant() + "\t\t" + this.getPerformer() + "\t\t\t" + this.getCity();
        }else if (this.getPerformer().contains("Big D") ) {
            return this.getDate() + "\t\t$" + this.getPrice() + "\t\t" + this.getQuant() + "\t\t" + this.getPerformer() + "\t\t\t\t\t" + this.getCity();}
         else if (this.getPerformer().contains("Vincenzo") || this.getPerformer().contains("Cabella")  ) {
            return this.getDate() + "\t\t$" + this.getPrice() + "\t\t" + this.getQuant() + "\t\t" + this.getPerformer() + "\t\t" + this.getCity();
        } else{
            return this.getDate() + "\t\t$" + this.getPrice() + "\t\t" + this.getQuant() + "\t\t" + this.getPerformer() + "\t\t\t\t" + this.getCity();
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
