/*
 Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, yang menerima
masukan tiga buah sisi, dimana jika semua sisi sama maka tampilkan “Termasuk
Kubus”, jika ada sisi yang tidak sama maka tampilkan bukan kubus.
 */
package method;
 import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sisi 1: ");
        int sisi1 = input.nextInt();
        System.out.print("Sisi 2: ");
        int sisi2 = input.nextInt();
        System.out.print("Sisi 3: ");
        int sisi3 = input.nextInt();

        if (isKubus(sisi1, sisi2, sisi3)) {
            System.out.println("Termasuk kubus");
        } else {
            System.out.println("Bukan kubus");
        }
    }

    public static boolean isKubus(int sisi1, int sisi2, int sisi3) {
        return sisi1 == sisi2 && sisi2 == sisi3;
    }
}
