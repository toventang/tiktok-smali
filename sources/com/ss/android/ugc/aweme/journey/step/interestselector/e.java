package com.ss.android.ugc.aweme.journey.step.interestselector;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.gz;
import com.ss.android.ugc.aweme.journey.step.c;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class e implements c<com.ss.android.ugc.aweme.base.f.a, c> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f105083a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.base.f.a f105084b;

    static {
        Covode.recordClassIndex(67382);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67383);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final h.f.a.b<c, z> a() {
        return b.f105085a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final /* synthetic */ long a(c cVar) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        if (cVar2.k()) {
            return 1000;
        }
        return 0;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        com.ss.android.ugc.aweme.base.f.a fVar;
        l.d(obj, "");
        if (gz.a()) {
            fVar = new d();
        } else {
            fVar = new f();
        }
        this.f105084b = fVar;
        return fVar;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        c cVar = (c) obj;
        l.d(cVar, "");
        h.f.a.b<Fragment, z> f2 = cVar.f();
        com.ss.android.ugc.aweme.base.f.a aVar = this.f105084b;
        if (aVar == null) {
            l.b();
        }
        f2.invoke(aVar);
    }

    static final class b extends m implements h.f.a.b<c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f105085a = new b();

        static {
            Covode.recordClassIndex(67384);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            r.a("need_show_interest_selection", new d().a("backend_response_received", com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.contains("response_received") ? 1 : 0).a("used_default_interest_data", cVar2.k() ? 1 : 0).f66730a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        c cVar = (c) obj;
        l.d(cVar, "");
        if (cVar.b().c() != 1 || cVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_INTERESTS_ID.getId()))) {
            return false;
        }
        return true;
    }
}
