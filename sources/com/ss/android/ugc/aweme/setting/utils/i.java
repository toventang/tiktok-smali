package com.ss.android.ugc.aweme.setting.utils;

import android.content.Context;
import com.bytedance.android.ecommerce.j.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f123041a;

    static {
        Covode.recordClassIndex(80798);
    }

    i(Context context) {
        this.f123041a = context;
    }

    @Override // com.bytedance.android.ecommerce.j.k
    public final void a(String str) {
        Context context = this.f123041a;
        if (!str.startsWith("aweme://webview/")) {
            SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
        } else {
            SmartRouter.buildRoute(context, str).open();
        }
    }
}
