public class SinglyLinkedList {
    
    private Node head;
    
    public SinglyLinkedList(){
        this.head = null;
    }

    private boolean IsEmpty(){
        return this.head == null;
    }


    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void addBack(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        } 
        
        Node runner = this.head;
        while(runner.next != null){
            runner = runner.next;
        }
        runner.next = newNode;
    }

    public void addFront(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void displayValues(){
        if(IsEmpty()){
            System.out.println("List is empty");
            return; 
        }

        Node runner = this.head;
        while(runner.next != null){
            System.out.println("$$$$$");
            String s = String.format("Node Value: %d :: Next Value: %d", runner.value, runner.next.value);
            System.out.println(s);
            runner = runner.next;
        }
        System.out.println("$$$$$");
        String s = String.format("Node Value: %d :: Next Value: null", runner.value);
        System.out.println(s);
    }

    public Integer removeBack(){
        Node runner = head;
        int valToReturn;

        // if we have 0 nodes return null
        if(IsEmpty())
            return null;
        
        // if we have just one node, remove head
        if(head.next == null){
            valToReturn = head.value;
            head = null;
            return valToReturn;
        }

        // otherwise, loop til we are right before the last node
        while(runner.next.next != null){
            runner = runner.next;
        }
        valToReturn = runner.next.value;
        runner.next = null;
        return valToReturn;
    }

}


    

