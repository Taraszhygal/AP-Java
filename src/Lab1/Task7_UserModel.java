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
class User {
    //поля молелі User
    String firstName;
    String lastName;
    String email;
    int age;

    // дефолтний конструктор
    public User(){
    }
    //конструктор з параметрами
    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    //перевизначення методу рівності двох об'єктів
    @Override
    public boolean equals(Object obj) {
        //перевірка чи об'єкт не null
        if (obj == null) {
            return false;
        }
        // перевірка чи типи обєктів одинакові
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final User instance = (User)obj;
        //порівняння полів обє'ктів одного типу
        if ((this.firstName == null) ? (instance.firstName != null) : !this.firstName.equals(instance.firstName)) {
            return false;
        }
        if ((this.lastName == null) ? (instance.lastName != null) : !this.lastName.equals(instance.lastName)) {
            return false;
        }
        if ((this.email == null) ? (instance.email != null) : !this.email.equals(instance.email)) {
            return false;
        }
        if (this.age!=instance.age){
            return false;
        }
        return true;
    }

    //перевизначення методу hashCode, шляхом розрахуку хешу від імені та віку
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 19 * hash + this.age;
        return hash;
    }
}
