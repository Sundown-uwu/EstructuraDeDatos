public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        // Eliminando algo que no existe
        list.remove(1);
        list.printList();

        System.out.println("\n---Agregando Elementos ---");
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("\n--- Lista Antes de Eliminar ---");
        list.printList();

        list.remove(1);
        list.printList();

        list.remove(5);
        list.printList();

        list.remove(3);
        list.printList();

        list.remove(2);
        list.printList();

        list.remove(4);
        list.printList();
    }
}