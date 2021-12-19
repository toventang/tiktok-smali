package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.service.a;
import com.ss.android.ugc.aweme.commercialize.utils.h;
import com.ss.android.ugc.aweme.commercialize.utils.i;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f76097a;

    static {
        Covode.recordClassIndex(46939);
    }

    m(e eVar) {
        this.f76097a = eVar;
    }

    public final void run() {
        e eVar = this.f76097a;
        if (!eVar.s) {
            eVar.f76068c.a(i.f(eVar.f76067b) || eVar.f76072g == 2);
            int e2 = i.e(eVar.f76067b);
            if (e2 > 0) {
                eVar.o = new h(eVar);
                eVar.q = System.currentTimeMillis();
                eVar.p = (long) (e2 * 1000);
                eVar.n.postDelayed(eVar.o, eVar.p);
            }
            eVar.u = true;
            if (b.B(eVar.f76067b) && !b.l(eVar.f76067b)) {
                b.o(eVar.f76067b);
            }
            eVar.f76078m.a("ON_AD_HALF_WEB_PAGE_SHOW", (Object) null);
            a.f75270a.a().b(eVar.f76067b, 0);
            h.a(eVar.f76067b, false);
            if (eVar.v != null) {
                eVar.v.b().e(eVar.f76067b);
            }
            if (eVar.f76075j.intValue() != -100 || eVar.f76076k.intValue() != -100) {
                r.a("ad_ui_adjust", new d().a("original_time", eVar.f76075j).a("real_time", eVar.f76076k).a("tag", 3).a("is_adjusted", eVar.f76077l).f66730a);
            }
        }
    }
}
