import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        
        int[][] survei = new int[10][6];
        double rataResponden, jumlahRataResponden;
        double totalKeseluruhan = 0; 
        
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            
            for (int j = 0; j < survei[i].length; j++) {
                while (true) {
                    System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                    int jawaban = sc2.nextInt();
                    
                    if (jawaban >= 1 && jawaban <= 5) {
                        survei[i][j] = jawaban; 
                        totalKeseluruhan += jawaban; 
                        break;
                    } else {
                        System.out.println("Masukkan nilai antara 1-5!");
                    }
                }
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Rata-rata nilai setiap responden:");
        for (int i = 0; i < survei.length; i++) {
            rataResponden = 0; 
            
            for (int j = 0; j < survei[i].length; j++) {
                rataResponden += survei[i][j];
            }
            
            jumlahRataResponden = rataResponden / 6; // Rata-rata untuk 6 pertanyaan
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + jumlahRataResponden);
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Rata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < survei[0].length; j++) {
            double totalPertanyaan = 0;

            for (int i = 0; i < survei.length; i++) {
                totalPertanyaan += survei[i][j]; 
            }

            double rataPertanyaan = totalPertanyaan / 10; // Rata-rata untuk setiap pertanyaan
            System.out.println("Nilai rata-rata pertanyaan " + (j + 1) + ": " + rataPertanyaan);
        }

        double rataKeseluruhan = totalKeseluruhan / 60; // 10 responden x 6 pertanyaan = 60 jawaban
        System.out.println("\n=====================================");
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);
    }
}
