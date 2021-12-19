package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class PluginFailed extends PluginState {
    static {
        Covode.recordClassIndex(79538);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PluginFailed(Exception exc) {
        super(null);
        l.d(exc, "");
    }
}
