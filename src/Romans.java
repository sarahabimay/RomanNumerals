public class Romans {
    public String romanise(int number) {
        String numerals = "";
        while(number>=1){
            numerals += "I";
            number--;
        }

        return numerals;
    }
}
