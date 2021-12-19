package com.google.android.gms.common.util.a;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f50499a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50500b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f50501c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadFactory f50502d;

    static {
        Covode.recordClassIndex(31462);
    }

    public c(String str) {
        this(str, (byte) 0);
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f50502d.newThread(new d(runnable));
        String str = this.f50499a;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.f50501c.getAndIncrement()).append("]").toString());
        return newThread;
    }

    private c(String str, byte b2) {
        this.f50501c = new AtomicInteger();
        this.f50502d = Executors.defaultThreadFactory();
        this.f50499a = (String) r.a((Object) str, (Object) "Name must not be null");
        this.f50500b = 0;
    }
}
