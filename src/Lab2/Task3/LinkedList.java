package Lab2.Task3;

public class LinkedList implements Queue {
    private Node head; //last added element
    private Node tail; //firs added element

    //default constructor
    LinkedList(){
        this.head=null;
        this.tail=null;
    }

    //method calculate and return list size
    @Override
    public int size(){
        int size = 0;

        if (tail == null){
            return size;
        }

        Node tailPointer = tail;

        while (tailPointer != null){
            ++size;
            tailPointer = tailPointer.getPrevious();
        }

        return size;
    }

    //method output all list elements
    @Override
    public void getAll(){
        Node tailPointer = tail;

        if (tail == null){ //check for empty list
            System.out.println("List is empty");
        }else {
            System.out.print("list = [ ");
            while (tailPointer!= null) {
                System.out.print("{"+ tailPointer.getValue()+ "} ");
                tailPointer = tailPointer.getPrevious();
            }
            System.out.print("]\n");
        }
    }

    //method add element to list head
    @Override
    public <V> void add(V value) {
        //if list is empty
        if (tail == null){
           tail = new Node(value,null,null);
           return;
        }
        // if list has only 1 element
        if (this.size()==1){
            head = new Node(value,tail,null);
            tail.setPrevious(head);
            return;
        }
        //create new node and set the head of list
        head = new Node(value,head,null);
        //set old head link to new head
        head.getNext().setPrevious(head);


    }

    //FIFO = delete element from list tail
    @Override
    public void delete() {
        if (tail!=null && size()!=1){
         tail = tail.getPrevious();
         tail.setNext(null);
        } else if(size()==1){// do it if in list only tail
            tail =null;
            System.out.println("List is empty");
        }else
            System.out.println("List is empty");
    }

    @Override
    public void delete(int index) {
        Node currentPointer = tail;


        if (index>=size()) { //show it if index not existing
            System.out.println("there is no item with this index ");
        }
        //delete tail
        if (index == 0){
            delete();
            return;
        }
        //delete any element in list
        if (index<this.size()-1){
            for (int i = 0; i <=index ; i++) {
                //links to previous and next element
                Node previousPointer = currentPointer.getPrevious();
                Node nextPointer = currentPointer.getNext();

                if (i==index){//do it if current pointer is expected element
                    nextPointer.setPrevious(currentPointer.getPrevious());
                    previousPointer.setNext(currentPointer.getNext());
                }else{// incrementing to the list
                    currentPointer = currentPointer.getPrevious();
                }
            }
            return;
        }
        //delete current head
        if (index==this.size()-1){
           head = head.getNext();
           head.setPrevious(null);
        }
    }

}