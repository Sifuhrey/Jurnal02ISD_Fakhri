package praktikum2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa2 org = new Mahasiswa2("607062300079", "M Riza Rabbani", "4702");
        GenArrayList list = new GenArrayList<>(10);
        list.addData(org);
        list.addData(new Mahasiswa2("607062300000", "Pasya Hermansyah", "4702"));
        list.display();
    }
}
