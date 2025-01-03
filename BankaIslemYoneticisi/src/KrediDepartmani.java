
// --- Departman: Kredi Departmani ---
public class KrediDepartmani extends Departman {
    @Override
    protected boolean islemUygunMu(Islem islem) {
        return islem.getTur().getIsim().equals("Kredi Basvurusu");
    }

    @Override
    protected void islemIsle(Islem islem) {
        System.out.println("Kredi departmani isliyor: " + islem.getDetaylar());
    }
}
