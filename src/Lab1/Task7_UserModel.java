package Lab1;

public class Task7_UserModel {
    public static void main(String[] args) {
        User tUser = new User("Taras","Zhyhal","zhygalt@gmail.com",19);
        User nUser = new User("Nazar","Hnatyshyn","nazar228@gmail.com",19);
        //Приклад використання функції equals
        if (tUser.equals(nUser)) {
        System.out.print("Користувачі одинакові");
        } else {
        System.out.print("Користувачі різні");
        }
    }
}
