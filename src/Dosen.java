public class Dosen extends Karyawan{
    public String NIDN;
    public int jumlahSKS;

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getJumlahSKS() {
        return jumlahSKS;
    }

    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah SKS yang diampu : " + getJumlahSKS());
        System.out.println("NIDN : " + getNIDN());
        System.out.println("Alamat : " + alamat);
        System.out.println("No Telp : " + noTelp);
        System.out.println("No Hp : " + noHp);
        System.out.println("Usia : " + usia);
        System.out.println("NIP : " + nip);

    }
}
