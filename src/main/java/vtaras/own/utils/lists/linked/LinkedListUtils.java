package vtaras.own.utils.lists.linked;

public class LinkedListUtils {

    /*
     * returns middle element in linked list
     */
    public static OwnLinkedList.Node getMiddleElement(OwnLinkedList list) {
        OwnLinkedList.Node current = list.head();
        OwnLinkedList.Node middle = current;
        int length = 0;
        while (current.next() != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next();
            }
            current = current.next();
        }
        if (length % 2 == 1) {
            middle = middle.next();
        }
        return middle;
    }


    /*
     * forward node to recursion method
     */
    public static OwnSinglyLinkedList reverseRecursively(OwnSinglyLinkedList list) {
        list.head = reverseRecursively(list.head);
        return getFullListFromNode(list.head);
    }

    /*
     * returns last element of old list,
     * which now is the first element
     * without using recursion
     */
    public static OwnSinglyLinkedList reverseIteratively(OwnSinglyLinkedList list) {
        OwnSinglyLinkedList.Node current = list.head;
        OwnSinglyLinkedList.Node previous = null;
        OwnSinglyLinkedList.Node forward = null;
        while (current.next != null) {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        list.head = current;
        list.head.next = previous;
        return list;
    }

    /*
     * returns last element of old list,
     * which now is the first element
     * using recursion
     */
    private static OwnSinglyLinkedList.Node reverseRecursively(OwnSinglyLinkedList.Node node) {
        OwnSinglyLinkedList.Node newHead;
        if ((node.next == null)) {
            return node;
        }
        newHead = reverseRecursively(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    /*
     * returns all list from head node
     */
    private static OwnSinglyLinkedList getFullListFromNode(OwnSinglyLinkedList.Node node) {
        OwnSinglyLinkedList list = new OwnSinglyLinkedList();
        list.append(node.data);
        while (node.next != null) {
            list.append(node.next.data);
            node.next = node.next.next;
        }
        return list;
    }


    public static OwnSinglyLinkedList.Node removeNodesGreaterThanValue(OwnSinglyLinkedList.Node listHead, int x) {
        if (listHead == null) {
            return null;
        }
        if (listHead.intData > x && listHead.next == null) {
            return null;
        }
        OwnSinglyLinkedList.Node current = listHead;
        OwnSinglyLinkedList.Node previous = null;
        while (current != null && current.intData > x) {
            previous = current;
            current = current.next;
        }
        if (previous != null) {
            previous.next = null;
        }
        OwnSinglyLinkedList.Node newHead = current;
        while (current != null && current.next != null) {
            if (current.next.intData > x) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return newHead;
    }
}
