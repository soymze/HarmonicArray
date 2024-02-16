public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicAvg = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            harmonicAvg +=   1.0 /(double)numbers[i];
        }

        System.out.println( (double) numbers.length/harmonicAvg);
    }
}

