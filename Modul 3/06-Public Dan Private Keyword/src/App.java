class Data {
  // Data member atau variabel instant
  String nama; // default, bisa diakses diluar class
  public String prodi; // public, bisa diakses diluar class
  private double ipk; // private, hanya bisa diakses oleh class itu sendiri

  // konstruktor
  Data(String nama, String prodi, double ipk) {
      this.nama = nama;
      this.prodi = prodi;
      this.ipk = ipk;

  }

  // default modifier access method
  void cetakData() {
      tambahIPK(); // contoh access pivate method
      System.out.println("Nama : " + this.nama);
      System.out.println("Prodi : " + this.prodi);
      System.out.println("IPK : " + this.ipk);
  }

  // public modifier access method
  public void ubahNama(String namaBaru) {
      this.nama = namaBaru;

  }

  // private modifier access method
  private void tambahIPK() {
      this.ipk += 0.5;
  }
}

public class App {
  public static void main(String[] args) throws Exception {
      // instansiasi objek
      Data data1 = new Data("Agus", "PTI", 3.50);

      // modifier access default
      System.out.println(data1.nama);
      data1.nama = "Rifki";
      System.out.println(data1.nama);

      // modifier access public
      System.out.println(data1.prodi);
      data1.prodi = "Managemen";
      System.out.println(data1.prodi);

      // modifier access private
      // System.out.println(data1.ipk);
      // data1.ipk = 3.30;
      // System.out.println(data1.ipk);

      // method default
      data1.cetakData();

      // method public
      data1.ubahNama("Adit");
      data1.cetakData();

      // method private
      // data1.tambahIPK();
  }
}