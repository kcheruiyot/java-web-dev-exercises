package org.launchcode.java.studios.charactercount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String s = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the" +
                " quadratics into a form that can be factored allowing that side" +
                " of the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there";
        int stringLength = s.length();
        char c;
        ArrayList<Character> charArray= new ArrayList<>();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(int i = 0; i <stringLength; i++){
            c = s.charAt(i);
            int count = 0;
            if(!charCount.containsKey(c)){
                for(int j = i; j < stringLength; j++){
                    if(c==s.charAt(j)){
                        count++;
                    }
                }
                charCount.put(c,count);
            }

        }
        for(Map.Entry<Character,Integer> n: charCount.entrySet()){
            System.out.println(n.getKey()+":"+n.getValue());
        }
    }
}

