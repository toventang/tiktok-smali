package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.a.b.a;
import com.ss.android.ugc.tiktok.security.b.h;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends af {

    /* renamed from: k  reason: collision with root package name */
    private static final String f48623k = n.class.getName();

    /* renamed from: l  reason: collision with root package name */
    private boolean f48624l;

    static {
        Covode.recordClassIndex(29330);
    }

    @Override // com.facebook.internal.af
    public void cancel() {
        MethodCollector.i(8434);
        WebView webView = this.f48532d;
        if (!this.f48538j || this.f48536h || webView == null || !webView.isShown()) {
            super.cancel();
            MethodCollector.o(8434);
        } else if (this.f48624l) {
            MethodCollector.o(8434);
        } else {
            this.f48624l = true;
            String concat = "javascript:".concat("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            String a2 = h.f149026a.a(webView, concat);
            if (!TextUtils.isEmpty(a2)) {
                concat = a2;
            }
            webView.loadUrl(concat);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.facebook.internal.n.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29331);
                }

                public final void run() {
                    if (!a.a(this)) {
                        try {
                            n.super.cancel();
                        } catch (Throwable th) {
                            a.a(th, this);
                        }
                    }
                }
            }, 1500);
            MethodCollector.o(8434);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.af
    public final Bundle a(String str) {
        Bundle c2 = ad.c(Uri.parse(str).getQuery());
        String string = c2.getString("bridge_args");
        c2.remove("bridge_args");
        if (!ad.a(string)) {
            try {
                c2.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", d.a(new JSONObject(string)));
            } catch (JSONException unused) {
                ad.d(f48623k);
            }
        }
        String string2 = c2.getString("method_results");
        c2.remove("method_results");
        if (!ad.a(string2)) {
            if (ad.a(string2)) {
                string2 = "{}";
            }
            try {
                c2.putBundle("com.facebook.platform.protocol.RESULT_ARGS", d.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                ad.d(f48623k);
            }
        }
        c2.remove("version");
        c2.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", y.a());
        return c2;
    }

    private n(Context context, String str, String str2) {
        super(context, str);
        this.f48530b = str2;
    }

    public static n a(Context context, String str, String str2) {
        af.a(context);
        return new n(context, str, str2);
    }
}
