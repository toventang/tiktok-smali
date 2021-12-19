package com.bytedance.ies.bullet.service.base.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.bullet.service.base.web.l;
import h.f.b.l;

public class k extends WebChromeClient {
    static {
        Covode.recordClassIndex(19401);
    }

    public void a(ValueCallback<Uri> valueCallback) {
        l.c(valueCallback, "");
    }

    public void a(ValueCallback<Uri> valueCallback, String str) {
        l.c(valueCallback, "");
        l.c(str, "");
    }

    public void a(ValueCallback<Uri> valueCallback, String str, String str2) {
        l.c(valueCallback, "");
        l.c(str, "");
        l.c(str2, "");
    }

    public void a(c cVar) {
    }

    public Bitmap getDefaultVideoPoster() {
        throw new as("An operation is not implemented");
    }

    public View getVideoLoadingProgressView() {
        throw new as("An operation is not implemented");
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        l.d dVar;
        if (permissionRequest != null) {
            h.f.b.l.c(permissionRequest, "");
            dVar = new l.d(permissionRequest);
        } else {
            dVar = null;
        }
        a(dVar);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        l.e eVar;
        if (fileChooserParams != null) {
            h.f.b.l.c(fileChooserParams, "");
            eVar = new l.e(fileChooserParams);
        } else {
            eVar = null;
        }
        return a(webView, valueCallback, eVar);
    }

    public boolean a(WebView webView, ValueCallback<Uri[]> valueCallback, a aVar) {
        throw new as("An operation is not implemented");
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        throw new as("An operation is not implemented");
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        throw new as("An operation is not implemented");
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        throw new as("An operation is not implemented");
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        throw new as("An operation is not implemented");
    }
}
