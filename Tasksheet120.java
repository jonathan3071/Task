public class Tasksheet120 {

    // Method that takes variable number of integer arguments
    public static int Sum(int... numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            int cumulativeSum = 0;
            
            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }
            totalSum += cumulativeSum;
            
            System.out.println("Cumulative sum for " + number + " = " + cumulativeSum);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        // Example usage
        int total = Sum(4, 5, 10);
        System.out.println("Total sum = " + total);
    }
}
