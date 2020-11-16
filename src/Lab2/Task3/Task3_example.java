package Lab2.Task3;

public class Task3_example {
    public static void main(String[] args) {
        //create instance of LinkedList by default private constructor
        LinkedList numbers =new LinkedList() ;

        //show that list is empty and that`s checked
        numbers.getAll();

        //add instances to queue
        numbers.add("Cyberpunk");
        numbers.add(2077);
        numbers.add(" will be released");
        numbers.add(" on December ");
        numbers.add(10);

        // show all list elements
        numbers.getAll();

        // delete element from tail
        numbers.delete();
        numbers.getAll();

        // delete last element by index
        numbers.delete(3);
        numbers.getAll();

        //delete element from middle by index
        numbers.delete(1);
        numbers.getAll();

        //try to delete not existing element
        numbers.delete(5);
        numbers.getAll();
    }
}
