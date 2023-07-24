package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        System.out.println(0);
        int x0 = 0;
        int x1 = 1;
        int counter = 1;

        while (counter < lastFibonacci) {
            System.out.println(x1);
            int xn = x0 + x1;
            x0 = x1;
            x1 = xn;
            counter++;
        }
    }
}
