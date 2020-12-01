package Lab2.Task3;

public class LinkedList implements Queue {
    private Node tail; //last added element
    private Node head; //firs added element

    //default constructor
    LinkedList(){
        this.tail =null;
        this.head =null;
    }

    //method calculate and return list size
    @Override
    public int size(){
        int size = 0;

        if (head == null){
            return size;
        }

        Node tailPointer = head;

        while (tailPointer != null){
            ++size;
            tailPointer = tailPointer.getPrevious();
        }

        return size;
    }

    //method output all list elements
    @Override
    public void getAll(){
        Node tailPointer = head;

        if (head == null){ //check for empty list
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

    //method add element to list tail
    @Override
    public <V> void add(V value) {
        //if list is empty
        if (head == null){
           head = new Node(value,null,null);
           return;
        }
        // if list has only 1 element
        if (this.size()==1){
            tail = new Node(value, head,null);
            head.setPrevious(tail);
            return;
        }
        //create new node and set the tail of list
        tail = new Node(value, tail,null);
        //set old tail link to new tail
        tail.getNext().setPrevious(tail);


    }

    //FIFO = delete element from list head
    @Override
    public void delete() {
        if (head !=null && size()!=1){
         head = head.getPrevious();
         head.setNext(null);
        } else if(size()==1){// do it if in list only head
            head =null;
            System.out.println("List is empty");
        }else
            System.out.println("List is empty");
    }

    @Override
    public void delete(int index) {
        Node currentPointer = head;


        if (index>=size()) { //show it if index not existing
            System.out.println("there is no item with this index ");
        }
        //delete head
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
        //delete current tail
        if (index==this.size()-1){
           tail = tail.getNext();
           tail.setPrevious(null);
        }
    }

}