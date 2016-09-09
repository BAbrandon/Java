/**
 * Created by Brandon on 4/1/2015.
 */
public interface QueueADT<T> {
    public abstract boolean fullShoppers();
    public abstract boolean emptyShoppers();
    public abstract void enqueue(T element);
    public abstract T dequeue();

}
