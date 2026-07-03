public class CodeAnalysis {
    public static void main(String[] args) {
        System.out.println("=== Code Analysis ===");
        
        // The code from the question
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nOutput: 1 2 3 4");
        System.out.println("Explanation: Array has 4 elements, loop prints each with a space");
    }
}