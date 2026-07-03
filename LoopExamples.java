public class LoopExamples {
    public static void main(String[] args) {
        System.out.println("=== FOR LOOP (30 days) ===");
        // For loop - when iterations are known
        for (int day = 0; day < 30; day++) {
            System.out.println("Day " + (day+1) + ": 20.0 mm");
        }
        
        System.out.println("\n=== WHILE LOOP (30 days) ===");
        // While loop - condition-based
        int day = 0;
        while (day < 30) {
            System.out.println("Day " + (day+1) + ": 20.0 mm");
            day++;
        }
    }
}