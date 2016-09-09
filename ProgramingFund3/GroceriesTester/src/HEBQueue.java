public class HEBQueue<T> implements QueueADT<T> {
    // declare instance fields (queue and counter)
    private T[] customer = (T[]) (new Object[3]);

    // declare instance fields to keep track of how
    // many elements are being used within a queue, and
    // where the front and rear of the queue(s) are located
    private int customerCounter, rearCustomer, frontCustomer;

    public HEBQueue()
    {
        customerCounter = 0;
        rearCustomer    = 0;
        frontCustomer   = 0;

    }   // end constructor HEBQueue

    public boolean fullShoppers()
    {
        if(customerCounter == customer.length){
            return true;
        }else{

            return false;
        }
    }   // end method fullShoppers

    public boolean emptyShoppers()
    {
        if(customerCounter == 0){
            return true;
        }else{return false;}
    }   // end method emptyShoppers

    public void enqueue(T element)
    {
        customer[rearCustomer] = element;
        System.out.println("Enqueued"+ customer[rearCustomer]);
        rearCustomer = (rearCustomer +1)%customer.length;
        customerCounter +=1;
    }   // end method enqueue

    public T dequeue()
    {
        T element;

        element = customer[frontCustomer];
        System.out.println("Dequeued "+element);
        frontCustomer = (frontCustomer +1)% customer.length;
        customerCounter--;
        return element;
    }   // end method dequeueCustomer

}   // end class HEBQueue