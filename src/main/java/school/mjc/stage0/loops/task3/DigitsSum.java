package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int length = String.valueOf(t).length();
        int i = 1;
        int sum = 0;

        while (i <= length) {
            sum += t % 10;
            t /= 10;
            i++;
        }

        System.out.println(Math.abs(sum));
    }
}
