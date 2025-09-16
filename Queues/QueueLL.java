public class QueueLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    // Node class
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public QueueLL() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return size of queue
    public int size() {
        return size;
    }

    // Add element to rear
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Remove element from front
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    // Peek at front element
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    // Print all elements in the queue
    public void printQueue() {
        Node<T> temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        QueueLL<Integer> queue = new QueueLL<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue(); // 10 -> 20 -> 30 -> null

        System.out.println("Front element: " + queue.peek()); // 10
        System.out.println("Dequeued: " + queue.dequeue());   // 10
        queue.printQueue(); // 20 -> 30 -> null

        System.out.println("Front element: " + queue.peek()); // 20
        System.out.println("Queue size: " + queue.size());    // 2
    }
}
