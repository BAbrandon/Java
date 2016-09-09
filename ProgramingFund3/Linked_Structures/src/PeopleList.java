/**
 * Created by Brandon on 2/25/2015.
 */
public class PeopleList {

    private PersonNode list;

    private  class PersonNode{
        public Person aPerson;


        //next node in the list
        public PersonNode next;

        public PersonNode(Person p){
          aPerson = p;

            next = null;

        }//constructor
    }//end of class
    public PeopleList(){
        //establish an empty list
        list = null;
    }
    public void add(Person newPerson){
        PersonNode node = new PersonNode(newPerson);

        //create a pointer that will be
        PersonNode current;
        //check for empty
        if (list == null){
            list = node;
            System.out.println("This Person was added to the linked list: "+ node.aPerson);

        }//end of if
        else{
            //point to the beginning of the list
            current = list;
            while(current.next != null){
            current = current.next;
            }//end of while
            current.next = node;
            System.out.println("This Person was added to the linked list: "+ node.aPerson);

        }//end of else
    }// end add method

    public String printList(){
        String result;
        PersonNode current;

        result = "Here is your current linked list:\n\n";


        current = list;
        while(current != null){

            result = result  + current.aPerson+"\n";
            current = current.next;
        }//end of while

        return result;
    }

}
