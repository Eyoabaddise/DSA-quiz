public class LinearQueue {
    private int maxSize; // Maximum size of the queue
    private int[] queueArray; // Array to hold the queue elements
    private int front; // Front of the queue
    private int rear; // Rear of the queue
    private int currentSize; // Current size of the queue

    // Constructor to initialize the queue
    public LinearQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++;
            System.out.println("Added " + value + " to the queue.");
        } else {
            System.out.println("Queue is full. Cannot add " + value + ".");
        }
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (!isEmpty()) {
            int removedValue = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            System.out.println("Removed " + removedValue + " from the queue.");
            return removedValue;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Returning -1 indicating an empty queue
        }
    }

    // Method to peek at the front element of the queue without removing it
    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Returning -1 indicating an empty queue
        }
    }

    // Method to display the elements of the queue
    public void display() {
        if (!isEmpty()) {
            System.out.print("Queue (front to rear): ");
            for (int i = 0; i < currentSize; i++) {
                int index = (front + i) % maxSize;
                System.out.print(queueArray[index] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5); // Creating a queue of size 5
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display(); // Displaying the queue

        queue.dequeue();
        queue.dequeue();

        queue.display(); // Displaying the queue after dequeue operations

        System.out.println("Front element: " + queue.peek()); // Peeking at the front element

        queue.enqueue(60);
        queue.enqueue(70);

        queue.display(); // Displaying the queue after enqueue operations
    }
}
