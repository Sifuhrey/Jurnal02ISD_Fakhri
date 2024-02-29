package tugasjurnal;

public class Main {
    public static void main(String[] args) {
        Generic<ATK> daftarATK = new Generic<>(5);
        Generic<Bag> daftarBag = new Generic<>(5);
        daftarATK.addData(new ATK("A007","Pulpen" , "Sarasa", 20));
        daftarATK.addData(new ATK("A002","Pensil" , "FB", 30));
        daftarATK.addData(new ATK("A005","Spidol" , "Snowman", 27));
        daftarATK.addData(new ATK("B007","Buku Tulis" , "Sidu", 40));
        daftarATK.addData(new ATK("B008","Kertas Origami" , "Bobo", 50));

        daftarBag.addData(new Bag("C003", "Tas", "Eiger", 12));
        daftarBag.addData(new Bag("C006", "Tas", "Louis Vitton", 7));
        daftarBag.addData(new Bag("C004", "Tempat Pensil", "FB", 8));
        daftarBag.addData(new Bag("C012", "Tempat Pensil", "Sidu", 5));
        daftarBag.addData(new Bag("C008", "Tas", "Converse", 15));

        daftarATK.display();
        daftarBag.display();

        daftarATK.setData(2, new ATK("A009","Spidol" , "Hitam", 27));
        Bag hapus = new Bag("C004", "Tempat Pensil", "FB", 8);
        daftarBag.removeData(hapus);

        daftarATK.display();
        daftarBag.display();
    }
}
