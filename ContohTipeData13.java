public class ContohTipeData13 {
    public static void main(String[] args) {
        
        char golonganDarah = 'A';
        short jarak = 130;
        short jumlahPenduduk = 1000;
        float suhu = 60.50F;
        double berat = 0.5467812345;
        long saldo = 1000000000;
        int desimal = 0x10;

        System.out.println("Golongan Darah\t\t\t\t :" + (byte) golonganDarah );
        System.out.println("Jarak\t\t\t\t\t :" + jarak);
        System.out.println("Jumlah Penduduk dalam Satu Dusun\t :" + jumlahPenduduk );
        System.out.println("Suhu\t\t\t\t\t :" + suhu);
        System.out.println("Berat\t\t\t\t\t :" + (float) berat);
        System.out.println("Angka Desimal\t\t\t\t :" + desimal);
    }
}