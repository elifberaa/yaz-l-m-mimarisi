public class TicariBinek extends Binek{
    String BagajKapasitesi;

    public TicariBinek(String Marka, String Model, String YakitTuru, String BagajKapasitesi) {
        super(Marka, Model, YakitTuru);
        this.BagajKapasitesi = BagajKapasitesi;

    }

    public void TicariBinekOtomobilGoruntule(){
        System.out.println("Otomobilin markası: " + Marka);
        System.out.println("Otomobilin modeli: " + Model);
        System.out.println("Otomobilin yakıt türü: " + YakitTuru);
        System.out.println("Otomobilin bagaj kapasitesi: " + BagajKapasitesi);
    }
}
