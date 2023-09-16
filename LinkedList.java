package AssignmentDay14;
public class LinkedList {
    public Node addFirst(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
            return head;
        }
    }

    public Node addLast(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        } else {
            Node currNode = head;
            while (currNode == null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            return currNode;
        }
    }

    public void addSpecific(int data, int p) {
        Node currNode;
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;
        } else {
            currNode = head;
            int currentPosition = 0;
            while (currNode != null && currentPosition < p) {
                currNode = currNode.next;
            }
            if (currNode == null) {
                System.out.println("Out of bound position");
                return;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
            System.out.println(currNode.data);

        }
    }

    Node head;

    public void displayData(Node head) {
        if (head == null) {
            System.out.println("The list is empty...!");
        } else {
            Node tail = head;
            while (tail != null) {
                System.out.print(tail.data + "->");
                tail = tail.next;
            }
        }
    }
}