import java.util.Scanner;
public class day34 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a >= 18) {
            System.out.println("Dewasa");
        } else if (a >= 13 && a <= 17) {
            System.out.println("Remaja");
        } else {
            System.out.println("Anak-Anak");
        }
    }
}
