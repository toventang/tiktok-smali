package com.ss.android.ugc.aweme.bullet.business;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.f.a.b;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.j;
import com.ss.android.ugc.aweme.ad.utils.a;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.tiktok.security.b.h;
import h.f.b.l;

public final class XpathBusiness extends BulletBusinessService.Business {
    static {
        Covode.recordClassIndex(42698);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XpathBusiness(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public final void xpathDirect(WebView webView) {
        long j2;
        d<String> dVar;
        j jVar;
        Long l2;
        MethodCollector.i(9969);
        b bVar = this.f69222k.f69252a;
        String str = null;
        if (!(bVar instanceof com.ss.android.ugc.aweme.bullet.module.ad.j)) {
            bVar = null;
        }
        com.ss.android.ugc.aweme.bullet.module.ad.j jVar2 = (com.ss.android.ugc.aweme.bullet.module.ad.j) bVar;
        if (jVar2 == null || (jVar = jVar2.Y) == null || (l2 = (Long) jVar.b()) == null) {
            j2 = 0;
        } else {
            j2 = l2.longValue();
        }
        b bVar2 = this.f69222k.f69252a;
        if (!(bVar2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.j)) {
            bVar2 = null;
        }
        com.ss.android.ugc.aweme.bullet.module.ad.j jVar3 = (com.ss.android.ugc.aweme.bullet.module.ad.j) bVar2;
        if (!(jVar3 == null || (dVar = jVar3.ap) == null)) {
            str = dVar.b();
        }
        if (j2 > 0 && !TextUtils.isEmpty(str)) {
            String a2 = a.a(str, j2);
            if (a2 == null) {
                a2 = "";
            }
            if (!TextUtils.isEmpty(a2) && webView != null) {
                String a3 = h.f149026a.a(webView, a2);
                if (!TextUtils.isEmpty(a3)) {
                    a2 = a3;
                }
                webView.loadUrl(a2);
                MethodCollector.o(9969);
                return;
            }
        }
        MethodCollector.o(9969);
    }
}
