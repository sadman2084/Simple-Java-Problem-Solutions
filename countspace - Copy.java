import java.util.Scanner;

public class countspace {
    public static void main(String[] args) {
        int i;
        int space = 0, word = 1, other = 0, letter = 0;
        int vowel = 0, consonent = 0;
        String arr;
        Scanner in = new Scanner(System.in);
        arr = in.nextLine();
        for (i = 0; i < arr.length(); i++) {
            char newchar = arr.charAt(i);
            if (Character.isLetter(newchar)) {
                letter++;
                if (newchar == 'a' || newchar == 'e' || newchar == 'i' || newchar == 'o' || newchar == 'u'
                        || newchar == 'A'
                        || newchar == 'E' || newchar == 'I' || newchar == 'O' || newchar == 'U') {
                    vowel++;
                } else {
                    consonent++;
                }
                if (newchar == ' ') {
                    word++;
                    space++;
                } else {
                    other++;
                }
            }
        }
        System.out.println("word: " + word);
        System.out.println("space: " + space);
        System.out.println("other: " + other);
        System.out.println("vowel: " + vowel);
        System.out.println("consonent:"+consonent);
        System.out.println("letter: " + letter);
    }
}