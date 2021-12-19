package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.h.e;
import com.ss.android.ugc.aweme.filter.repository.a.c;
import com.ss.android.ugc.aweme.filter.repository.internal.h;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.z;
import h.f.b.l;

public final class j extends e<com.ss.android.ugc.aweme.filter.repository.internal.a> implements h {

    /* renamed from: a  reason: collision with root package name */
    final com.ss.android.ugc.aweme.filter.repository.internal.e f95723a;

    static {
        Covode.recordClassIndex(60651);
    }

    @Override // com.bytedance.jedi.a.h.a
    public final t<com.ss.android.ugc.aweme.filter.repository.internal.a> b() {
        t<com.ss.android.ugc.aweme.filter.repository.internal.a> a2 = t.a(new a(this));
        l.b(a2, "");
        return a2;
    }

    public j(com.ss.android.ugc.aweme.filter.repository.internal.e eVar) {
        l.d(eVar, "");
        this.f95723a = eVar;
    }

    static final class a<T> implements w<com.ss.android.ugc.aweme.filter.repository.internal.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f95724a;

        static {
            Covode.recordClassIndex(60652);
        }

        a(j jVar) {
            this.f95724a = jVar;
        }

        @Override // f.a.w
        public final void subscribe(v<com.ss.android.ugc.aweme.filter.repository.internal.a> vVar) {
            l.d(vVar, "");
            vVar.a(new com.ss.android.ugc.aweme.filter.repository.internal.a(new c(this.f95724a.f95723a.a(), z.INSTANCE), true));
            vVar.a();
        }
    }
}
