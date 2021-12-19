package com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class ClientUploadRouterModel {
    @c(a = "mode")
    private final int mode;
    @c(a = "weight")
    private final int weight;

    static {
        Covode.recordClassIndex(77055);
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getWeight() {
        return this.weight;
    }

    public ClientUploadRouterModel(int i2, int i3) {
        this.mode = i2;
        this.weight = i3;
    }
}
