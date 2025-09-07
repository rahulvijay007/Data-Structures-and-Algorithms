public class Search {
    public static class LinkedList {
        public class Node {
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public Node head;
        public Node tail;
        public int size;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void addMiddle(int index, int data) {
            if (index < 0 || index > size) {
                System.out.println("Invalid index");
                return;
            }
            if (index == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }

        public void removeFirst() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            size--;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }

        public void removeLast() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (size == 1) {
                head = tail = null;
                size = 0;
                return;
            }
            size--;
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }

        public void remove(int index) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (index < 0 || index >= size) {
                System.out.println("Invalid index");
                return;
            }
            size--;
            if (index == 0) {
                head = head.next;
                if (head == null) tail = null;
                return;
            }
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }

        public void print() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int iterativeSearch(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
        public void recursiveSearch(Node head, int key)
        {
            if(head == null)
            {
                System.out.println("Key not found");
                return;
            }
            if(head.data == key)
            {
                System.out.println("Key found");
                return;
            }
            recursiveSearch(head.next, key);
        }
    }
    public static void main(String args[]) {
            LinkedList list = new LinkedList();
            list.addFirst(1);
            list.addFirst(2);
            list.addFirst(3);
            list.addLast(0);
            list.addMiddle(2, 9);
            list.print();
            list.removeFirst();
            list.print();
            list.removeLast();
            list.print();
            list.remove(1);
            list.print();
            System.out.println(list.iterativeSearch(9));
            System.out.println(list.iterativeSearch(2));
            System.out.println(list.iterativeSearch(0));
            System.out.println(list.iterativeSearch(1));
        }
}
