package LinkedList;

public class LinkListOpertion<T> {
    Node<T> start;

    void insertAtbeg(Node<T> node) {
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
            insertAtbeg(node);
            return;
        }
        int i = 1;
        Node<T> temp = start;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;

    }

    void deleteAtanyPos(int pos) {
        Node<T> temp = null;
        if (start == null) {
            System.out.println("LinkList is empty");
            return;
        }
        if (pos == 1) {
            temp = start;
            start = start.next;
        }
        temp = start;
        int i = 1;
        while (i < pos) {
            temp = temp.next;
            i++;

        }
        temp.next = temp.next.next;

    }

    void Print() {
        Node<T> temp = start;
        while (temp != null) {
            System.out.println(start.next);

            temp = temp.next;
        }

    }

    void infiniteloop() {
        Node<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = start;

    }

    void detectloop(Node<T> temp) {
        Node<T> slow = temp;
        Node<T> fast = temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("loop detected");

                return;
            }

        }
        System.out.println("Not detected");
    }

    public static void main(String[] args) {

        {
            LinkListOpertion<Integer> obj = new LinkListOpertion<>();
            // obj.insertAtbeg(new Node<>(10));
            // obj.insertAtbeg(new Node<>(20));
            // obj.insertAtbeg(new Node<>(30));
            // obj.Print();
            // obj.insertAtEnd(new Node<>(10));
            // obj.insertAtEnd(new Node<>(20));
            // obj.insertAtEnd(new Node<>(30));
            // obj.insertAtEnd(new Node<>(40));
            Node<Integer> root = new Node<>(10);
            root.next = new Node<>(30);
            root.next.next = new Node<>(40);
            root.next.next.next = new Node<>(50);
            Node<Integer> temp = root;

            // while(temp.next!=null){
            // temp=temp.next;
            // }
            // temp.next=root;
            obj.detectloop(root);

            /*
             * while ( root!= null) {
             * System.out.println(root.data);
             * 
             * root = root.next;
             * }
             */

            // obj.deleteAtanyPos(2);
            // obj.insertAtMid(new Node<>(25), 3);
            // obj.detectloop();

            // obj.Print();

        }

    }
}
