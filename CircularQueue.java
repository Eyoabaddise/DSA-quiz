
    public class CircularQueue {
        private int maxSize;
        private int[] queueArray;
        private int front;
        private int rear;
        private int currentSize;

        public CircularQueue(int size) {
            maxSize = size;
            queueArray = new int[maxSize];
            front = 0;
            rear = -1;
            currentSize = 0;
        }

        public boolean isEmpty() {
            return (currentSize == 0);
        }

        public boolean isFull() {
            return (currentSize == maxSize);
        }

        public void enqueue(int value) {
            if (!isFull()) {
                rear = (rear + 1) % maxSize;
                queueArray[rear] = value;
                currentSize++;
                System.out.println("Added " + value + " to the circular queue.");
            } else {
                System.out.println("Circular queue is full. Cannot add " + value + ".");
            }
        }

        public int dequeue() {
            if (!isEmpty()) {
                int removedValue = queueArray[front];
                front = (front + 1) % maxSize;
                currentSize--;
                System.out.println("Removed " + removedValue + " from the circular queue.");
                return removedValue;
            } else {
                System.out.println("Circular queue is empty. Cannot dequeue.");
                return -1;
            }
        }

        public int peek() {
            if (!isEmpty()) {
                return queueArray[front];
            } else {
                System.out.println("Circular queue is empty. Cannot peek.");
                return -1;
            }
        }

        public void display() {
            if (!isEmpty()) {
                System.out.print("Circular Queue (front to rear): ");
                int count = 0;
                int i = front;
                while (count < currentSize) {
                    System.out.print(queueArray[i] + " ");
                    i = (i + 1) % maxSize;
                    count++;
                }
                System.out.println();
            } else {
                System.out.println("Circular queue is empty.");
            }
        }

        public static void main(String[] args) {
            CircularQueue queue = new CircularQueue(5); // Creating a circular queue of size 5
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            queue.display(); // Displaying the circular queue

            queue.dequeue();
            queue.enqueue(40);
            queue.enqueue(50);

            queue.display(); // Displaying the circular queue after enqueue and dequeue operations

            System.out.println("Front element: " + queue.peek()); // Peeking at the front element
        }
    }


