package ControlFlow;

public class FibonacciSeries {
    public static void main(String[] args) {
        int x = 0, y = 1, sum = 0;
        while (sum <= 100) {
            System.out.print(y + " ");
            sum = x + y;
            x = y;
            y = sum;
        }
    }
}
