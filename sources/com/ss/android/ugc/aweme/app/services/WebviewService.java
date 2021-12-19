package com.ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import h.f.b.l;

public final class WebviewService implements IWebViewService {
    static {
        Covode.recordClassIndex(41190);
    }

    @Override // com.ss.android.ugc.aweme.app.services.IWebViewService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview/");
        if (!(context instanceof Activity)) {
            buildRoute.addFlags(268435456);
        }
        buildRoute.withParam("url", str).withParam("hide_nav_bar", true).open();
    }
}
