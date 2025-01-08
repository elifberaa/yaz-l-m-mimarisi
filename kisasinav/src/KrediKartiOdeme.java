package OdemeYontemi;

public class KrediKartiOdeme implements IOdemeStratejisi {
    public void odemeYap(double miktar) {
        System.out.println(miktar + " TL, kredi kartı ile ödendi.");
    }
}
