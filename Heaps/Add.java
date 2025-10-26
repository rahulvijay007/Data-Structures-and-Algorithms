import java.util.*;

public class Add {
    static class heap {
        ArrayList<Integer> ar = new ArrayList<>();

        // Add element and maintain min-heap property (up-heapify)
        public void add(int data) {
            ar.add(data);
            int x = ar.size() - 1;
            int par = (x - 1) / 2;

            while (x > 0 && ar.get(x) < ar.get(par)) {
                // Swap child and parent
                int temp = ar.get(x);
                ar.set(x, ar.get(par));
                ar.set(par, temp);

                // Move up
                x = par;
                par = (x - 1) / 2;
            }
        }

        // Return smallest element (root)
        public int peek() {
            if (ar.isEmpty()) {
                throw new NoSuchElementException("Heap is empty");
            }
            return ar.get(0);
        }

        // Restore heap property after removal (down-heapify)
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < ar.size() && ar.get(left) < ar.get(minIdx)) {
                minIdx = left;
            }
            if (right < ar.size() && ar.get(right) < ar.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = ar.get(i);
                ar.set(i, ar.get(minIdx));
                ar.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        // Remove and return smallest element (root)
        public int remove() {
            if (ar.isEmpty()) {
                throw new NoSuchElementException("Heap is empty");
            }

            int data = ar.get(0);
            int last = ar.get(ar.size() - 1);

            // Move last element to root
            ar.set(0, last);
            ar.remove(ar.size() - 1);

            // Restore heap property
            if (!ar.isEmpty()) {
                heapify(0);
            }

            return data;
        }

        public boolean isEmpty()
        {
            return ar.isEmpty();
        }
    }

    public static void main(String[] args) {
        heap h = new heap();
        h.add(10);
        h.add(5);
        h.add(20);
        h.add(1);

        System.out.println("Heap array: " + h.ar);
        System.out.println("Minimum element (peek): " + h.peek());

        System.out.println("Removed: " + h.remove());
        System.out.println("Heap after removal: " + h.ar);
        System.out.println("New minimum (peek): " + h.peek());
    }
}
