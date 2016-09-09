
public class ArrayStack<T> implements StackADT<T>{
    // declare instance fields (stack and counter)
    private T[] stack = (T[]) (new Object[70]);
    private int stackCounter;

    public ArrayStack()
    {
        stackCounter = 0;
    }   // end constructor ArrayStack

    public boolean full()
    {
        if(stackCounter == stack.length){return true;}else return false;

    }   // end method full

    public boolean notEmpty()
    {
        if(stackCounter!= 0){return true;}else return false;

    }   // end method notEmpty

    public void push (T element)
    {
        stack[stackCounter] = element;
        stackCounter++;
        System.out.println("Pushed:"+ element);
    }   // end method push

    public T pop()
    {
        T oneItem;
        --stackCounter;
        oneItem = stack[stackCounter];
        System.out.println("Popped:"+ oneItem);
        return oneItem;
    }   // end method pop

}   // end class ArrayStack
