package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.base.a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface k extends a {
    static {
        Covode.recordClassIndex(13817);
    }

    WebResourceResponse a(WebView webView, String str);

    Object a(Context context, Object obj);

    Object a(Object obj, Context context, Object obj2, View view, Object obj3);

    List<String> a();

    List<String> a(String str);

    void a(String str, Context context);

    String b();

    Map<String, String> b(String str);

    void c();
}
