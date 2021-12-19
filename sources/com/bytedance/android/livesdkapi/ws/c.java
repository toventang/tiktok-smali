package com.bytedance.android.livesdkapi.ws;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f23406c;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<a> f23407a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Object> f23408b;

    static {
        Covode.recordClassIndex(13912);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(6029);
        if (f23406c == null) {
            synchronized (c.class) {
                try {
                    f23406c = new c();
                } catch (Throwable th) {
                    MethodCollector.o(6029);
                    throw th;
                }
            }
        }
        c cVar = f23406c;
        MethodCollector.o(6029);
        return cVar;
    }

    public final void b() {
        WeakReference<a> weakReference = this.f23407a;
        if (weakReference != null) {
            a aVar = weakReference.get();
            if (aVar != null) {
                aVar.b();
            }
            WeakReference<Object> weakReference2 = this.f23408b;
            if (!(weakReference2 == null || weakReference2.get() == null)) {
                this.f23408b.get();
            }
            this.f23407a = null;
        }
    }
}
