package Advanced_Loopings;

public class startPatten {
    public static void main(String[] args) {
        int rows = 5; // පේළි ගණන

        for (int i = 1; i <= rows; i++) {

            // 1. Spaces print කිරීම (ඉදිරියෙන් ඇති හිස්තැන්)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 2. Stars print කිරීම (* එකට පසු space එකක් ඇත)
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // 3. ඊළඟ පේළියට යාම
            System.out.println();
        }
    }
}
