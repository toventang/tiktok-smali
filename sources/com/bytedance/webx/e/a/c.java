package com.bytedance.webx.e.a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.e.a.c.a;
import com.bytedance.webx.e.a.d;
import com.bytedance.webx.f.b;
import com.ss.android.ugc.tiktok.security.b.h;
import java.util.Map;
import java.util.concurrent.Executor;

public class c extends a {
    static {
        Covode.recordClassIndex(28104);
    }

    public final void d() {
        super.destroy();
    }

    public final void e() {
        super.stopLoading();
    }

    public final void f() {
        super.reload();
    }

    public final void h() {
        super.goBack();
    }

    public final void j() {
        super.goForward();
    }

    public final void k() {
        super.onPause();
    }

    public final void l() {
        super.onResume();
    }

    public final void u() {
        super.onAttachedToWindow();
    }

    public final void v() {
        super.onStartTemporaryDetach();
    }

    public final void w() {
        super.onFinishTemporaryDetach();
    }

    public final void a(SslCertificate sslCertificate) {
        super.setCertificate(sslCertificate);
    }

    public final void a(String str, String str2, String str3) {
        super.savePassword(str, str2, str3);
    }

    public final void a(String str, String str2, String str3, String str4) {
        super.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public final String[] a(String str, String str2) {
        return super.getHttpAuthUsernamePassword(str, str2);
    }

    public final void a(String str, Map<String, String> map, com.bytedance.webx.c... cVarArr) {
        com.bytedance.webx.e.c.f45979a.get().a(cVarArr);
        loadUrl(str, map);
        com.bytedance.webx.e.c.f45979a.get().a();
    }

    public final void a(String str, Map<String, String> map) {
        a(this, str, map);
    }

    public final void a(String str, com.bytedance.webx.c... cVarArr) {
        com.bytedance.webx.e.c.f45979a.get().a(cVarArr);
        loadUrl(str);
        com.bytedance.webx.e.c.f45979a.get().a();
    }

    public final void a(String str, byte[] bArr) {
        super.postUrl(str, bArr);
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void a(String str, ValueCallback<String> valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final void a(String str, boolean z, ValueCallback<String> valueCallback) {
        super.saveWebArchive(str, z, valueCallback);
    }

    public final boolean a(int i2) {
        return super.canGoBackOrForward(i2);
    }

    public final boolean a(boolean z) {
        return super.pageUp(z);
    }

    public final void a(WebView.FindListener findListener) {
        super.setFindListener(findListener);
    }

    public final void a(Message message) {
        super.documentHasImages(message);
    }

    public final void a(WebViewClient webViewClient) {
        a((a) this, webViewClient);
    }

    public final void a(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    public final void a(WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    public final void a(DownloadListener downloadListener) {
        super.setDownloadListener(downloadListener);
    }

    public final void a(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
    }

    public final void a(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    public final void a(WebMessage webMessage, Uri uri) {
        super.postWebMessage(webMessage, uri);
    }

    public final boolean a(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public final boolean a(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public final boolean a(int i2, int i3, KeyEvent keyEvent) {
        return super.onKeyMultiple(i2, i3, keyEvent);
    }

    public final void a(ViewStructure viewStructure) {
        super.onProvideVirtualStructure(viewStructure);
    }

    public final void a(ViewStructure viewStructure, int i2) {
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
    }

    public final void a(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final boolean a(DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    public final void a(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }

    public final void a(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
    }

    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean a(int i2, Rect rect) {
        return super.requestFocus(i2, rect);
    }

    public final boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        return super.overScrollBy(i2, i3, i4, i5, i6, i7, i8, i9, z);
    }

    public static abstract class a extends com.bytedance.webx.f.a<c> implements a {
        static {
            Covode.recordClassIndex(28105);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.net.http.SslCertificate r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "setCertificate"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.net.http.SslCertificate):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "savePassword"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "setHttpAuthUsernamePassword"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String[] a(java.lang.String r4, java.lang.String r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getHttpAuthUsernamePassword"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                java.lang.String[] r0 = r0.a(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.lang.String, java.lang.String):java.lang.String[]");
        }

        public void a(String str, Map<String, String> map) {
            com.bytedance.webx.f.a a2 = b.a(y(), this, "loadUrl");
            if (a2 instanceof a) {
                ((a) a2).a(str, map);
            } else {
                ((c) x()).a(str, map);
            }
        }

        public void a(String str) {
            com.bytedance.webx.f.a a2 = b.a(y(), this, "loadUrl");
            if (a2 instanceof a) {
                ((a) a2).a(str);
            } else {
                ((c) x()).b(str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r4, byte[] r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "postUrl"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.lang.String, byte[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "loadData"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.b(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            /*
                r6 = this;
                r2 = r6
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "loadDataWithBaseURL"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r4 = r10
                r5 = r11
                r1 = r7
                r2 = r8
                r3 = r9
                r0.a(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r4, android.webkit.ValueCallback<java.lang.String> r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "evaluateJavascript"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.lang.String, android.webkit.ValueCallback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r4, boolean r5, android.webkit.ValueCallback<java.lang.String> r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "saveWebArchive"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.lang.String, boolean, android.webkit.ValueCallback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(int r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "canGoBackOrForward"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(boolean r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "pageUp"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(boolean):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(boolean r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "pageDown"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.b(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(boolean):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView.FindListener r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "setFindListener"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.webkit.WebView$FindListener):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.os.Message r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "documentHasImages"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.os.Message):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebViewClient r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "setWebViewClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0015
                r2 = r1
                android.webkit.WebViewClient r4 = com.example.a.c.a(r4)
                goto L_0x0001
            L_0x0015:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.webkit.WebViewClient):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.util.concurrent.Executor r4, android.webkit.WebViewRenderProcessClient r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "setWebViewRenderProcessClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.util.concurrent.Executor, android.webkit.WebViewRenderProcessClient):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebViewRenderProcessClient r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "setWebViewRenderProcessClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.webkit.WebViewRenderProcessClient):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.DownloadListener r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "setDownloadListener"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.webkit.DownloadListener):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebChromeClient r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "setWebChromeClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.webkit.WebChromeClient):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r4, java.lang.String r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "addJavascriptInterface"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(java.lang.Object, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebMessage r4, android.net.Uri r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "postWebMessage"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.webkit.WebMessage, android.net.Uri):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onHoverEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onTouchEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.b(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(int r4, android.view.KeyEvent r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onKeyDown"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.a(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(int, android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(int r4, android.view.KeyEvent r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onKeyUp"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.b(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(int, android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(int r4, int r5, android.view.KeyEvent r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onKeyMultiple"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.a(r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(int, int, android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.ViewStructure r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onProvideVirtualStructure"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.view.ViewStructure):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.ViewStructure r4, int r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onProvideAutofillVirtualStructure"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.view.ViewStructure, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.graphics.Canvas r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onDraw"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.graphics.Canvas):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.view.DragEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onDragEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.view.DragEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r4, int r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onVisibilityChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.view.View, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r4, int r5, android.graphics.Rect r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onFocusChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(boolean, int, android.graphics.Rect):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.view.KeyEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "dispatchKeyEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(int r4, android.graphics.Rect r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "requestFocus"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.a(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(int, android.graphics.Rect):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, boolean r19) {
            /*
                r10 = this;
                r2 = r10
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "overScrollBy"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r4 = r14
                r3 = r13
                r2 = r12
                r1 = r11
                r5 = r15
                r9 = r19
                r8 = r18
                r7 = r17
                r6 = r16
                boolean r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(int, int, int, int, int, int, int, int, boolean):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.net.http.SslCertificate b() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getCertificate"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.net.http.SslCertificate r0 = r0.c()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b():android.net.http.SslCertificate");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "destroy"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.c():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "stopLoading"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.d():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "reload"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.f()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.e():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean f() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "canGoBack"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.g()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.f():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void g() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "goBack"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.h()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.g():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean h() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "canGoForward"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.i()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.h():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "goForward"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.j()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.i():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onPause"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.k()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.j():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void k() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onResume"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.l()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.k():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebViewClient l() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getWebViewClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.webkit.WebViewClient r0 = r0.m()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.l():android.webkit.WebViewClient");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebViewRenderProcess m() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getWebViewRenderProcess"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.webkit.WebViewRenderProcess r0 = r0.n()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.m():android.webkit.WebViewRenderProcess");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebViewRenderProcessClient n() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getWebViewRenderProcessClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.webkit.WebViewRenderProcessClient r0 = r0.o()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.n():android.webkit.WebViewRenderProcessClient");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebChromeClient o() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getWebChromeClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.webkit.WebChromeClient r0 = r0.p()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.o():android.webkit.WebChromeClient");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebMessagePort[] p() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "createWebMessageChannel"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.webkit.WebMessagePort[] r0 = r0.q()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.p():android.webkit.WebMessagePort[]");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebSettings q() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getSettings"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.webkit.WebSettings r0 = r0.r()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.q():android.webkit.WebSettings");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean r() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "zoomIn"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.s()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.r():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean s() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "zoomOut"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.t()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.s():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void t() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onAttachedToWindow"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.u()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.t():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void u() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onStartTemporaryDetach"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.v()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.u():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void v() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onFinishTemporaryDetach"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.w()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.v():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean w() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onCheckIsTextEditor"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.x()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.w():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.inputmethod.InputConnection a(android.view.inputmethod.EditorInfo r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onCreateInputConnection"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.view.inputmethod.InputConnection r0 = r0.a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebBackForwardList a(android.os.Bundle r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "saveState"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.webkit.WebBackForwardList r0 = r0.a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.os.Bundle):android.webkit.WebBackForwardList");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebBackForwardList b(android.os.Bundle r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "restoreState"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                android.webkit.WebBackForwardList r0 = r0.b(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(android.os.Bundle):android.webkit.WebBackForwardList");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(int r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onWindowVisibilityChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.c(int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean d(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onTrackballEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.d(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.d(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean e(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "dispatchTouchEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.e(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.e(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean f(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onInterceptTouchEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.f(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.f(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(float r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "zoomBy"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(float):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "goBackOrForward"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(android.graphics.Canvas r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "draw"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.c(android.graphics.Canvas):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(java.lang.String r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "removeJavascriptInterface"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.d(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.c(java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(boolean r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onWindowFocusChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.c(boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.graphics.Canvas r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "dispatchDraw"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(android.graphics.Canvas):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean c(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onGenericMotionEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                boolean r0 = r0.c(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.c(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.content.res.Configuration r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onConfigurationChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(android.content.res.Configuration):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.lang.String r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "saveWebArchive"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r4, int r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "flingScroll"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r4, int r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onMeasure"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.b(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onSizeChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(int, int, int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onScrollChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.b(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.b(int, int, int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r4, int r5, boolean r6, boolean r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onOverScrolled"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.c.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.e.a.c) r0
                r0.a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.a.a(int, int, boolean, boolean):void");
        }
    }

    public final SslCertificate c() {
        return super.getCertificate();
    }

    public final boolean g() {
        return super.canGoBack();
    }

    public final boolean i() {
        return super.canGoForward();
    }

    public final WebViewClient m() {
        return super.getWebViewClient();
    }

    public final WebViewRenderProcess n() {
        return super.getWebViewRenderProcess();
    }

    public final WebViewRenderProcessClient o() {
        return super.getWebViewRenderProcessClient();
    }

    public final WebChromeClient p() {
        return super.getWebChromeClient();
    }

    public final WebMessagePort[] q() {
        return super.createWebMessageChannel();
    }

    public final WebSettings r() {
        return super.getSettings();
    }

    public final boolean s() {
        return super.zoomIn();
    }

    public final boolean t() {
        return super.zoomOut();
    }

    public final boolean x() {
        return super.onCheckIsTextEditor();
    }

    public boolean canGoBack() {
        if (!d.b.f45978a) {
            return super.canGoBack();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "canGoBack");
        if (!(a2 instanceof a)) {
            return super.canGoBack();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean f2 = ((a) a2).f();
        com.bytedance.webx.e.c.f45980b.get().b();
        return f2;
    }

    public boolean canGoForward() {
        if (!d.b.f45978a) {
            return super.canGoForward();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "canGoForward");
        if (!(a2 instanceof a)) {
            return super.canGoForward();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean h2 = ((a) a2).h();
        com.bytedance.webx.e.c.f45980b.get().b();
        return h2;
    }

    @Override // com.bytedance.webx.e.a.c.a
    public WebMessagePort[] createWebMessageChannel() {
        if (!d.b.f45978a) {
            return super.createWebMessageChannel();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "createWebMessageChannel");
        if (!(a2 instanceof a)) {
            return super.createWebMessageChannel();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        WebMessagePort[] p = ((a) a2).p();
        com.bytedance.webx.e.c.f45980b.get().b();
        return p;
    }

    public void destroy() {
        if (!d.b.f45978a) {
            super.destroy();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "destroy");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).c();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.destroy();
    }

    public SslCertificate getCertificate() {
        if (!d.b.f45978a) {
            return super.getCertificate();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getCertificate");
        if (!(a2 instanceof a)) {
            return super.getCertificate();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        SslCertificate b2 = ((a) a2).b();
        com.bytedance.webx.e.c.f45980b.get().b();
        return b2;
    }

    public WebSettings getSettings() {
        if (!d.b.f45978a) {
            return super.getSettings();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getSettings");
        if (!(a2 instanceof a)) {
            return super.getSettings();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        WebSettings q = ((a) a2).q();
        com.bytedance.webx.e.c.f45980b.get().b();
        return q;
    }

    @Override // com.bytedance.webx.e.a.c.a
    public WebChromeClient getWebChromeClient() {
        if (!d.b.f45978a) {
            return super.getWebChromeClient();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getWebChromeClient");
        if (!(a2 instanceof a)) {
            return super.getWebChromeClient();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        WebChromeClient o = ((a) a2).o();
        com.bytedance.webx.e.c.f45980b.get().b();
        return o;
    }

    @Override // com.bytedance.webx.e.a.c.a
    public WebViewClient getWebViewClient() {
        if (!d.b.f45978a) {
            return super.getWebViewClient();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getWebViewClient");
        if (!(a2 instanceof a)) {
            return super.getWebViewClient();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        WebViewClient l2 = ((a) a2).l();
        com.bytedance.webx.e.c.f45980b.get().b();
        return l2;
    }

    @Override // com.bytedance.webx.e.a.c.a
    public WebViewRenderProcess getWebViewRenderProcess() {
        if (!d.b.f45978a) {
            return super.getWebViewRenderProcess();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getWebViewRenderProcess");
        if (!(a2 instanceof a)) {
            return super.getWebViewRenderProcess();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        WebViewRenderProcess m2 = ((a) a2).m();
        com.bytedance.webx.e.c.f45980b.get().b();
        return m2;
    }

    @Override // com.bytedance.webx.e.a.c.a
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        if (!d.b.f45978a) {
            return super.getWebViewRenderProcessClient();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getWebViewRenderProcessClient");
        if (!(a2 instanceof a)) {
            return super.getWebViewRenderProcessClient();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        WebViewRenderProcessClient n = ((a) a2).n();
        com.bytedance.webx.e.c.f45980b.get().b();
        return n;
    }

    public void goBack() {
        if (!d.b.f45978a) {
            super.goBack();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "goBack");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).g();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.goBack();
    }

    public void goForward() {
        if (!d.b.f45978a) {
            super.goForward();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "goForward");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).i();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.goForward();
    }

    public void onAttachedToWindow() {
        if (!d.b.f45978a) {
            super.onAttachedToWindow();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onAttachedToWindow");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).t();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onAttachedToWindow();
    }

    public boolean onCheckIsTextEditor() {
        if (!d.b.f45978a) {
            return super.onCheckIsTextEditor();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onCheckIsTextEditor");
        if (!(a2 instanceof a)) {
            return super.onCheckIsTextEditor();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean w = ((a) a2).w();
        com.bytedance.webx.e.c.f45980b.get().b();
        return w;
    }

    public void onFinishTemporaryDetach() {
        if (!d.b.f45978a) {
            super.onFinishTemporaryDetach();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onFinishTemporaryDetach");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).v();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onFinishTemporaryDetach();
    }

    public void onPause() {
        if (!d.b.f45978a) {
            super.onPause();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onPause");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).j();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (!d.b.f45978a) {
            super.onResume();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onResume");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).k();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onResume();
    }

    public void onStartTemporaryDetach() {
        if (!d.b.f45978a) {
            super.onStartTemporaryDetach();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onStartTemporaryDetach");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).u();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onStartTemporaryDetach();
    }

    public void reload() {
        if (!d.b.f45978a) {
            super.reload();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "reload");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).e();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.reload();
    }

    public void stopLoading() {
        if (!d.b.f45978a) {
            super.stopLoading();
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "stopLoading");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).d();
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.stopLoading();
    }

    public boolean zoomIn() {
        if (!d.b.f45978a) {
            return super.zoomIn();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "zoomIn");
        if (!(a2 instanceof a)) {
            return super.zoomIn();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean r = ((a) a2).r();
        com.bytedance.webx.e.c.f45980b.get().b();
        return r;
    }

    public boolean zoomOut() {
        if (!d.b.f45978a) {
            return super.zoomOut();
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "zoomOut");
        if (!(a2 instanceof a)) {
            return super.zoomOut();
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean s = ((a) a2).s();
        com.bytedance.webx.e.c.f45980b.get().b();
        return s;
    }

    public c(Context context) {
        super(context);
    }

    public final void a(float f2) {
        super.zoomBy(f2);
    }

    public final void b(int i2) {
        super.goBackOrForward(i2);
    }

    public final void c(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public final InputConnection a(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    public final WebBackForwardList b(Bundle bundle) {
        return super.restoreState(bundle);
    }

    public final void d(String str) {
        super.removeJavascriptInterface(str);
    }

    public final boolean e(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean f(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final WebBackForwardList a(Bundle bundle) {
        return super.saveState(bundle);
    }

    public final void c(Canvas canvas) {
        super.draw(canvas);
    }

    public final boolean d(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    public final void c(String str) {
        super.saveWebArchive(str);
    }

    public final void b(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void c(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public boolean canGoBackOrForward(int i2) {
        if (!d.b.f45978a) {
            return super.canGoBackOrForward(i2);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "canGoBackOrForward");
        if (!(a2 instanceof a)) {
            return super.canGoBackOrForward(i2);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(i2);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!d.b.f45978a) {
            super.dispatchDraw(canvas);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "dispatchDraw");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).b(canvas);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!d.b.f45978a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "dispatchKeyEvent");
        if (!(a2 instanceof a)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(keyEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!d.b.f45978a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "dispatchTouchEvent");
        if (!(a2 instanceof a)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean e2 = ((a) a2).e(motionEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return e2;
    }

    public void documentHasImages(Message message) {
        if (!d.b.f45978a) {
            super.documentHasImages(message);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "documentHasImages");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(message);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.documentHasImages(message);
    }

    public void draw(Canvas canvas) {
        if (!d.b.f45978a) {
            super.draw(canvas);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "draw");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).c(canvas);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.draw(canvas);
    }

    public void goBackOrForward(int i2) {
        if (!d.b.f45978a) {
            super.goBackOrForward(i2);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "goBackOrForward");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).b(i2);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.goBackOrForward(i2);
    }

    public void loadUrl(String str) {
        if (!d.b.f45978a) {
            a((a) this, str);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "loadUrl");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(str);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        a((a) this, str);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        if (!d.b.f45978a) {
            super.onConfigurationChanged(configuration);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onConfigurationChanged");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(configuration);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!d.b.f45978a) {
            return super.onCreateInputConnection(editorInfo);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onCreateInputConnection");
        if (!(a2 instanceof a)) {
            return super.onCreateInputConnection(editorInfo);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        InputConnection a3 = ((a) a2).a(editorInfo);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (!d.b.f45978a) {
            return super.onDragEvent(dragEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onDragEvent");
        if (!(a2 instanceof a)) {
            return super.onDragEvent(dragEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(dragEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!d.b.f45978a) {
            super.onDraw(canvas);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onDraw");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(canvas);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onDraw(canvas);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!d.b.f45978a) {
            return super.onGenericMotionEvent(motionEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onGenericMotionEvent");
        if (!(a2 instanceof a)) {
            return super.onGenericMotionEvent(motionEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean c2 = ((a) a2).c(motionEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return c2;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!d.b.f45978a) {
            return super.onHoverEvent(motionEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onHoverEvent");
        if (!(a2 instanceof a)) {
            return super.onHoverEvent(motionEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(motionEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!d.b.f45978a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onInterceptTouchEvent");
        if (!(a2 instanceof a)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean f2 = ((a) a2).f(motionEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return f2;
    }

    @Override // com.bytedance.webx.e.a.c.a
    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        if (!d.b.f45978a) {
            super.onProvideVirtualStructure(viewStructure);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onProvideVirtualStructure");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(viewStructure);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onProvideVirtualStructure(viewStructure);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!d.b.f45978a) {
            return super.onTouchEvent(motionEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onTouchEvent");
        if (!(a2 instanceof a)) {
            return super.onTouchEvent(motionEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean b2 = ((a) a2).b(motionEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return b2;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!d.b.f45978a) {
            return super.onTrackballEvent(motionEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onTrackballEvent");
        if (!(a2 instanceof a)) {
            return super.onTrackballEvent(motionEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean d2 = ((a) a2).d(motionEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return d2;
    }

    public void onWindowFocusChanged(boolean z) {
        if (!d.b.f45978a) {
            super.onWindowFocusChanged(z);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onWindowFocusChanged");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).c(z);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        if (!d.b.f45978a) {
            super.onWindowVisibilityChanged(i2);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onWindowVisibilityChanged");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).c(i2);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onWindowVisibilityChanged(i2);
    }

    public boolean pageDown(boolean z) {
        if (!d.b.f45978a) {
            return super.pageDown(z);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "pageDown");
        if (!(a2 instanceof a)) {
            return super.pageDown(z);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean b2 = ((a) a2).b(z);
        com.bytedance.webx.e.c.f45980b.get().b();
        return b2;
    }

    public boolean pageUp(boolean z) {
        if (!d.b.f45978a) {
            return super.pageUp(z);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "pageUp");
        if (!(a2 instanceof a)) {
            return super.pageUp(z);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(z);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    public void removeJavascriptInterface(String str) {
        if (!d.b.f45978a) {
            super.removeJavascriptInterface(str);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "removeJavascriptInterface");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).c(str);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.removeJavascriptInterface(str);
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        if (!d.b.f45978a) {
            return super.restoreState(bundle);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "restoreState");
        if (!(a2 instanceof a)) {
            return super.restoreState(bundle);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        WebBackForwardList b2 = ((a) a2).b(bundle);
        com.bytedance.webx.e.c.f45980b.get().b();
        return b2;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        if (!d.b.f45978a) {
            return super.saveState(bundle);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "saveState");
        if (!(a2 instanceof a)) {
            return super.saveState(bundle);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        WebBackForwardList a3 = ((a) a2).a(bundle);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    public void saveWebArchive(String str) {
        if (!d.b.f45978a) {
            super.saveWebArchive(str);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "saveWebArchive");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).b(str);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.saveWebArchive(str);
    }

    public void setCertificate(SslCertificate sslCertificate) {
        if (!d.b.f45978a) {
            super.setCertificate(sslCertificate);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "setCertificate");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(sslCertificate);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.setCertificate(sslCertificate);
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        if (!d.b.f45978a) {
            super.setDownloadListener(downloadListener);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "setDownloadListener");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(downloadListener);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.setDownloadListener(downloadListener);
    }

    public void setFindListener(WebView.FindListener findListener) {
        if (!d.b.f45978a) {
            super.setFindListener(findListener);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "setFindListener");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(findListener);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.setFindListener(findListener);
    }

    @Override // com.bytedance.webx.e.a.c.a
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (!d.b.f45978a) {
            super.setWebChromeClient(webChromeClient);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "setWebChromeClient");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(webChromeClient);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.setWebChromeClient(webChromeClient);
    }

    @Override // com.bytedance.webx.e.a.c.a
    public void setWebViewClient(WebViewClient webViewClient) {
        if (!d.b.f45978a) {
            a((a) this, webViewClient);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "setWebViewClient");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(com.example.a.c.a(webViewClient));
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        a((a) this, webViewClient);
    }

    @Override // com.bytedance.webx.e.a.c.a
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        if (!d.b.f45978a) {
            super.setWebViewRenderProcessClient(webViewRenderProcessClient);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "setWebViewRenderProcessClient");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(webViewRenderProcessClient);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    @Override // com.bytedance.webx.e.a.c.a
    public void zoomBy(float f2) {
        if (!d.b.f45978a) {
            super.zoomBy(f2);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "zoomBy");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(f2);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.zoomBy(f2);
    }

    public final void b(String str) {
        a((a) this, str);
    }

    public final boolean c(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean b(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void a(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final boolean b(boolean z) {
        return super.pageDown(z);
    }

    public final void b(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    private static void a(a aVar, String str) {
        String a2 = h.f149026a.a(aVar, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        super.loadUrl(str);
    }

    private static void a(a aVar, WebViewClient webViewClient) {
        if (com.ss.android.ugc.tiktok.security.c.b.a() && webViewClient != null) {
            WebSettings settings = aVar.getSettings();
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

    public void addJavascriptInterface(Object obj, String str) {
        if (!d.b.f45978a) {
            super.addJavascriptInterface(obj, str);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "addJavascriptInterface");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(obj, str);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!d.b.f45978a) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "evaluateJavascript");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(str, valueCallback);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    public void flingScroll(int i2, int i3) {
        if (!d.b.f45978a) {
            super.flingScroll(i2, i3);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "flingScroll");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(i2, i3);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.flingScroll(i2, i3);
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        if (!d.b.f45978a) {
            return super.getHttpAuthUsernamePassword(str, str2);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getHttpAuthUsernamePassword");
        if (!(a2 instanceof a)) {
            return super.getHttpAuthUsernamePassword(str, str2);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        String[] a3 = ((a) a2).a(str, str2);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!d.b.f45978a) {
            return super.onKeyDown(i2, keyEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onKeyDown");
        if (!(a2 instanceof a)) {
            return super.onKeyDown(i2, keyEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(i2, keyEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (!d.b.f45978a) {
            return super.onKeyUp(i2, keyEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onKeyUp");
        if (!(a2 instanceof a)) {
            return super.onKeyUp(i2, keyEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean b2 = ((a) a2).b(i2, keyEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return b2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!d.b.f45978a) {
            super.onMeasure(i2, i3);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onMeasure");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).b(i2, i3);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // com.bytedance.webx.e.a.c.a
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        if (!d.b.f45978a) {
            super.onProvideAutofillVirtualStructure(viewStructure, i2);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onProvideAutofillVirtualStructure");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(viewStructure, i2);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        if (!d.b.f45978a) {
            super.onVisibilityChanged(view, i2);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onVisibilityChanged");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(view, i2);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onVisibilityChanged(view, i2);
    }

    public void postUrl(String str, byte[] bArr) {
        if (!d.b.f45978a) {
            super.postUrl(str, bArr);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "postUrl");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(str, bArr);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.postUrl(str, bArr);
    }

    @Override // com.bytedance.webx.e.a.c.a
    public void postWebMessage(WebMessage webMessage, Uri uri) {
        if (!d.b.f45978a) {
            super.postWebMessage(webMessage, uri);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "postWebMessage");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(webMessage, uri);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.postWebMessage(webMessage, uri);
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (!d.b.f45978a) {
            return super.requestFocus(i2, rect);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "requestFocus");
        if (!(a2 instanceof a)) {
            return super.requestFocus(i2, rect);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(i2, rect);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!d.b.f45978a) {
            a(this, str, map);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "loadUrl");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(str, map);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        a(this, str, map);
    }

    @Override // com.bytedance.webx.e.a.c.a
    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        if (!d.b.f45978a) {
            super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "setWebViewRenderProcessClient");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(executor, webViewRenderProcessClient);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    public final void a(int i2, int i3) {
        super.flingScroll(i2, i3);
    }

    public final boolean b(int i2, KeyEvent keyEvent) {
        return super.onKeyUp(i2, keyEvent);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void loadData(String str, String str2, String str3) {
        if (!d.b.f45978a) {
            super.loadData(str, str2, str3);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "loadData");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).b(str, str2, str3);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.loadData(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (!d.b.f45978a) {
            super.onFocusChanged(z, i2, rect);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onFocusChanged");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(z, i2, rect);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onFocusChanged(z, i2, rect);
    }

    public boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        if (!d.b.f45978a) {
            return super.onKeyMultiple(i2, i3, keyEvent);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onKeyMultiple");
        if (!(a2 instanceof a)) {
            return super.onKeyMultiple(i2, i3, keyEvent);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(i2, i3, keyEvent);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }

    public void savePassword(String str, String str2, String str3) {
        if (!d.b.f45978a) {
            super.savePassword(str, str2, str3);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "savePassword");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(str, str2, str3);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.savePassword(str, str2, str3);
    }

    private static void a(a aVar, String str, Map map) {
        String a2 = h.f149026a.a(aVar, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        if (!d.b.f45978a) {
            super.saveWebArchive(str, z, valueCallback);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "saveWebArchive");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(str, z, valueCallback);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.saveWebArchive(str, z, valueCallback);
    }

    public final void b(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    public final void b(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        if (!d.b.f45978a) {
            super.onOverScrolled(i2, i3, z, z2);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onOverScrolled");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(i2, i3, z, z2);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onOverScrolled(i2, i3, z, z2);
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        if (!d.b.f45978a) {
            super.onScrollChanged(i2, i3, i4, i5);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onScrollChanged");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).b(i2, i3, i4, i5);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onScrollChanged(i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!d.b.f45978a) {
            super.onSizeChanged(i2, i3, i4, i5);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onSizeChanged");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(i2, i3, i4, i5);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        if (!d.b.f45978a) {
            super.setHttpAuthUsernamePassword(str, str2, str3, str4);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "setHttpAuthUsernamePassword");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(str, str2, str3, str4);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public final void a(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }

    public final void a(int i2, int i3, boolean z, boolean z2) {
        super.onOverScrolled(i2, i3, z, z2);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!d.b.f45978a) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "loadDataWithBaseURL");
        if (a2 instanceof a) {
            com.bytedance.webx.e.c.f45980b.get().a();
            ((a) a2).a(str, str2, str3, str4, str5);
            com.bytedance.webx.e.c.f45980b.get().b();
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        if (!d.b.f45978a) {
            return super.overScrollBy(i2, i3, i4, i5, i6, i7, i8, i9, z);
        }
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "overScrollBy");
        if (!(a2 instanceof a)) {
            return super.overScrollBy(i2, i3, i4, i5, i6, i7, i8, i9, z);
        }
        com.bytedance.webx.e.c.f45980b.get().a();
        boolean a3 = ((a) a2).a(i2, i3, i4, i5, i6, i7, i8, i9, z);
        com.bytedance.webx.e.c.f45980b.get().b();
        return a3;
    }
}
