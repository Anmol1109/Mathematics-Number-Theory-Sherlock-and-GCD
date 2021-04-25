import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int gcd(int n1,int n2){
        int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; ++i) {
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
        }
        return gcd;
    }
    static String solve(int[] a) {
        Arrays.sort(a);
        int x = a[0];
        for(int i = 1;i < a.length;i++)
            x = gcd(a[i],x);
        if(x == 1)
            return "YES";
        else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int aCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] a = new int[aCount];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int aItr = 0; aItr < aCount; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr]);
                a[aItr] = aItem;
            }

            String result = solve(a);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
