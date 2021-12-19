package com.lynx.tasm.behavior.c.a;

import android.os.ConditionVariable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.c.c;
import com.lynx.tasm.behavior.c.d;
import com.lynx.tasm.behavior.c.k;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.o;
import com.lynx.tasm.utils.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private final List<k> f55833c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Map<k.a, k> f55834d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final ConditionVariable f55835e = new ConditionVariable();

    /* renamed from: f  reason: collision with root package name */
    private final ConditionVariable f55836f = new ConditionVariable();

    /* renamed from: g  reason: collision with root package name */
    private int f55837g = 0;

    static {
        Covode.recordClassIndex(34905);
    }

    protected static class a extends LinkedHashMap<k.a, k> {
        static {
            Covode.recordClassIndex(34907);
        }

        protected a() {
        }

        public final k put(k.a aVar, k kVar) {
            k kVar2 = (k) super.put((Object) aVar, (Object) kVar);
            if (kVar2 != null) {
                kVar.a(kVar2);
            }
            return kVar2;
        }
    }

    @Override // com.lynx.tasm.behavior.c.a.a
    public final void b() {
        this.f55837g = 0;
        this.f55836f.close();
        this.f55835e.close();
    }

    public final void c() {
        MethodCollector.i(13395);
        TraceEvent.a(0, "UIOperationQueueAsyncRender.flush");
        ArrayList<k> arrayList = new ArrayList();
        synchronized (this.f55834d) {
            try {
                for (k kVar : this.f55834d.values()) {
                    arrayList.add(kVar);
                }
                this.f55834d.clear();
            } catch (Throwable th) {
                MethodCollector.o(13395);
                throw th;
            }
        }
        for (k kVar2 : arrayList) {
            kVar2.b(this.f55822a);
            if (kVar2 instanceof c) {
                this.f55837g = 3;
            }
        }
        TraceEvent.b(0, "UIOperationQueueAsyncRender.flush");
        MethodCollector.o(13395);
    }

    @Override // com.lynx.tasm.behavior.c.a.a
    public final void a() {
        MethodCollector.i(13315);
        if (m.a()) {
            if (!this.f55823b && this.f55837g != 3) {
                long currentTimeMillis = System.currentTimeMillis();
                TraceEvent.a(0, "UIOperationQueueAsyncRender.flush.waitTASM");
                if (!this.f55836f.block(100)) {
                    LLog.a(6, "lynx_UIOperationQueueAsyncRender", "flush on ui thread failed, wait tasm finish timeout");
                }
                TraceEvent.b(0, "UIOperationQueueAsyncRender.flush.waitTASM");
                c();
                TraceEvent.a(0, "UIOperationQueueAsyncRender.flush.waitLayout");
                if (!this.f55835e.block(100)) {
                    LLog.a(6, "lynx_UIOperationQueueAsyncRender", "flush on ui thread failed, wait layout finish timeout");
                }
                TraceEvent.b(0, "UIOperationQueueAsyncRender.flush.waitLayout");
                c();
                a(new o.a(true, currentTimeMillis, System.currentTimeMillis()));
            }
            MethodCollector.o(13315);
            return;
        }
        synchronized (this.f55834d) {
            try {
                for (k kVar : this.f55833c) {
                    this.f55834d.put(kVar.f55846b, kVar);
                }
                this.f55833c.clear();
            } catch (Throwable th) {
                MethodCollector.o(13315);
                throw th;
            }
        }
        int i2 = this.f55837g;
        if (i2 == 1) {
            this.f55836f.open();
        } else if (i2 == 2) {
            this.f55835e.open();
        }
        m.a(new Runnable() {
            /* class com.lynx.tasm.behavior.c.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34906);
            }

            public final void run() {
                if (!b.this.f55823b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    b.this.c();
                    b.this.a(new o.a(false, currentTimeMillis, System.currentTimeMillis()));
                }
            }
        });
        MethodCollector.o(13315);
    }

    public final void a(o.a aVar) {
        this.f55822a.f55933c.f55905m.a(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.a.a
    public final void a(k kVar) {
        this.f55833c.add(kVar);
        if (kVar instanceof d) {
            this.f55837g = 1;
        } else if (kVar instanceof c) {
            this.f55837g = 2;
        }
    }

    public b(q qVar) {
        super(qVar, true);
    }
}
