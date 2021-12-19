package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f155969a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f155970b;

    static {
        Covode.recordClassIndex(103636);
    }

    j(String str, AtomicLong atomicLong) {
        this.f155969a = str;
        this.f155970b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f155969a;
        AtomicLong atomicLong = this.f155970b;
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName(str + atomicLong.getAndIncrement());
        return newThread;
    }
}
