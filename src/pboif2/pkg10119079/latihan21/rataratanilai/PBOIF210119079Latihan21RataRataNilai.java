package pboif2.pkg10119079.latihan21.rataratanilai;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI: membuat program rata rata nilai mahasiswa
 *
 */
public class PBOIF210119079Latihan21RataRataNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mhs, i;
        float nilai,rataNilai,total;
        total = 0;
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        mhs = input.nextInt();
        
        
        for (i = 1; i <= mhs; i++){
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");
            nilai = input.nextInt();
            total += nilai;
        }
        
        rataNilai = total / mhs;
        System.out.println("");
        System.out.println("Maka, rata-rata nilainya adalah " + rataNilai); 
    }
    
}
