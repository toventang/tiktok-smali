package com.ss.android.ugc.aweme.ecommercelive.framework.d.a;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f88032a;

    /* renamed from: b  reason: collision with root package name */
    public final e f88033b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f88034c;

    static {
        Covode.recordClassIndex(55337);
    }

    public static final class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f88035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f88036b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f88037c;

        static {
            Covode.recordClassIndex(55338);
        }

        public final void run() {
            if (this.f88035a.f88033b == e.LOW) {
                Process.setThreadPriority(10);
            } else if (this.f88035a.f88033b == e.HIGH) {
                Process.setThreadPriority(-4);
            }
            super.run();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, Runnable runnable, String str, Runnable runnable2, String str2) {
            super(runnable2, str2);
            this.f88035a = cVar;
            this.f88036b = runnable;
            this.f88037c = str;
        }
    }

    public /* synthetic */ c(String str) {
        this(str, e.NORMAL);
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f88032a + "-" + this.f88034c.incrementAndGet();
        return new a(this, runnable, str, runnable, str);
    }

    private c(String str, e eVar) {
        l.d(str, "");
        l.d(eVar, "");
        this.f88032a = str;
        this.f88033b = eVar;
        this.f88034c = new AtomicInteger(0);
    }
}
