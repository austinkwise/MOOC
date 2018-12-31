import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
        	System.out.print("Type a word: ");
        	String text = reader.nextLine();
        	
        	if (text.isEmpty()) {
        		System.out.println("You typed the following words");
        		Collections.reverse(words);
        		for (String word : words) {
        			System.out.println( word );
        		}
        		break;
        	}
        	else {
        		words.add(text);        	
        		}
        }
    }
}
