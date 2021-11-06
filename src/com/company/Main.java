package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {

        System.out.println("Please, input the day of the week:");

        String[][] arr = new String[7][2];

        arr[0][0] = "Sunday";
        arr[0][1] = "Go to courses; watch a film";

        arr[1][0] = "Monday";
        arr[1][1] = "Find amazing game";

        arr[2][0] = "Tuesday";
        arr[2][1] = "Do homework";

        arr[3][0] = "Wednesday";
        arr[3][1] = "Earn money";

        arr[4][0] = "Thursday";
        arr[4][1] = "Repair computer";

        arr[5][0] = "Friday";
        arr[5][1] = "Go a walk";

        arr[6][0] = "Saturday";
        arr[6][1] = "Find interesting book";

        command  = scanner.nextLine();

            switch (command.trim().toLowerCase(Locale.ROOT)) {
            case "sunday" :
                Sunday(arr);
                break;
            case "monday" :
                Monday(arr);
                break;
            case "tuesday" :
                Tuesday(arr);
                break;

            case "wednesday" :
                Wednesday(arr);
                break;

            case "thursday" :
                Thursday(arr);
                break;

            case "friday" :
                Friday(arr);
                break;
            case "saturday" :
                Saturday(arr);
                break;
            default:
                System.out.println("Sorry, I don't understand you, please try again.");
                break;
        }
    }while(!command.equals("exit"));
}
    private static void Sunday(String[][] arr) {
        System.out.println(arr[0][1]);
    }

    private static void Monday(String[][] arr) {
        System.out.println(arr[1][1]);
    }

    private static void Tuesday(String[][] arr) {
        System.out.println(arr[2][1]);
    }

    private static void Wednesday(String[][] arr) {
        System.out.println(arr[3][1]);
    }

    private static void Thursday(String[][] arr) {
        System.out.println(arr[4][1]);
    }

    private static void Friday(String[][] arr) {
        System.out.println(arr[5][1] );
    }

    private static void Saturday(String[][] arr) {
        System.out.println(arr[6][1]);
    }
}