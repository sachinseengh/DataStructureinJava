// package 4-Queue;

public class CircularQueue {
    int arr[];
    int size;
    int front = -1;
    int rear = -1;

    public void createArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void enQueue(int value) {
        if (front == 0 && rear == size - 1) {
            System.out.println("Overflow");
            return;
        } else if (front == rear + 1) {
            System.out.println("Overflow");
            return;
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = value;
        }
    }

    public void deQueue() {
        if (front == -1) {
            System.out.println("Empty");

        } else if (rear == front) {
            System.out.println(arr[rear]);
            front = -1;
            rear = -1;
        } else {
            System.out.println(arr[front]);
            front = (front + 1) % size;
        }
    }

    public void printQueue() {
        if (front == -1) {
            System.out.println("Empty");
            return;
        }
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + ",");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(arr[i] + ",");
            }
            for (int i = front; i < size; i++) {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void main(String[] args) {

        CircularQueue cqueue = new CircularQueue();
        cqueue.createArray(3);
        cqueue.enQueue(6);
        cqueue.enQueue(62);
        cqueue.enQueue(63);
        cqueue.enQueue(89);
        cqueue.enQueue(48);
        cqueue.enQueue(58858);
        cqueue.printQueue();
        System.out.println("\n");
        cqueue.deQueue();
        cqueue.deQueue();
        cqueue.printQueue();
        System.out.println("\n");
        cqueue.enQueue(5);
        cqueue.printQueue();
        cqueue.deQueue();
        System.out.println("\n");
        cqueue.printQueue();
    }

}
