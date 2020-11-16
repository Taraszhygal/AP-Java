package Lab2.Task6;

import Lab1.User;

import java.util.HashMap;
import java.util.Map;

public class Task6_example {
    public static void main(String[] args) {
        //create and init users
        User tUser = new User("Taras","Zhyhal","zhygalt@gmail.com",19);
        User nUser = new User("Nazar","Hnatyshyn","nazar228@gmail.com",19);
        User nzUser = new User("Nazar","Zhygal","nazazhyg@gmail.com",21);

        //create hashMap (doesnt save order)
        Map<String , User> userMap =new HashMap<>();

        //add users to map
        userMap.put(tUser.getFirstName(),tUser); // Taras Zhyhal
        userMap.put(nUser.getFirstName(),nUser); // Nazar Hnatyshyn
        //delete user from map
        userMap.remove(tUser.getFirstName());

        System.out.println("key = Nazar and value before add duplicate");
        //output key,value
        System.out.println("<"+nUser.getFirstName()+"> = <"
                                        +userMap.get(nUser.getFirstName()).getFirstName() + " "
                                        +userMap.get(nUser.getFirstName()).getLastName()+", "
                                        + userMap.get(nUser.getFirstName()).getAge()+" years old "+">");

        //add user with kay duplicate
        userMap.put(nzUser.getFirstName(),nzUser);

        System.out.println("key = Nazar and value after add duplicate");
        //output key,value
        System.out.println("<"+nzUser.getFirstName()+"> = <"
                +userMap.get(nzUser.getFirstName()).getFirstName() + " "
                +userMap.get(nzUser.getFirstName()).getLastName()+ ", "
                + userMap.get(nzUser.getFirstName()).getAge()+" years old "+">");


    }
}
