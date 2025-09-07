public class Pallindrome {
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
        public void reverse()
        {
            Node prev = null;
            Node curr = head;
            Node next;
            tail = head; // Update tail to the old head
            while (curr != null) {
                next = curr.next; // Store next node
                curr.next = prev; // Reverse the link
                prev = curr;      // Move prev to current
                curr = next;     // Move to next node
            }
            head = prev; // Update head to the new first node

        }
        public Node findMid(Node head)
        {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; // slow is now at the middle node
        }
        public boolean check()
        {
            if(head == null || head.next == null) return true;
            Node mid = findMid(head);
            Node prev = null;
            Node curr = mid;
            Node next;
            while (curr != null) {
                next = curr.next; // Store next node
                curr.next = prev; // Reverse the link
                prev = curr;      // Move prev to current
                curr = next;     // Move to next node
            }
            Node left = head;
            Node right = prev; // Start of reversed second half
            while (right != null) {
                if (left.data != right.data) {
                    return false; // Mismatch found
                }
                left = left.next;
                right = right.next;
            }
            return true; // All nodes matched
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.print();
        System.out.println(list.check());
    }
    
}
