/*
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, yang membaca
panjang (integer) tiga buah sisi sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <=
c, lalu menentuka apakah ketiga sisi tersebut membentuk segitiga siku – siku, segitiga
lancip, atau segitiga tumpul (Petunjuk gunakan hukum Phytagoras).
 */
package method;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan a: ");
        int a = input.nextInt();
        System.out.print("Masukkan b: ");
        int b = input.nextInt();
        System.out.print("Masukkan c: ");
        int c = input.nextInt();

        if (isValidTriangle(a, b, c)) {
            if (isSegitigaSikuSiku(a, b, c)) {
                System.out.println("Segitiga siku-siku");
            } else if (isSegitigaLancip(a, b, c)) {
                System.out.println("Segitiga lancip");
            } else {
                System.out.println("Segitiga tumpul");
            }
        } else {
            System.out.println("Tidak membentuk segitiga.");
        }
    }
    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c && a > 0 && b > 0 && c > 0);
    }

    public static boolean isSegitigaSikuSiku(int a, int b, int c) {
        return (a * a + b * b == c * c);
    }

    public static boolean isSegitigaLancip(int a, int b, int c) {
        return (a * a + b * b > c * c);
    }
}
