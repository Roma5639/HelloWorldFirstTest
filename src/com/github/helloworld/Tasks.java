package com.github.helloworld;


public class Tasks {
    // public static void main(String[] args) {
    // System.out.println("Hello World!");


    public static void season(String seasonName) {

         if (seasonName.equalsIgnoreCase("winter")) {
             System.out.println("it's cold");
         }
     }

//     public static void main(String[] args) throws Exception {
//
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Please, enter your price:");
//         String sPrice = reader.readLine();
//         int price = Integer.parseInt(sPrice);
//         String userPrice = price < 1000 ? "цена нормальная" : "цена завышена";
//         System.out.println(userPrice);
//     }
//
//     public static void main(String[] args) throws Exception {
//
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Please, enter a finger number:");
//         String sFinger = reader.readLine();
//         int nFinger = Integer.parseInt(sFinger);
//         String fingerName;
//         switch (nFinger) {
//             case 1:
//                 System.out.println("Большой");
//                 break;
//             case 2:
//                 System.out.println("Указательный");
//                 break;
//             case 3:
//                 System.out.println("Средний");
//                 break;
//             case 4:
//                 System.out.println("Безымянный");
//                 break;
//             case 5:
//                 System.out.println("Мизинец");
//                 break;
//             default:
//                 System.out.println("nameless");
//         }
//     } */
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Please, enter a weekday:");
//        String sDay = reader.readLine();
//        if (sDay.equals("понедельник") || (sDay.equals("вторник")) || (sDay.equals("среда"))
//                || (sDay.equals("четверг")) || (sDay.equals("пятница"))) {
//            System.out.println("будний день");
//        }
//            else if (sDay.equals("суббота") || (sDay.equals("воскресенье"))) {
//                System.out.println("выходной день");
//        }
//                else
//                System.out.println("введенное значение некорректно");
//
//    }

    public static void main(String[] args) {
        System.out.println("Test season method");
        season("summer");
        season("spring");
        season("winter");


    }
}