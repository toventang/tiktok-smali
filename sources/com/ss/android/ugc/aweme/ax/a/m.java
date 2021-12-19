package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface m extends s {
    static {
        Covode.recordClassIndex(41704);
    }

    void a(int i2, String str);

    void a(Uri uri);

    void a(SslError sslError);

    void a(WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void a(WebView webView, int i2);

    void a(a aVar);

    void a(String str);

    void a(String str, String str2);

    void a(String str, String str2, String str3, long j2);

    void a(List<String> list);

    void a(boolean z);

    void b(Uri uri);

    void b(String str);

    void e();

    void f();

    void g();

    void h();

    void i();
}
