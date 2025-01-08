package OdemeYontemi;

public class NakitOdeme implements IOdemeStratejisi {
    public void odemeYap(double miktar) {
        System.out.println(miktar + " TL, nakit olarak ödendi.");
    }
}

