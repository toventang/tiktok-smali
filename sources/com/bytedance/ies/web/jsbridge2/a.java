package com.bytedance.ies.web.jsbridge2;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f35560a;

    /* renamed from: b  reason: collision with root package name */
    private volatile View f35561b;

    static {
        Covode.recordClassIndex(21255);
    }

    /* access modifiers changed from: protected */
    public abstract View a();

    /* renamed from: com.bytedance.ies.web.jsbridge2.a$a  reason: collision with other inner class name */
    public static final class C0808a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f35562a;

        static {
            Covode.recordClassIndex(21256);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ies.web.jsbridge2.a
        public final View a() {
            return this.f35562a;
        }

        public C0808a(WebView webView) {
            this.f35562a = webView;
        }
    }

    public final View b() {
        if (!this.f35560a) {
            synchronized (this) {
                if (!this.f35560a) {
                    this.f35560a = true;
                    this.f35561b = a();
                }
            }
        }
        return this.f35561b;
    }
}
