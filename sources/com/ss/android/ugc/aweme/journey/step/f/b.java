package com.ss.android.ugc.aweme.journey.step.f;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.journey.step.c;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b implements c<a, c> {

    /* renamed from: a  reason: collision with root package name */
    private a f105009a;

    static {
        Covode.recordClassIndex(67329);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final h.f.a.b<c, z> a() {
        return new a(this);
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
        this.f105009a = aVar;
        return aVar;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        c cVar = (c) obj;
        l.d(cVar, "");
        h.f.a.b<Fragment, z> f2 = cVar.f();
        a aVar = this.f105009a;
        if (aVar == null) {
            l.b();
        }
        f2.invoke(aVar);
    }

    static final class a extends m implements h.f.a.b<c, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.language.b n = cVar2.n();
            if (n == null || TextUtils.equals(n.f(), cVar2.o().f())) {
                cVar2.p().invoke();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        c cVar = (c) obj;
        l.d(cVar, "");
        if (cVar.m() && !cVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID.getId()))) {
            return true;
        }
        return false;
    }
}
