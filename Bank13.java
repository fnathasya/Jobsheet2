import java.util.Scanner;

public class Bank13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, bunga, prosentase_bunga =0.02;

        System.out.println("Bank");
        System.out.println("Masukkan Jumlah Tabungan Awal Anda : ");
        jml_tabungan_awal = input.nextInt();

        System.out.println("Masukkan Lama Menabung Anda : ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;

        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("Bunga : " + bunga);
        System.out.println("Jumlah Tabungan Akhir Anda Adalah " + jml_tabungan_akhir);

    }
}