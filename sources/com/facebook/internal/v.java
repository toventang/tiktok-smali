package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.m;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

public final class v<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f48681a;

    /* renamed from: b  reason: collision with root package name */
    public CountDownLatch f48682b = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(29354);
    }

    public v(final Callable<T> callable) {
        m.c().execute(new FutureTask(new Callable<Void>() {
            /* class com.facebook.internal.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29355);
            }

            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                try {
                    v.this.f48681a = (T) callable.call();
                    v.this.f48682b.countDown();
                    return null;
                } catch (Throwable th) {
                    v.this.f48682b.countDown();
                    throw th;
                }
            }
        }));
    }
}
