package OdemeYontemi;

public class BankaKartiOdeme implements IOdemeStratejisi {
    public void odemeYap(double miktar) {
        System.out.println(miktar + " TL, banka kartı ile ödendi.");
    }
}
