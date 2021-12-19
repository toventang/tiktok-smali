package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.adaptation.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements c.e {

    /* renamed from: a  reason: collision with root package name */
    private final a f93792a;

    static {
        Covode.recordClassIndex(59677);
    }

    k(a aVar) {
        this.f93792a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.c.e
    public final void bm_() {
        a aVar = this.f93792a;
        aVar.bm_();
        aVar.bf = true;
        if (aVar.bl != 4) {
            if (c.f66197m > 0) {
                a.a(aVar.an, c.f66197m);
                a.a(aVar.ap, -2);
            } else {
                a.a(aVar.ap, 0);
            }
            if (c.n > 0) {
                a.a(aVar.ao, c.n);
                a.a(aVar.aq, -2);
            } else {
                a.a(aVar.aq, 0);
            }
        } else {
            a.a(aVar.ap, 0);
            a.a(aVar.aq, 0);
        }
        FeedAdServiceImpl.c().b().a(n.a(d.a()), aVar.N.getHeight());
    }
}
