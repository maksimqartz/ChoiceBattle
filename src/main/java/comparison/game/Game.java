package comparison.game;

import java.util.HashMap;
import java.util.Scanner;

import static comparison.game.SetUp.getContendersMap;

public class Game {

    static HashMap<Integer, String> contendersMap = getContendersMap();

    private static int generateRandomId() {
        /**
         *
         */
        int randomContenderId;
        String validationContender;
        do {
            randomContenderId = (int) (Math.random() * contendersMap.size());
            validationContender = contendersMap.get(randomContenderId);
        } while (validationContender == null);
        System.out.println(randomContenderId + " is number of contestant: " + contendersMap.get(randomContenderId));
        return randomContenderId;
    }


    //We begin our battle with the users choices
    public static void gameEngine() {

        System.out.println();
        /**
         *
         */
        do {
            Scanner answerDecision = new Scanner(System.in);
            boolean isWrongAnswer;
            int randomContenderId = generateRandomId();
            do {
                isWrongAnswer = false;
                System.out.println(contendersMap.get(randomContenderId) + " now standing near you. What you think about it?" +
                        "\nIt is better than anyone else?");
                switch (answerDecision.nextLine().toLowerCase()) {
                    case "yes":
                        break;
                    case "no":
                        System.out.println("Contender number " + randomContenderId + " loose this fight!\n");
                        contendersMap.remove(randomContenderId);
                        break;
                    default:
                        System.out.println("So, what is you choice Yes or No?");
                        isWrongAnswer = true;
                }
            } while (isWrongAnswer);
        } while (contendersMap.size() != 1);
        //answerDecision.close();

        System.out.println(contendersMap);
        System.out.println(contendersMap.size());
    }

}
