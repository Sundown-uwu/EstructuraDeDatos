public class App {
    public static void main(String[] args) throws Exception {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(9);

        System.out.println("Lista Original:");
        ListRemover.printList(head);
        ListRemover.Remover(head);
        System.out.println("\nLista sin Duplicados:");
        ListRemover.printList(head);
    }
}
