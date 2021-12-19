package com.ss.android.vesdk;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.TEVideoUtils;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    private volatile long f150939a;

    static {
        Covode.recordClassIndex(99277);
    }

    public final synchronized void a() {
        MethodCollector.i(12128);
        TEVideoUtils.releaseGetFrameHandler(this.f150939a);
        this.f150939a = 0;
        MethodCollector.o(12128);
    }

    public final synchronized void a(String str) {
        MethodCollector.i(11983);
        this.f150939a = TEVideoUtils.createGetFrameHandler(str);
        MethodCollector.o(11983);
    }

    public final synchronized Bitmap a(int i2, int i3, boolean z) {
        MethodCollector.i(12127);
        if (this.f150939a == 0) {
            MethodCollector.o(12127);
            return null;
        }
        Bitmap frameWithHandler = TEVideoUtils.getFrameWithHandler(this.f150939a, i2, -1, i3, z);
        MethodCollector.o(12127);
        return frameWithHandler;
    }
}
