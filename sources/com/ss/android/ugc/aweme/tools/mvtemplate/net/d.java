package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEMVAlgorithmConfig;

public final /* synthetic */ class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f140900a;

    static {
        Covode.recordClassIndex(92007);
        int[] iArr = new int[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.values().length];
        f140900a = iArr;
        iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE.ordinal()] = 1;
        iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE_AND_JSON.ordinal()] = 2;
        iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO.ordinal()] = 3;
        iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO_AND_JSON.ordinal()] = 4;
    }
}
