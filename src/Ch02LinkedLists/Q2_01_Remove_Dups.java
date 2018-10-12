package Ch02LinkedLists;

import CtCILibrary.LinkedListNode;

/**
 * Created by minami_munakata on 2018-10-11.
 *
 */
public class Q2_01_Remove_Dups {

    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0, null, null);
        LinkedListNode head = first;
        for (int i = 1; i < 10; i++) {
            LinkedListNode second = new LinkedListNode(i / 2, null, null);
            first.setNext(second);
            second.setPrev(first);
            first = second;
        }
        head.printNode();

        LinkedListNode clone = head.cloneNode();
//
//        QuestionA.deleteDups(cloneA);
//
//
        clone.printNode();

    }
}
