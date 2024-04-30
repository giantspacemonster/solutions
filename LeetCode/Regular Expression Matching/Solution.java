import java.util.ArrayList;

class Solution {
    public boolean isMatch(String s, String p) {
        System.out.println("Hello World");
        ArrayList<Character> characterArray = new ArrayList<>(p.length());
        for (Character characterString : p.toCharArray()) {
            characterArray.add(characterString);
        }
        System.err.println(characterArray.reversed());
        return false;
        // aa*bba*b* should match aaaaabbaabbbbb if I understand correctly
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isMatch("aaaabbaabbbbb", "a*bba*b*");
    }
}
