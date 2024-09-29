package allymcsakura;

import java.util.Scanner;

public class Main {

    // Messages are outputted as a typewriter effect.
    private static void typeWriterEffect(String message) {
        for (char ch : message.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    // Main method for Script's user interaction.
    public static void main(String[] args) {
        typeWriterEffect("Hello and welcome! I hope you have a great day today!");
        typeWriterEffect("Can you tell me your name?: ");

        // Script scans the user's input.
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String name;

        // Makes sure Script demands the user's name
        while (true) {
            userInput = scanner.nextLine().trim();
            if (!userInput.isEmpty()) {
                name = userInput.split("\\s+")[0];
                break;
            }
            typeWriterEffect("Please enter your name: ");
        }

        typeWriterEffect("Nice to meet you, " + name + "!");
        typeWriterEffect("Now, is it okay if I could give you a virtual hug, " + name + "? (Y/N)");

        String hugResponse = scanner.nextLine().trim().toUpperCase();

        // Scripts decides if the user answers yes or no, or neither.
        if (hugResponse.startsWith("Y")) {
            typeWriterEffect("Sending you a virtual hug, " + name + "!");
        } else if (hugResponse.startsWith("N")) {
            typeWriterEffect("That's okay, " + name + "! Maybe another time.");
        } else {
            typeWriterEffect("Your answer is unclear. Maybe another time!");
        }
    }
}