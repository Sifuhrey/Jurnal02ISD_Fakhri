package tugasjurnal;

public class Bag {
    private String kode;
    private String jenis;
    private String nama;
    private int stok;

    public Bag(String kode, String jenis, String nama, int stok) {
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    @Override
    public String toString() {
        return kode + "|" + jenis + "|" + nama + "|" + stok;
    }

}
