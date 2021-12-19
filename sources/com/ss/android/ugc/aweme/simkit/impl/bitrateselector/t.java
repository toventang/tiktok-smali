package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bitrateselector.a.g;
import com.ss.android.ugc.playerkit.model.c;

public final class t {
    static {
        Covode.recordClassIndex(87378);
    }

    static g a() {
        if (c.f148702a.getBitrateModelThreshold() == -1.0d) {
            return g.SHIFT;
        }
        return g.INTELLIGENT;
    }
}
