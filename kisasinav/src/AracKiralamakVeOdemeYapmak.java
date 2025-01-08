import Fabrikalar.*;
import OdemeYontemi.*;

public class AracKiralamakVeOdemeYapmak {
    private IAracFactory aracFactory;
    private IOdemeStratejisi odemeStratejisi;

    // Araç kiralama
    public void aracKirala(String aracTipi) {
        switch (aracTipi.toLowerCase()) {
            case "sedan":
                aracFactory = new SedanFactory();
                break;
            case "suv":
                aracFactory = new SUVFactory();
                break;
            case "spor araba":
                aracFactory = new SporArabaFactory();
                break;
            default:
                System.out.println("Geçersiz araç tipi.");
                return;
        }
        aracFactory.motoruUret();
        aracFactory.lastigiUret();
        aracFactory.icMekanUret();
        System.out.println(aracTipi + " kiralandı.");
    }

    // Ödeme yapma
    public void odemeYap(String odemeTuru, double miktar) {
        switch (odemeTuru.toLowerCase()) {
            case "kredi kartı":
                odemeStratejisi = new KrediKartiOdeme();
                break;
            case "banka kartı":
                odemeStratejisi = new BankaKartiOdeme();
                break;
            case "nakit":
                odemeStratejisi = new NakitOdeme();
                break;
            default:
                System.out.println("Geçersiz ödeme türü.");
                return;
        }
        odemeStratejisi.odemeYap(miktar);
    }
}
