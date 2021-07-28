package factory.pattern;

public class Employee {
    String nama;
    String jabatan;
    int gaji;

    public Employee(String nama, String jabatan, int gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Hai, Nama saya " + nama + ", jabatan saya adalah " + jabatan + ", gaji saya adalah " + gaji ;
    }
}
