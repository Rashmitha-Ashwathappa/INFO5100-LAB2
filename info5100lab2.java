import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int first = 0; first < n; first++) {
            int Sum = 0;
            for (int last = first; last < n; last++) {
                Sum += arr[last];
                if (Sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}