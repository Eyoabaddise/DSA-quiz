
    import java.util.Stack;

    public class LinearQueueUsingStacks {
        private Stack<Integer> stack1; // For enqueue operation
        private Stack<Integer> stack2; // For dequeue operation

        public LinearQueueUsingStacks() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void enqueue(int value) {
            stack1.push(value);
            System.out.println("Added " + value + " to the linear queue using stacks.");
        }

        public int dequeue() {
            if (stack2.isEmpty()) {
                // Transfer elements from stack1 to stack2 to maintain FIFO order
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (!stack2.isEmpty()) {
                int removedValue = stack2.pop();
                System.out.println("Removed " + removedValue + " from the linear queue using stacks.");
                return removedValue;
            } else {
                System.out.println("Linear queue using stacks is empty. Cannot dequeue.");
                return -1; // Returning -1 indicating an empty queue
            }
        }

        public static void main(String[] args) {
            LinearQueueUsingStacks queue = new LinearQueueUsingStacks(); // Creating a linear queue using stacks
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            System.out.println("Dequeued element: " + queue.dequeue());
            System.out.println("Dequeued element: " + queue.dequeue());
            System.out.println("Dequeued element: " + queue.dequeue());
            System.out.println("Dequeued element: " + queue.dequeue()); // Trying to dequeue from an empty queue
        }
    }


