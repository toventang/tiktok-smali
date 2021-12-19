package com.ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.ss.android.ugc.tiktok.security.b.h;

public class XpathBusiness extends BusinessService.Business {
    static {
        Covode.recordClassIndex(48837);
    }

    XpathBusiness(e eVar) {
        super(eVar);
    }

    public void xpathDirect(a aVar, WebView webView) {
        MethodCollector.i(12054);
        if (aVar == null) {
            MethodCollector.o(12054);
            return;
        }
        long j2 = aVar.f78742b.f78759a;
        String str = aVar.f78742b.q;
        if (j2 > 0 && !TextUtils.isEmpty(str)) {
            String a2 = com.ss.android.ugc.aweme.ad.utils.a.a(str, j2);
            if (!TextUtils.isEmpty(a2) && webView != null) {
                String a3 = h.f149026a.a(webView, a2);
                if (!TextUtils.isEmpty(a3)) {
                    a2 = a3;
                }
                webView.loadUrl(a2);
            }
        }
        MethodCollector.o(12054);
    }
}
