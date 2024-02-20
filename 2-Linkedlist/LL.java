public class LL {

    Node head;
    private int size = 0;

    // for Size
    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add-first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printList() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.print("Linked list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.print("Linked list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        }

        Node curr = head;
        Node last = head.next;
        while (last.next != null) {
            curr = last;
            last = last.next;
        }
        curr.next = null;

    }

    public int getSize() {
        return this.size;
    }

    public void search(String item) {
        Node curr = head;
        int index = 0;
        int found = 0;

        while (curr.next != null) {

            if (curr.data.equals(item)) {
                found++;
                System.out.println("Found at " + index);
                return;
            }
            curr = curr.next;
            index++;
        }
        if (found == 0) {
            System.out.println("Element not found");
        }

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.printList();
        System.out.println("\n");
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        System.out.println("\n");
        list.printList();
        System.out.println();

        System.out.println(list.getSize());
        list.addFirst("sachin");
        list.printList();
        System.out.println();
        System.out.println(list.getSize());

        list.search("singh");

    }
}
