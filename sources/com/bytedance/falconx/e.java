package com.bytedance.falconx;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.statistic.InterceptorModel;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static a f28806a;

    public interface a {
        static {
            Covode.recordClassIndex(16929);
        }

        void a(WebView webView, InterceptorModel interceptorModel, boolean z);
    }

    static {
        Covode.recordClassIndex(16928);
    }

    public static void a(WebView webView, InterceptorModel interceptorModel, boolean z) {
        a aVar = f28806a;
        if (aVar != null) {
            aVar.a(webView, interceptorModel, z);
        }
    }
}
