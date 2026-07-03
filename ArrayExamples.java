public class ArrayExamples {
    public static void main(String[] args) {
        System.out.println("=== 1D ARRAY - One Sensor ===");
        double[] rainfall = new double[30];
        for (int i = 0; i < 5; i++) {
            rainfall[i] = i * 5.0;
            System.out.println("Day " + (i+1) + ": " + rainfall[i] + " mm");
        }
        System.out.println("... (up to 30 days)");
        
        System.out.println("\n=== 2D ARRAY - Multiple Sensors ===");
        double[][] sensors = new double[3][30];
        for (int s = 0; s < 3; s++) {
            System.out.println("Sensor " + (s+1) + ":");
            for (int d = 0; d < 3; d++) {
                sensors[s][d] = (s+1) * (d+1) * 2.0;
                System.out.println("  Day " + (d+1) + ": " + sensors[s][d] + " mm");
            }
            System.out.println("  ... (up to 30 days)");
        }
    }
}