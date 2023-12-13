package namevalues;

public class Name {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static int calculateValue(String name) {
        int total = 0;
        char[] characters = name.toCharArray();
        for(char letter: characters) {
            total += ALPHABET.indexOf(letter) + 1;
        }
        return total;
    }
}
