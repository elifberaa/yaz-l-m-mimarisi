// --- Main.Islem Sinifi ---
public class Islem {
    private IslemTuru tur; // Flyweight
    private String detaylar;

    public Islem(String tur, String detaylar) {
        this.tur = IslemTuruFabrikasi.getIslemTuru(tur);
        this.detaylar = detaylar;
    }

    public IslemTuru getTur() {
        return tur;
    }

    public String getDetaylar() {
        return detaylar;
    }

    public void kabulEt(IZiyaretci ziyaretci) {
        ziyaretci.ziyaretEt(this);
    }
}
