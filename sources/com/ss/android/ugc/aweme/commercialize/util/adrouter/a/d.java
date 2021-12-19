package com.ss.android.ugc.aweme.commercialize.util.adrouter.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import h.f.b.l;

public final class d extends a {
    static {
        Covode.recordClassIndex(46539);
    }

    private final String e() {
        if (!TextUtils.isEmpty(d().f75410d.f75437a)) {
            return d().f75410d.f75437a;
        }
        return d().f75409c.f75440a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean a() {
        if (TextUtils.isEmpty(e())) {
            return false;
        }
        return com.ss.android.ugc.aweme.miniapp_api.d.c(e());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean b() {
        c cVar = c.a.f109704a;
        l.b(cVar, "");
        IMiniAppService a2 = cVar.a();
        if (a2 == null || !a2.openMiniApp(c(), e(), new a())) {
            return false;
        }
        return true;
    }
}
