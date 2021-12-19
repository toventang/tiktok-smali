package com.ss.android.sdk.webview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.c;
import com.bytedance.falconx.d;
import com.bytedance.falconx.statistic.b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public a f60220a;

    /* renamed from: b  reason: collision with root package name */
    public String f60221b;

    /* renamed from: c  reason: collision with root package name */
    private c f60222c;

    /* renamed from: d  reason: collision with root package name */
    private b f60223d = new b() {
        /* class com.ss.android.sdk.webview.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37196);
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(37197);
        }

        WebResourceResponse a(String str);
    }

    static {
        Covode.recordClassIndex(37195);
    }

    public final synchronized void a() {
        MethodCollector.i(10377);
        this.f60220a = null;
        MethodCollector.o(10377);
    }

    public final h a(boolean z) {
        c cVar = this.f60222c;
        if (cVar != null) {
            cVar.f28781a = z;
        }
        return this;
    }

    private static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public h(String str) {
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        String f2 = com.bytedance.ies.ugc.appcontext.d.f();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (!TextUtils.isEmpty(str)) {
            String g2 = com.ss.android.ugc.aweme.language.d.g();
            this.f60221b = str.substring(str.lastIndexOf("/") + 1);
            d.a aVar = new d.a(a2);
            aVar.f28796b = this.f60221b;
            aVar.f28801g = new ArrayList();
            aVar.f28803i = serverDeviceId;
            aVar.f28797c = f2;
            aVar.f28805k = TextUtils.isEmpty(g2) ? "unknow" : g2;
            aVar.f28804j = "gecko-va.tiktokv.com";
            aVar.f28799e = this.f60223d;
            aVar.f28800f = false;
            aVar.f28802h = Arrays.asList(Uri.fromFile(new File(a(com.bytedance.ies.ugc.appcontext.d.a()), "offlineX")));
            this.f60222c = new c(aVar.a());
        }
    }

    public final h a(List<Pattern> list) {
        String g2 = com.ss.android.ugc.aweme.language.d.g();
        d.a aVar = new d.a(com.bytedance.ies.ugc.appcontext.d.a());
        aVar.f28796b = this.f60221b;
        aVar.f28801g = list;
        aVar.f28804j = "gecko-va.tiktokv.com";
        aVar.f28799e = this.f60223d;
        aVar.f28800f = false;
        aVar.f28802h = Arrays.asList(Uri.fromFile(new File(a(com.bytedance.ies.ugc.appcontext.d.a()), "offlineX")));
        aVar.f28803i = AppLog.getServerDeviceId();
        aVar.f28797c = com.bytedance.ies.ugc.appcontext.d.f();
        if (TextUtils.isEmpty(g2)) {
            g2 = "unknow";
        }
        aVar.f28805k = g2;
        this.f60222c = new c(aVar.a());
        return this;
    }

    public final synchronized WebResourceResponse a(WebView webView, String str) {
        WebResourceResponse a2;
        MethodCollector.i(10376);
        a aVar = this.f60220a;
        if (aVar == null || (a2 = aVar.a(str)) == null) {
            try {
                c cVar = this.f60222c;
                if (cVar != null) {
                    WebResourceResponse a3 = cVar.a(webView, str);
                    MethodCollector.o(10376);
                    return a3;
                }
                MethodCollector.o(10376);
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.o(10376);
                return null;
            }
        } else {
            MethodCollector.o(10376);
            return a2;
        }
    }
}
