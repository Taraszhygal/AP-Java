package Lab1;

public class Task2_lenSort {
    public static void main(String[] args) {
    String [] test = {"We’ve", "been" ,"spending", "most" ,"our" ,"lives" ,"living" ,"in" ,"the" ,"gangsta's", "paradise"};
        //вивід масиву до сортування
        System.out.println("Array before sorting");
        for (String a: test) {
            System.out.print("["+a+"]"+"\t");
        }

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - -\nArray after sorting");
        //сортуванн та вивід відсортованого масиву
        for (String b: sort(test)) {
            System.out.print("["+b+"]"+"\t");
        }
    }

    //метод для сортування рядкового масиву по довжині слів
    private static String[] sort(String[]arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //попарне порівняннн довжинислів в масиві та обмін місцями в масиві
                if (arr[i].length()<arr[j].length()){
                    String tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
}
