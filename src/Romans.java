public class Romans {
    private int values[] = {5, 4, 1};
    private String symbols[] = {"V", "IV", "I"};

    public String romanise(int number) {
        String numerals = "";
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                numerals += symbols[i];
                number -= values[i];
            }
        }
        return numerals;
    }
}
