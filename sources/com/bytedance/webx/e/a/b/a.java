package com.bytedance.webx.e.a.b;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.a;
import com.bytedance.webx.e;
import com.bytedance.webx.e.a.a.a;
import com.bytedance.webx.e.a.a.b;
import com.bytedance.webx.e.a.c;
import java.util.Map;

public class a extends com.bytedance.webx.a<c> implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f45958a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45959b;

    /* renamed from: j  reason: collision with root package name */
    public boolean f45960j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f45961k;

    /* renamed from: l  reason: collision with root package name */
    private c.a f45962l = new c.a() {
        /* class com.bytedance.webx.e.a.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28099);
        }

        @Override // com.bytedance.webx.f.a
        public final com.bytedance.webx.a a() {
            return a.this;
        }

        @Override // com.bytedance.webx.e.a.c.a
        public final void a(String str) {
            boolean z;
            if (a.this.f45958a || a.this.f45959b) {
                z = false;
            } else {
                z = true;
            }
            a.this.f45958a = true;
            if (z) {
                try {
                    a.this.a(str);
                } catch (Throwable th) {
                    a.this.f45958a = false;
                    throw th;
                }
            }
            super.a(str);
            a.this.f45958a = false;
        }

        @Override // com.bytedance.webx.e.a.c.a
        public final void a(String str, Map<String, String> map) {
            boolean z;
            if (a.this.f45958a || a.this.f45959b) {
                z = false;
            } else {
                z = true;
            }
            a.this.f45959b = true;
            if (z) {
                try {
                    a.this.a(str);
                } catch (Throwable th) {
                    a.this.f45959b = false;
                    throw th;
                }
            }
            super.a(str, map);
            a.this.f45959b = false;
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.webx.a.b f45963m;

    static {
        Covode.recordClassIndex(28098);
    }

    /* renamed from: com.bytedance.webx.e.a.b.a$a  reason: collision with other inner class name */
    public class C1139a extends com.bytedance.webx.a {

        /* renamed from: b  reason: collision with root package name */
        private a.AbstractC1138a f45966b = new a.AbstractC1138a() {
            /* class com.bytedance.webx.e.a.b.a.C1139a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28101);
            }

            @Override // com.bytedance.webx.f.a
            public final com.bytedance.webx.a a() {
                return C1139a.this;
            }

            @Override // com.bytedance.webx.e.a.a.a.AbstractC1138a
            public final void a(WebView webView, int i2) {
                super.a(webView, i2);
            }
        };

        static {
            Covode.recordClassIndex(28100);
        }

        public C1139a() {
        }

        @Override // com.bytedance.webx.a
        public final void a(a.C1134a aVar) {
            a("onProgressChanged", this.f45966b, 500);
        }
    }

    public class b extends com.bytedance.webx.a {

        /* renamed from: b  reason: collision with root package name */
        private b.a f45969b = new b.a() {
            /* class com.bytedance.webx.e.a.b.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28103);
            }

            @Override // com.bytedance.webx.f.a
            public final com.bytedance.webx.a a() {
                return b.this;
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final boolean b(WebView webView, String str) {
                boolean z;
                if (a.this.f45960j || a.this.f45961k) {
                    z = false;
                } else {
                    z = true;
                }
                a.this.f45960j = true;
                try {
                    boolean b2 = super.b(webView, str);
                    if (z && !b2) {
                        a.this.b(str);
                    }
                    return b2;
                } finally {
                    a.this.f45960j = false;
                }
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final boolean a(WebView webView, WebResourceRequest webResourceRequest) {
                boolean z;
                if (a.this.f45960j || a.this.f45961k) {
                    z = false;
                } else {
                    z = true;
                }
                a.this.f45961k = true;
                try {
                    boolean a2 = super.a(webView, webResourceRequest);
                    if (z && !a2) {
                        a.this.b(webResourceRequest.getUrl().toString());
                    }
                    return a2;
                } finally {
                    a.this.f45961k = false;
                }
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void a(WebView webView, String str, boolean z) {
                a.this.b(str);
                super.a(webView, str, z);
            }
        };

        static {
            Covode.recordClassIndex(28102);
        }

        public b() {
        }

        @Override // com.bytedance.webx.a
        public final void a(a.C1134a aVar) {
            a("shouldOverrideUrlLoading", this.f45969b, 500);
            a("doUpdateVisitedHistory", this.f45969b, 500);
        }
    }

    public final void b(String str) {
        com.bytedance.webx.a.b bVar = this.f45963m;
        if (bVar != null) {
            bVar.a(str, 1);
        }
    }

    public final void a(String str) {
        com.bytedance.webx.a.b bVar = this.f45963m;
        if (bVar == null) {
            com.bytedance.webx.a.b bVar2 = new com.bytedance.webx.a.b(this.f45902e);
            this.f45963m = bVar2;
            bVar2.a(str, 0);
            return;
        }
        bVar.a(str, 1);
    }

    @Override // com.bytedance.webx.a
    public final void a(a.C1134a aVar) {
        a.C1134a.a(((com.bytedance.webx.e.a.c.a) b()).getExtendableWebViewClient(), new b());
        a.C1134a.a(((com.bytedance.webx.e.a.c.a) b()).getExtendableWebChromeClient(), new C1139a());
        a("loadUrl", this.f45962l, 500);
    }
}
