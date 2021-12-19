package com.bytedance.lynx.hybrid.webkit.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.a;
import com.bytedance.webx.e;
import h.a.n;
import h.f.b.l;

public final class c extends com.bytedance.webx.a<com.bytedance.webx.e.a.c> implements e.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41269b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f41270a = new e();

    /* renamed from: j  reason: collision with root package name */
    private final d f41271j = new d();

    /* renamed from: k  reason: collision with root package name */
    private final C1010c f41272k = new C1010c();

    public interface b {
        static {
            Covode.recordClassIndex(25292);
        }

        e a();

        d b();
    }

    static {
        Covode.recordClassIndex(25290);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25291);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final e f41275a = new e();

        /* renamed from: b  reason: collision with root package name */
        private final d f41276b = new d();

        static {
            Covode.recordClassIndex(25295);
        }

        @Override // com.bytedance.lynx.hybrid.webkit.a.a.c.b
        public final e a() {
            return this.f41275a;
        }

        @Override // com.bytedance.lynx.hybrid.webkit.a.a.c.b
        public final d b() {
            return this.f41276b;
        }

        e() {
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.c$c  reason: collision with other inner class name */
    public final class C1010c extends com.bytedance.webx.a<com.bytedance.webx.e.a.a.a> {
        static {
            Covode.recordClassIndex(25293);
        }

        @Override // com.bytedance.webx.a
        public final boolean a() {
            return c.this.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C1010c() {
        }

        @Override // com.bytedance.webx.a
        public final void a(a.C1134a aVar) {
            for (String str : n.b("onProgressChanged", "onReceivedTitle", "onReceivedIcon", "onReceivedTouchIconUrl", "onShowCustomView", "onHideCustomView", "onCreateWindow", "onRequestFocus", "onCloseWindow", "onJsAlert", "onJsConfirm", "onJsPrompt", "onJsBeforeUnload", "onExceededDatabaseQuota", "onReachedMaxAppCacheSize", "onGeolocationPermissionsShowPrompt", "onGeolocationPermissionsHidePrompt", "onPermissionRequest", "onPermissionRequestCanceled", "onJsTimeout", "onConsoleMessage", "getDefaultVideoPoster", "getVideoLoadingProgressView", "getVisitedHistory", "onShowFileChooser")) {
                d b2 = c.this.f41270a.b();
                l.c(this, "");
                b2.f41277d = this;
                a(str, b2, 9000);
            }
        }
    }

    public final class d extends com.bytedance.webx.a<com.bytedance.webx.e.a.a.b> {
        static {
            Covode.recordClassIndex(25294);
        }

        @Override // com.bytedance.webx.a
        public final boolean a() {
            return c.this.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }

        @Override // com.bytedance.webx.a
        public final void a(a.C1134a aVar) {
            for (String str : n.b("shouldOverrideUrlLoading", "onPageStarted", "onPageFinished", "onLoadResource", "onPageCommitVisible", "shouldInterceptRequest", "onTooManyRedirects", "onReceivedError", "onReceivedHttpError", "onFormResubmission", "doUpdateVisitedHistory", "onReceivedSslError", "onReceivedClientCertRequest", "onReceivedHttpAuthRequest", "shouldOverrideKeyEvent", "onUnhandledKeyEvent", "onScaleChanged", "onReceivedLoginRequest", "onRenderProcessGone", "onSafeBrowsingHit")) {
                e a2 = c.this.f41270a.a();
                l.c(this, "");
                a2.f41278a = this;
                a(str, a2, 9000);
            }
        }
    }

    @Override // com.bytedance.webx.a
    public final void a(a.C1134a aVar) {
        this.f45904g = "CustomClientExtension";
        if (aVar == null) {
            l.a();
        }
        com.bytedance.webx.e.a.c.a aVar2 = (com.bytedance.webx.e.a.c.a) b();
        l.a((Object) aVar2, "");
        a.C1134a.a(aVar2.getExtendableWebViewClient(), this.f41271j);
        com.bytedance.webx.e.a.c.a aVar3 = (com.bytedance.webx.e.a.c.a) b();
        l.a((Object) aVar3, "");
        a.C1134a.a(aVar3.getExtendableWebChromeClient(), this.f41272k);
    }
}
