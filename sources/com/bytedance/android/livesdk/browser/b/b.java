package com.bytedance.android.livesdk.browser.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.a;
import com.bytedance.android.livesdk.livesetting.hybrid.WebviewDestroyModeSetting;
import com.bytedance.android.livesdk.util.d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Locale;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f14282a;

    static {
        Covode.recordClassIndex(7917);
    }

    private b() {
    }

    @Override // com.bytedance.android.livesdk.browser.b.a
    public final int a() {
        int value = WebviewDestroyModeSetting.INSTANCE.getValue();
        if (value == 1 || value == 0 || value == 2) {
            return value;
        }
        return 2;
    }

    public static a b() {
        MethodCollector.i(9297);
        if (f14282a == null) {
            synchronized (b.class) {
                try {
                    if (f14282a == null) {
                        f14282a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9297);
                    throw th;
                }
            }
        }
        b bVar = f14282a;
        MethodCollector.o(9297);
        return bVar;
    }

    @Override // com.bytedance.android.livesdk.browser.b.a
    public final void a(WebView webView) {
        String country;
        Context context = webView.getContext();
        String a2 = a.a(context, webView);
        if (a2 == null) {
            a2 = "";
        }
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (context != null) {
            locale = context.getResources().getConfiguration().locale;
        }
        IHostContext iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class);
        if (!TextUtils.isEmpty(a2) && iHostContext != null) {
            StringBuilder append = new StringBuilder().append(a2).append(" ").append(iHostContext.appName()).append("_").append(iHostContext.getVersionCode()).append(" AppVersion/").append(iHostContext.getVersionCode()).append(" JsSdk/2.0 NetType/");
            Context context2 = iHostContext.context();
            if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
                j.f107227f = NetworkUtils.getNetworkAccessType(context2);
            }
            StringBuilder append2 = append.append(j.f107227f.toUpperCase()).append(" Channel/").append(iHostContext.getChannel()).append(" ByteLocale/").append(locale.toString()).append(" Webcast_ByteLocale/").append(d.a(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).currentLocale())).append(" Region/");
            if (!TextUtils.isEmpty(com.bytedance.android.live.core.b.a.b())) {
                country = com.bytedance.android.live.core.b.a.b();
            } else {
                country = Locale.getDefault().getCountry();
                if (TextUtils.isEmpty(country)) {
                    country = "US";
                }
            }
            a2 = append2.append(country).append(" App/").append(iHostContext.appName()).append(" WebcastSDK/2160").toString();
        }
        if (!TextUtils.isEmpty(a2)) {
            com.a.a(webView.getSettings(), a2);
        }
    }
}
