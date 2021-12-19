package com.ttnet.org.chromium.base;

import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public final class m implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f155272a;

    /* renamed from: b  reason: collision with root package name */
    private final StrictMode.VmPolicy f155273b;

    static {
        Covode.recordClassIndex(103324);
    }

    public static m a() {
        return new m(StrictMode.allowThreadDiskWrites());
    }

    public static m b() {
        return new m(StrictMode.allowThreadDiskReads());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f155272a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.f155273b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    private m(StrictMode.ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    public m(StrictMode.VmPolicy vmPolicy) {
        this(null, vmPolicy);
    }

    private m(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.f155272a = threadPolicy;
        this.f155273b = vmPolicy;
    }
}
