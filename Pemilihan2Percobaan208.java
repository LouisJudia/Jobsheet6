import java.util.Scanner;

public class Pemilihan2Percobaan208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int pilihan_menu,jumlahBeli =1;
        String member, metodePembayaran, qris;
        double diskon, harga,total_bayar = 0,diskonQris = 0; 


        System.out.println("----------------------");
        System.out.println("=== MENU KAFE JTI ====");
        System.out.println("----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket bundling (Rice bowl = Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input08.nextInt();
        input08.nextLine();
        System.out.print("Apakah anda menggunakan QRIS (y/n) = ");
        qris =input08.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input08.nextLine();
        System.out.println("---------------------------------------");

        if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string}
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu ==1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
 
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; //menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            //Menghitung total bayar setelah diskon
            total_bayar = harga -(harga * diskon);
            System.out.println("total  Bayar setelah diskon = " + total_bayar);        
        }

        else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan string}
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu ==1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
 
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; //menghentikan eksekusi lebih lnajut jika pilihan salah
            }

            //Menghitung total bayar setelah diskon
            System.out.println("total  Bayar  = " + harga );  

            total_bayar = harga*jumlahBeli;

            switch (qris.toLowerCase()) {
                case "y":
                    System.out.println("Total Bayar sebelum dipotong diskon qris = " + total_bayar);
                    total_bayar-=diskonQris;
                    System.out.println("Total Bayar = " + total_bayar);
                    break;
                case "n":
                    System.out.println("Total bayar = " + total_bayar);
                default:
                    System.out.println("Masukkan input yang benar");
                    input08.close();
                    return;
            }
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("---------------------------------------");
    }
    
}