package Lab3.Task3_StreamAPI;

import Lab3.Task2_UncheckExept.Address;
import Lab3.Task2_UncheckExept.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test_Stream {
    public static void main(String[] args) {

        Address addressSherlock = new Address("London", "Marylebon", "221b");
        Address addressMary = new Address("NY", "Brooklyn", "2617");
        Address addressMy = new Address("Lviv", "New Lviv", "27026");
        Address addressBro = addressMy;
        User userSherlock = new User("Sherlock", "Holmes", addressSherlock, "qaSherlock@tmobile.uk", "qwertyand123");
        User userMary = new User("Mary", "Yorks", addressMary, "mashatsk@gmail.com", "fjsd442");
        User userMe = new User("Taras", "Zhygal", addressMy, "zhygalt@mail.ua", "HESOYAM4ME");
        User userBro = new User("Nazer", "Zhygal", addressBro, "zhygalnazar@gmail.ua", "UZUMYMV");

        List<User> users = new ArrayList<>();
        users.add(userMe);
        users.add(userBro);
        users.add(userMary);
        users.add(userSherlock);

        //find Sherlock and add "the best" to name then output it
        users.stream()
                .filter(user -> user.getFirstName().equals("Sherlock"))
                .map(user -> user.getFirstName() + " The Best")
                .forEach(System.out::println);

        //return cities list without duplicate
        List<String> CitiesList = users.stream()
                .map(user -> user.getAddress().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(CitiesList);

        //output third element
        User nUser = users.stream()
                .skip(2)
                .findFirst()
                .get();
        System.out.println(nUser.getFirstName() + " " + nUser.getLastName());

        //peek 3 users with the shortest passwords and output they password length
        List<User> threeShortestPassUser = users.stream()
                .sorted((user1, user2) -> user1.getPassword().length() - user2.getPassword().length())
                .limit(3)
                .peek(user -> System.out.println(user.getFirstName() + " have " + user.getPassword().length() + " length password"))
                .collect(Collectors.toList());

        //output sum of length all emails
        System.out.println(users.stream()
                .map(user -> user.getEmail().length())
                .reduce((integer, integer2) -> integer + integer2).orElse(0)
                .intValue()
        );
    }
}
