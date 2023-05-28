package LinkedList;

public class LinkedListCRUD<T> {
    Node<T> start;

    void insertAtBeg(Node<T> node) {
        // Linked List is empty
        if (start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtEnd(Node<T> node) {

        if (start == null) {
            start = node;
            return;
        }

        if (start.next == null) {
            start.next = node;
            return;
        }
        Node<T> current = start;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;

    }

    void insertAtMid(Node<T> node, int pos) {

        if (start == null) {
            start = node;
            return;
        }

        if (pos == 0) {
            insertAtBeg(node);
            return;
        }

        int i = 0;
        Node<T> temp = start;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void deleteAtMid(int pos) {
        if (pos == 0) {
            start = start.next;
            return;
        }
        int i = 0;
        Node<T> temp = start;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void print() {
        Node<T> temp = start;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCRUD<Integer> obj = new LinkedListCRUD<>();
        obj.insertAtBeg(new Node<>(10));
        obj.insertAtBeg(new Node<>(20));
        obj.insertAtBeg(new Node<>(30));
        obj.insertAtBeg(new Node<>(40));

        obj.insertAtEnd(new Node<>(100));
        obj.insertAtMid(new Node<>(50), 3);
        obj.print();

    }
}
