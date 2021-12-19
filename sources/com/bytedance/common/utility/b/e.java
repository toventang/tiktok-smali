package com.bytedance.common.utility.b;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f26914b = c.f26891a;

    /* renamed from: c  reason: collision with root package name */
    public static ExecutorService f26915c = c.f26891a;

    /* renamed from: d  reason: collision with root package name */
    protected static final AtomicInteger f26916d = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private Runnable f26917a;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f26918e;

    public e() {
        this((char) 0);
    }

    public void run() {
        Runnable runnable = this.f26917a;
        if (runnable != null) {
            runnable.run();
        }
    }

    static {
        Covode.recordClassIndex(15883);
    }

    public final void a() {
        Runnable runnable;
        if (Logger.debug()) {
            runnable = new Runnable() {
                /* class com.bytedance.common.utility.b.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15884);
                }

                public final void run() {
                    try {
                        e.this.run();
                    } catch (Exception unused) {
                    }
                }
            };
        } else {
            runnable = this;
        }
        if (this.f26918e) {
            f26915c.submit(runnable);
        } else {
            f26914b.submit(runnable);
        }
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            f26914b.submit(runnable);
        }
    }

    public e(byte b2) {
        this((char) 0);
    }

    private e(char c2) {
        this.f26918e = false;
    }
}
