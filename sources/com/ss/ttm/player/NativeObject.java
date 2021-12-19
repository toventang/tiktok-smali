package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;

public class NativeObject {

    /* renamed from: l  reason: collision with root package name */
    protected long f151961l;

    static {
        Covode.recordClassIndex(101312);
    }

    private native void nativeRelease(long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
    }

    private long getNativeObj() {
        return this.f151961l;
    }

    /* access modifiers changed from: protected */
    public void setNativeObj(long j2) {
        this.f151961l = j2;
    }
}
