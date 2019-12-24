package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>();
        array.add(2);
        array.add(3);
        array.add(22);
        array.add(4);
        array.add(261);
        array.add(34);
        array.add(21);
        array.add(12);
        array.add(23);
        array.add(25);
        System.out.println(sumArray(array));

        ArrayList<String> myString= new ArrayList<>();
        myString.add("Summer");
        myString.add("Fall");
        myString.add("Winter");
        myString.add("Spring");
        myString.add("Olive");
        myString.add("Alive");
        myString.add("Where");
        myString.add("Ignore");
        String s = "I would not, could not, in a box. I would not, could not " +
                "with a fox. I will not eat them in a house. I will not eat n" +
                "them with a mouse.";
String [] newString = s.split(" ");
ArrayList<String> listString = new ArrayList<>();
for(int i =0; i <newString.length; i++){
    listString.add(newString[i]);
}
       printString(listString);

    }
    public static  int sumArray(ArrayList<Integer> arr){
        int sum = 0;
        for(int n:arr){
            if(n%2==0){
                sum+=n;
            }
        }
        return sum;
    }
    public static void printString(ArrayList<String> s){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word length");
        int n = in.nextInt();
        for(String a: s){
            if(a.length()==n){
                System.out.println(a);
            }
        }

    }
}
