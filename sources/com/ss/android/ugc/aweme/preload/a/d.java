package com.ss.android.ugc.aweme.preload.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.preload.a.c;
import f.a.aa;
import f.a.t;
import f.a.x;
import f.a.y;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f115751a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(74681);
    }

    /* access modifiers changed from: package-private */
    public static final class a<Upstream, Downstream> implements y {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115752a = new a();

        static {
            Covode.recordClassIndex(74682);
        }

        a() {
        }

        @Override // f.a.y
        public final x<T> a(t<T> tVar) {
            l.d(tVar, "");
            return tVar.b(f.a.h.a.c(f.a.k.a.f158008e)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<Upstream, Downstream> implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f115753a;

        static {
            Covode.recordClassIndex(74683);
        }

        b(e eVar) {
            this.f115753a = eVar;
        }

        @Override // f.a.y
        public final x<T> a(t<T> tVar) {
            l.d(tVar, "");
            c cVar = c.C2957c.f115741a;
            e eVar = this.f115753a;
            l.d(eVar, "");
            return tVar.b((aa) new c.d(cVar, eVar)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        }
    }

    public static <T> y<T, T> a(e eVar) {
        l.d(eVar, "");
        if (eVar.f115757c > 10 || eVar.f115757c <= 0) {
            throw new IllegalArgumentException("Priority should be between RxTaskInfo.PRIORITY_BACKGROUND and RxTaskInfo.PRIORITY_IMMEDIATE!".toString());
        } else if (10 == eVar.f115757c) {
            return a.f115752a;
        } else {
            return new b(eVar);
        }
    }
}
