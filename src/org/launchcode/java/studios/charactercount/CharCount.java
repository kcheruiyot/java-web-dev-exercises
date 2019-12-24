package org.launchcode.java.studios.charactercount;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) throws FileNotFoundException {
       /* String s = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the" +
                " quadratics into a form that can be factored allowing that side" +
                " of the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there";
        */
       String s = "";
        java.io.File inputData = new java.io.File("../java-web-dev-exercises/src/org/launchcode/java/studios/charactercount/string.txt");
        Scanner input = new Scanner(inputData);
        while (input.hasNext()) {
            s += input.nextLine();
        }
        System.out.println(s);
        int stringLength = s.length();
        char c;
        ArrayList<Character> charArray= new ArrayList<>();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(int i = 0; i <stringLength; i++){
            c = s.charAt(i);
            c = Character.toLowerCase(c);
            int count = 0;
            if(Character.isLetter(c)){
                if(!charCount.containsKey(c)){
                    for(int j = i; j < stringLength; j++){
                        if(c==Character.toLowerCase(s.charAt(j))){
                            count++;
                        }
                    }
                    charCount.put(c,count);
                }
            }


        }
        for(Map.Entry<Character,Integer> n: charCount.entrySet()){
            System.out.println(n.getKey()+":"+n.getValue());
        }
    }
}

