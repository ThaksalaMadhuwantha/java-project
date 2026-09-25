package Activity_Set_01;

public class operators {
    public static void main(String[] args) {
        // --- 1. Arithmetic Operators (+, -, *, /, %) ---
        double item1Price = 600.0;
        double item2Price = 400.0;

        double totalPrice = item1Price + item2Price; // Addition (+)
        double discount = totalPrice * 0.10;         // Multiplication (*)
        double finalPrice = totalPrice - discount;    // Subtraction (-)

        int totalItems = 3;
        double avgPricePerItem = totalPrice / totalItems; // Division (/)
        int extraPoints = (int) totalPrice % 300;          // Modulus (%)

        System.out.println("=== 1. Arithmetic Operators ===");
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Final Price after Discount: " + finalPrice);
        System.out.println("Average Price per Item: " + avgPricePerItem);
        System.out.println("Extra Points (Modulus): " + extraPoints);

        // --- 2. Assignment Operators (=, +=, -=, *=) ---
        double totalBill = finalPrice;
        totalBill += 50.0; // Delivery fee adding (totalBill = totalBill + 50.0)

        System.out.println("\n=== 2. Assignment Operators ===");
        System.out.println("Total Bill with Delivery Fee (+=): " + totalBill);

        // --- 3. Unary Operators (++ , --, !) ---
        int customerRewardPoints = 5;
        customerRewardPoints++; // Increment (++)

        boolean isStoreOpen = true;
        boolean isStoreClosed = !isStoreOpen; // Logical NOT (!)

        System.out.println("\n=== 3. Unary Operators ===");
        System.out.println("Updated Reward Points (++): " + customerRewardPoints);
        System.out.println("Is Store Closed (!): " + isStoreClosed);

        // --- 4. Relational Operators (>, <, >=, ==, !=) ---
        boolean isHighSpender = totalBill > 1000;
        boolean isEligibleForDiscount = totalPrice >= 500;

        System.out.println("\n=== 4. Relational Operators ===");
        System.out.println("Is High Spender (> 1000)? " + isHighSpender);
        System.out.println("Is Eligible for Discount (>= 500)? " + isEligibleForDiscount);

        // --- 5. Logical Operators (&&, ||) ---
        boolean isVipMember = true;
        boolean hasSpecialOffer = isVipMember && (totalBill > 500); // Logical AND
        boolean canGetFreeShipping = isVipMember || (totalBill > 2000); // Logical OR

        System.out.println("\n=== 5. Logical Operators ===");
        System.out.println("Has Special Offer (&&): " + hasSpecialOffer);
        System.out.println("Can Get Free Shipping (||): " + canGetFreeShipping);

        // --- 6. Bitwise Operators (&, |, ^, ~) ---
        int READ_PERMISSION = 4;  // Binary: 0100
        int WRITE_PERMISSION = 2; // Binary: 0010

        int userPermissions = READ_PERMISSION | WRITE_PERMISSION; // Bitwise OR (0110 -> 6)
        boolean canWrite = (userPermissions & WRITE_PERMISSION) != 0; // Bitwise AND

        System.out.println("\n=== 6. Bitwise Operators ===");
        System.out.println("Combined Permission Flags (|): " + userPermissions);
        System.out.println("Has Write Permission (&): " + canWrite);
    }
}
