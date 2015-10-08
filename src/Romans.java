public class Romans {
    public String romanise(int number) {
        String numerals = "";
        if(number == 4){
            numerals += "IV";
            number -= 4;
        }
        while(number>=1){
            numerals += "I";
            number--;
        }

        return numerals;
    }
}
