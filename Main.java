package AssignmentDay14;
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = list.addFirst(56, null);
        list.addFirst(30, head);
        list.addFirst(70, head);
        list.addLast(400, head);
        list.addFirst(29, head);
        list.displayData(head);
        list.addLast(100, head);
        list.addSpecific(30, 2);
        list.displayData(head);
    }
}
