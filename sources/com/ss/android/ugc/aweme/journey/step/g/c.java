package com.ss.android.ugc.aweme.journey.step.g;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c implements com.ss.android.ugc.aweme.journey.step.c<e, d> {

    /* renamed from: a  reason: collision with root package name */
    private e f105028a;

    static {
        Covode.recordClassIndex(67343);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final b<d, z> a() {
        return a.f105029a;
    }

    static final class a extends m implements b<d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f105029a = new a();

        static {
            Covode.recordClassIndex(67344);
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
    public final /* synthetic */ boolean a(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        if (dVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_SLOGAN_ID.getId()))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        b<Fragment, z> g2 = dVar.g();
        e eVar = this.f105028a;
        if (eVar == null) {
            l.b();
        }
        g2.invoke(eVar);
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        boolean z;
        d dVar = (d) obj;
        l.d(dVar, "");
        this.f105028a = new a();
        Bundle bundle = new Bundle();
        if (dVar.s() > 0) {
            bundle.putInt("extra_optimize_option", dVar.s());
            bundle.putBoolean("extra_is_saveinstance", dVar.t());
        }
        bundle.putBoolean("extra_require_login", dVar.u());
        if (dVar.b().c() == 3) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("extra_new_version", z);
        e eVar = this.f105028a;
        if (eVar == null) {
            l.b();
        }
        eVar.setArguments(bundle);
        return this.f105028a;
    }
}
