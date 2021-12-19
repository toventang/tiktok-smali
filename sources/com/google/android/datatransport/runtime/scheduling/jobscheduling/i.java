package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f49581a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49582b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49583c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f49584d;

    static {
        Covode.recordClassIndex(31017);
    }

    private i(h hVar, k kVar, int i2, Runnable runnable) {
        this.f49581a = hVar;
        this.f49582b = kVar;
        this.f49583c = i2;
        this.f49584d = runnable;
    }

    public static Runnable a(h hVar, k kVar, int i2, Runnable runnable) {
        return new i(hVar, kVar, i2, runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r7.f49577d.a(r10, r11 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00ad */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.i.run():void");
    }
}
