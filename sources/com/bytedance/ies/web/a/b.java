package com.bytedance.ies.web.a;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tiktok.security.b.h;
import com.ss.android.ugc.tiktok.security.b.i;
import java.util.Map;

public final class b extends WebView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f35527a;

    /* renamed from: b  reason: collision with root package name */
    private g f35528b;

    static {
        Covode.recordClassIndex(21241);
    }

    public final void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public final void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public final void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public final void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public final void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    private boolean a() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public final int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public final String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public final int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public final String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void goBack() {
        if (!i.b(this)) {
            try {
                super.goBack();
            } catch (Exception unused) {
            }
        }
    }

    public final boolean canGoBack() {
        if (!a() || !i.a(this)) {
            return false;
        }
        return true;
    }

    public final void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public final void goBackOrForward(int i2) {
        try {
            super.goBackOrForward(i2);
        } catch (Exception unused) {
        }
    }

    public final void setBackgroundColor(int i2) {
        try {
            super.setBackgroundColor(i2);
        } catch (Exception unused) {
        }
    }

    public final void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public final void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public final void setWebViewUrlFilter(g gVar) {
        this.f35528b = gVar;
    }

    public final boolean canGoBackOrForward(int i2) {
        try {
            return super.canGoBackOrForward(i2);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    private String a(String str) {
        g gVar = this.f35528b;
        if (gVar != null) {
            return gVar.a();
        }
        return str;
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        boolean z;
        try {
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient != null) {
                z = true;
            } else {
                z = false;
            }
            this.f35527a = z;
        } catch (Exception unused) {
            this.f35527a = false;
        }
    }

    public final void loadUrl(String str) {
        MethodCollector.i(8913);
        String a2 = i.f149045a.a(this, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        try {
            String a3 = a(str);
            String a4 = h.f149026a.a(this, a3);
            if (!TextUtils.isEmpty(a4)) {
                a3 = a4;
            }
            super.loadUrl(a3);
            MethodCollector.o(8913);
        } catch (Exception unused) {
            MethodCollector.o(8913);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (com.ss.android.ugc.tiktok.security.c.b.a() && webViewClient != null) {
                WebSettings settings = getSettings();
                String userAgentString = settings.getUserAgentString();
                if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                    StringBuilder sb = new StringBuilder(userAgentString);
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(" ");
                    }
                    sb.append("BytedanceWebview/d8a21c6");
                    settings.setUserAgentString(sb.toString());
                }
            }
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public final void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(a(str), bArr);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        MethodCollector.i(8911);
        String a2 = i.f149045a.a(this, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        try {
            String a3 = a(str);
            String a4 = h.f149026a.a(this, a3);
            if (!TextUtils.isEmpty(a4)) {
                a3 = a4;
            }
            super.loadUrl(a3, map);
            MethodCollector.o(8911);
        } catch (Exception unused) {
            MethodCollector.o(8911);
        }
    }

    public final void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
