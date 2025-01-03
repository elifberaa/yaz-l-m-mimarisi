public class TransferDepartmani extends Departman {
    @Override
    protected boolean islemUygunMu(Islem islem) {
        return islem.getTur().getIsim().equals("Para Transferi");
    }

    @Override
    protected void islemIsle(Islem islem) {
        System.out.println("Transfer departmani isliyor: " + islem.getDetaylar());
    }
}
