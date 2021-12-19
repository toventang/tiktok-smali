package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;

public class VEEffectSelectOp {
    public int action;
    public EffectModel mEffectModel;
    public EffectPointModel mPreviousModel;
    public int mTimePosition;
    public final int mType;

    static {
        Covode.recordClassIndex(84490);
    }

    private VEEffectSelectOp(int i2) {
        this.mType = i2;
    }

    public static VEEffectSelectOp selectTime(int i2) {
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(1);
        vEEffectSelectOp.mTimePosition = i2;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectTrans(EffectModel effectModel) {
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(2);
        vEEffectSelectOp.mEffectModel = effectModel;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectFilter(int i2, EffectModel effectModel) {
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(3);
        vEEffectSelectOp.mEffectModel = effectModel;
        vEEffectSelectOp.action = i2;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectSticker(EffectModel effectModel, EffectPointModel effectPointModel) {
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(4);
        vEEffectSelectOp.mEffectModel = effectModel;
        vEEffectSelectOp.mPreviousModel = effectPointModel;
        return vEEffectSelectOp;
    }
}
