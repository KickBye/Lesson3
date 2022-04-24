package javaSimple;

public class HelpedMethod {
    final static String parametr = "qwe";

    public int ind = 2;


    public static String name(String word, int value) {
        String nameForReturn = word;
        return nameForReturn;
    }

    private String prefix(String pref) {
        return pref;

    }

    protected String sufix(String suf) {
        return suf;
    }

    String lost() {
        return "lost";
    }

    static int sum(int a, int b){
        return a+b;
    }
    public String switchRadio(String radioName) {
        String radio;
        switch (radioName) {
            case "Afro":
                radio = "102.3";
                break;
            case "Auto":
                radio = "104.5";
                break;
            default:
                radio = "Мы не знаем этого радио";
        }
        return radio;
    }
        public String switchRadioNewWave(String radioName){
            String radio;
            radio = switch (radioName){
                case "Afro" -> "102.3";
                case "Auto" -> "104.5";
                default -> "Мы не знаем этого радио";
            };
        return radio;
    }
}
