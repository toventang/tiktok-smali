package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.model.f;
import com.ss.android.ugc.aweme.commercialize.model.h;
import com.ss.android.ugc.aweme.commercialize.utils.i;

final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final p f76123a;

    /* renamed from: b  reason: collision with root package name */
    private final h f76124b;

    static {
        Covode.recordClassIndex(46951);
    }

    r(p pVar, h hVar) {
        this.f76123a = pVar;
        this.f76124b = hVar;
    }

    public final void run() {
        p pVar = this.f76123a;
        h hVar = this.f76124b;
        if (!pVar.s) {
            String str = hVar.f74892b;
            if (b.f73781b.a() != null && !b.f73781b.a().p(pVar.f76101b)) {
                pVar.a("not satisfied");
            } else if (b.f73781b.a() != null && b.f73781b.a().d()) {
                pVar.a("has shown once");
            } else if (o.b(pVar.f76102c) || pVar.u) {
                pVar.a("already shown once");
            } else if (pVar.f76107h == null || !pVar.f76107h.i()) {
                String b2 = pVar.b(false);
                if (TextUtils.isEmpty(b2) || !TextUtils.equals(str, "passive_show") || b.f73781b.a() == null || !b.f73781b.a().e()) {
                    if (b2 == null) {
                        b2 = pVar.t;
                    }
                    if (!TextUtils.isEmpty(b2)) {
                        pVar.f76109j.a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", b2);
                        if (b.f73781b.a() != null) {
                            d.f74778a.b(pVar.f76101b, 0);
                            b.f73781b.a().a(pVar.f76101b, false, b2);
                        }
                        ac.f76047a.b(pVar.f76101b, b2);
                        return;
                    }
                    pVar.f76109j.a("AD_ACTION_MOVE_OUT_DESC", Boolean.valueOf(i.f(pVar.f76101b)));
                    pVar.f76109j.a("ON_AD_HALF_WEB_PAGE_SHOW_START", (Object) new f.a().a(new x(pVar)).f75479a);
                    pVar.f76110k.postDelayed(new y(pVar), 200);
                    return;
                }
                pVar.a("search: just enter");
            } else {
                pVar.a("top page is showing");
            }
        }
    }
}
