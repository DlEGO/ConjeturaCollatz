import java.util.Scanner;

public class main {

    public static int solve(int start, int end) {

        int max = 0;
        int currentCycleLength = 0;

        for(int i=start; i <= end; i++) {
            currentCycleLength = cycleLengthFor(i);
            max = Math.max(max, currentCycleLength);
        }

        return max;
    }

    public static int cycleLengthFor(int n) {

        if(n <= 0) {
            throw new IllegalArgumentException();
        }

        int length = 1;

        while(n > 1) {
            n = calculateFor(n);
            length++;
        }

        return length;
    }

    public static int calculateFor(int n) {
        if(n % 2 == 0) {
            return n/2;
        }
        return 3*n + 1;
    }

    public static void main(String[] args) {
        //Collatz Conjecture

        try {
            Scanner sc = new Scanner(System.in);
            int start, end, max;
            while (sc.hasNext()) {
                start = sc.nextInt();
                end = sc.nextInt();
                max = solve(start, end);
                System.out.println(max);


            }
        } finally {
            System.out.println("Done");
            System.exit(0);
        }


    }
}
