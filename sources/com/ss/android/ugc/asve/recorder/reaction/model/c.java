package com.ss.android.ugc.asve.recorder.reaction.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends d {
    static {
        Covode.recordClassIndex(38302);
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.model.a
    public final int convertDpToWidth(int i2) {
        return (int) ((((float) (i2 + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.model.a
    public final int convertWidthToDp(int i2) {
        return (int) (((((float) i2) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.model.a
    public final int convertDpToHeight(int i2) {
        double d2 = (double) ((((float) i2) / 375.0f) * ((float) this.outputVideoWidth));
        double d3 = (double) this.outputVideoWidth;
        Double.isNaN(d3);
        Double.isNaN(d2);
        return (int) (d2 + (d3 * 0.010666666666666666d));
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.model.a
    public final int convertHeightToDp(int i2) {
        double d2 = (double) i2;
        double d3 = (double) this.outputVideoWidth;
        Double.isNaN(d3);
        Double.isNaN(d2);
        double d4 = (double) this.outputVideoWidth;
        Double.isNaN(d4);
        return (int) (((d2 - (d3 * 0.010666666666666666d)) / d4) * 375.0d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(str, false, i2, i3, i4, i5, i6, i7);
        l.d(str, "");
    }
}
