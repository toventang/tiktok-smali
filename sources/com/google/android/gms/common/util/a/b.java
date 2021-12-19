package com.google.android.gms.common.util.a;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f50496a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50497b;

    /* renamed from: c  reason: collision with root package name */
    private final ThreadFactory f50498c;

    static {
        Covode.recordClassIndex(31461);
    }

    public b(String str) {
        this(str, (byte) 0);
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f50498c.newThread(new d(runnable));
        newThread.setName(this.f50496a);
        return newThread;
    }

    private b(String str, byte b2) {
        this.f50498c = Executors.defaultThreadFactory();
        this.f50496a = (String) r.a((Object) str, (Object) "Name must not be null");
        this.f50497b = 0;
    }
}
