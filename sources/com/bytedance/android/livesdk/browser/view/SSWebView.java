package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.livesdk.browser.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.ies.web.jsbridge2.t;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.feed.experiment.ag;
import com.ss.android.ugc.tiktok.security.b.h;
import com.ss.android.ugc.tiktok.security.c.b;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SSWebView extends WebView implements t {
    private String pageStartUrl;

    static {
        Covode.recordClassIndex(8222);
    }

    static /* synthetic */ void access$000(WebView webView, String str, Map map) {
        MethodCollector.i(10641);
        super.loadUrl(str, map);
        MethodCollector.o(10641);
    }

    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.t
    public String getSafeUrl() {
        return this.pageStartUrl;
    }

    public void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public void goBackOrForward(int i2) {
        try {
            super.goBackOrForward(i2);
        } catch (Exception unused) {
        }
    }

    public void setBackgroundColor(int i2) {
        try {
            super.setBackgroundColor(i2);
        } catch (Exception unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setPageStartUrl(String str) {
        this.pageStartUrl = str;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(this, webViewClient);
        } catch (Exception unused) {
        }
    }

    private static boolean isSafeHost(String str) {
        return a.a(str);
    }

    public boolean canGoBackOrForward(int i2) {
        try {
            return super.canGoBackOrForward(i2);
        } catch (Exception unused) {
            return false;
        }
    }

    public SSWebView(Context context) {
        super(context);
        MethodCollector.i(10475);
        MethodCollector.o(10475);
    }

    public void loadUrl(String str) {
        try {
            String filterUrl = filterUrl(str);
            com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(this, filterUrl, requestHeader(filterUrl, null));
        } catch (Exception unused) {
        }
    }

    public void setOverScrollMode(int i2) {
        try {
            super.setOverScrollMode(i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private String filterUrl(String str) {
        boolean z;
        MethodCollector.i(10650);
        Context context = getContext();
        if (context != null) {
            if (m.a(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                com.bytedance.ttnet.a.a.a(context);
                str = com.bytedance.ttnet.a.a.e(str);
            }
        }
        try {
            if (((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isLocalTest() && getContext().getAssets() != null && getContext().getAssets().list("") != null && Arrays.asList(getContext().getAssets().list("")).contains("ttnet_config.json")) {
                str = tryReplaceUrlToBoe(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        syncCookie(str);
        MethodCollector.o(10650);
        return str;
    }

    private void syncCookie(String str) {
        String str2;
        String[] split;
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        List<String> a2 = ((k) com.bytedance.android.live.t.a.a(k.class)).a(str);
        com.bytedance.android.live.core.c.a.a(3, "Cookie_Share", "url:".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = "";
        }
        if (!(a2 == null || str2 == null)) {
            for (int i2 = 0; i2 < a2.size(); i2++) {
                String str3 = a2.get(i2);
                for (String str4 : str3.split(";")) {
                    String replace = str4.replace(" ", "");
                    com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_setCookie(instance, str2, replace);
                    com.bytedance.android.live.core.c.a.a(3, "Cookie_Share", "set cookie:".concat(String.valueOf(replace)));
                }
                com.bytedance.android.live.core.c.a.a(3, "Cookie_Share", "cookies:".concat(String.valueOf(str3)));
            }
        }
    }

    private String tryReplaceUrlToBoe(String str) {
        if (str == null) {
            return str;
        }
        try {
            URI create = URI.create(str);
            create.getHost();
            if (m.a("")) {
                return str;
            }
            String scheme = create.getScheme();
            int port = create.getPort();
            String rawPath = create.getRawPath();
            String rawQuery = create.getRawQuery();
            String rawFragment = create.getRawFragment();
            StringBuilder sb = new StringBuilder();
            if (scheme != null) {
                sb.append(scheme);
                sb.append("://");
            }
            sb.append("");
            if (port > 0) {
                sb.append(':');
                sb.append(port);
            }
            if (rawPath == null || !rawPath.startsWith("/")) {
                sb.append('/');
            }
            if (rawPath != null) {
                sb.append(rawPath);
            }
            if (rawQuery != null) {
                sb.append('?');
                sb.append(rawQuery);
            }
            if (rawFragment != null) {
                sb.append('#');
                sb.append(rawFragment);
            }
            return new URI(sb.toString()).toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (Exception unused) {
        }
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(filterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10476);
        MethodCollector.o(10476);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        try {
            String filterUrl = filterUrl(str);
            com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(this, filterUrl, requestHeader(filterUrl, map));
        } catch (Exception unused) {
        }
    }

    public static void com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(WebView webView, WebViewClient webViewClient) {
        if (b.a() && webViewClient != null) {
            WebSettings settings = webView.getSettings();
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
    }

    private static Map<String, String> requestHeader(String str, Map<String, String> map) {
        Map<String, String> emptyMap;
        if (isSafeHost(str)) {
            emptyMap = ((k) com.bytedance.android.live.t.a.a(k.class)).b(str);
        } else {
            emptyMap = Collections.emptyMap();
        }
        if (emptyMap == null || emptyMap.isEmpty()) {
            return map;
        }
        if (map == null || map.isEmpty()) {
            return emptyMap;
        }
        HashMap hashMap = new HashMap(map);
        for (Map.Entry<String, String> entry : emptyMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public static void com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(WebView webView, String str, Map map) {
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        access$000(webView, str, map);
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(10638);
        MethodCollector.o(10638);
    }

    public static void com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_setCookie(CookieManager cookieManager, String str, String str2) {
        String cookie;
        cookieManager.setCookie(str, str2);
        if (f.a(g.a()) && ag.a() && (cookie = CookieManager.getInstance().getCookie(com.ss.android.ugc.aweme.feed.f.a.a())) != null && !TextUtils.equals(cookie, com.ss.android.ugc.aweme.feed.f.a.b())) {
            com.ss.android.ugc.aweme.feed.f.a.a(com.ss.android.ugc.aweme.feed.f.a.a(), cookie);
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
