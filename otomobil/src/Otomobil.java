public class Otomobil {
    String Marka;
    String Model;

    public Otomobil(String Marka, String Model) {
        this.Marka = Marka;
        this.Model = Model;
    }

    public void OtomobilGoruntule() {
        System.out.println("Otomobilin markası"+ Marka);
        System.out.println("Otomobil model: " + Model);
    }
}
