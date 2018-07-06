package stackTest;

import myStack.MyStack;

public class MyStackTest {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(5);

//        System.out.println( myStack.isFull());
//        System.out.println(myStack.pop());
        myStack.push(12);
        myStack.push(14);
        myStack.push(18);
        myStack.push(123);
        myStack.push(165);
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        myStack.push(12);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        myStack.push(12);
//        myStack.push(12);
//        myStack.push(12);
        myStack.printArray();
        System.out.println();
        System.out.println(myStack.size());

    }
}
