import java.util.Scanner;

public class Hello_Git {
    public static int countLetters(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte ein Wort eingeben: ");
        String input = sc.nextLine();

        int length = countLetters(input);
        System.out.println("Das Wort \"" + input + "\" hat " + length + " Buchstaben.");
        System.out.print("Code wurde geändert");

        
    }
}
