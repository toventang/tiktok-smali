package com.ss.android.ugc.aweme.journey.step.e;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c implements com.ss.android.ugc.aweme.journey.step.c<b, d> {

    /* renamed from: a  reason: collision with root package name */
    private b f105006a;

    static {
        Covode.recordClassIndex(67324);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final b<d, z> a() {
        return a.f105007a;
    }

    static final class a extends m implements b<d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f105007a = new a();

        static {
            Covode.recordClassIndex(67325);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            l.d(dVar, "");
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final /* synthetic */ long a(d dVar) {
        l.d(dVar, "");
        return 0;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        b bVar = new b();
        this.f105006a = bVar;
        return bVar;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        b<Fragment, z> f2 = dVar.f();
        b bVar = this.f105006a;
        if (bVar == null) {
            l.b();
        }
        f2.invoke(bVar);
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        if (dVar.d() == 0 || dVar.d() == 2 || dVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_GENDER_SELECTION.getId())) || dVar.e() == null) {
            return false;
        }
        return true;
    }
}
