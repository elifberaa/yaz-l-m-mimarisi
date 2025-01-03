
public class Binek extends Otomobil{
    String YakitTuru;

    public Binek(String Marka, String Model, String YakitTuru){
        super(Marka, Model);
        this.YakitTuru = YakitTuru;

    }
    public void BinekOtomobilGoruntule(){
        System.out.println("Otomobil markası:" + Marka);
        System.out.println("Otomobil model" + Model);
        System.out.println("Otomobil Yakit Turu:" + YakitTuru);
    }

}
