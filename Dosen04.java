public class Dosen04 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen04(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampil(){
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-Laki" : "Perempuan"));
        System.out.println("Usia : " + usia);
    }
}
