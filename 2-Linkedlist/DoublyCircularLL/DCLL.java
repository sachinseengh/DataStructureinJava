// package 2-Linkedlist.DoublyCircularLL;

public class DCLL {
    Node head;
    Node tail;

    class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        tail = newNode;

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;

        newNode.prev = tail;
        tail.next = newNode;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (head.next == head) {
            head = null;
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

    public void printList() {
        Node curr = head;
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        if (curr.next == head) {
            System.out.println(curr.data + "-> null");
            return;
        }

        while (curr.next != head) {
            System.out.print(curr.data + "->");
            curr = curr.next;
            if (curr == tail) {
                System.out.print(curr.data);
            }
        }

        System.out.print("-> null");
    }

    public static void main(String[] args) {
        DCLL list = new DCLL();
        list.addNode("sachin");
        list.printList();
        System.out.println("\n");
        list.addNode("is");
        list.printList();
        System.out.println("\n");
        list.addNode("a good boy");
        list.printList();

        System.out.println("\n");
        list.addFirst("hello");
        list.printList();

        System.out.println("\n");
        list.addFirst("sir");
        list.printList();

        System.out.println("\n");
        list.deleteFirst();
        list.printList();

        System.out.println("\n");
        list.deleteFirst();
        list.printList();

        System.out.println("\n");
        list.deleteLast();
        list.printList();
    }

}
