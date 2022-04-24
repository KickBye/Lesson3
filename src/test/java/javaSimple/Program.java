package javaSimple;

public class Program {

    public static void main(String[] args) {
        int num = 2;
        System.out.println("Hello world!!!");
        System.out.println(HelpedMethod.parametr);
        System.out.println("Сумма=" + HelpedMethod.sum(3, num));
        String qwe = "qwe";
        boolean result = qwe == HelpedMethod.parametr;
        System.out.println(result);
        boolean result2 = qwe.equalsIgnoreCase(HelpedMethod.parametr);
        System.out.println(result2);
        num = 5;

        if (num == 3) {
            System.out.println("4eten'ko");
        } else if (num == 4) {
            System.out.println("Почти получилось");
        } else {
            System.out.println("Вообще не получилось");
        }

        HelpedMethod hp = new HelpedMethod();
        System.out.println("Radio = " + hp.switchRadio("afro"));

        int index = 100;
        for (int x = 0; x <= index; x++) {
            x = x + 25;
            System.out.println(x);
        }
        int value;
        while (index < 110) {
            value = 10 + index;
            index = value + index;
            System.out.println(value);
        }
        do {
            System.out.println("No no no");
            index = 100;

        } while (index > 110);
        System.out.println("мы закончили");


        //* Домашнее задание 1.1 Написать примеры сравнения всех примитивных типов в java
        //* 1.2 написать все циклы и ветвление на основе примитивных типов
        boolean testBool0=false;
        boolean testBool1 = false;
        boolean testBool2 = false;
        int testInt0=0;
        int testInt1 = 150;
        int testInt2=-10;
        String testString0=" - Идеально, цель 1 достигнута";
        String testString1=" - Идеально, цель 2 достигнута";
        String testString2=" - Идеально, цель 3 достигнута";
        for (testInt0=0; testBool0==false;testInt0++){
            if (testInt0<=50) {
                System.out.println(testInt0+ " - Этого слишком мало");
            } else if (testInt0>50 && testInt0<100) {
                System.out.println(testInt0+ " - Становится жарко");
            }else {
                System.out.println(testInt0+testString0);
                testBool0=true;
            }
        } while (testBool1==false) {

            switch (testInt1) {
                case 50:
                    System.out.println(testInt1+testString1);
                    testBool1=true;
                    break;
                case 100:
                    System.out.println(testInt1+" - Вторая цель приближается");
                    testInt1=testInt1-10;
                    break;
                case 150:
                    System.out.println(testInt1+" - Вторая цель старт");
                    testInt1=testInt1-10;
                    break;
                default:
                    System.out.println("LOADING");
                    testInt1=testInt1-10;
            }


        }


    }


}
