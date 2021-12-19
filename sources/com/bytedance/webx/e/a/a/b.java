package com.bytedance.webx.e.a.a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.e.c;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;

public class b extends com.bytedance.webx.e.a.a.a.b {
    static {
        Covode.recordClassIndex(28095);
    }

    public final boolean a(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final boolean a(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void a(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public final boolean a(WebView webView, KeyEvent keyEvent) {
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public final boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public static abstract class a extends com.bytedance.webx.f.a<b> {
        static {
            Covode.recordClassIndex(28096);
        }

        public boolean a(WebView webView, WebResourceRequest webResourceRequest) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "shouldOverrideUrlLoading");
            if (a2 instanceof a) {
                return ((a) a2).a(webView, webResourceRequest);
            }
            return ((b) x()).a(webView, webResourceRequest);
        }

        public void a(WebView webView, String str, Bitmap bitmap) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onPageStarted");
            if (a2 instanceof a) {
                ((a) a2).a(webView, str, bitmap);
            } else {
                ((b) x()).a(webView, str, bitmap);
            }
        }

        public void a(WebView webView, String str) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onPageFinished");
            if (a2 instanceof a) {
                ((a) a2).a(webView, str);
            } else {
                ((b) x()).b(webView, str);
            }
        }

        public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onReceivedHttpError");
            if (a2 instanceof a) {
                ((a) a2).a(webView, webResourceRequest, webResourceResponse);
            } else {
                ((b) x()).a(webView, webResourceRequest, webResourceResponse);
            }
        }

        public void a(WebView webView, String str, boolean z) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "doUpdateVisitedHistory");
            if (a2 instanceof a) {
                ((a) a2).a(webView, str, z);
            } else {
                ((b) x()).a(webView, str, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.webkit.WebView r4, android.view.KeyEvent r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "shouldOverrideKeyEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                boolean r0 = r0.a(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.a(android.webkit.WebView, android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onReceivedLoginRequest"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                r0.a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.a(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String):void");
        }

        public boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onRenderProcessGone");
            if (a2 instanceof a) {
                return ((a) a2).a(webView, renderProcessGoneDetail);
            }
            return ((b) x()).a(webView, renderProcessGoneDetail);
        }

        public WebResourceResponse b(WebView webView, WebResourceRequest webResourceRequest) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "shouldInterceptRequest");
            if (a2 instanceof a) {
                return ((a) a2).b(webView, webResourceRequest);
            }
            return ((b) x()).b(webView, webResourceRequest);
        }

        public void c(WebView webView, String str) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onLoadResource");
            if (a2 instanceof a) {
                ((a) a2).c(webView, str);
            } else {
                ((b) x()).c(webView, str);
            }
        }

        public WebResourceResponse d(WebView webView, String str) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "shouldInterceptRequest");
            if (a2 instanceof a) {
                return ((a) a2).d(webView, str);
            }
            return ((b) x()).e(webView, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(android.webkit.WebView r4, java.lang.String r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onPageCommitVisible"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                r0.d(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.e(android.webkit.WebView, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.webkit.WebView r4, android.view.KeyEvent r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onUnhandledKeyEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                r0.b(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.b(android.webkit.WebView, android.view.KeyEvent):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r4, android.webkit.ClientCertRequest r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onReceivedClientCertRequest"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                r0.a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.a(android.webkit.WebView, android.webkit.ClientCertRequest):void");
        }

        public boolean b(WebView webView, String str) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "shouldOverrideUrlLoading");
            if (a2 instanceof a) {
                return ((a) a2).b(webView, str);
            }
            return ((b) x()).a(webView, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r4, float r5, float r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onScaleChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                r0.a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.a(android.webkit.WebView, float, float):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.webkit.WebView r4, android.os.Message r5, android.os.Message r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onFormResubmission"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                r0.b(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.b(android.webkit.WebView, android.os.Message, android.os.Message):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r4, android.os.Message r5, android.os.Message r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onTooManyRedirects"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                r0.a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.a(android.webkit.WebView, android.os.Message, android.os.Message):void");
        }

        public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onReceivedSslError");
            if (a2 instanceof a) {
                ((a) a2).a(webView, sslErrorHandler, sslError);
            } else {
                ((b) x()).a(webView, sslErrorHandler, sslError);
            }
        }

        public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onReceivedError");
            if (a2 instanceof a) {
                ((a) a2).a(webView, webResourceRequest, webResourceError);
            } else {
                ((b) x()).a(webView, webResourceRequest, webResourceError);
            }
        }

        public void a(WebView webView, int i2, String str, String str2) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onReceivedError");
            if (a2 instanceof a) {
                ((a) a2).a(webView, i2, str, str2);
            } else {
                ((b) x()).a(webView, i2, str, str2);
            }
        }

        public void a(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(y(), this, "onReceivedHttpAuthRequest");
            if (a2 instanceof a) {
                ((a) a2).a(webView, httpAuthHandler, str, str2);
            } else {
                ((b) x()).a(webView, httpAuthHandler, str, str2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r4, android.webkit.WebResourceRequest r5, int r6, android.webkit.SafeBrowsingResponse r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.y()
                java.lang.String r0 = "onSafeBrowsingHit"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.f.b.a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.e.a.a.b.a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.e.a.a.b) r0
                r0.a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.a.b.a.a(android.webkit.WebView, android.webkit.WebResourceRequest, int, android.webkit.SafeBrowsingResponse):void");
        }
    }

    public final void c(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public final void d(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
    }

    public final WebResourceResponse b(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final WebResourceResponse e(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public final void b(WebView webView, KeyEvent keyEvent) {
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public final void a(WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public final void b(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onLoadResource(WebView webView, String str) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onLoadResource");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).c(webView, str);
            c.f45980b.get().b();
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onPageCommitVisible(WebView webView, String str) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onPageCommitVisible");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).e(webView, str);
            c.f45980b.get().b();
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onPageFinished(WebView webView, String str) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onPageFinished");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, str);
            c.f45980b.get().b();
            return;
        }
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onReceivedClientCertRequest");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, clientCertRequest);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onRenderProcessGone");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, renderProcessGoneDetail);
            c.f45980b.get().b();
            return com.example.a.c.a(webView, renderProcessGoneDetail);
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        return com.example.a.c.a(webView, renderProcessGoneDetail);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onUnhandledKeyEvent");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).b(webView, keyEvent);
            c.f45980b.get().b();
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "shouldOverrideKeyEvent");
        if (!(a2 instanceof a)) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        c.f45980b.get().a();
        boolean a3 = ((a) a2).a(webView, keyEvent);
        c.f45980b.get().b();
        return a3;
    }

    @Override // com.bytedance.webx.e.a.a.a.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "shouldOverrideUrlLoading");
        if (!(a2 instanceof a)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        c.f45980b.get().a();
        boolean a3 = ((a) a2).a(webView, webResourceRequest);
        c.f45980b.get().b();
        return a3;
    }

    @Override // com.bytedance.webx.e.a.a.a.b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        e<WebResourceRequest, WebResourceResponse> o = n.f112474e.o(new e<>(webResourceRequest, webView, null, d.CONTINUE));
        if (o.f112463f == d.INTERCEPT && o.f112459b != null) {
            return o.f112459b;
        }
        if (o.f112463f != d.EXCEPTION || o.f112462e == null) {
            WebView webView2 = o.f112460c;
            Q q = o.f112458a;
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "shouldInterceptRequest");
            if (!(a2 instanceof a)) {
                return super.shouldInterceptRequest(webView2, (WebResourceRequest) q);
            }
            c.f45980b.get().a();
            WebResourceResponse b2 = ((a) a2).b(webView2, (WebResourceRequest) q);
            c.f45980b.get().b();
            return b2;
        }
        throw o.f112462e;
    }

    @Override // com.bytedance.webx.e.a.a.a.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "shouldOverrideUrlLoading");
        if (!(a2 instanceof a)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        c.f45980b.get().a();
        boolean b2 = ((a) a2).b(webView, str);
        c.f45980b.get().b();
        return b2;
    }

    @Override // com.bytedance.webx.e.a.a.a.b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        e<String, WebResourceResponse> n = n.f112474e.n(new e<>(str, webView, null, d.CONTINUE));
        if (n.f112463f == d.INTERCEPT && n.f112459b != null) {
            return n.f112459b;
        }
        if (n.f112463f != d.EXCEPTION || n.f112462e == null) {
            WebView webView2 = n.f112460c;
            Q q = n.f112458a;
            com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "shouldInterceptRequest");
            if (!(a2 instanceof a)) {
                return super.shouldInterceptRequest(webView2, (String) q);
            }
            c.f45980b.get().a();
            WebResourceResponse d2 = ((a) a2).d(webView2, q);
            c.f45980b.get().b();
            return d2;
        }
        throw n.f112462e;
    }

    public final void a(WebView webView, float f2, float f3) {
        super.onScaleChanged(webView, f2, f3);
    }

    public final void b(WebView webView, Message message, Message message2) {
        super.onFormResubmission(webView, message, message2);
    }

    public final void a(WebView webView, Message message, Message message2) {
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "doUpdateVisitedHistory");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, str, z);
            c.f45980b.get().b();
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onFormResubmission");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).b(webView, message, message2);
            c.f45980b.get().b();
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onPageStarted");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, str, bitmap);
            c.f45980b.get().b();
            return;
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onReceivedHttpError");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, webResourceRequest, webResourceResponse);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onReceivedSslError");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, sslErrorHandler, sslError);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onScaleChanged(WebView webView, float f2, float f3) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onScaleChanged");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, f2, f3);
            c.f45980b.get().b();
            return;
        }
        super.onScaleChanged(webView, f2, f3);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onTooManyRedirects");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, message, message2);
            c.f45980b.get().b();
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onReceivedError");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, webResourceRequest, webResourceError);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void a(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    public final void a(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
    }

    public final void a(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onReceivedError");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, i2, str, str2);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedError(webView, i2, str, str2);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onReceivedHttpAuthRequest");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, httpAuthHandler, str, str2);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onReceivedLoginRequest");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, str, str2, str3);
            c.f45980b.get().b();
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.bytedance.webx.e.a.a.a.b
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        com.bytedance.webx.f.a a2 = com.bytedance.webx.f.b.a(getExtendableContext(), "onSafeBrowsingHit");
        if (a2 instanceof a) {
            c.f45980b.get().a();
            ((a) a2).a(webView, webResourceRequest, i2, safeBrowsingResponse);
            c.f45980b.get().b();
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i2, safeBrowsingResponse);
    }

    public final void a(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, i2, safeBrowsingResponse);
    }

    public final void a(WebView webView, String str, String str2, String str3) {
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }
}
