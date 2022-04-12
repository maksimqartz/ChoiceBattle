package comparison.game;

import java.util.HashMap;
import java.util.Scanner;

import static comparison.game.ValidateParseInt.validationInputInt;

public class SetUp {

    /**
     * @return HashMap with contenders names in String format and their ID's as a key.
     */
    public static HashMap<Integer, String> getContendersMap() {

        System.out.println("How many participants will compete for victory in The Ultimate Battle?");
        int numberOfContenders = validationInputInt();

        System.out.println(numberOfContenders + " heroes will compete in this fight");
        HashMap<Integer, String> contendersForComparison = new HashMap<>();

        /**
         *
         */
        int idOfContender = 1;
        for (int i = 0; i < numberOfContenders; i++) {
            System.out.println("Name for contender number " + idOfContender + " is ");
            String contender = new Scanner(System.in).next();
            contendersForComparison.put(idOfContender, contender);
            idOfContender++;
        }

        System.out.println(contendersForComparison);
        return contendersForComparison;
    }
}
