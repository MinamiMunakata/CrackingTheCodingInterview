package CtCILibrary;

/**
 * Created by minami_munakata on 2018-10-11.
 *
 * Reference:
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/CtCILibrary/CtCILibrary/LinkedListNode.java
 */
public class LinkedListNode {
    private int data;
    private LinkedListNode prevNode;
    private LinkedListNode nextNode;
    private LinkedListNode lastNode;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode(int data, LinkedListNode prevNode, LinkedListNode nextNode) {
        this.data = data;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }

    public LinkedListNode() {}

    public void setPrev(LinkedListNode prev) {
        this.prevNode = prev;
        if (prev != null && prev.nextNode != this) {
            prev.setNext(this);
        }
    }

    public void setNext(LinkedListNode next) {
        this.nextNode = next;
        if (this == lastNode) {
            this.lastNode = next;
        }
        if (next != null && next.prevNode != this) {
            next.setPrev(this);
        }
    }

    public void printNode() {
        if (this.nextNode != null) {
            System.out.print(this.data + " -> ");
            this.nextNode.printNode();
        } else {
            System.out.println(this.data);
        }
    }

    public LinkedListNode cloneNode() {
        LinkedListNode nextClone = null;
        if (nextNode != null) {
            nextClone = nextNode.cloneNode();
        }
        LinkedListNode clone = new LinkedListNode(data, null, nextClone);
        return clone;
    }
}
