package LinkedList;

import sun.awt.image.ImageWatched;

/**
 * Created by Eric on 11/5/2015.
 */
public class LinkedListItr {
    private LinkedListNode current;

    protected LinkedListItr() {
        this.current = null;
    }

    protected LinkedListItr(LinkedListNode node) {
        this.current = node;
    }

    protected void next() {
        this.current = current.getNext();
    }

    protected void prev() {
        this.current = current.getPrev();
    }

    protected boolean isAtEnd() {
        return (current.getNext() == null || current.getNext().getData() == null);
    }

    protected boolean isAtBeginning() {
        return current.getPrev().getData() == null;
    }

    protected Integer getCurrentData() {
        return current.getData();
    }

    protected void setCurrent(LinkedListNode current) {
        this.current = current;
    }

    protected LinkedListNode getCurrent() {
        return current;
    }
}
