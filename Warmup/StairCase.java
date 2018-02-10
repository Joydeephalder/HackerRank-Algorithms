//  https://www.hackerrank.com/challenges/staircase/problem

import java.util.*;

public class StairCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int j=0;j<n;j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i < n - j ? " " : "#");  // if i<n-j then prints " "(space) otherwise prints "#".
            }
            System.out.println("");
        }
    }
}
