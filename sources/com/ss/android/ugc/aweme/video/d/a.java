package com.ss.android.ugc.aweme.video.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.b;

public enum a {
    Undefine(b.Undefine),
    Standard(b.Standard),
    High(b.High),
    SuperHigh(b.SuperHigh),
    ExtremelyHigh(b.ExtremelyHigh),
    FourK(b.FourK),
    HDR(b.HDR),
    Auto(b.Auto),
    L_Standard(b.L_Standard),
    H_High(b.H_High),
    TwoK(b.TwoK),
    ExtremelyHigh_50F(b.ExtremelyHigh_50F),
    TwoK_50F(b.TwoK_50F),
    FourK_50F(b.FourK_50F),
    ExtremelyHigh_60F(b.ExtremelyHigh_60F),
    TwoK_60F(b.TwoK_60F),
    FourK_60F(b.FourK_60F),
    ExtremelyHigh_120F(b.ExtremelyHigh_120F),
    TwoK_120F(b.TwoK_120F),
    FourK_120F(b.FourK_120F);
    
    private final b resolution;

    public final b getResolution() {
        return this.resolution;
    }

    public final int getIndex() {
        return ordinal();
    }

    public static a[] getAllResolution() {
        try {
            return new a[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F};
        } catch (Exception unused) {
            return new a[0];
        }
    }

    static {
        Covode.recordClassIndex(93828);
    }

    public static a valueOf(int i2) {
        a aVar = Undefine;
        if (i2 < aVar.ordinal() || i2 > FourK_120F.ordinal()) {
            return aVar;
        }
        return values()[i2];
    }

    private a(b bVar) {
        this.resolution = bVar;
    }
}
