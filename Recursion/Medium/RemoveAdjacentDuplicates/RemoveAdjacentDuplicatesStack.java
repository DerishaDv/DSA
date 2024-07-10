package Recursion.medium;

import java.util.Arrays;
import java.util.Stack;

public class RemoveAdjacentDuplicatesStack {

    public static void main(String[] args) {
        String[] str = {"geeksforgeeg","azxxxzy","caaabbbaac","gghhg","aaaacddddcappp","aaaaaaaaaa","qpaaaaadaaaaadprq", "acaaabbbacdddd"};
        for(String x: str) System.out.println(removeDuplicates(x));
    }
    private static String removeDuplicates(String s) {
        Stack<Character> characters = new Stack<>();
        int prevTop = '0';
        for(char x : s.toCharArray()) {
            if(x ==prevTop) continue;
            if(!characters.isEmpty() && characters.peek()==x){
                prevTop = characters.pop();
            }
            else if(characters.isEmpty() || characters.peek()!=x) characters.push(x);
        }

        StringBuilder stringBuilder = new StringBuilder();
        characters.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
