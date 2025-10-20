public class ListRemover {
public static void Remover(Node head){
    if(head == null || head.next == null){
        return;
    }
    Node actual = head;
    while (actual != null){
        Node sig = actual;

        while(sig.next != null){
            if(sig.next.data == actual.data){
                sig.next=sig.next.next;
            }else{
                sig = sig.next;
            }
        }
        actual = actual.next;
    }

}    
public static void printList(Node head) {
        Node print = head;
        while (print != null) {
            System.out.print(print.data + " / ");
            print = print.next;
        }
        System.out.println("null");
    }
}
