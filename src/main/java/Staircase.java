import java.util.Scanner;

/**
 * Problem Statement
 * <p>
 * Your teacher has given you the task to draw the structure of a staircase. Being an expert programmer, you decided to make a program for the same. You are given the height of the staircase. You need to print a staircase as shown in the example.
 * <p>
 * Input Format
 * <p>
 * You are given an integer N depicting the height of the staircase.
 * <p>
 * Constraints
 * 1?N?100
 * Output Format
 * <p>
 * Draw a staircase of height N in the format given below.
 */
public class Staircase {
    public static void main(String[] args) {
        final int N = new Scanner(System.in).nextInt();
        for (int i = 1; i <= N; i++) {
            final String format = "%1$" + N + "s\n";
            final String currentStair = new String(new char[i]).replace("\0", "#");
            System.out.printf(format, currentStair);
        }
    }
}
