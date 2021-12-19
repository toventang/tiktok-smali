package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;

public abstract class LoadControl extends NativeObject {
    static {
        Covode.recordClassIndex(101304);
    }

    /* access modifiers changed from: protected */
    public abstract int onCodecStackSelected(int i2);

    /* access modifiers changed from: protected */
    public abstract int onFilterStackSelected(int i2);

    /* access modifiers changed from: protected */
    public abstract int onTrackSelected(int i2);

    /* access modifiers changed from: protected */
    public abstract boolean shouldStartPlayback(long j2, float f2, boolean z);
}
