public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"

        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"

        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // * You will add a line of code here.
            System.out.println();
        }

        System.out.println("\n");

    }
}

// 1. N changes faster. It is controlled by the inner loop.
// 2. C now changes faster, due to being the inner loop.
// 3. Adding ln to print, causes the string to be printed on multiple lines
// instead of 1.
// 4. The output prints as a grid when System.out.println(); is added inside the
// outer loop, but outside the inner.