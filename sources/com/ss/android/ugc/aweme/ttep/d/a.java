package com.ss.android.ugc.aweme.ttep.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.cy.b;
import com.ss.android.ugc.aweme.cy.e;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.b.l;
import h.f.b.m;

public final class a implements com.ss.android.ugc.aweme.cy.a {
    static {
        Covode.recordClassIndex(92299);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.d.a$a  reason: collision with other inner class name */
    static final class C3746a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ b.c $state;

        static {
            Covode.recordClassIndex(92300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3746a(b.c cVar) {
            super(0);
            this.$state = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.$state.f79207b);
        }
    }

    @Override // com.ss.android.ugc.aweme.cy.a
    public final b.a a(f fVar, e eVar, b.c cVar) {
        l.d(fVar, "");
        l.d(eVar, "");
        l.d(cVar, "");
        l.b(fVar.a(ShortVideoContext.class, (String) null), "");
        com.ss.android.ugc.aweme.beauty.f.a();
        b.a aVar = new b.a();
        aVar.a(eVar.a(), b.a.C1842a.f79205a).a(eVar.l(), new C3746a(cVar));
        return aVar;
    }
}
