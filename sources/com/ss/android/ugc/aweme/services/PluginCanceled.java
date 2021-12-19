package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

public final class PluginCanceled extends PluginState {
    public static final PluginCanceled INSTANCE = new PluginCanceled();

    private PluginCanceled() {
        super(null);
    }

    static {
        Covode.recordClassIndex(79536);
    }
}
