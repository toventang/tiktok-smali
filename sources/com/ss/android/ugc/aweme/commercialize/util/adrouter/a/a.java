package com.ss.android.ugc.aweme.commercialize.util.adrouter.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.b;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.e;
import h.f.b.l;
import org.json.JSONObject;

public abstract class a implements e {

    /* renamed from: b  reason: collision with root package name */
    public Context f75401b;

    /* renamed from: c  reason: collision with root package name */
    public b f75402c;

    static {
        Covode.recordClassIndex(46535);
    }

    public void a(boolean z, b bVar) {
        l.d(bVar, "");
    }

    public final Context c() {
        Context context = this.f75401b;
        if (context == null) {
            l.a("context");
        }
        return context;
    }

    public final b d() {
        b bVar = this.f75402c;
        if (bVar == null) {
            l.a("params");
        }
        return bVar;
    }

    public static boolean a(Context context, Intent intent) {
        com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_WebUrlHandler_startActivity", (JSONObject) null, "begin", (String) null);
        if (context == null || intent == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_WebUrlHandler_startActivity", (JSONObject) null, "try", (String) null);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException unused) {
            com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_WebUrlHandler_startActivity", (JSONObject) null, "fail", (String) null);
            return false;
        }
    }
}
