package DataStructures.Linear;

public class Queue {
    private int[] arr;
    private int capacity;
    private int front;
    private int rear;

    public Queue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int element) {
        if (!isFull()) {
            if (front == -1)
                front = 0;
            arr[++rear] = element;
            // above line equivalent to:
            // rear++;
            // arr[rear] = element;
        } else
            throw new IllegalStateException("Queue Overflow: Queue is already full.");
    }

    public int deQueue() {
        if (!isEmpty()) {
            int value = arr[front++];
            // above line equivalent to:
            // int value = arr[front];
            // front++;
            if (front > rear) {
                front = -1;
                rear = -1;
            }
            return value;
        } else
            throw new IllegalStateException("Queue Underflow: Queue is already empty.");
    }

    public int peek() {
        if (!isEmpty())
            return arr[front];
        else
            throw new IllegalStateException("Queue is empty!");
    }

    public void display() {
        if (isEmpty())
            throw new IllegalStateException("Queue Underflow: Stack is empty");
        System.out.print("Queue content (front to rear): ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
