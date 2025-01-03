public class Main {
    public static void main(String[] args) {

       SekilFabrikası sf = new SekilFabrikası();
       ISekilSablonu sekil1 = sf.SekilOlustur( 1 );

       sekil1.Alan();
       sekil1.Cevre();


       ISekilSablonu sekil2 = sf.SekilOlustur( 2 );

       sekil2.Alan();
       sekil2.Cevre();

    }
}