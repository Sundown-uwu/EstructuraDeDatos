public class BinarySearchTree {
    Node root;
    public void insert(int value){
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current,int value){
        //Caso base cuando curerrent sea null, en este punto vamos a crear el nodo
        if(current == null){
            return new Node(value);
        }
        //Si el valor a insertar es menor al valor de currente 
        //Entonces vamos a crear el nodo de lado izquierdo
        if(value < current.value){
            current.left = insertRecursive(current.left,value);
            //Si el valor a insertar es mayor que el valor de current
            //Vamos a crear el nodo de lado derecho
        }else if(value > current.value){
            current.right = insertRecursive(current.right,value);
        }
        return current;
    }
//En caso de que queramos imprimir el arbol en orden
    public void printInOrder(){
        System.out.println("---Print en orden---");
        printInOrderRecursive(root);
        }

    private void printInOrderRecursive(Node current){
        if(current != null){
            printInOrderRecursive(current.left);
            System.out.println(current.value + " ");
            printInOrderRecursive(current.right);
        }
        }
}

