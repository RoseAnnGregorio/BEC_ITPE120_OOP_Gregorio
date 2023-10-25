public class MathUtils {
    
    public static double calculateAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] values = { 5.5, 10.0, 15.5, 20.0, 25.5 };

      
        System.out.println("Average: " + MathUtils.calculateAverage(values)); 
    }
}
