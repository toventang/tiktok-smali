package com.bytedance.apm.p;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private volatile ExecutorService f25211a;

    static {
        Covode.recordClassIndex(14686);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final c f25213a = new c((byte) 0);

        static {
            Covode.recordClassIndex(14688);
        }
    }

    public static c a() {
        if (com.bytedance.apm.c.f24687c) {
            return a.f25213a;
        }
        return null;
    }

    private c() {
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class com.bytedance.apm.p.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14687);
            }

            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Apm_Log_Bypass_Store");
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        this.f25211a = g.a(a2.a());
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(Runnable runnable) {
        this.f25211a.submit(runnable);
    }
}
