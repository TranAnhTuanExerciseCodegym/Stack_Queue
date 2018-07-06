package stack;

public class MyStack {
    int size;
    int[] array;
    int index = 0;

    public MyStack(int size) {
        this.size = size;
        array = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        array[index] = element;
        index++;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public void printArray() {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        index--;
        return array[index];
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return index;
    }
}
