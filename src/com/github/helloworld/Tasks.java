package com.github.helloworld;


import java.util.Arrays;

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

    //-------------------CRATING AN ARRAY------------------------------
    static int[] testArray = new int[]{10, 20, 30, 40, 50, 50, 60, 70, 80, 90, 50, 10, 91, 4};


    //--------------------MAX ELEMENT OF THE ARRAY-------------------
    public static int maxElementArray(int[] testArray) {
        int max = testArray[0];
        for (int i = 1; i < testArray.length; i++) {
            if (testArray[i] > max) max = testArray[i];
        }
        System.out.println("Maximum value is: "+max);
        return max;
    }


    //------------------REVERSING THE ARRAY------------------------
    public static void reverseArray(int[] testArray) {
        System.out.println("Reversed array is: ");
        for (int i = testArray.length - 1; i >= 0; i--) {
            System.out.print(testArray[i] + " ");
        }
    }


    //---------------TWO MAX ELEMENTS CONVERTED INTO AN ARRAY---------
    public static void twoMaxElementArray(int[] testArray) {

        int max = testArray[0];
        for (int i = 1; i < testArray.length; i++) {
            if (testArray[i] > max) max = testArray[i];
        }
        int max2 = testArray[0];
        for (int i = 1; i < testArray.length; i++) {
            if (testArray[i] != max && testArray[i] > max2 ) max2 = testArray[i];
        }
        System.out.println("\n1 max: " + max);
        System.out.println("2 max: " + max2);
        int[] createdArray = {max, max2};
        //Arrays.fill(createdArray, max, max2);
        System.out.println(Arrays.toString(createdArray));
    }

    //---------------MODULE OF TWO ELEMENTS RETURNED AS INT---------------------------
    public static int countModuleOfTwoAsInt(int[] testArray) {
        int count = 0;
        for(int j=0; j< testArray.length; j++) {
            if(testArray[j] %2==0 && testArray[j] %3!=0) {
                count++;
            }
        }
        System.out.println("Amount of elements with module of \"2\" (excluding module of \"3\" ): "+count);
        return count;
    }

    //---------------THE MOST COMMON NUMBER---------------------------
    public static int mostCommonNumber(int[] testArray)
    {
        int count = 1, currCount;
        int repeatNumber = testArray[0];
        int currNumber =0;
        for (int i = 0; i < (testArray.length -1); i++)
        {
            currNumber = testArray[i];
            currCount = 0;

            for (int j = 1; j < testArray.length; j++)
            {
                if (currNumber == testArray[j])
                currCount++;
            }
            if (currCount > count)
            {
                repeatNumber = currNumber;
                count = currCount;
            }
        }
        System.out.println("The most common number is " +repeatNumber);
        System.out.println("The most common number repeated " +count + " times");
        return repeatNumber;
    }



        //--------------------MY METHODS OUTPUT---------------------------
        public static void main (String[]args){
//       System.out.println("Test season method");
//        season("summer");
//        season("spring");
//        season("winter");
//        priceCheck(1024);
//        fingers(2);
//        weekdays("понедельник");
            maxElementArray(testArray);
            reverseArray(testArray);
            twoMaxElementArray(testArray);
            countModuleOfTwoAsInt(testArray);
            mostCommonNumber(testArray);
        }
    }











