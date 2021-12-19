package com.ss.android.newmedia.e.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.h.j;
import androidx.core.h.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tiktok.security.b.h;
import com.ss.android.ugc.tiktok.security.c.b;
import java.util.Map;

public class d extends WebView implements j {
    private static final String TAG = d.class.getSimpleName();
    public boolean canTouch = true;
    private long lastCickTime;
    private m mChildHelper;
    private int mLastY;
    private int mNestedOffsetY;
    private int[] mScrollConsumed;
    private int[] mScrollOffset;
    private long startClickTime;
    private int timeInterval = 500;

    static /* synthetic */ void access$000(WebView webView, String str, Map map) {
        MethodCollector.i(10008);
        super.loadUrl(str, map);
        MethodCollector.o(10008);
    }

    static /* synthetic */ void access$001(WebView webView, String str) {
        MethodCollector.i(10173);
        super.loadUrl(str);
        MethodCollector.o(10173);
    }

    public static int com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    private String fileterUrl(String str) {
        return str;
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

    public int getTimeInterval() {
        int i2 = this.timeInterval;
        if (i2 > 0) {
            return i2;
        }
        return 500;
    }

    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.a(0);
    }

    @Override // androidx.core.h.j
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.f2548a;
    }

    @Override // androidx.core.h.j
    public void stopNestedScroll() {
        this.mChildHelper.b(0);
    }

    static {
        Covode.recordClassIndex(37056);
    }

    private void initNestedScrolling() {
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mChildHelper = new m(this);
        setNestedScrollingEnabled(false);
    }

    public boolean hasClickInTimeInterval() {
        long currentTimeMillis = System.currentTimeMillis() - this.lastCickTime;
        com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_aweme_lancet_LogLancet_i(TAG, "interval:".concat(String.valueOf(currentTimeMillis)));
        if (currentTimeMillis < ((long) getTimeInterval())) {
            return true;
        }
        return false;
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

    public void setCanTouch(boolean z) {
        this.canTouch = z;
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

    public void setTimeInterval(int i2) {
        this.timeInterval = i2;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(this, webViewClient);
        } catch (Exception unused) {
        }
    }

    public boolean canGoBackOrForward(int i2) {
        try {
            return super.canGoBackOrForward(i2);
        } catch (Exception unused) {
            return false;
        }
    }

    public void loadUrl(String str) {
        try {
            com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(this, fileterUrl(str));
        } catch (Exception unused) {
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.a(z);
    }

    public boolean startNestedScroll(int i2) {
        return this.mChildHelper.a(i2, 0);
    }

    public d(Context context) {
        super(context);
        MethodCollector.i(9670);
        initNestedScrolling();
        MethodCollector.o(9670);
    }

    private boolean isHttpUrl(String str) {
        if (com.bytedance.common.utility.m.a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public boolean nestedTouch(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mNestedOffsetY = 0;
        }
        int y = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, (float) this.mNestedOffsetY);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.mLastY - y;
                    if (dispatchNestedPreScroll(0, i2, this.mScrollConsumed, this.mScrollOffset)) {
                        i2 -= this.mScrollConsumed[1];
                        this.mNestedOffsetY += this.mScrollOffset[1];
                    }
                    int scrollY = getScrollY();
                    this.mLastY = y - this.mScrollOffset[1];
                    int max = Math.max(0, scrollY + i2) - scrollY;
                    if (dispatchNestedScroll(0, max, 0, i2 - max, this.mScrollOffset)) {
                        int i3 = this.mLastY;
                        int[] iArr = this.mScrollOffset;
                        this.mLastY = i3 - iArr[1];
                        this.mNestedOffsetY += iArr[1];
                    }
                } else if (!(actionMasked == 3 || actionMasked == 5)) {
                    return false;
                }
            }
            stopNestedScroll();
        } else {
            this.mLastY = y;
            startNestedScroll(2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.canTouch) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.startClickTime = System.currentTimeMillis();
                com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_aweme_lancet_LogLancet_i(TAG, "startClickTime" + this.startClickTime);
            } else if (action == 1) {
                long currentTimeMillis = System.currentTimeMillis() - this.startClickTime;
                String str = TAG;
                com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_aweme_lancet_LogLancet_i(str, "clickDuration".concat(String.valueOf(currentTimeMillis)));
                if (currentTimeMillis < 100) {
                    this.lastCickTime = System.currentTimeMillis();
                    com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_aweme_lancet_LogLancet_i(str, "lastCickTime:" + this.lastCickTime + "TapTimeout():" + ViewConfiguration.getTapTimeout());
                }
            }
            try {
                return nestedTouch(motionEvent);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.mChildHelper.a(f2, f3);
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(fileterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        try {
            com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(this, fileterUrl(str), map);
        } catch (Exception unused) {
        }
    }

    public static void com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(WebView webView, String str) {
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        access$001(webView, str);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(9840);
        initNestedScrolling();
        MethodCollector.o(9840);
    }

    public static void com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(WebView webView, WebViewClient webViewClient) {
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

    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.mChildHelper.a(f2, f3, z);
    }

    public static void com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(WebView webView, String str, Map map) {
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        access$000(webView, str, map);
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(10006);
        initNestedScrolling();
        MethodCollector.o(10006);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.mChildHelper.a(i2, i3, iArr, iArr2);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.mChildHelper.a(i2, i3, i4, i5, iArr);
    }
}
