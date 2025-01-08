package Fabrikalar;

import ArabaModulleri.*;

public class SedanFactory implements IAracFactory {
    public IMotor motoruUret() {
        return new SedanMotor();
    }
    public ILastik lastigiUret() {
        return new SedanLastik();
    }
    public IIcMekan icMekanUret() {
        return new SedanIcMekan();
    }
}