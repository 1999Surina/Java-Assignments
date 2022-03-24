package JavaAssignments;
import java.util.*;
import java.util.Scanner;

public class AllAlphabets {
    public void checkContains(String input) {
        boolean doesContain = true;
        input = input.toLowerCase();
        for (char alphabet = 'a'; alphabet <= 'z'; ++alphabet) {
            if (input.contains(String.valueOf(alphabet))) {
                doesContain = false;
                break;

            }
        }
        if (doesContain) {
            System.out.println("Contains all letters of the alphabet");
        }
        else {
            System.out.println("Doesn't contain all letters of the alphabet");
        }
    }
    public static void main(String[] args){
        String input;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter an input string");
        input =scn.nextLine();
        AllAlphabets allAlphabets=new AllAlphabets();
        allAlphabets.checkContains(input);
    }
}
//the time complexity is O(n)
//the space complexity is