package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class FeedLoadMorePlan {
    @c(a = "delay")
    private int delay;
    @c(a = "preload")
    private boolean preload;

    static {
        Covode.recordClassIndex(70822);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final boolean getPreload() {
        return this.preload;
    }

    public final String toString() {
        return "(preload=" + this.preload + ", delay=" + this.delay + ')';
    }

    public final void setDelay(int i2) {
        this.delay = i2;
    }

    public final void setPreload(boolean z) {
        this.preload = z;
    }
}
