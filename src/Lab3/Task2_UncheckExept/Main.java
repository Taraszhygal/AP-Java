package Lab3.Task2_UncheckExept;

public class Main {
    public static void main(String[] args) {
        String[] firstNames = {"Gabe", "Hideo", "Todd"};
        String[] lastNames = {"Newell", "Kojima", "Howard"};
        String[] cities = {"Davis", "Tokyo", "Pennsylvania"};
        String[] districts = {"Bellevue,", "Setagaya", "Lower Macungie Township"};
        String[] postCodes = {"15527", "93220", "code"};
        String[] emails = {"gaben@valve.com", "kojimba.gmail.com", "thoward@orange.us"};
        String[] passwords = {"qwerty123", "asd123321", "pass"};

        User[] users = new User[3];

        for (int i = 0; i < users.length; i++) {
            users[i] = new User(firstNames[i],
                    lastNames[i],
                    new Address(cities[i],
                            districts[i],
                            postCodes[i]),
                    emails[i],
                    passwords[i]);
        }

        for (User user : users) {
            System.out.println("перевіряються поля користувача: " + user.getFirstName() + " " + user.getLastName());

            try {
                validate(user);
            } catch (InvalidDataException iDException) {
                System.out.println(iDException.getLocalizedMessage());
            } finally {
                System.out.println("----------------------------------------------------------------------------");
            }
        }


    }

    private static void validate(User user) throws InvalidDataException {
        //checking first name is: no empty, no numbers, no spaces.
        if (user.getFirstName().length() == 0
                || user.getFirstName().matches(".*\\d.*")
                || user.getFirstName().matches(".*\\p{Space}.*")) {
            //if condition invalid throw custom  exception
            throw new InvalidDataException(ErrorCode.CODE_400, "Bad Request",
                    "Поле first name повинне бути не порожнє, не містити цифер та пробілів");
        }

        //checking last name is: no empty, no numbers, no spaces.
        if (user.getLastName().length() == 0
                || user.getLastName().matches(".*\\d.*")
                || user.getLastName().matches(".*\\p{Space}.*")) {

            throw new InvalidDataException(ErrorCode.CODE_400, "Bad Request",
                    "Поле last name повинне бути не порожнє, не містити цифер та пробілів");
        }

        //checking city is: no empty, no numbers.
        if (user.getAddress().getCity().length() == 0
                || user.getAddress().getCity().matches(".*\\d.*")) {

            throw new InvalidDataException(ErrorCode.CODE_400, "Bad Request",
                    "Поле city повинне бути не порожнє та не містити цифер");
        }

        //checking district is: no empty, no numbers.
        if (user.getAddress().getDistrict().length() == 0
                || user.getAddress().getDistrict().matches(".*\\d.*")) {

            throw new InvalidDataException(ErrorCode.CODE_400, "Bad Request",
                    "Поле district повинне бути не порожнє та не містити цифер");
        }

        //checking post index is: no empty, no letters.
        if (user.getAddress().getPostCode().length() == 0
                || user.getAddress().getPostCode().matches(".*\\D")) {

            throw new InvalidDataException(ErrorCode.CODE_400, "Bad Request",
                    "Поле post index повинне бути не порожнє та не містити букв");
        }

        //checking email is: no empty, is @ , no spaces.
        if (user.getEmail().length() == 0
                || !user.getEmail().matches(".*@.*")
                || !user.getEmail().matches(".*[.].*")
                || user.getEmail().matches(".*\\p{Space}.*")) {

            throw new InvalidDataException(ErrorCode.CODE_400, "Bad Request",
                    "Поле email повинне бути не порожнє, містити @ та '.'  не містити пробілів");
        }

        //checking last name  for: no empty, no numbers, no spaces.
        if (user.getPassword().length() < 6
                || !user.getPassword().matches(".*\\d.*")
                || !user.getPassword().matches(".*\\p{Alpha}.*")
                || user.getPassword().matches(".*\\p{Space}.*")) {

            throw new InvalidDataException(ErrorCode.CODE_400, "Bad Request",
                    "Поле password повинне бути не коротше 6 символів, містити цифри та букви і не містити пробілів");
        }

        System.out.println(user.getFirstName() + " " + user.getLastName() + " успішно пройшов перевірку ");

    }
}
