package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.a.f.d;
import f.a.ab;
import f.a.d.g;
import h.f.b.l;
import h.p;
import h.v;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public abstract class a<DATA, CURSOR, EXTRA> extends d<p<? extends Integer, ? extends CURSOR>, p<? extends CURSOR, ? extends p<? extends List<? extends DATA>, ? extends EXTRA>>> {

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference<CURSOR> f149273a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f149274b = new Object();

    static {
        Covode.recordClassIndex(98304);
    }

    public abstract boolean b(CURSOR cursor, CURSOR cursor2);

    public a(CURSOR cursor) {
        this.f149273a = new AtomicReference<>(cursor);
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.a$a  reason: collision with other inner class name */
    static final class C4031a<T, R> implements g<p<? extends CURSOR, ? extends p<? extends List<? extends DATA>, ? extends EXTRA>>, p<? extends List<? extends DATA>, ? extends EXTRA>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f149276b;

        static {
            Covode.recordClassIndex(98305);
        }

        C4031a(a aVar, Object obj) {
            this.f149275a = aVar;
            this.f149276b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.b.b.a */
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.concurrent.atomic.AtomicReference<CURSOR> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: private */
        /* renamed from: a */
        public p<List<DATA>, EXTRA> apply(p<? extends CURSOR, ? extends p<? extends List<? extends DATA>, ? extends EXTRA>> pVar) {
            MethodCollector.i(5371);
            l.d(pVar, "");
            synchronized (this.f149275a.f149274b) {
                try {
                    a aVar = this.f149275a;
                    if (aVar.b(this.f149276b, aVar.f149273a.get())) {
                        this.f149275a.f149273a.set(pVar.getFirst());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5371);
                    throw th;
                }
            }
            p<List<DATA>, EXTRA> pVar2 = (p) pVar.getSecond();
            MethodCollector.o(5371);
            return pVar2;
        }
    }

    public final ab<p<List<DATA>, EXTRA>> a(int i2) {
        CURSOR cursor;
        synchronized (this.f149274b) {
            cursor = this.f149273a.get();
        }
        ab<R> c2 = a(v.a(Integer.valueOf(i2), cursor)).b().c(new C4031a(this, cursor));
        l.b(c2, "");
        return c2;
    }
}
