package Com.UAS_PBO;

public class main {
    public static void main(String[] args) {

        PegawaiTetap pegawaiTetap = new PegawaiTetap("Rifki", 5000000);
        pegawaiTetap.Infopegawai();
        System.out.println("Gaji Lembur (2 jam): Rp" + pegawaiTetap.hitungGajiLembur(2));
        System.out.println("Gaji Bersih: Rp" + pegawaiTetap.hitungGajiBersih(2));
        System.out.println();


        
        PegawaiTidakTetap pegawaiTidakTetap = new PegawaiTidakTetap("Lalu Andra", 8000000);
        pegawaiTidakTetap.Infopegawai();
        System.out.println("Gaji Lembur (4 jam): Rp" + pegawaiTidakTetap.hitungGajiLembur(4));
        System.out.println("Gaji Bersih: Rp" + pegawaiTidakTetap.hitungGajiBersih(4));
    }
}
