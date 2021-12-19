package com.ss.android.ugc.aweme.utils.gecko;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class GeckoExperimentsType {
    @c(a = "available_storage_full")
    private final int availableStorageFull = 200;
    @c(a = "available_storage_patch")
    private final int availableStoragePatch = 200;
    @c(a = "use_gecko_settings")
    private final boolean useGeckoSettings = true;

    static {
        Covode.recordClassIndex(93570);
    }

    public final int getAvailableStorageFull() {
        return this.availableStorageFull;
    }

    public final int getAvailableStoragePatch() {
        return this.availableStoragePatch;
    }

    public final boolean getUseGeckoSettings() {
        return this.useGeckoSettings;
    }
}
