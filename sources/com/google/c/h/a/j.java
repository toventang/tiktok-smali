package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class j<V> extends i<V> implements q<V> {
    static {
        Covode.recordClassIndex(33647);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract q<? extends V> c();

    public static abstract class a<V> extends j<V> {

        /* renamed from: a  reason: collision with root package name */
        private final q<V> f54231a;

        static {
            Covode.recordClassIndex(33648);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.h.a.i, com.google.c.h.a.j
        public final /* bridge */ /* synthetic */ Future a() {
            return this.f54231a;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.h.a.j
        public final q<V> b() {
            return this.f54231a;
        }

        @Override // com.google.c.c.u, com.google.c.h.a.i, com.google.c.h.a.j
        public final /* bridge */ /* synthetic */ Object c() {
            return this.f54231a;
        }

        protected a(q<V> qVar) {
            this.f54231a = (q) k.a(qVar);
        }
    }

    protected j() {
    }

    @Override // com.google.c.h.a.q
    public final void a(Runnable runnable, Executor executor) {
        c().a(runnable, executor);
    }
}
