package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        getMPG();
    }

    private static void getMPG() {
        Scanner in = new Scanner(System.in);
        System.out.println("How may miles have you driven?");
        double miles = in.nextDouble();
        System.out.println("How much gas, in gallons, have you consumed?");
        double gas = in.nextDouble();
        double mpg = miles/gas;
        System.out.println("After travelling " + miles + " miles and consuming " + gas + " gallons, your miles-per-gallon consumption is " + (miles/gas));
    }
}
