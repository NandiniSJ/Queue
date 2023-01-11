import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {

   private Node<T> front;
   private Node<T> rare;
   private int length = 0;

    public int getLength() {
        return length;
    }

    public void enQueue(T value){
       Node<T> newNode = new Node<>(value,null);
       if(rare == null){
           rare = newNode;
           front = newNode;
       }
       rare.setNextNode(newNode);
       rare = newNode;
       length++;
   }

   public T deQueue(){
       LinkedList<T> l = new LinkedList<>();
       T result = front.getValue();
       if(front.getNextNode() == null){
            front = null;
            rare = null;
            return result;
        }
       if(front == null){
           return null;
       }
       front = front.getNextNode();
       length--;
       return result;
   }

}
