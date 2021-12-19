package com.facebook.imagepipeline.e;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class l implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final int f47927a = 10;

    /* renamed from: b  reason: collision with root package name */
    private final String f47928b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f47929c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f47930d = new AtomicInteger(1);

    static {
        Covode.recordClassIndex(28992);
    }

    public l(String str) {
        this.f47928b = str;
        this.f47929c = true;
    }

    public final Thread newThread(final Runnable runnable) {
        String str;
        AnonymousClass1 r2 = new Runnable() {
            /* class com.facebook.imagepipeline.e.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28993);
            }

            public final void run() {
                try {
                    Process.setThreadPriority(l.this.f47927a);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        };
        if (this.f47929c) {
            str = this.f47928b + "-" + this.f47930d.getAndIncrement();
        } else {
            str = this.f47928b;
        }
        return new Thread(r2, str);
    }
}
