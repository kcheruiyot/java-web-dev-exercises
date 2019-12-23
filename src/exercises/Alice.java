package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceQuote = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once " +
                "or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is " +
                "the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the search word");
        String searchWord = in.nextLine();
        searchWord = searchWord.toLowerCase();
        System.out.println(aliceQuote.toLowerCase().contains(searchWord));
        int startIndex = aliceQuote.toLowerCase().indexOf(searchWord.toLowerCase());
        int stopIndex = startIndex + searchWord.length() -1;
        String newQuote = aliceQuote.substring(0,startIndex) + aliceQuote.substring(stopIndex +1,aliceQuote.length());
        aliceQuote = newQuote;
    System.out.println(aliceQuote);

    }
}
