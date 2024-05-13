public class QueueUsingStacks {
    private Stack stack1;
    private Stack stack2;

    // Constructor to initialize the queue
    public QueueUsingStacks(int capacity) {
        stack1 = new Stack(capacity);
        stack2 = new Stack(capacity);
    }

    // Method to enqueue an element
    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        System.out.println("Enqueued " + value + " into the queue");
    }

    // Method to dequeue an element
    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue element");
            return -1;
        }
        int dequeuedValue = stack1.pop();
        System.out.println("Dequeued " + dequeuedValue + " from the queue");
        return dequeuedValue;
    }


    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty! No element to peek");
            return -1;
        }
        return stack1.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);


        System.out.println("Peeked element: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
