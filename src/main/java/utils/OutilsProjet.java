package utils;

import java.util.Random;

public class OutilsProjet {
    public static String generateRandomNumber(int numberOfDigit) {
        if (numberOfDigit <= 0) {
            throw new IllegalArgumentException("A random number's length cannot be zero or negative");
        }
        Random random = new Random();
        String bound = "1";
        StringBuilder nombre0 = new StringBuilder();
        for (int i = 0; i < numberOfDigit; i++) {
            nombre0.append("0");
        }
        bound = bound + nombre0;
        int boundInteger = Integer.parseInt(bound);
        return String.format("%0" + numberOfDigit + "d", random.nextInt(boundInteger));
    }
}
