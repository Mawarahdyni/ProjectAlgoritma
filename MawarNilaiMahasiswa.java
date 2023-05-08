//Mawar Ahdayani Samual
//227064516023

import java.util.Scanner;

public class MawarNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        // Mendeklarasikan array untuk menyimpan nama dan nilai mahasiswa
        String[] namaMahasiswa = new String[jumlahData];
        int[] nilaiUTS = new int[jumlahData];
        int[] nilaiUAS = new int[jumlahData];
        int[] totalNilai = new int[jumlahData];
        double[] rataNilai = new double[jumlahData];

        // Meminta input nama dan nilai mahasiswa
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            namaMahasiswa[i] = input.next();
            System.out.print("Masukkan nilai UTS mahasiswa ke-" + (i+1) + ": ");
            nilaiUTS[i] = input.nextInt();
            System.out.print("Masukkan nilai UAS mahasiswa ke-" + (i+1) + ": ");
            nilaiUAS[i] = input.nextInt();
            totalNilai[i] = nilaiUTS[i] + nilaiUAS[i];
            rataNilai[i] = (double) totalNilai[i] / 2;
        }

        // Menampilkan hasil
        System.out.println("No\tNama\tUTS\tUAS\tTotal\tRata-Rata");
        System.out.println("==================================================");
        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%d\t%.1f\n", (i+1), namaMahasiswa[i], nilaiUTS[i], nilaiUAS[i], totalNilai[i], rataNilai[i]);
        }
    }
}
