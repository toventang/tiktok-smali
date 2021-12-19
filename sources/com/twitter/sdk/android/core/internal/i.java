package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int f155966a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f155967b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f155968c;

    static {
        Covode.recordClassIndex(103635);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f155968c = availableProcessors;
        f155966a = availableProcessors + 1;
        f155967b = (availableProcessors * 2) + 1;
    }

    public static ThreadFactory a(String str) {
        return new j(str, new AtomicLong(1));
    }

    public static void a(String str, ExecutorService executorService) {
        a(str, executorService, TimeUnit.SECONDS);
    }

    private static void a(String str, ExecutorService executorService, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new k(executorService, timeUnit, str), "Twitter Shutdown Hook for ".concat(String.valueOf(str))));
    }
}
