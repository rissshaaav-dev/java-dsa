package datastructures.linear;

public class CircularQueue {
    private int[] arr;
    private int capacity;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return (rear+1)%capacity == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int element) {
        if (!isFull()) {
            if (front == -1)
                front = 0;
            rear = (rear+1)%capacity;
            arr[rear] = element;
        } else
            throw new IllegalStateException("Queue Overflow: Queue is already full.");
    }

    public int deQueue() {
        if (!isEmpty()) {
            int value = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else front = (front+1)%capacity;
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
            throw new IllegalStateException("Queue Underflow: Queue is empty");
        System.out.print("Queue content (front to rear): ");
        for (int i = front; i != rear; i = (i + 1) % capacity) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[rear] + " ");
        System.out.println();
    }
}
