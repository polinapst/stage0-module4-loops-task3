package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.println(second);
        } else if (second == 0) {
            System.out.println(first);
        } else {
            int currentDivisor = first < second ? first : second;

            while (currentDivisor >= 1) {
                if (first % currentDivisor == 0 && second % currentDivisor == 0) {
                    System.out.println(currentDivisor);
                    break;
                }

                currentDivisor--;
            }
        }
    }
}
