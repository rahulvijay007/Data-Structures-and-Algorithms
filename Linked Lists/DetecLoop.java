public class DetecLoop {
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
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            Node temp = head;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public void removeFirst() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            } else if (size == 1) {
                head = tail = null;
                size = 0;
                return;
            }
            size--;
            head = head.next;
        }

        public void removeLast() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            } else if (size == 1) {
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
            } else if (size == 1) {
                head = tail = null;
                size = 0;
                return;
            }
            size--;
            Node temp = head;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
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
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public boolean check() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println("Loop Detected? " + ll.check());
    }
}
