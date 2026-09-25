package Activity_Set_01;

public class prepostFixes {
    public static void main(String[] args) {
        // --- Prefix Example ---
        int a = 5;
        System.out.println("--- Prefix (++a) ---");
        System.out.println("Original a: " + a);          // Output: 5
        System.out.println("During ++a: " + (++a));      // Output: 6 (පළමුව 1 ක් එකතු වී 6 මුද්‍රණය වේ)
        System.out.println("After ++a: " + a);           // Output: 6

        System.out.println();

        // --- Postfix Example ---
        int b = 5;
        System.out.println("--- Postfix (b++) ---");
        System.out.println("Original b: " + b);          // Output: 5
        System.out.println("During b++: " + (b++));      // Output: 5 (පරණ අගය මුද්‍රණය වී, පසුව 1 ක් එකතු වේ)
        System.out.println("After b++: " + b);           // Output: 6 (දැන් අගය 6 යි)
    }
}
