package Lab2.Task3;

public interface Queue  {
   <V> void add(V value);
    void delete(int index);
    void delete();
    void getAll();

    int size();

}