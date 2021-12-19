package com.twitter.sdk.android.core.internal;

import com.a;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f155971a;

    /* renamed from: b  reason: collision with root package name */
    private final long f155972b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final TimeUnit f155973c;

    /* renamed from: d  reason: collision with root package name */
    private final String f155974d;

    static {
        Covode.recordClassIndex(103637);
    }

    k(ExecutorService executorService, TimeUnit timeUnit, String str) {
        this.f155971a = executorService;
        this.f155973c = timeUnit;
        this.f155974d = str;
    }

    public final void run() {
        ExecutorService executorService = this.f155971a;
        long j2 = this.f155972b;
        TimeUnit timeUnit = this.f155973c;
        String str = this.f155974d;
        try {
            executorService.shutdown();
            if (!executorService.awaitTermination(j2, timeUnit)) {
                com.twitter.sdk.android.core.k.c().b();
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            f c2 = com.twitter.sdk.android.core.k.c();
            a.a(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str});
            c2.b();
            executorService.shutdownNow();
        }
    }
}
