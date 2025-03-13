package hometask_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getSeasonSwitch();
        getSeasonIf();
        calculateTemperature();
        getColour();
        writeOddNumbers();
        writeNumbers();
        calculateSum();
        calculateSequence();
        getFirstNumbers();
        getSquare();
    }

    public static void getSeasonSwitch() {
        //Программа пора года (switch-case)

        System.out.println("Please, enter month № from 1 to 12: ");


        int month = inputData().nextInt();
        switch (month) {
            case (12):
            case (1):
            case (2):
                System.out.println("You entered: " + month + ". It's winter");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("You entered: " + month + ". It's spring");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("You entered: " + month + ". It's summer");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("You entered: " + month + ". It's autumn");
                break;
            default:
                System.out.println("You entered: " + month + ". It's incorrect №");
                break;
        }
    }

    private static Scanner inputData() {
        return new Scanner(System.in);
    }

    public static void getSeasonIf() {
        //Программа поры года по номеру месяца (if-else-if)
        System.out.println("Please, enter month № from 1 to 12: ");

        int month = inputData().nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("It's winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("It's spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("It's summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("It's autumn");
        } else {
            System.out.println("It's incorrect number");
        }

    }

    public static void calculateTemperature() {
        System.out.println("Please, enter outdoor temperature: ");
        int t = inputData().nextInt();
        if (t > -5) {
            System.out.println("It's warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("It's normal");
        } else if (t <= -20) {
            System.out.println("It's cold");
        }
    }

    public static void getColour() {
        System.out.println("Please, enter rainbow № from 1 to 7: ");
        int num = inputData().nextInt();
        switch (num) {
            case (1):
                System.out.println("You entered: " + num + ". It's red");
                break;
            case (2):
                System.out.println("You entered: " + num + ". It's orange");
                break;
            case (3):
                System.out.println("You entered: " + num + ". It's yellow");
                break;
            case (4):
                System.out.println("You entered: " + num + ". It's green");
                break;
            case (5):
                System.out.println("You entered: " + num + ". It's blue");
                break;
            case (6):
                System.out.println("You entered: " + num + ". It's indigo ");
                break;
            case (7):
                System.out.println("You entered: " + num + ". It's violet ");
                break;
            default:
                System.out.println("You entered: " + num + ". It's incorrect №");
                break;
        }
    }

    public static void writeOddNumbers() {
        System.out.println("Odd numbers from 1 to 99");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void writeNumbers() {
        for (int i = 5; i >= 1; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void calculateSum() {
        System.out.println("Please, enter positive number: ");
        int x = inputData().nextInt();
        if (x > 0) {
            int y;
            y = x * (x + 1) / 2;
            System.out.println("Sum from 1 to " + x + " is " + y);
        } else {
            System.out.println("It's not positive number");
        }
    }
    public static void calculateSequence() {
        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println();
    }

    public static void getFirstNumbers() {

        int first = 0;
        int dif = -5;

        for (int i = 0; i < 10; i++) {
            System.out.print(first + " " );
            first += dif;
        }
        System.out.println();
    }

    public static void getSquare() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("The square of the " + i + " is " + (i * i));
        }
    }
}
