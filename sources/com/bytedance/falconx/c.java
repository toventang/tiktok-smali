package com.bytedance.falconx;

import android.os.SystemClock;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.a.a;
import com.bytedance.falconx.a.b;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.falconx.statistic.d;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28781a = true;

    /* renamed from: b  reason: collision with root package name */
    private d f28782b;

    /* renamed from: c  reason: collision with root package name */
    private a f28783c;

    static {
        Covode.recordClassIndex(16923);
    }

    public c(d dVar) {
        if (dVar != null) {
            this.f28782b = dVar;
            d.a().f28810b = this.f28782b;
            this.f28783c = new a(this.f28782b);
            d dVar2 = this.f28782b;
            if (b.f28775a) {
                if (a.f28761a == null) {
                    a.f28761a = new ArrayList();
                }
                com.bytedance.falconx.a.a.a aVar = new com.bytedance.falconx.a.a.a(dVar2.f28785b, dVar2.f28786c, dVar2.f28787d, dVar2.f28789f, dVar2.f28791h, dVar2.f28792i, dVar2.f28793j, dVar2.f28794k);
                if (!a.f28761a.contains(aVar)) {
                    a.f28761a.add(aVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("config == null");
    }

    public final WebResourceResponse a(WebView webView, String str) {
        if (!this.f28781a) {
            return null;
        }
        try {
            List<b> list = this.f28782b.f28788e;
            if (list != null && !list.isEmpty()) {
                InterceptorModel interceptorModel = new InterceptorModel();
                for (b bVar : list) {
                    interceptorModel.startTime = Long.valueOf(SystemClock.uptimeMillis());
                    WebResourceResponse a2 = bVar.a(webView, str);
                    if (a2 != null) {
                        interceptorModel.loadFinish(true);
                        interceptorModel.url = str;
                        interceptorModel.mimeType = a2.getMimeType();
                        e.a(webView, interceptorModel, false);
                        return a2;
                    }
                }
            }
            return this.f28783c.a(webView, str);
        } catch (Throwable unused) {
            com.bytedance.geckox.i.a.a();
            return null;
        }
    }
}
