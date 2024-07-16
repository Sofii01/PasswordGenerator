import java.lang.StringBuilder;
import java.util.Random;

public class PasswordGenerator {

    public static String generator(Boolean lower, Boolean upper, Boolean num, Boolean special){

        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChar = ".#$%&/";
        String allowed = "";

        if (lower) allowed += lowerCase;
        if (upper) allowed += upperCase;
        if (num) allowed += numbers;
        if (special) allowed += specialChar;

        // Check if no options are selected
        if (allowed.length() == 0) {
            return "Please select at least one option.";
        }

        StringBuilder password = new StringBuilder();
        int lenght = 8;
        Random ran = new Random();
        for (int i = 0; i < lenght ; i++) {
            int index = ran.nextInt(allowed.length());
            password.append(allowed.charAt(index));
        }
        return password.toString();
    }

}
