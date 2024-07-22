// package Algorithms.Strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'buildPalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING a
     * 2. STRING b
     */
    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String buildPalindrome(String a, String b) {
        // Write your code here
        int firstLoop_Lifespan = (a.length() * (a.length() + 1)) / 2;
        int secondLoop_Lifespan = (b.length() * (b.length() + 1)) / 2;
        System.out.println(firstLoop_Lifespan);
        System.out.println(secondLoop_Lifespan);
        for (int i = firstLoop_Lifespan - 1; i >= 0; i--) {
            for (int j = 0; j < secondLoop_Lifespan; j++) {

                // String first = a.substring(0, i);
                // String second = b.substring(i, j);
                // String third = first+second;
                // System.out.println(isPalindrome(third));
                // System.out.println(" "+i+" "+j);
            }
            for (int len = a.length(); len > 0; len--) {
                for (int start = 0; start <= a.length() - len; start++) {
                    String palindromCandidate_firstHalf = "";
                    for (int k = start; k < start + len; k++) {
                        palindromCandidate_firstHalf += a.charAt(k);
                    }
                    System.err.print(palindromCandidate_firstHalf + " ");// do something with the candidate
                }
            }
        }
        return "";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String a = bufferedReader.readLine();

                String b = bufferedReader.readLine();

                String result = Result.buildPalindrome(a, b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
