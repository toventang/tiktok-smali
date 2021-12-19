package com.ss.android.sdk.webview;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.sdk.webview.h;
import com.ss.android.ugc.aweme.web.b.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class i implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile i f60225a;

    /* renamed from: b  reason: collision with root package name */
    private Set<h.a> f60226b = new LinkedHashSet();

    static {
        Covode.recordClassIndex(37198);
    }

    private i() {
    }

    public static i a() {
        MethodCollector.i(10204);
        if (f60225a == null) {
            synchronized (i.class) {
                try {
                    if (f60225a == null) {
                        f60225a = new i();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10204);
                    throw th;
                }
            }
        }
        i iVar = f60225a;
        MethodCollector.o(10204);
        return iVar;
    }

    public final void b() {
        if (!b.a((Collection) this.f60226b)) {
            Iterator<h.a> it = this.f60226b.iterator();
            while (it.hasNext()) {
                h.a next = it.next();
                if ((next instanceof a) && ((a) next).o) {
                    it.remove();
                }
            }
        }
    }

    public final void a(h.a aVar) {
        MethodCollector.i(10361);
        synchronized (this) {
            try {
                this.f60226b.add(aVar);
            } finally {
                MethodCollector.o(10361);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    @Override // com.ss.android.sdk.webview.h.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebResourceResponse a(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 10205(0x27dd, float:1.43E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            monitor-enter(r4)
            java.util.Set<com.ss.android.sdk.webview.h$a> r0 = r4.f60226b     // Catch:{ all -> 0x0036 }
            r1.addAll(r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            boolean r0 = r1.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x001c
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x001c:
            java.util.Iterator r1 = r1.iterator()
        L_0x0020:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            com.ss.android.sdk.webview.h$a r0 = (com.ss.android.sdk.webview.h.a) r0
            android.webkit.WebResourceResponse r2 = r0.a(r5)
            if (r2 == 0) goto L_0x0020
        L_0x0032:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.webview.i.a(java.lang.String):android.webkit.WebResourceResponse");
    }
}
