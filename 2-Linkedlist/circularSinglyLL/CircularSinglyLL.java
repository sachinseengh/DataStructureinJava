// package circularSinglyLL;

public class CircularSinglyLL {
    Node head;
    Node tail;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node curr = head;
        if (curr.next == head) {
            System.out.println(curr.data);
        }
        while (curr.next != head) {

            System.out.print(curr.data + "->");
            curr = curr.next;
            if (curr == tail) {
                System.out.print(curr.data);

            }
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (head.next == head) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        tail.next = head;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (head.next == head) {
            head = null;
            tail = null;
            return;
        }
        Node curr = head;
        Node last = curr.next;

        while (last.next != head) {
            curr = last;
            last = last.next;
        }
        curr.next = head;
        tail = curr;
    }

    public static void main(String[] args) {

        CircularSinglyLL list = new CircularSinglyLL();
        list.addLast("Sachin");
        list.addLast("is");
        list.addLast("a");
        list.printList();
        System.out.println();
        list.addFirst("The");
        list.printList();
        list.addFirst("one of ");
        System.out.println();
        list.printList();
        list.deleteFirst();
        System.out.println();
        list.printList();

        list.deleteLast();
        System.out.println();
        list.printList();

    }
}
