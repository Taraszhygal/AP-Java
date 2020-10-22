    package Lab1;

    import java.util.Random;

    public class Task4_BubbleSort {
        public static void main(String[] args) {
            int length=12;
            int [] num = new int[length];
            Random random = new Random();

           //заповнення масиву випадковими цифрами
            for (int i = 0; i < length; i++) {
                num[i] = random.nextInt(200);
            }
            // вивід масиву до сортування
            System.out.println("Array before sorting");
            for (int a: num) {
                System.out.print(a+"\t");
            }
            // виклик методу сортування бульбашкою та вивід результату
            System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - -\n" +
                    "Array after sorting");
            for (int b : sort(num)) {
                System.out.print(b +"\t");
            }

        }
        // метод сортування бульбашкою
        private static int[] sort(int[]arr){

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    //попарне порівняння елементів і їх обмін
                    if (arr[i]<arr[j]){
                        int tmp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                    }
                }
            }
            return arr;
        }
    }
