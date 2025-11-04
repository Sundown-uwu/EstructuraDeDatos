public class App {
    public static void main(String[] args) throws Exception {
ArrayQueue<Customer> customerQueue = new ArrayQueue<>();
        
        customerQueue.enqueue(new Customer(1, "Ana"));
        customerQueue.enqueue(new Customer(2, "Luis"));
        customerQueue.enqueue(new Customer(3, "Maya"));
        
        System.out.println("Antes de invertir:");
        System.out.println(customerQueue);
        int sizeBefore = customerQueue.size();

        customerQueue.reverse();

        System.out.println("\nDespués de invertir:");
        System.out.println(customerQueue);
        int sizeAfter = customerQueue.size();

        System.out.println("\nElementos antes = " + sizeBefore + ", elementos después = " + sizeAfter);
    }
}