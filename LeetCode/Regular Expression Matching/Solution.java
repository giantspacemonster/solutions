/*
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 * '.' Matches any single character.​​​​
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 */
import java.util.ArrayList;
import java.util.Stack;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;


class Solution {
    public boolean isMatch(String s, String p) {
        // System.out.println("Hello World");
        // ArrayList<Character> characterArray = new ArrayList<>(p.length());
        // for (Character characterString : p.toCharArray()) {
        // characterArray.add(characterString);
        // }
        Stack<Character> expressionStack = new Stack<Character>();
        final CharacterIterator str_iter = new StringCharacterIterator(p);
        for (char i = str_iter.last(); i != CharacterIterator.DONE; i = str_iter.previous()) {
            expressionStack.add(i);
        }
        System.out.println(expressionStack.toString() + " Expression Stack");
        return false;
        // aa*bba*b* should match aaaaabbaabbbbb if I understand correctly
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isMatch("aaaabbaabbbbb", "a*bba*b*");
    }
}
