package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

public final class PluginInstalled extends PluginState {
    public static final PluginInstalled INSTANCE = new PluginInstalled();

    private PluginInstalled() {
        super(null);
    }

    static {
        Covode.recordClassIndex(79539);
    }
}
