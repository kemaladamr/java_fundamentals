package ControlFlow;

import java.util.Scanner;

public class PeachBoxCounter {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("Enter the number of peaches picked: ");
        int numberOfPeaches = sc.nextInt();
//        for (int numShipped=0; numShipped<numberOfPeaches; numShipped+=20) {
//            System.out.printf("shipped %d peaches so far\n", numShipped);
//        }
        int numberOfBoxesShipped = 0;

        while (numberOfPeaches >= 20) {
            numberOfPeaches -= 20;
            numberOfBoxesShipped += 1;
            System.out.printf("%d boxes shipped, %d peaches remaining\n",
                    numberOfBoxesShipped, numberOfPeaches);
        }
    }
}
