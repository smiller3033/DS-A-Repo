public class App {
    public static void main(String[] args) throws Exception {
        int size;
        //creat list
        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();
        intList.addToBack(5);
        System.out.println("Head: " + intList.getHead().getData());
        System.out.println("Tail: " + intList.getTail().getData());
        size  = intList.size();
        System.out.println("size: " + size);
        intList.addToBack(6);
        System.out.println("Head: " + intList.getHead().getData());
        System.out.println("Tail: " + intList.getTail().getData());
        size  = intList.size();
        System.out.println("size: " + size);
        intList.addToBack(7);
        System.out.println("Head: " + intList.getHead().getData());
        System.out.println("Tail: " + intList.getTail().getData());
        size  = intList.size();
        System.out.println("size: " + size);

        //test remove
        System.out.println(intList.removeFromBack());
        System.out.println("Head: " + intList.getHead().getData());
        System.out.println("Tail: " + intList.getTail().getData());
        size  = intList.size();
        System.out.println("size: " + size);
        System.out.println(intList.removeFromBack());
        System.out.println("Head: " + intList.getHead().getData());
        System.out.println("Tail: " + intList.getTail().getData());
        size  = intList.size();
        System.out.println("size: " + size);
        System.out.println(intList.removeFromBack());
        System.out.println("Head: " + intList.getHead().getData());
        System.out.println("Tail: " + intList.getTail().getData());
        size  = intList.size();
        System.out.println("size: " + size);
    }
}
