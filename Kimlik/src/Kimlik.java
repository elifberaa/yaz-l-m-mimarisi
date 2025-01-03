public class Kimlik {
    private static Kimlik nesne;

    private Kimlik(){

    }

    static Kimlik kimlikOlustur(){
        if(nesne == null)
            nesne = new Kimlik();
        return nesne;
    }

    public static void kimlikGoruntule(){
        System.out.println(" Nesne: Kimlik nesnesi tek kopya olarak oluşturuldu:" +nesne );
    }
}
