import java.util.*;
import java.util.Scanner;

public class SeparateConsonantsAndVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = sc.nextLine();
    
    String vowels = "aeiouAEIOU";
    String consonants = "";
    String vowelsInWord = "";
    
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (vowels.indexOf(ch) != -1) {
        vowelsInWord += ch + " ";
      } else {
        consonants += ch + " ";
      }
    }
    
    System.out.println("Consonants: " + consonants);
    System.out.println("Vowels: " + vowelsInWord);
  }
}
