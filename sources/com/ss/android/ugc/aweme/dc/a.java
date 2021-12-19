package com.ss.android.ugc.aweme.dc;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.f;
import com.ss.android.ugc.aweme.be.a;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.locks.ReentrantLock;

public abstract class a<T extends com.ss.android.ugc.aweme.be.a> implements e {

    /* renamed from: a  reason: collision with root package name */
    private final h f79367a = i.a((h.f.a.a) C1847a.f79369a);

    /* renamed from: m  reason: collision with root package name */
    public T f79368m;
    public f<com.bytedance.ies.powerlist.b.a> n;

    static {
        Covode.recordClassIndex(49275);
    }

    private final ReentrantLock a() {
        return (ReentrantLock) this.f79367a.getValue();
    }

    public void a(boolean z) {
    }

    public abstract T b();

    public void c(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.dc.e
    public void ce_() {
    }

    /* renamed from: com.ss.android.ugc.aweme.dc.a$a  reason: collision with other inner class name */
    static final class C1847a extends m implements h.f.a.a<ReentrantLock> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1847a f79369a = new C1847a();

        static {
            Covode.recordClassIndex(49276);
        }

        C1847a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ReentrantLock invoke() {
            return new ReentrantLock();
        }
    }

    public final T l() {
        T t = this.f79368m;
        if (t == null) {
            l.a("item");
        }
        return t;
    }

    public T d() {
        T b2 = b();
        this.f79368m = b2;
        if (b2 == null) {
            l.a("item");
        }
        b2.f68538a = this;
        T t = this.f79368m;
        if (t == null) {
            l.a("item");
        }
        return t;
    }

    public final void a(f<com.bytedance.ies.powerlist.b.a> fVar) {
        l.d(fVar, "");
        this.n = fVar;
    }

    public final void a(b<? super T, ? extends T> bVar) {
        l.d(bVar, "");
        ReentrantLock a2 = a();
        a2.lock();
        try {
            f<com.bytedance.ies.powerlist.b.a> fVar = this.n;
            if (fVar == null) {
                l.a("state");
            }
            T t = this.f79368m;
            if (t == null) {
                l.a("item");
            }
            int c2 = fVar.c(t);
            if (c2 == -1) {
                if (this.f79368m == null) {
                    l.a("item");
                }
                return;
            }
            T t2 = this.f79368m;
            if (t2 == null) {
                l.a("item");
            }
            String str = t2.f68539b;
            T t3 = this.f79368m;
            if (t3 == null) {
                l.a("item");
            }
            T t4 = (T) ((com.ss.android.ugc.aweme.be.a) bVar.invoke(t3));
            this.f79368m = t4;
            if (t4 == null) {
                l.a("item");
            }
            t4.a(str);
            T t5 = this.f79368m;
            if (t5 == null) {
                l.a("item");
            }
            l.d(t5, "");
            this.f79368m = t5;
            if (t5 == null) {
                l.a("item");
            }
            t5.f68538a = this;
            f<com.bytedance.ies.powerlist.b.a> fVar2 = this.n;
            if (fVar2 == null) {
                l.a("state");
            }
            T t6 = this.f79368m;
            if (t6 == null) {
                l.a("item");
            }
            fVar2.b(c2, t6);
            a2.unlock();
        } finally {
            a2.unlock();
        }
    }
}
