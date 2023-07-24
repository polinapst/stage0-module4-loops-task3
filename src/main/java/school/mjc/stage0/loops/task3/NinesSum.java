package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int m = 0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            m += Math.pow(10, i);
            sum += 9 * m;
        }

        System.out.println(sum);
    }
}
