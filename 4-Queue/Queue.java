// package 4-Queue;

public class Queue {
    int size;
    int arr[];
    int front, rear;

    public void createArray(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = -1;

    }

    public void enQueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        } else if (front == -1) {
            front++;
            rear++;
            arr[rear] = value;
        } else {
            rear++;
            arr[rear] = value;
        }
    }

    public void deQueue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        } else {
            int value = arr[front];
            System.out.println(value);
            rear--;
        }
    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.createArray(5);
        queue.enQueue(4);
        queue.enQueue(58);
        queue.enQueue(58);
        queue.enQueue(58);
        queue.enQueue(58);
        queue.enQueue(58);
        queue.printQueue();
        System.out.println("\n");
        queue.deQueue();
        queue.printQueue();
    }

}
