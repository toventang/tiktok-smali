package com.bytedance.monitor.a.b.a;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.a;
import com.bytedance.monitor.a.b.f;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f41372a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public f f41373b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC1014a f41374c;

    /* renamed from: d  reason: collision with root package name */
    private final String f41375d;

    /* renamed from: com.bytedance.monitor.a.b.a.a$a  reason: collision with other inner class name */
    public interface AbstractC1014a {
        static {
            Covode.recordClassIndex(25358);
        }

        void a(long j2);
    }

    static {
        Covode.recordClassIndex(25356);
    }

    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() {
            /* class com.bytedance.monitor.a.b.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25357);
            }

            public final void run() {
                Process.setThreadPriority(10);
                if (a.this.f41374c != null) {
                    a.this.f41374c.a(Thread.currentThread().getId());
                }
                try {
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    a.C1013a.f41371a.a(th, "APM_INNER_ERROR_async_task");
                    if (a.this.f41373b != null) {
                        th.getMessage();
                    }
                }
            }
        }, this.f41375d);
    }

    public a(String str) {
        this.f41375d = "APM_".concat(String.valueOf(str));
    }
}
