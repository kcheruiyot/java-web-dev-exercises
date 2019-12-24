package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your students (or ENTER to finish):");
        String name;
        int id;

        do {
            name = in.nextLine();
            if(!name.equals("")){
                System.out.println("Enter " + name +"'s id");
                id = in.nextInt();
                students.put(id,name);
            }
            in.nextLine();

        }while (!name.equals(""));
        System.out.println("\nClass roster:");
        System.out.println("Student name\tStudent ID");
        for(Map.Entry<Integer, String> s: students.entrySet()){
            System.out.println(s.getValue()+"\t\t"+s.getKey());
        }

    }
}
