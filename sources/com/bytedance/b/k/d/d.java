package com.bytedance.b.k.d;

import android.os.Process;
import com.bytedance.b.k.b.b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

public final class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f26329a;

    static {
        Covode.recordClassIndex(15292);
    }

    public d(String str) {
        this.f26329a = "APM6-".concat(String.valueOf(str));
    }

    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() {
            /* class com.bytedance.b.k.d.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15293);
            }

            public final void run() {
                Process.setThreadPriority(10);
                try {
                    runnable.run();
                } catch (Throwable th) {
                    b.a("APM-AsyncTask", "SingleThreadFactory error when running in thread " + d.this.f26329a, th);
                }
            }
        }, this.f26329a);
    }
}
