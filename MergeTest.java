/*
  Edgard Jara
  MergeTest.java
  This project merges two lists in order
*/
import java.util.Scanner;

public class MergeTest {
 
  //Create main method
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
  }
  //Create method that prompts user to create a list which to sort
  public static int getArray (String prompt, Scanner input) {
   
  
    int arraySize;
    // ask user for arraySize
    System.out.print(prompt);
    arraySize = input.nextInt();
    
    return arraySize;
    
  }
}