public class ListTester {
    
    public static void main(String[] args) {
        
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addBack(1);
        sll.addBack(10);
        sll.addBack(4);
        sll.addBack(6);

        int val = sll.removeBack();
        sll.displayValues();
    }
}
