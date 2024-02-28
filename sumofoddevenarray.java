public class sumofoddevenarray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of the array: " + sum);

        if (sum % 2 == 0) {
            System.out.println("Even sum");
        } else {
            System.out.println("Odd sum");
        }
    }
}

