package Fabrikalar;

import ArabaModulleri.*;

public class SporArabaFactory implements IAracFactory {
    public IMotor motoruUret() {
        return new SporArabaMotor();
    }
    public ILastik lastigiUret() {
        return new SporArabaLastik();
    }
    public IIcMekan icMekanUret() {
        return new SporArabaIcMekan();
    }
}
