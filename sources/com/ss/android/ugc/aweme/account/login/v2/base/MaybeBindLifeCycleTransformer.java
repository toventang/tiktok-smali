package com.ss.android.ugc.aweme.account.login.v2.base;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import f.a.d.k;
import f.a.e.e.c.u;
import f.a.e.e.e.bc;
import f.a.h;
import f.a.n;
import f.a.r;
import f.a.s;
import h.f.b.l;

public final class MaybeBindLifeCycleTransformer<T> implements s<T, T>, s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f64713a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final f.a.l.b<Integer> f64714b;

    static {
        Covode.recordClassIndex(39762);
    }

    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            disposeRequest();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39763);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public MaybeBindLifeCycleTransformer() {
        f.a.l.b<Integer> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f64714b = bVar;
    }

    @v(a = i.a.ON_DESTROY)
    public final void disposeRequest() {
        this.f64714b.onNext(1);
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64715a = new b();

        static {
            Covode.recordClassIndex(39764);
        }

        b() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            Integer num = (Integer) obj;
            l.d(num, "");
            if (num.intValue() == 1) {
                return true;
            }
            return false;
        }
    }

    @Override // f.a.s
    public final r<T> a(n<T> nVar) {
        l.d(nVar, "");
        f.a.l.b<Integer> bVar = this.f64714b;
        b bVar2 = b.f64715a;
        f.a.e.b.b.a((Object) bVar2, "predicate is null");
        h<T> a2 = f.a.h.a.a(new bc(bVar, bVar2)).a(f.a.a.MISSING);
        f.a.e.b.b.a((Object) a2, "other is null");
        n a3 = f.a.h.a.a(new u(nVar, a2));
        l.b(a3, "");
        return a3;
    }
}
