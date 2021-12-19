package com.ss.android.ugc.aweme.qrcode.c;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.ck.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.miniapp_api.d;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.qrcode.c.a;

public final class e extends a {
    static {
        Covode.recordClassIndex(77775);
    }

    public e(a.AbstractC3089a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final boolean a(String str, int i2) {
        Activity j2;
        if (TextUtils.isEmpty(str) || (j2 = f.j()) == null) {
            return false;
        }
        IMiniAppService a2 = c.a.f109704a.a();
        a.C2810a aVar = new a.C2810a();
        aVar.f109680b = "scan";
        aVar.f109681c = "021002";
        com.ss.android.ugc.aweme.miniapp_api.model.b.a a3 = aVar.a();
        if (!d.c(str)) {
            return false;
        }
        a2.openMiniApp(j2, str, a3);
        r.a("enter_microapp", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "scan").a("enter_method", "scan_cam").a("microapp_id", v.b(str, "app_id")).f66730a);
        return true;
    }
}
