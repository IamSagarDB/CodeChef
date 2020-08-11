package in.dropcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sagar D B on Aug, 2020, 15:40
 * GitHub: github.com/iamsagardb
 *
 * Problem level: Easy
 *
 * Question:
 * Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.
 *
 * Example
 * Input:
 * 1
 * 2
 * 88
 * 42
 * 99
 *
 * Output:
 * 1
 * 2
 * 88
 */
public class Life_the_Universe_and_Everything {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        List<Integer> arr = new ArrayList<>();
        while(true){
            x = s.nextInt();
            if (x != 42){
                arr.add(x);
            }else {
                break;
            }
        }

        for (int res : arr){
            System.out.println(res);
        }
    }
}
