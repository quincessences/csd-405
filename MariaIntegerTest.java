// CSD405 - Intermediate Programming with Java
// Name: Maria Q. Michaels
// Date: 06/12/2022
// Assignment: Module 3 Assignment
// Purpose: Create an integer class.

public class MariaIntegerTest {
    public static void main(String[] args) {
        MariaInteger mariaInteger1 = new MariaInteger(5);
        MariaInteger mariaInteger2 = new MariaInteger(20);
        MariaInteger mariaInteger3 = new MariaInteger(5);

        System.out.printf("Is %d prime? %s%n", mariaInteger1.getValue(), mariaInteger1.isPrime());
        System.out.printf("Is %d prime? %s%n", mariaInteger2.getValue(), mariaInteger2.isPrime());
        System.out.printf("Is %d prime? %s%n", mariaInteger3.getValue(), mariaInteger3.isPrime());

        System.out.printf("Is %d even? %s%n", mariaInteger1.getValue(), mariaInteger1.isEven());
        System.out.printf("Is %d even? %s%n", mariaInteger2.getValue(), mariaInteger2.isEven());
        System.out.printf("Is %d even? %s%n", mariaInteger3.getValue(), mariaInteger3.isEven());

        System.out.printf("Is 13 odd? %s%n", MariaInteger.isOdd(13));
        
        System.out.printf("%d equals %d? %s%n", mariaInteger1.getValue(), mariaInteger3.getValue(), mariaInteger1.equals(mariaInteger3));

        System.out.printf("%d%n", MariaInteger.parseInt(new char[] {'1', '5', '6'}));
        System.out.printf("%d%n", MariaInteger.parseInt("454"));
    }
}


class MariaInteger {
    private int mariaValue;

    public MariaInteger(int value) {
        mariaValue = value;
    }

    public int getValue() {
        return mariaValue;
    }

    public boolean isEven() {
        return (mariaValue % 2) == 0;
    }

    public boolean isOdd() {
        return (mariaValue % 2) == 1;
    }

    public boolean isPrime() {
        if (mariaValue == 1 || mariaValue == 2) {
            return true;
        }
        else {
            for (int i = 2; i < mariaValue; i++) {
                if (i % mariaValue == 0) return false;
            }
        }
        return true;
    }

    public static boolean isEven(int mariaInt) {
        return (mariaInt % 2) == 0;
    }

    public static boolean isOdd(int mariaInt) {
        return (mariaInt % 2) == 1;
    }

    public static boolean isPrime(int mariaInt) {
        if (mariaInt == 1 || mariaInt == 2) {
            return true;
        }
        else {
            for (int i = 2; i < mariaInt; i++) {
                if (i % mariaInt == 0) return false;
            }
        }
        return true;
    }    

    public static boolean isEven(MariaInteger mariaInt) {
        return mariaInt.isEven();
    }

    public static boolean isOdd(MariaInteger mariaInt) {
        return mariaInt.isOdd();
    }

    public static boolean isPrime(MariaInteger mariaInt) {
        return mariaInt.isPrime();
    }

    public boolean equals(int testInt) {
        if (testInt == mariaValue) 
            return true;
        return false;
    }

    public boolean equals(MariaInteger mariaInt) {
        if (mariaInt.mariaValue == this.mariaValue) 
            return true;
        return false;
    }

    public static int parseInt(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}