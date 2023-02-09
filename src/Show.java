
import java.util.ArrayList;



public class Show {


    private String date;
    private double price;
    private int quant;
    private String performer;
    private String city;

    /**
     *
     * @param date Is the date of the show
     * @param price price of the ticket. The tickHigh and tickLow methods sort based on this parameter.
     * @param quant the quantity of tickets available.
     * @param performer performer of the Show. The tickHigh and tickLow booleans start sorting based on this parameter.
     * @param city city the show is performed in. The byCity search looks for this parameter in every show.
     */
    public Show(String date,double price,int quant,String performer, String city){
        this.city=city;
        this.date=date;
        this.price=price;
        this.quant=quant;
        this.performer=performer;
    }

    /**
     *
     * @param lines The Arraylist that will be looped through in order to print all the Show objects using the toString method
     */
    public static void printArray(ArrayList <Show> lines){
        System.out.println("Date\t\t\tPrice\t\tQty\t\tPerformer\t\t\t\tCity");
        System.out.println("--------------------------------------------------------------------------");
        for (Show i : lines){
            System.out.println(i.toString());
        }
        System.out.println("\n");
    }

    /**
     *
     * @return returns the Show object in a string form, so it is easily understood by the user.
     */
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

    public int getQuant() {
        return quant;
    }


    public String getPerformer() {
        return performer;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

}
