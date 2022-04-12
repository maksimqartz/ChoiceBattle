package comparison.game;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateParseInt {

    /**
     * Method that validate input from a user.
     * Method use scanner and take string value.
     * All String and Empty values will be not accepted.
     *
     * @return Integer
     */
    public static Integer validationInputInt() {
        boolean validationEmpty;
        boolean validationString;
        String stringToValidate;
        do {
            System.out.println("Please indicate the number: ");
            stringToValidate = new Scanner(System.in).nextLine();
            validationEmpty = stringToValidate.isEmpty();
            validationString = Pattern.compile("\\D").matcher(stringToValidate).find();
        } while (validationEmpty | validationString);
        return Integer.parseInt(stringToValidate);
    }
}
