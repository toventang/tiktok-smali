package com.bytedance.ies.bullet.kit.web;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.m;
import com.bytedance.ies.bullet.c.e.a.b;
import java.util.Map;

public interface f extends m {
    static {
        Covode.recordClassIndex(19201);
    }

    a a();

    Map<String, Object> a(c cVar, b bVar);

    void a(WebSettings webSettings, WebView webView);

    com.bytedance.ies.bullet.kit.web.b.b b();
}
