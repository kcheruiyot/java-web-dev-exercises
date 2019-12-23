package org.launchcode.java.studios.areaofacircle;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args) {
        DecimalFormat fm = new DecimalFormat("#.##");
        Scanner in = new Scanner(System.in);
        int i = 0;
        boolean isNegative = true;
        do{
            System.out.println("Enter the radius");
            String  r = in.next();
            if(!isNumber(r)|| r.isEmpty()){
                break;
            }
            else if(isNumber(r)){
                if(Character.isDigit(r.charAt(0))){
                    System.out.println("The area of a circle of radius " + r +" is: " + Circle.getArea(Double.parseDouble(r)));
                    isNegative = false;
                }
                else if(r.charAt(0)!='-'){
                    break;
                }

            }
            i++;
        }while(isNegative);


    }
    private static boolean isNumber(String s){
        int numberOfPeriod = 0;
        int numberOfChars = s.length();
        boolean notANumber = true;
        for(int i = 1; i < numberOfChars; i++){
            if(Character.isDigit(s.charAt(i)) == false){
                notANumber =false;
                break;
            }
        }
        return notANumber;
    }
}
