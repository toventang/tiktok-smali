package com.ss.android.ugc.aweme.dsp.common.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

public final class DspStruct implements Serializable {
    @c(a = "aweme")
    private final Aweme aweme = new Aweme();
    @c(a = "dsp_extra")
    private final DspExtraStruct dspExtra = new DspExtraStruct();

    static {
        Covode.recordClassIndex(51935);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final DspExtraStruct getDspExtra() {
        return this.dspExtra;
    }
}
