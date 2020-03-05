package vtaras.own.utils.lotus.flare;

public class RemoveNodesGreaterThanX {

    public static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {

        if (listHead == null) {
            return null;
        }

        if (listHead.data > x && listHead.next == null) {
            return null;
        }

        SinglyLinkedListNode current = listHead;
        SinglyLinkedListNode previous = null;

        while (current != null && current.data > x) {
            previous = current;
            current = current.next;
        }

        if (previous != null) {
            previous.next = null;
        }

        SinglyLinkedListNode newHead = current;

        while (current != null && current.next != null) {
            if (current.next.data > x) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return newHead;
    }


}
