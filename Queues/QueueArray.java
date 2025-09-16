public class QueueArray {
    static class Queue {
        int a[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            a = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % size;
            }
            a[rear] = data;
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(a[front]);
        }
        public void print() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            int i = front;
            while (true) {
                System.out.print(a[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.peek(); // 1
        q.dequeue();
        q.enqueue(6); // ✅ works now because circular
        q.peek(); // 2
    }
}
