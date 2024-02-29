package praktikum2;

public class Mahasiswa2 implements Comparable<Mahasiswa2>{
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa2(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    @Override
    public String toString() {
        return "[nim = " + nim + ", nama = " + nama + ", kelas = " + kelas + "]";
    }

    @Override
    public int compareTo(Mahasiswa2 o) {
        return this.getNim().compareTo(o.getNim());
    }
    
    
}
