import java.util.Random;

public class RainfallMonitor {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] daily = new double[30];
        double total = 0.0;
        int wetDays = 0;

        System.out.println("=== NARO Rainfall Monitor ===\n");

        // (i) Generate 30 random daily rainfall readings between 0 and 60 mm
        System.out.println("Daily Rainfall Readings (mm):");
        for (int i = 0; i < daily.length; i++) {
            daily[i] = rand.nextDouble() * 60; // 0.0 to 59.999...
            total += daily[i];
            if (daily[i] > 30) wetDays++;
            
            // Print readings in rows of 10
            System.out.printf("%6.2f", daily[i]);
            if ((i + 1) % 10 == 0) System.out.println();
        }

        // (ii) Compute and display total and average
        double average = total / daily.length;
        System.out.println("\n--- Statistics ---");
        System.out.printf("Total rainfall: %.2f mm\n", total);
        System.out.printf("Average rainfall: %.2f mm\n", average);

        // (iii) Count and report wet days
        System.out.println("Wet days (>30 mm): " + wetDays);

        // (iv) Classify the month
        System.out.print("Month classification: ");
        if (total <= 300) {
            System.out.println("DRY (Total ≤ 300 mm)");
        } else if (total < 600) {
            System.out.println("NORMAL (300-600 mm)");
        } else {
            System.out.println("FLOOD-RISK (Total ≥ 600 mm)");
        }
    }
}