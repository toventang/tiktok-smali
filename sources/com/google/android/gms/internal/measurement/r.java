package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class r implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private ThreadFactory f51282a = Executors.defaultThreadFactory();

    static {
        Covode.recordClassIndex(32066);
    }

    r() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f51282a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
