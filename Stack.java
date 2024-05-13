
    public class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        // Constructor to initialize the stack
        public Stack(int size) {
            capacity = size;
            arr = new int[capacity];
            top = -1;
        }


        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push element " + value);
                return;
            }
            arr[++top] = value;
            System.out.println("Pushed " + value + " to the stack");
        }

        // Method to pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot pop element");
                return -1;
            }
            int poppedValue = arr[top--];
            System.out.println("Popped " + poppedValue + " from the stack");
            return poppedValue;
        }


        public boolean isEmpty() {
            return top == -1;
        }


        public boolean isFull() {
            return top == capacity - 1;
        }

        public static void main(String[] args) {
            Stack stack = new Stack(5);

            stack.push(1);



            System.out.println(  stack.pop());

        }
    }


