package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ax.a.m;
import com.ss.android.ugc.aweme.ax.a.v;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f78904a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(48966);
    }

    public static void a(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    static void a(String str, com.ss.android.ugc.aweme.ax.a.k kVar) {
        m mVar;
        if (str != null) {
            d.a.a();
            if (kVar != null) {
                mVar = (m) kVar.a(m.class);
            } else {
                mVar = null;
            }
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            d.a(mVar, "webview_safe_log", "filter_scheme", new v(parse, "intent_scheme_", null, 4).getFormatData(), null, null);
        }
    }
}
