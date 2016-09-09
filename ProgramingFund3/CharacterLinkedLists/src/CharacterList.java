import javax.swing.*;

/**
 * Created by Brandon on 3/18/2015.
 */
public class CharacterList {
    private CharacterNode list;
    private class CharacterNode{
        public Character aCharacter;

        public CharacterNode next;
        public CharacterNode(Character newCharacter){
            aCharacter = newCharacter;
            next = null;
        }
        public String thisChar(){
            return aCharacter.thisChar2();
        }
    }//end of character node

    public CharacterList(){
        list = null;
    }
    public void add(Character newCharacter){
        CharacterNode c,t;
        CharacterNode node = new CharacterNode(newCharacter);

        if(list == null){
            list = node;
            System.out.println("This character was added to the linked list" + node.aCharacter);
        }else{
            c = list;
            t = list;
            while (c!= null && node.thisChar().compareTo(c.thisChar()) >0){
                t = c;
                c = c.next;

            }//end of while
            if(list == c){
                node.next = list;
                list = node;
            }else{
                node.next = t.next;
                t.next = node;
            }//inner else
            System.out.println("This character was added to the linked list" + node.aCharacter);
        }//outer else

    }

    public void delete(String deleteCharacter){
        CharacterNode c,t;
        c = list;
        t = list;
        while (c != null && deleteCharacter.compareTo(c.thisChar()) != 0){
            t = c;
            c = c.next;

        }//end oof while
        if (c == null){
            JOptionPane.showMessageDialog(null,"Sorry but the character"+ deleteCharacter + "doesn't exist!","Error",JOptionPane.ERROR_MESSAGE);
        }else if (t == list && c == list){
            list = t.next;
            System.out.println("This character has "+deleteCharacter+" been deleted from the linked list");
        }else{
            t.next = c.next;
            System.out.println("This character has "+deleteCharacter+" been deleted from the linked list");

        }
    }

    public String buildList(){
        String result;
        CharacterNode c;
        c = list;
        result = "Here is your linked list: \n\n";

        while (c != null){
            result = result + c.aCharacter + "\n";
            c = c.next;
        }
        return result;
    }
}
