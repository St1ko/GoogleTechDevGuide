import java.util.Scanner;

public class Hangman {
    private static String[] words = {"technology", "football", "music", "dog", "blockchain"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String dashWord = new String(new char[word.length()]).replace("\0", "-");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (count < 8 && dashWord.contains("-")) {
            System.out.println(dashWord);
            System.out.println("You have " + (8-count) + " guesses left.");
            System.out.println("What is your next guess?");
            String guess = scanner.next().toLowerCase();
            System.out.println();
            hangman(guess);
        }
        scanner.close();
    }

    public static void hangman(String guess) {
        String newDash = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newDash += guess.charAt(0);
            } else if (dashWord.charAt(i) != '-') {
                newDash += word.charAt(i);
            } else {
                newDash += "-";
            }
        }

        if (dashWord.equals(newDash)) {
            System.out.println("Wrong guess!");
            count++;
            if (count == 8) {
                System.out.println("You are out of guesses!");
            }
            System.out.println();
        } else {
            dashWord = newDash;
        }

        if (dashWord.equals(word)) {
            System.out.println(word);
            System.out.println("You guessed the word!");
        }
    }
}
