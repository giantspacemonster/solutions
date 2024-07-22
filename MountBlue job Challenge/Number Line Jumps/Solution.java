import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. INTEGER x1
     * 2. INTEGER v1
     * 3. INTEGER x2
     * 4. INTEGER v2
     */
    public static int getCommonMultiple(int x1, int x2, int v1, int v2, int iteration) {
        int commonMultiple = 1;
        x1 = x1 == 0 ? v1 : x1;
        x2 = x2 == 0 ? v2 : x2;
        // System.out.println("Getting Common multiple between " + x1 + "\t" + x2 + "
        // iteration number:" + iteration);
        while (iteration != 0) {

            if (commonMultiple % x1 == 0 && commonMultiple % x2 == 0) {
                iteration--;
            }
            commonMultiple++;
        }
        // System.out.println(commonMultiple - 1);
        return (commonMultiple - 1);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int step1 = 0;
        int step2 = 0;
        // int com_mult = getCommonMultiple(x1, x2, 1);
        List<Integer> com_mult_array = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            com_mult_array.add(getCommonMultiple(x1, x2, v1, v2, i));
        }
        Iterator<Integer> cm_array_iter = com_mult_array.iterator();
        while (cm_array_iter.hasNext()) {
            int com_mult = cm_array_iter.next();
            for (int j = x1; j <= com_mult; j = j + v1) {
                step1++;
            }
            for (int k = x2; k <= com_mult; k = k + v2) {
                step2++;
            }
            // System.out.println(com_mult + ":\t" + step1 + "\t" + step2 + "\t" + x1 + "\t"
            // + x2);
            if (step1 == step2) {
                break;
            }
        }
        return step1 == step2 ? "YES" : "NO";
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}