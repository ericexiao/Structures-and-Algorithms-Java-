package LinkedList;

/**
 * Created by Eric on 11/4/2015.
 */
public class LinkedListNode {
    private Integer data;
    private LinkedListNode next, prev;

    protected LinkedListNode() {
        this.data = null;
        this.next = null;
        this.prev = null;
    }

    protected LinkedListNode(Integer data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Integer getData() {
        return data;
    }

    protected LinkedListNode getNext() {
        return next;
    }

    protected LinkedListNode getPrev() {
        return prev;
    }

    protected void setData(Integer data) {
        this.data = data;
    }

    protected void setNext(LinkedListNode next) {
        this.next = next;
    }

    protected void setPrev(LinkedListNode prev) {
        this.prev = prev;
    }
}
