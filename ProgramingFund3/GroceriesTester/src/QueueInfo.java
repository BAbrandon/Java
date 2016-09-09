/**
 * Created by Brandon on 4/1/2015.
 */
public class QueueInfo {
    private String name;
    private double bill;
    public QueueInfo(String newName, double newBill){
        name = newName;
        bill = newBill;
    }
    public String toString(){

        return "Shopper's name '" + name + "', and their bill "+ bill;
    }//to string

}//end of queueInfo
