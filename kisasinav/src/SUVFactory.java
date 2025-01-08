package Fabrikalar;

import ArabaModulleri.*;

public class SUVFactory implements IAracFactory {
    public IMotor motoruUret() {
        return new SUVMotor();
    }
    public ILastik lastigiUret() {
        return new SUVLastik();
    }
    public IIcMekan icMekanUret() {
        return new SUVIcMekan();
    }
}