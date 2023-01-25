public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        //Empty
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createLinkedList(int nodeValue) {
        Node newNode = new Node();
        head = new Node();
        tail = new Node();
        newNode.setValue(nodeValue);
        head.setNext(newNode);
        head = newNode;
        tail = newNode;
        tail.setNext(null);
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if (head == null) {
            createLinkedList(nodeValue);
        } else {
            Node newNode = new Node();
            newNode.setValue(nodeValue);
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    public void traversalLinkedList() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getValue());
                if (i < size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
            System.out.println("\n");
        } else {
            System.out.println("The Linked List does not exist");
        }
    }
}
