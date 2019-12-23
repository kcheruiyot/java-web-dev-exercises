package exercises;

import java.util.Scanner;

public class Area {
    static Scanner in;

    public static void main(String[] args) {
        getArea();
    }
    public   static double getArea(){
        double area;
        in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double l = in.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double w = in.nextDouble();
        area = l * w;
        System.out.println("The area of a rectangle of length "+ l +" and width " + w +" is "+area );
        return area;
    }
}
