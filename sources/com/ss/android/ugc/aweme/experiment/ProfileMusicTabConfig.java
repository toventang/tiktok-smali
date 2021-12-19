package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class ProfileMusicTabConfig {
    @c(a = "enable_pin")
    private final boolean enablePin;

    static {
        Covode.recordClassIndex(56253);
    }

    public final boolean getEnablePin() {
        return this.enablePin;
    }
}
