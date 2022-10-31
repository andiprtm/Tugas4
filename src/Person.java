public class Person {
    public String nama;
    public String alamat;
    public String noTelp;
    public String noHp;
    public int usia;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    public void display() {
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("No. Telp: " + getNoTelp());
        System.out.println("No. HP: " + getNoHp());
        System.out.println("Usia: " + getUsia());
    }
}
