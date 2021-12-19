package com.bytedance.ies.bullet.kit.web;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.webkit.DownloadListener;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.web.jsbridge2.t;
import com.ss.android.ugc.tiktok.security.b.i;
import h.f.b.l;
import java.util.Map;

public class SSWebView extends com.bytedance.webx.e.a.c implements t {

    /* renamed from: a  reason: collision with root package name */
    public boolean f32384a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.android.monitor.webview.c f32385b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32386c;

    /* renamed from: d  reason: collision with root package name */
    private final int f32387d;

    /* renamed from: e  reason: collision with root package name */
    private final int f32388e;

    /* renamed from: f  reason: collision with root package name */
    private int f32389f;

    /* renamed from: g  reason: collision with root package name */
    private long f32390g;

    /* renamed from: h  reason: collision with root package name */
    private long f32391h;

    /* renamed from: i  reason: collision with root package name */
    private b f32392i;

    /* renamed from: j  reason: collision with root package name */
    private a f32393j;

    /* renamed from: k  reason: collision with root package name */
    private c f32394k;

    /* renamed from: l  reason: collision with root package name */
    private String f32395l;

    public interface a {
        static {
            Covode.recordClassIndex(19171);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(19172);
        }

        void onScrollChanged(int i2, int i3, int i4, int i5);
    }

    static {
        Covode.recordClassIndex(19170);
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
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

    public final com.bytedance.android.monitor.webview.c getMonitorHelper() {
        return this.f32385b;
    }

    @Override // com.bytedance.ies.web.jsbridge2.t
    public String getSafeUrl() {
        return this.f32395l;
    }

    @Override // com.bytedance.webx.e.a.c
    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public void onPause() {
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public void onResume() {
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    private boolean y() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.webx.e.a.c
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

    public final int getTimeInterval() {
        int i2 = this.f32389f;
        if (i2 > 0) {
            return i2;
        }
        return this.f32388e;
    }

    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public void destroy() {
        try {
            com.bytedance.android.monitor.webview.c cVar = this.f32385b;
            if (cVar != null) {
                cVar.l(this);
            }
            super.destroy();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public void onAttachedToWindow() {
        try {
            com.bytedance.android.monitor.webview.c cVar = this.f32385b;
            if (cVar != null) {
                cVar.r(this);
            }
            super.onAttachedToWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public void reload() {
        try {
            com.bytedance.android.monitor.webview.c cVar = this.f32385b;
            if (cVar != null) {
                cVar.n(this);
            }
            super.reload();
        } catch (Exception unused) {
        }
    }

    public final boolean a() {
        c cVar = this.f32394k;
        if (cVar != null) {
            try {
                return cVar.a();
            } catch (as unused) {
            }
        }
        if (System.currentTimeMillis() - this.f32391h < ((long) getTimeInterval())) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        l.a((Object) copyBackForwardList, "");
        if (copyBackForwardList.getCurrentIndex() >= 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.webx.e.a.c
    public boolean canGoBack() {
        if (!y() || !i.a(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.webx.e.a.c
    public void goBack() {
        if (!i.b(this)) {
            try {
                com.bytedance.android.monitor.webview.c cVar = this.f32385b;
                if (cVar != null) {
                    cVar.p(this);
                }
                super.goBack();
            } catch (Exception unused) {
            }
        }
    }

    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.e.a.c
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

    public final void setCanTouch(boolean z) {
        this.f32384a = z;
    }

    @Override // com.bytedance.webx.e.a.c
    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public final void setMonitorHelper(com.bytedance.android.monitor.webview.c cVar) {
        this.f32385b = cVar;
    }

    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setOverScrollMode(int i2) {
        try {
            super.setOverScrollMode(i2);
        } catch (Throwable unused) {
        }
    }

    public final void setPageStartUrl(String str) {
        this.f32395l = str;
    }

    public final void setTimeInterval(int i2) {
        this.f32389f = i2;
    }

    @Override // com.bytedance.webx.e.a.c.a, com.bytedance.webx.e.a.c
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public final void setWebOverScrollByListener(a aVar) {
        this.f32393j = aVar;
    }

    public final void setWebScrollListener(b bVar) {
        this.f32392i = bVar;
    }

    @Override // com.bytedance.webx.e.a.c
    public boolean canGoBackOrForward(int i2) {
        try {
            return super.canGoBackOrForward(i2);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void setWebViewEventDelegate(c cVar) {
        l.c(cVar, "");
        this.f32394k = cVar;
    }

    public interface c {
        static {
            Covode.recordClassIndex(19173);
        }

        boolean a();

        boolean a(MotionEvent motionEvent);

        boolean a(boolean z);

        public static final class a {
            static {
                Covode.recordClassIndex(19174);
            }

            public static boolean a(MotionEvent motionEvent) {
                l.c(motionEvent, "");
                throw new as("An operation is not implemented");
            }
        }
    }

    public boolean canScrollVertically(int i2) {
        c cVar = this.f32394k;
        if (cVar != null) {
            try {
                return cVar.a(super.canScrollVertically(i2));
            } catch (as unused) {
            }
        }
        return super.canScrollVertically(i2);
    }

    @Override // com.bytedance.webx.e.a.c
    public void loadUrl(String str) {
        String a2 = i.f149045a.a(this, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        l.c(str, "");
        try {
            com.bytedance.android.monitor.webview.c cVar = this.f32385b;
            if (cVar != null) {
                cVar.g(this, str);
            }
            super.loadUrl(str);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context) {
        this(context, null, 6, (byte) 0);
        if (com.ss.android.ugc.tiktok.security.c.b.a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                com.a.a(settings, sb.toString());
            }
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l.c(motionEvent, "");
        c cVar = this.f32394k;
        if (cVar != null) {
            try {
                return cVar.a(motionEvent);
            } catch (as unused) {
            }
        }
        if (!this.f32384a) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32390g = System.currentTimeMillis();
        } else if (action == 1 && System.currentTimeMillis() - this.f32390g < ((long) this.f32387d)) {
            this.f32391h = System.currentTimeMillis();
            ViewConfiguration.getTapTimeout();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // com.bytedance.webx.e.a.c.a, com.bytedance.webx.e.a.c
    public void setWebViewClient(WebViewClient webViewClient) {
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

    @Override // com.bytedance.webx.e.a.c
    public void postUrl(String str, byte[] bArr) {
        l.c(str, "");
        l.c(bArr, "");
        try {
            super.postUrl(str, bArr);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, com.bytedance.webx.e.a.c
    public void loadUrl(String str, Map map) {
        String a2 = i.f149045a.a(this, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        l.c(str, "");
        l.c(map, "");
        try {
            com.bytedance.android.monitor.webview.c cVar = this.f32385b;
            if (cVar != null) {
                cVar.g(this, str);
            }
            super.loadUrl(str, map);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public void loadData(String str, String str2, String str3) {
        l.c(str, "");
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SSWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        String simpleName = SSWebView.class.getSimpleName();
        l.a((Object) simpleName, "");
        this.f32386c = simpleName;
        this.f32387d = 100;
        this.f32388e = 500;
        this.f32389f = 500;
        this.f32384a = true;
        if (com.ss.android.ugc.tiktok.security.c.b.a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                com.a.a(settings, sb.toString());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SSWebView(Context context, AttributeSet attributeSet, int i2, byte b2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // com.bytedance.webx.e.a.c
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.f32392i;
        if (bVar != null) {
            bVar.onScrollChanged(i2, i3, i4, i5);
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        l.c(str2, "");
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        return super.overScrollBy(i2, i3, i4, i5, i6, i7, i8, i9, z);
    }
}
