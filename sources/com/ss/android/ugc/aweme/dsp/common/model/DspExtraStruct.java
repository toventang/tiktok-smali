package com.ss.android.ugc.aweme.dsp.common.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class DspExtraStruct implements Serializable {
    @c(a = "upsell_resso")
    private final DspUpsellRessoStruct upsellResso = new DspUpsellRessoStruct();

    static {
        Covode.recordClassIndex(51934);
    }

    public final DspUpsellRessoStruct getUpsellResso() {
        return this.upsellResso;
    }
}
