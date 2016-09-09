/**
 * Created by Brandon on 3/18/2015.
 */
public class Character {
    private String oneChar;

    public Character(String newChar){
        oneChar = newChar;
    }
    public String thisChar2(){
        return oneChar;
    }
    public String toString(){
        return "Character: "+ oneChar;
    }
}//end of class
