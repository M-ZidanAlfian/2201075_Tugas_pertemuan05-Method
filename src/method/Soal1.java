/*
 * Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menampilkan
bilangan dari satu sampai dengan n, dimana n diinput dari alat masukan, n>=1.
 */

package method;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("n harus >= 1.");
        } else {
            displayNumbers(n);
        }
    }
    
    public static void displayNumbers(int n) {
        System.out.println("Bilangan ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

