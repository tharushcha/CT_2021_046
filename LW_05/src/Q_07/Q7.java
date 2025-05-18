package Q_07;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        String[] words = sentence.split(" ");

        String modifiedSentence = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToReplace)) {
                modifiedSentence += replacementWord;
            } else {
                modifiedSentence += words[i];
            }

            if (i < words.length - 1) {
                modifiedSentence += " ";
            }
        }

        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }
}
