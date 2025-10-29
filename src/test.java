public class test {
    public static void main(String[] args) {
        int i = 50;
        int j = 12;
        int k = 7;
        int min;
        int max;

        if (i < j && i < k) {
            min = i;
        } else if (j < i && j < k) {
            min = j;
        } else {
            min = k;
        }

        if (i > j && i > k) {
            max = i;
        } else if (j > i && j > k) {
            max = j;
        } else {
            max = k;
        }

        for (int i1 = min; i1 <= max; i1++) {
            System.out.println(i1);
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + (min + max));
        System.out.println("Difference: " + (min - max));
        System.out.println("Product: " + min * max);
        System.out.println("Division: " + max / min);

    }
}
