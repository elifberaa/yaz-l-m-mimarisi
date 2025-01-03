public class Main {
    public static void main(String[] args) {
        Otomobil oto1 = new Otomobil( "Renault","Clio");
        oto1.OtomobilGoruntule();




        Binek binek1 = new Binek( "Dacia", "Sandero","Motorin" );
        binek1.BinekOtomobilGoruntule();


        TicariBinek tb1 = new TicariBinek("Tofaş", "Kartal", "Motorin", "250 lt");
        tb1.TicariBinekOtomobilGoruntule();

    }
}