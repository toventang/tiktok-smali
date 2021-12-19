package com.bytedance.sdk.b.d.e;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.b.d.b.b;
import com.bytedance.sdk.b.d.e.a;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutorService;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f43599b;

    /* renamed from: a  reason: collision with root package name */
    public final a f43600a;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f43601c;

    static {
        Covode.recordClassIndex(26690);
    }

    private d() {
        com.bytedance.sdk.b.a.j();
        ExecutorService executorService = com.bytedance.sdk.b.a.f43481a.f43491h;
        if (executorService == null) {
            l.a a2 = l.a(o.FIXED);
            a2.f79174c = 1;
            executorService = g.a(a2.a());
        }
        this.f43601c = executorService;
        this.f43600a = new a(this);
    }

    public static d a() {
        MethodCollector.i(3435);
        if (f43599b == null) {
            synchronized (d.class) {
                try {
                    if (f43599b == null) {
                        f43599b = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3435);
                    throw th;
                }
            }
        }
        d dVar = f43599b;
        MethodCollector.o(3435);
        return dVar;
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final SoftReference<d> f43604a;

        static {
            Covode.recordClassIndex(26692);
        }

        a(d dVar) {
            this.f43604a = new SoftReference<>(dVar);
        }

        public final void handleMessage(Message message) {
            a aVar;
            b a2;
            if (this.f43604a.get() != null && (a2 = (aVar = (a) message.obj).a()) != null) {
                int i2 = message.what;
                if (i2 == 0) {
                    a2.a((Object) aVar.f43596g);
                } else if (i2 == 1) {
                    a2.a(aVar.f43597h);
                }
            }
        }
    }

    public final <T> void a(final a<T> aVar) {
        if (aVar.a() != null) {
            aVar.f43595f = new a.AbstractC1053a<T>() {
                /* class com.bytedance.sdk.b.d.e.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26691);
                }

                @Override // com.bytedance.sdk.b.d.e.a.AbstractC1053a
                public final void a(Exception exc) {
                    aVar.f43597h = exc;
                    Message obtain = Message.obtain();
                    obtain.obj = aVar;
                    obtain.what = 1;
                    d.this.f43600a.sendMessage(obtain);
                }

                @Override // com.bytedance.sdk.b.d.e.a.AbstractC1053a
                public final void a(T t) {
                    aVar.f43596g = t;
                    Message obtain = Message.obtain();
                    obtain.obj = aVar;
                    obtain.what = 0;
                    d.this.f43600a.sendMessage(obtain);
                }
            };
            this.f43601c.submit(aVar);
        }
    }
}
