public class Romans {
    public String romanise(int number) {
        String numerals = "";

        if (number >= 3) {
            numerals += "I";
        }
        if (number >= 2) {
            numerals += "I";
        }
        if (number >= 1) {
            numerals += "I";
        }
        return numerals;
    }
}
