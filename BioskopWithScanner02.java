import java.util.Scanner;
public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("======== Daftar Menu ========");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Silahkan pilih menu: ");
            menu = sc2.nextInt();
            sc2.nextLine(); 

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc2.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc2.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc2.nextInt();
                    sc2.nextLine(); 

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Kursi tidak tersedia! Baris harus antara 1-4 dan kolom antara 1-2. Silakan coba lagi.");
                        break;
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " sudah terisi! Silakan pilih kursi lain.");
                        continue;
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                        break; 
                    }
                }

            } else if (menu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int b = 0; b < penonton.length; b++) {
                    for (int k = 0; k < penonton[b].length; k++) {
                        if (penonton[b][k] != null) {
                            System.out.println("Baris: " + (b + 1) + " Kolom: " + (k + 1) + " : " + penonton[b][k]);
                        } else {
                            System.out.println("Baris: " + (b + 1) + " Kolom: " + (k + 1) + " : ***");
                        }
                    }
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih! Program selesai.");
                break;

            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        }
    }
}