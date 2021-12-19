package com.bytedance.android.a.a.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public abstract class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f6611a = new AtomicInteger(1);

    /* access modifiers changed from: protected */
    public abstract void a();

    c() {
    }

    public final void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    static {
        Covode.recordClassIndex(3186);
    }
}
