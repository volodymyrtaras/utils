package vtaras.own.utils.examples.java.linked.lists;

public class OwnSinglyLinkedList {

    public Node head;

    public void append(Object data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    public Node tail() {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }


    public static class Node {
        public Node next;
        public String data;
        public int intData;

        public Node(Object o) {
            if (o instanceof String) {
                this.data = (String) o;
            } else if (o instanceof Integer) {
                this.intData = (int) o;
            }
        }

        public Node(String data) {
            this.data = data;
        }

        public int getIntData() {
            return intData;
        }

        public String getData() {
            return data;
        }

        public Node(int intData) {
            this.intData = intData;
        }
    }
}
