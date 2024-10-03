import java.util.Scanner;

public class Pemilihan2Percobaan208  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Masukkan tahun: ");
        year = input.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Tahun Kabisat.");
        } else {
            System.out.println("Bukan Tahun Kabisat.");
        }

        input.close();
    }
}
