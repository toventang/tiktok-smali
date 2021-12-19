package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

public final class PluginPending extends PluginState {
    public static final PluginPending INSTANCE = new PluginPending();

    private PluginPending() {
        super(null);
    }

    static {
        Covode.recordClassIndex(79540);
    }
}
