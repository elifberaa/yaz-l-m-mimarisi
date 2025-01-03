public class SekilFabrikası {
    public ISekilSablonu SekilOlustur(int SekilNumarasi){
        if(SekilNumarasi==1)
            return new Dikdortgen();

        if(SekilNumarasi==2)
            return new Ucgen();


        else return null;

    }
}
