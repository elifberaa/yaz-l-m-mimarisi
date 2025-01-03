// --- Ziyaretci: Risk Analizi ---
public class RiskAnaliziZiyaretci implements IZiyaretci {
    @Override
    public void ziyaretEt(Islem islem) {
        System.out.println("Risk analizi yapiliyor: " + islem.getTur().getIsim());
    }
}
