package com.ss.android.ugc.aweme.journey.step.d;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.journey.step.c;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d implements c<a, c> {

    /* renamed from: a  reason: collision with root package name */
    private a f104979a;

    static {
        Covode.recordClassIndex(67306);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final b<c, z> a() {
        return a.f104980a;
    }

    static final class a extends m implements b<c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104980a = new a();

        static {
            Covode.recordClassIndex(67307);
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
        a aVar = new a();
        this.f104979a = aVar;
        return aVar;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        c cVar = (c) obj;
        l.d(cVar, "");
        b<Fragment, z> f2 = cVar.f();
        a aVar = this.f104979a;
        if (aVar == null) {
            l.b();
        }
        f2.invoke(aVar);
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        c cVar = (c) obj;
        l.d(cVar, "");
        if (cVar.h()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                return false;
            }
        }
        if (cVar.i() == null || cVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_DEEPLINK_ID.getId()))) {
            return false;
        }
        return true;
    }
}
