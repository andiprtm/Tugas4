public class Mahasiswa extends Person{
    public String NIM;
    public int jumlahSKS;

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIM() {
        return NIM;
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
        System.out.println("NIM : " + getNIM());
        System.out.println("Alamat : " + alamat);
        System.out.println("No Telp : " + noTelp);
        System.out.println("No Hp : " + noHp);
        System.out.println("Usia : " + usia);
    }
}
