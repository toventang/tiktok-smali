package com.bytedance.webx.e.a.a.a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.d.c;
import com.bytedance.webx.e.b;
import com.bytedance.webx.h;

public class a extends WebChromeClient implements c, b {

    /* renamed from: a  reason: collision with root package name */
    public WebChromeClient f45952a;

    /* renamed from: b  reason: collision with root package name */
    private h f45953b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.webx.e.a f45954c = new com.bytedance.webx.e.a();

    static {
        Covode.recordClassIndex(28093);
    }

    public Bitmap getDefaultVideoPoster() {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.getDefaultVideoPoster();
        }
        return super.getDefaultVideoPoster();
    }

    @Override // com.bytedance.webx.e.b
    public com.bytedance.webx.d.a getExtendableContext() {
        com.bytedance.webx.e.a aVar = this.f45954c;
        if (aVar == null) {
            return null;
        }
        return aVar.f45951a;
    }

    public View getVideoLoadingProgressView() {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.getVideoLoadingProgressView();
        }
        return super.getVideoLoadingProgressView();
    }

    public void onGeolocationPermissionsHidePrompt() {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onGeolocationPermissionsHidePrompt();
        } else {
            super.onGeolocationPermissionsHidePrompt();
        }
    }

    public void onHideCustomView() {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        } else {
            super.onHideCustomView();
        }
    }

    public boolean onJsTimeout() {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.onJsTimeout();
        }
        return super.onJsTimeout();
    }

    @Override // com.bytedance.webx.e.b
    public final void a(h hVar) {
        this.f45953b = hVar;
        this.f45954c.f45951a = new com.bytedance.webx.d.a(this.f45953b, this);
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.getVisitedHistory(valueCallback);
        } else {
            super.getVisitedHistory(valueCallback);
        }
    }

    public void onCloseWindow(WebView webView) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onCloseWindow(webView);
        } else {
            super.onCloseWindow(webView);
        }
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onPermissionRequest(permissionRequest);
        } else {
            super.onPermissionRequest(permissionRequest);
        }
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
        } else {
            super.onPermissionRequestCanceled(permissionRequest);
        }
    }

    public void onRequestFocus(WebView webView) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onRequestFocus(webView);
        } else {
            super.onRequestFocus(webView);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public void onProgressChanged(WebView webView, int i2) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onProgressChanged(webView, i2);
        } else {
            super.onProgressChanged(webView, i2);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onReceivedIcon(webView, bitmap);
        } else {
            super.onReceivedIcon(webView, bitmap);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTitle(webView, str);
        } else {
            super.onReceivedTitle(webView, str);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        } else {
            super.onShowCustomView(view, customViewCallback);
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            WebChromeClient webChromeClient = this.f45952a;
            if (webChromeClient != null) {
                webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
            } else {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
        }
    }

    public void onConsoleMessage(String str, int i2, String str2) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onConsoleMessage(str, i2, str2);
        } else {
            super.onConsoleMessage(str, i2, str2);
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
        } else {
            super.onReceivedTouchIconUrl(webView, str, z);
        }
    }

    public void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, i2, customViewCallback);
        } else {
            super.onShowCustomView(view, i2, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onReachedMaxAppCacheSize(j2, j3, quotaUpdater);
        } else {
            super.onReachedMaxAppCacheSize(j2, j3, quotaUpdater);
        }
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.onCreateWindow(webView, z, z2, message);
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.onJsAlert(webView, str, str2, jsResult);
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            return webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        WebChromeClient webChromeClient = this.f45952a;
        if (webChromeClient != null) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j2, j3, j4, quotaUpdater);
        } else {
            super.onExceededDatabaseQuota(str, str2, j2, j3, j4, quotaUpdater);
        }
    }
}
