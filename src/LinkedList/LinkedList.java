package LinkedList;

/**
 * Created by Eric on 11/5/2015.
 */
public class LinkedList {
    LinkedListNode head, tail;
    LinkedListItr itr;

    //Creates a new LinkedList, sets head and tail to be neighbors of each other. Sets the itr at the head.
    public LinkedList() {
        this.head = new LinkedListNode();
        this.tail = new LinkedListNode();
        head.setNext(this.tail);
        tail.setPrev(this.head);
        itr = new LinkedListItr();
        itr.setCurrent(head);
    }

    public void next() {
        if(!itr.isAtEnd()) {
            itr.next();
        }
    }

    public void prev() {
        if(!itr.isAtBeginning()) {
            itr.prev();
        }
    }

    public void first() {
        itr.setCurrent(this.head.getNext());
        System.out.println("Now at the beginning of the list");
    }

    public void last() {
        itr.setCurrent(this.tail.getPrev());
        System.out.println("Now at the end of the list");
    }

    public void insertAfterCurrent(Integer i) {
        LinkedListNode node = new LinkedListNode(i);
        itr.getCurrent().getNext().setPrev(node);
        itr.getCurrent().setNext(node);

        System.out.println("Npde with value " + i + " inserted after current node");
    }

    public void insertBeforeCurrent(Integer i) {
        LinkedListNode node = new LinkedListNode(i);
        itr.getCurrent().getPrev().setNext(node);
        itr.getCurrent().setPrev(node);

        System.out.println("Npde with value " + i + " inserted before current node");
    }

    public void insertAtEnd(Integer i) {

    }

    public void delete(Integer i) {

    }

    public int size() {
        int counter = 0;
        LinkedListItr temp = new LinkedListItr();
        temp.setCurrent(this.head);

        while(!temp.isAtEnd()) {
            counter++;
            temp.setCurrent(temp.getCurrent().getNext());
        }

        return counter;
    }

    public void find(Integer i) {

    }

    public void empty() {
        while (head.getNext() != tail) {

        }
    }

    public boolean isEmpty() {
        return head.getNext() == tail;
    }

    public void print() {
        LinkedListItr temp = new LinkedListItr(this.head.getNext());
        while (!temp.isAtBeginning()) {

        }
    }
    public static void main(String[] args) {

    }
}
