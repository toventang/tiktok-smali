package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.utils.i;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final p f76131a;

    static {
        Covode.recordClassIndex(46958);
    }

    y(p pVar) {
        this.f76131a = pVar;
    }

    public final void run() {
        p pVar = this.f76131a;
        if (!pVar.s) {
            pVar.f76102c.a(i.f(pVar.f76101b) || pVar.f76106g == 2);
            int e2 = i.e(pVar.f76101b);
            if (e2 > 0) {
                pVar.f76111l = new s(pVar);
                pVar.n = System.currentTimeMillis();
                pVar.f76112m = (long) (e2 * 1000);
                pVar.f76110k.postDelayed(pVar.f76111l, pVar.f76112m);
            }
            pVar.u = true;
            if (b.f73781b.a() != null && b.f73781b.a().q(pVar.f76101b) && !b.f73781b.a().r(pVar.f76101b)) {
                b.f73781b.a().s(pVar.f76101b);
            }
            pVar.f76109j.a("ON_AD_HALF_WEB_PAGE_SHOW", (Object) null);
            if (b.f73781b.a() != null) {
                d.f74778a.b(pVar.f76101b, 1);
                b.f73781b.a().a(pVar.f76101b, true, "");
            }
            ac.f76047a.e(pVar.f76101b);
            if (pVar.o.intValue() != -100 || pVar.p.intValue() != -100) {
                r.a("ad_ui_adjust", new com.ss.android.ugc.aweme.app.f.d().a("original_time", pVar.o).a("real_time", pVar.p).a("tag", 3).a("is_adjusted", pVar.q).f66730a);
            }
        }
    }
}
