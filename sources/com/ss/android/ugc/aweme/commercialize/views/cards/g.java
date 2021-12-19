package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.model.f;
import com.ss.android.ugc.aweme.commercialize.model.h;
import com.ss.android.ugc.aweme.commercialize.service.a;
import com.ss.android.ugc.aweme.commercialize.utils.i;
import com.ss.android.ugc.aweme.utils.v;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f76090a;

    /* renamed from: b  reason: collision with root package name */
    private final h f76091b;

    static {
        Covode.recordClassIndex(46933);
    }

    g(e eVar, h hVar) {
        this.f76090a = eVar;
        this.f76091b = hVar;
    }

    public final void run() {
        e eVar = this.f76090a;
        h hVar = this.f76091b;
        if (!eVar.s) {
            String str = hVar.f74892b;
            if (!v.b(eVar.f76067b)) {
                eVar.a("not satisfied");
            } else if (com.ss.android.ugc.aweme.feed.helper.h.a().f93343f) {
                eVar.a("has shown once");
            } else if (eVar.f76067b != null && eVar.f76067b.getAwemeRawAd() != null && eVar.f76067b.getAwemeRawAd().canShowLynxBtn2CardAnim()) {
                eVar.a("lynx card not satisfied");
            } else if (o.b(eVar.f76068c) || eVar.u) {
                eVar.a("already shown once");
            } else if (eVar.f76073h == null || !eVar.f76073h.i()) {
                String b2 = eVar.b(false);
                if (TextUtils.isEmpty(b2) || !TextUtils.equals(str, "passive_show") || !com.ss.android.ugc.aweme.feed.helper.h.a().f93344g) {
                    if (b2 == null) {
                        b2 = eVar.t;
                    }
                    if (!TextUtils.isEmpty(b2)) {
                        eVar.f76078m.a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", b2);
                        a.f75270a.a().b(eVar.f76067b, 1);
                        com.ss.android.ugc.aweme.commercialize.utils.h.a(eVar.f76067b, b2, false);
                        if (eVar.v != null) {
                            eVar.v.b().b(eVar.f76067b, b2);
                            return;
                        }
                        return;
                    }
                    eVar.f76078m.a("AD_ACTION_MOVE_OUT_DESC", Boolean.valueOf(i.f(eVar.f76067b)));
                    eVar.f76078m.a("ON_AD_HALF_WEB_PAGE_SHOW_START", (Object) new f.a().a(new l(eVar)).f75479a);
                    eVar.n.postDelayed(new m(eVar), 200);
                    return;
                }
                eVar.a("search: just enter");
            } else {
                eVar.a("top page is showing");
            }
        }
    }
}
