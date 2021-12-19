package com.bytedance.c.a.a.a;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<h> f26671a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f26672b = false;

    static {
        Covode.recordClassIndex(15735);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.f26672b) {
            if (ApmDelegate.a.f25042a.f25014h) {
                this.f26672b = true;
            }
            b.a.f25210a.b(new Runnable() {
                /* class com.bytedance.c.a.a.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15736);
                }

                public final void run() {
                    MethodCollector.i(12716);
                    try {
                        if (ApmDelegate.a.f25042a.f25014h) {
                            LinkedList linkedList = new LinkedList();
                            synchronized (a.this.f26671a) {
                                try {
                                    linkedList.addAll(a.this.f26671a);
                                    a.this.f26671a.clear();
                                } finally {
                                    MethodCollector.o(12716);
                                }
                            }
                            while (!linkedList.isEmpty()) {
                                h hVar = (h) linkedList.poll();
                                if (hVar != null) {
                                    c.a().a(hVar.f26686a, hVar.f26687b, null, false);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                        MethodCollector.o(12716);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        MethodCollector.i(8963);
        if (this.f26672b) {
            MethodCollector.o(8963);
            return;
        }
        synchronized (this.f26671a) {
            try {
                if (this.f26671a.size() > 40) {
                    this.f26671a.poll();
                }
                this.f26671a.add(new h(str, str2));
            } finally {
                MethodCollector.o(8963);
            }
        }
    }
}
