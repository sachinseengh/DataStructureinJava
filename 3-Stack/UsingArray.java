// package 3-Stack;

import java.util.Scanner;

public class UsingArray {
    int[] arr;
    int tos = -1;
    int size;

    UsingArray(int n) {
        size = n;
        this.arr = new int[n];
    }

    public void push(int data) {

        if (tos == size - 1) {
            System.out.println("Stack is Full");
            return;
        }
        tos++;
        arr[tos] = data;
    }

    public void pop() {
        if (tos == -1) {
            System.out.println("Empty Stack");
            return;
        }
        System.out.println(arr[tos]);
        tos--;
    }

    public void peek() {
        if (tos == -1) {
            System.out.println("Empty Stack");
            return;
        }
        System.out.println(arr[tos]);

    }

    public void isFull() {
        if (tos == -1) {
            System.out.println("Empty Stack");
            return;
        }
        if (tos == (size - 1)) {
            System.out.println("Full");
        } else {
            System.out.println("Not Full");
        }
    }

    public void deleteStack() {
        arr = null;
        tos = -1;
    }

    public void printStack() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of stack");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        UsingArray ua = new UsingArray(n);
        ua.push(2);
        ua.printStack();

        System.out.println("\n");
        ua.push(3);
        ua.printStack();

        System.out.println("\n");
        ua.push(3);
        ua.printStack();

        System.out.println("\n");
        ua.push(3);
        ua.printStack();

        System.out.println("\n");
        ua.push(3);
        ua.printStack();

        System.out.println("\n");
        ua.pop();
        ua.printStack();

        System.out.println("\n");
        ua.peek();
        ua.printStack();

        System.out.println("\n");
        ua.isFull();

        ua.deleteStack();
        ua.printStack();

    }
}
