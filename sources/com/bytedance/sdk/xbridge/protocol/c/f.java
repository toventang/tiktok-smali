package com.bytedance.sdk.xbridge.protocol.c;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public interface f extends g {
    static {
        Covode.recordClassIndex(26858);
    }

    String a();

    void a(g gVar);

    void a(Object obj, String str);

    void a(String str, ValueCallback<String> valueCallback);

    WebView b();
}
