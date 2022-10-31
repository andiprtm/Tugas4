public class Main {
    public static void main(String[] args) {

        System.out.println("===========MAHASISWA===========");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Rizki");
        mhs.setAlamat("Jl. Jendral Sudirman");
        mhs.setNoTelp("021-123456");
        mhs.setNoHp("08123456789");
        mhs.setUsia(24);
        mhs.setNIM("123456789");
        mhs.setJumlahSKS(24);
        mhs.print();

        System.out.println("===========KARYAWAN===========");
        Karyawan kry = new Karyawan();
        kry.setNama("Rizki");
        kry.setAlamat("Jl. Jendral Sudirman");
        kry.setNoTelp("021-123456");
        kry.setNoHp("08123456789");
        kry.setUsia(24);
        kry.setNip("123456789");
        kry.print();

        System.out.println("=============DOSEN===============");
        Dosen dsn = new Dosen();
        dsn.setNama("Rizki");
        dsn.setAlamat("Jl. Jendral Sudirman");
        dsn.setNoTelp("021-123456");
        dsn.setNIDN("123456789");
        dsn.setJumlahSKS(24);
        dsn.setNoHp("08123456789");
        dsn.setUsia(24);
        dsn.setNip("123456789");
        dsn.print();
    }
}
