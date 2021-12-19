package com.ss.android.ugc.aweme.journey.step.c;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cq;
import com.ss.android.ugc.aweme.journey.step.c;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d implements c<b, c> {

    /* renamed from: a  reason: collision with root package name */
    private b f104971a;

    static {
        Covode.recordClassIndex(67299);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final b<c, z> a() {
        return a.f104972a;
    }

    static final class a extends m implements b<c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104972a = new a();

        static {
            Covode.recordClassIndex(67300);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c cVar) {
            l.d(cVar, "");
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final /* synthetic */ long a(c cVar) {
        l.d(cVar, "");
        return 0;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        b bVar = new b();
        this.f104971a = bVar;
        return bVar;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        c cVar = (c) obj;
        l.d(cVar, "");
        b<Fragment, z> f2 = cVar.f();
        b bVar = this.f104971a;
        if (bVar == null) {
            l.b();
        }
        f2.invoke(bVar);
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        c cVar = (c) obj;
        l.d(cVar, "");
        if (cVar.q() != null && !cq.f78276a.c() && !cVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_CONTENT_LANGUAGE_ID.getId()))) {
            return true;
        }
        return false;
    }
}
