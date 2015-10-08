public class Romans {
    private int values[] = {90, 50, 40, 10, 9, 5, 4, 1};
    private String symbols[] = {"XC", "L", "XL", "X", "IX", "V", "IV", "I"};

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
