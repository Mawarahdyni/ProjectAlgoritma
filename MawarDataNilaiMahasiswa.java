//Mawar Ahdayani Samual
//227064516023

import java.util.Scanner;

public class MawarDataNilaiMahasiswa {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    // Meminta input jumlah mahasiswa
    System.out.print("berapa masukan nilai mahasiswa: ");
    int jumlahMahasiswa = input.nextInt();

    // Mendeklarasikan array untuk menyimpan nama dan nilai mahasiswa
    String[] namaMahasiswa = new String[jumlahMahasiswa];
    int[] nilaiMahasiswa = new int[jumlahMahasiswa];

    // Meminta input nama dan nilai mahasiswa
    for (int i = 0; i < jumlahMahasiswa; i++) {
      System.out.print("Masukkan nama mahasiswa ke " + (i+1) + ": ");
      namaMahasiswa[i] = input.next();
      System.out.print("Masukkan nilai mahasiswa ke " + (i+1) + ": ");
      nilaiMahasiswa[i] = input.nextInt();
    }

    // Menghitung total nilai mahasiswa
    int totalNilai = 0;
    for (int i = 0; i < jumlahMahasiswa; i++) {
      totalNilai += nilaiMahasiswa[i];
    }

    // Menghitung rata-rata nilai mahasiswa
    double rataNilai = (double) totalNilai / jumlahMahasiswa;

    // Menampilkan total nilai dan rata-rata nilai
    System.out.println("Total nilai: " + totalNilai);
    System.out.println("Rata-rata nilai: " + rataNilai);
  }
}
