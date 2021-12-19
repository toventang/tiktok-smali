package com.bytedance.webx.e.a.a;

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
import com.bytedance.webx.e.c;
import com.bytedance.webx.f.b;

public class a extends com.bytedance.webx.e.a.a.a.a {
    static {
        Covode.recordClassIndex(28091);
    }

    public final void a() {
        super.onHideCustomView();
    }

    public final void b() {
        super.onGeolocationPermissionsHidePrompt();
    }

    public final boolean a(WebView webView, boolean z, boolean z2, Message message) {
        return super.onCreateWindow(webView, z, z2, message);
    }

    public final boolean a(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public final boolean a(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public final void a(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        super.onExceededDatabaseQuota(str, str2, j2, j3, j4, quotaUpdater);
    }

    public final void a(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public final void a(String str, int i2, String str2) {
        super.onConsoleMessage(str, i2, str2);
    }

    public final boolean a(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean a(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    /* renamed from: com.bytedance.webx.e.a.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC1138a extends com.bytedance.webx.f.a<a> {
        static {
            Covode.recordClassIndex(28092);
        }

        public void a(WebView webView, String str) {
            com.bytedance.webx.f.a a2 = b.a(y(), this, "onReceivedTitle");
            if (a2 instanceof AbstractC1138a) {
                ((AbstractC1138a) a2).a(webView, str);
            } else {
                ((a) x()).a(webView, str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r4, java.lang.String r5, boolean r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onReceivedTouchIconUrl"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.WebView, java.lang.String, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.webkit.WebView r4, boolean r5, boolean r6, android.os.Message r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onCreateWindow"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                boolean r0 = r0.a(r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.WebView, boolean, boolean, android.os.Message):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, android.webkit.JsResult r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onJsAlert"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                boolean r0 = r0.a(r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.webkit.WebView r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, android.webkit.JsPromptResult r11) {
            /*
                r6 = this;
                r2 = r6
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onJsPrompt"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r4 = r10
                r5 = r11
                r1 = r7
                r2 = r8
                r3 = r9
                boolean r0 = r0.a(r1, r2, r3, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsPromptResult):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r11, java.lang.String r12, long r13, long r15, long r17, android.webkit.WebStorage.QuotaUpdater r19) {
            /*
                r10 = this;
                r2 = r10
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onExceededDatabaseQuota"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r5 = r15
                r3 = r13
                r9 = r19
                r7 = r17
                r2 = r12
                r1 = r11
                r0.a(r1, r2, r3, r5, r7, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(java.lang.String, java.lang.String, long, long, long, android.webkit.WebStorage$QuotaUpdater):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onGeolocationPermissionsShowPrompt"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r4, int r5, java.lang.String r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onConsoleMessage"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(java.lang.String, int, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.webkit.ConsoleMessage r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onConsoleMessage"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                boolean r0 = r0.a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.ConsoleMessage):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.webkit.WebView r4, android.webkit.ValueCallback<android.net.Uri[]> r5, android.webkit.WebChromeClient.FileChooserParams r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onShowFileChooser"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                boolean r0 = r0.a(r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onHideCustomView"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.b():void");
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
                java.lang.String r0 = "onGeolocationPermissionsHidePrompt"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.c():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean d() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onJsTimeout"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                boolean r0 = r0.c()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.d():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Bitmap e() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getDefaultVideoPoster"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                android.graphics.Bitmap r0 = r0.d()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.e():android.graphics.Bitmap");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.View f() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getVideoLoadingProgressView"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                android.view.View r0 = r0.e()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.f():android.view.View");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.webkit.PermissionRequest r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onPermissionRequestCanceled"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.b(android.webkit.PermissionRequest):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.webkit.WebView r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onCloseWindow"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.b(android.webkit.WebView):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.PermissionRequest r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onPermissionRequest"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.PermissionRequest):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.ValueCallback<java.lang.String[]> r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "getVisitedHistory"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.ValueCallback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onRequestFocus"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.WebView):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r4, android.webkit.WebChromeClient.CustomViewCallback r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onShowCustomView"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.view.View, android.webkit.WebChromeClient$CustomViewCallback):void");
        }

        public void a(WebView webView, int i2) {
            com.bytedance.webx.f.a a2 = b.a(y(), this, "onProgressChanged");
            if (a2 instanceof AbstractC1138a) {
                ((AbstractC1138a) a2).a(webView, i2);
            } else {
                ((a) x()).a(webView, i2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r4, android.graphics.Bitmap r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onReceivedIcon"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.webkit.WebView, android.graphics.Bitmap):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(long r7, long r9, android.webkit.WebStorage.QuotaUpdater r11) {
            /*
                r6 = this;
                r2 = r6
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onReachedMaxAppCacheSize"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r1 = r7
                r3 = r9
                r5 = r11
                r0.a(r1, r3, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(long, long, android.webkit.WebStorage$QuotaUpdater):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r4, int r5, android.webkit.WebChromeClient.CustomViewCallback r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onShowCustomView"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                r0.a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.a(android.view.View, int, android.webkit.WebChromeClient$CustomViewCallback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean c(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, android.webkit.JsResult r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onJsBeforeUnload"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                boolean r0 = r0.c(r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.c(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, android.webkit.JsResult r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onJsConfirm"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.a.AbstractC1138a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.e.a.a.a) r0
                boolean r0 = r0.b(r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.a.AbstractC1138a.b(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }
    }

    public final boolean c() {
        return super.onJsTimeout();
    }

    public final Bitmap d() {
        return super.getDefaultVideoPoster();
    }

    public final View e() {
        return super.getVideoLoadingProgressView();
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public Bitmap getDefaultVideoPoster() {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getDefaultVideoPoster");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.getDefaultVideoPoster();
        }
        c.f45980b.get().a();
        Bitmap e2 = ((AbstractC1138a) a2).e();
        c.f45980b.get().b();
        return e2;
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public View getVideoLoadingProgressView() {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getVideoLoadingProgressView");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.getVideoLoadingProgressView();
        }
        c.f45980b.get().a();
        View f2 = ((AbstractC1138a) a2).f();
        c.f45980b.get().b();
        return f2;
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onGeolocationPermissionsHidePrompt() {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onGeolocationPermissionsHidePrompt");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).c();
            c.f45980b.get().b();
            return;
        }
        super.onGeolocationPermissionsHidePrompt();
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onHideCustomView() {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onHideCustomView");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).b();
            c.f45980b.get().b();
            return;
        }
        super.onHideCustomView();
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public boolean onJsTimeout() {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onJsTimeout");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.onJsTimeout();
        }
        c.f45980b.get().a();
        boolean d2 = ((AbstractC1138a) a2).d();
        c.f45980b.get().b();
        return d2;
    }

    public final void b(PermissionRequest permissionRequest) {
        super.onPermissionRequestCanceled(permissionRequest);
    }

    public final void b(WebView webView) {
        super.onCloseWindow(webView);
    }

    public final void a(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
    }

    @Override // com.bytedance.webx.e.a.a.a.a, android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "getVisitedHistory");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(valueCallback);
            c.f45980b.get().b();
            return;
        }
        super.getVisitedHistory(valueCallback);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onCloseWindow(WebView webView) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onCloseWindow");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).b(webView);
            c.f45980b.get().b();
            return;
        }
        super.onCloseWindow(webView);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onPermissionRequest");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(permissionRequest);
            c.f45980b.get().b();
            return;
        }
        super.onPermissionRequest(permissionRequest);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onPermissionRequestCanceled");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).b(permissionRequest);
            c.f45980b.get().b();
            return;
        }
        super.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onRequestFocus(WebView webView) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onRequestFocus");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(webView);
            c.f45980b.get().b();
            return;
        }
        super.onRequestFocus(webView);
    }

    public final void a(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onConsoleMessage");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.onConsoleMessage(consoleMessage);
        }
        c.f45980b.get().a();
        boolean a3 = ((AbstractC1138a) a2).a(consoleMessage);
        c.f45980b.get().b();
        return a3;
    }

    public final void a(WebView webView) {
        super.onRequestFocus(webView);
    }

    public final void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onProgressChanged(WebView webView, int i2) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onProgressChanged");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(webView, i2);
            c.f45980b.get().b();
            return;
        }
        super.onProgressChanged(webView, i2);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onReceivedIcon");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(webView, bitmap);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onReceivedTitle(WebView webView, String str) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onReceivedTitle");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(webView, str);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onGeolocationPermissionsShowPrompt");
            if (a2 instanceof AbstractC1138a) {
                c.f45980b.get().a();
                ((AbstractC1138a) a2).a(str, callback);
                c.f45980b.get().b();
                return;
            }
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onShowCustomView");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(view, customViewCallback);
            c.f45980b.get().b();
            return;
        }
        super.onShowCustomView(view, customViewCallback);
    }

    public final void a(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
    }

    public final void a(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
    }

    public final void a(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }

    public final void a(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        super.onReachedMaxAppCacheSize(j2, j3, quotaUpdater);
    }

    public final void a(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i2, customViewCallback);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onConsoleMessage(String str, int i2, String str2) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onConsoleMessage");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(str, i2, str2);
            c.f45980b.get().b();
            return;
        }
        super.onConsoleMessage(str, i2, str2);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onReachedMaxAppCacheSize");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(j2, j3, quotaUpdater);
            c.f45980b.get().b();
            return;
        }
        super.onReachedMaxAppCacheSize(j2, j3, quotaUpdater);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onReceivedTouchIconUrl");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(webView, str, z);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onShowCustomView");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(view, i2, customViewCallback);
            c.f45980b.get().b();
            return;
        }
        super.onShowCustomView(view, i2, customViewCallback);
    }

    @Override // com.bytedance.webx.e.a.a.a.a, android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onShowFileChooser");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        c.f45980b.get().a();
        boolean a3 = ((AbstractC1138a) a2).a(webView, valueCallback, fileChooserParams);
        c.f45980b.get().b();
        return a3;
    }

    public final void a(WebView webView, String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    public final boolean c(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public final boolean b(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onCreateWindow");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.onCreateWindow(webView, z, z2, message);
        }
        c.f45980b.get().a();
        boolean a3 = ((AbstractC1138a) a2).a(webView, z, z2, message);
        c.f45980b.get().b();
        return a3;
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onJsAlert");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
        c.f45980b.get().a();
        boolean a3 = ((AbstractC1138a) a2).a(webView, str, str2, jsResult);
        c.f45980b.get().b();
        return a3;
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onJsBeforeUnload");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        c.f45980b.get().a();
        boolean c2 = ((AbstractC1138a) a2).c(webView, str, str2, jsResult);
        c.f45980b.get().b();
        return c2;
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onJsConfirm");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        c.f45980b.get().a();
        boolean b2 = ((AbstractC1138a) a2).b(webView, str, str2, jsResult);
        c.f45980b.get().b();
        return b2;
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onJsPrompt");
        if (!(a2 instanceof AbstractC1138a)) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        c.f45980b.get().a();
        boolean a3 = ((AbstractC1138a) a2).a(webView, str, str2, str3, jsPromptResult);
        c.f45980b.get().b();
        return a3;
    }

    @Override // com.bytedance.webx.e.a.a.a.a
    public void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        com.bytedance.webx.f.a a2 = b.a(getExtendableContext(), "onExceededDatabaseQuota");
        if (a2 instanceof AbstractC1138a) {
            c.f45980b.get().a();
            ((AbstractC1138a) a2).a(str, str2, j2, j3, j4, quotaUpdater);
            c.f45980b.get().b();
            return;
        }
        super.onExceededDatabaseQuota(str, str2, j2, j3, j4, quotaUpdater);
    }
}
