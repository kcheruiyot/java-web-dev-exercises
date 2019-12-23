package exercises;

import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) {
        getName();

    }
    private static void getName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }

}
