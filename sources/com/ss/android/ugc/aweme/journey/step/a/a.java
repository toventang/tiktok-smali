package com.ss.android.ugc.aweme.journey.step.a;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.journey.ae;
import com.ss.android.ugc.aweme.journey.step.c;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a implements c<c, b> {

    /* renamed from: a  reason: collision with root package name */
    private c f104936a;

    static {
        Covode.recordClassIndex(67269);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final b<b, z> a() {
        return C2672a.f104937a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.a.a$a  reason: collision with other inner class name */
    static final class C2672a extends m implements b<b, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2672a f104937a = new C2672a();

        static {
            Covode.recordClassIndex(67270);
        }

        C2672a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            l.d(bVar, "");
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final /* synthetic */ long a(b bVar) {
        l.d(bVar, "");
        return 0;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        c cVar = new c();
        this.f104936a = cVar;
        return cVar;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        b bVar = (b) obj;
        l.d(bVar, "");
        b<Fragment, z> f2 = bVar.f();
        c cVar = this.f104936a;
        if (cVar == null) {
            l.b();
        }
        f2.invoke(cVar);
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        Boolean bool;
        b bVar = (b) obj;
        l.d(bVar, "");
        if (bVar.r() == null) {
            return false;
        }
        ae r = bVar.r();
        if (r != null) {
            bool = r.f104820a;
        } else {
            bool = null;
        }
        if (!(!l.a((Object) bool, (Object) true)) && bVar.b().c() == 1 && !bVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_AD_EXPERIENCE_ID.getId()))) {
            return true;
        }
        return false;
    }
}
