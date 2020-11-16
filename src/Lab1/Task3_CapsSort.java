package Lab1;

public class Task3_CapsSort {
    public static void main(String[] args) {
        String [] test = {"ALOHA", "ALOHa" ,"ALOha", "ALoha" ,"Aloha" ,"aloha"};

        //вивід масиву до сортування
        System.out.println("Array before sorting");
        for (String b: test) {
            System.out.print(b+"\t");
        }

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - -\n" +
                "Array after sorting");
        //сортуванн та вивід відсортованого масиву
        for (String a: sort(test)) {
            System.out.print(a +"\t");
        }

    }

    //метод для сортування рядків
    private static String[] sort(String[]arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //попарне порівняння кількості великих літер у словах та їх обмін
                if (caps_count(arr[i])<caps_count(arr[j])){
                    String tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }

    //метод для підрахунку великих літер
     private static int caps_count(String str){
        char[]tmp = str.toCharArray();
        int count=0;
         for (char c: tmp) {
             //якщо літера велика ліцильник збільшується
             if(c>='A'&& c<='Z') {
                count++;
             }
         }
        return count;
     }
}
