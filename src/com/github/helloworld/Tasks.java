package com.github.helloworld;


public class Tasks {

    public static void season(String seasonName) {

        if (seasonName.equalsIgnoreCase("winter")) {
            System.out.println("it's cold");
        }
    }

    public static void priceCheck(int price) {
        String checkResult = price < 1000 ? "цена нормальная" : "цена завышена";
        System.out.println(checkResult);
    }


    public static void fingers(int nFinger) {
        switch (nFinger) {
            case 1:
                System.out.println("Большой");
                break;
            case 2:
                System.out.println("Указательный");
                break;
            case 3:
                System.out.println("Средний");
                break;
            case 4:
                System.out.println("Безымянный");
                break;
            case 5:
                System.out.println("Мизинец");
                break;
            default:
                System.out.println("nameless");
                break;
        }
    }

    public static void weekdays(String day) {
        if (day.equalsIgnoreCase("понедельник") || (day.equalsIgnoreCase("вторник")) ||
                (day.equalsIgnoreCase("среда")) || (day.equals("четверг")) || (day.equals("пятница"))) {
            System.out.println("будний день");
        } else if (day.equalsIgnoreCase("суббота") || (day.equalsIgnoreCase("воскресенье"))) {
            System.out.println("выходной день");
        } else
            System.out.println("введенное значение некорректно");

    }

    public static void main(String[] args) {
        System.out.println("Test season method");
        season("summer");
        season("spring");
        season("winter");
        priceCheck(1024);
        fingers(2);
        weekdays("понедельник");
    }
}