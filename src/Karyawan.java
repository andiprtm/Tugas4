public class Karyawan extends Person{
    public String nip;

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No Telp : " + noTelp);
        System.out.println("No Hp : " + noHp);
        System.out.println("Usia : " + usia);
        System.out.println("NIP : " + getNip());
    }

}
