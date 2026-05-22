package utilities;

import java.util.Random;

public class RandomDataGenerator {

    public static String generateRandomUsername() {

        return "user" + generateRandomNumber();
    }

    public static String generateRandomEmail() {

        return "test" + generateRandomNumber() + "@gmail.com";
    }

    public static int generateRandomNumber() {

        Random random = new Random();

        return random.nextInt(999999);
    }
}