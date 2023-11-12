public class ContohVariabel13 {
    public static void main(String[] args) {
    
    String hobby = "Menyanyi dan Makan";
    boolean keterangan = true;
    char jenisKelamin = 'P';
    byte umur = 18;
    double ipk = 3.9, tinggi = 156;

    System.out.println("salah satu hobby saya adalah " + hobby);
    System.out.println("Apakah pandai ?" + keterangan);
    System.out.println("Jenis Kelamin: " + jenisKelamin);
    System.out.println("Umurku Saat Ini: " + umur);
    System.out.println(String.format("IPK saya %s dengan tinggi badan %s", ipk, tinggi));
}
}