public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Lista -> (Vacía)");
            return;
        }

        System.out.print("Lista -> ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" / ");
            }
            current = current.next;
        }
    }

    public void remove(int data) {

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Info: Valor " + data + " no encontrado en la lista.");
            return;
        }

        System.out.println("\n--- Eliminando nodo con valor: " + data + " ---");

        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }
}
