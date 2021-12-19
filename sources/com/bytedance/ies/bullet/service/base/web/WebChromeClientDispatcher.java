package com.bytedance.ies.bullet.service.base.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.bytedance.ies.bullet.service.base.as;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class WebChromeClientDispatcher extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<k> f32641a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(19389);
    }

    public Bitmap getDefaultVideoPoster() {
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().getDefaultVideoPoster();
            } catch (as unused) {
            }
        }
        return super.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().getVideoLoadingProgressView();
            } catch (as unused) {
            }
        }
        return super.getVideoLoadingProgressView();
    }

    public void onGeolocationPermissionsHidePrompt() {
        super.onGeolocationPermissionsHidePrompt();
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onGeolocationPermissionsHidePrompt();
            } catch (as unused) {
            }
        }
    }

    public void onHideCustomView() {
        super.onHideCustomView();
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHideCustomView();
            } catch (as unused) {
            }
        }
    }

    public final void a(k kVar) {
        l.c(kVar, "");
        this.f32641a.add(kVar);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPermissionRequest(permissionRequest);
            } catch (as unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        l.c(valueCallback, "");
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(valueCallback);
            } catch (as unused) {
            }
        }
    }

    public void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onProgressChanged(webView, i2);
            } catch (as unused) {
            }
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedTitle(webView, str);
            } catch (as unused) {
            }
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onShowCustomView(view, customViewCallback);
            } catch (as unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        l.c(valueCallback, "");
        l.c(str, "");
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(valueCallback, str);
            } catch (as unused) {
            }
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) a.a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            a.a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            super.onGeolocationPermissionsShowPrompt(str, callback);
            Iterator<T> it = this.f32641a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onGeolocationPermissionsShowPrompt(str, callback);
                } catch (as unused) {
                }
            }
        }
    }

    public void onConsoleMessage(String str, int i2, String str2) {
        super.onConsoleMessage(str, i2, str2);
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onConsoleMessage(str, i2, str2);
            } catch (as unused) {
            }
        }
    }

    public void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i2, customViewCallback);
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onShowCustomView(view, i2, customViewCallback);
            } catch (as unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            } catch (as unused) {
            }
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        l.c(valueCallback, "");
        l.c(str, "");
        l.c(str2, "");
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(valueCallback, str, str2);
            } catch (as unused) {
            }
        }
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsAlert(webView, str, str2, jsResult);
            } catch (as unused) {
            }
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsBeforeUnload(webView, str, str2, jsResult);
            } catch (as unused) {
            }
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsConfirm(webView, str, str2, jsResult);
            } catch (as unused) {
            }
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<T> it = this.f32641a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
            } catch (as unused) {
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }
}
