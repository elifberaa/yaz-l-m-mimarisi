package Fabrikalar;

import ArabaModulleri.*;

public interface IAracFactory {
    IMotor motoruUret();
    ILastik lastigiUret();
    IIcMekan icMekanUret();
}
