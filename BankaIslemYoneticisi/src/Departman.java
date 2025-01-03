
// --- Sorumluluk Zinciri Arayuzu ---
public abstract class Departman {
    protected Departman sonraki;

    public void setSonraki(Departman sonraki) {
        this.sonraki = sonraki;
    }

    public void islemYap(Islem islem) {
        if (islemUygunMu(islem)) {
            islemIsle(islem);
        } else if (sonraki != null) {
            sonraki.islemYap(islem);
        } else {
            System.out.println("Bu islem islenemedi: " + islem.getTur().getIsim());
        }
    }

    protected abstract boolean islemUygunMu(Islem islem);

    protected abstract void islemIsle(Islem islem);
}
