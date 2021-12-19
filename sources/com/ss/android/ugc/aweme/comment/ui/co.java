package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.a;
import com.ss.android.ugc.aweme.comment.adapter.b;
import com.ss.android.ugc.aweme.common.a.h;
import h.f.b.l;

final /* synthetic */ class co implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72692a;

    static {
        Covode.recordClassIndex(44786);
    }

    co(bz bzVar) {
        this.f72692a = bzVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        a aVar = this.f72692a.U;
        String str = aVar.f71259e.keyword;
        if (str != null && str.length() > 0) {
            b bVar = aVar.f71256b;
            if (bVar == null) {
                l.a("adapter");
            }
            bVar.ag_();
            String str2 = aVar.f71259e.keyword;
            l.b(str2, "");
            aVar.a(str2, 1);
        } else if (l.a((Object) aVar.f71259e.keyword, (Object) "")) {
            b bVar2 = aVar.f71256b;
            if (bVar2 == null) {
                l.a("adapter");
            }
            bVar2.ag_();
            aVar.a(aVar.f71259e.cursor, 1);
        }
    }
}
