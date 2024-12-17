package DataStructures.Linear;

public class Stack {
    private int[] arr;
    private int capacity;
    private int top;

    public Stack(int size){
        if(size<=0){
            throw new IllegalArgumentException("Stack size must be positive");
        }
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == (capacity - 1);
    }

    public void push(int element){
        if(!isFull()) arr[++top] = element;
        else throw new IllegalStateException("Stack Overflow: Stack is already full");
    }

    public int pop(){
        if(!isEmpty()) return arr[top--];
        else throw new IllegalStateException("Stack Underflow: Stack is already empty");
    }

    public int peek(){
        if(!isEmpty()) return arr[top];
        else throw new IllegalStateException("Stack Underflow: Stack is already empty");
    }

    public int currentSize(){
        return top+1;
    }

    public void display(){
        if(isEmpty()) throw new IllegalStateException("Stack Underflow: Stack is empty");
        System.out.println("Stack content (top to bottom): ");
        for(int i = top; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
