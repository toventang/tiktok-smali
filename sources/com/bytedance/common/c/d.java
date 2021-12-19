package com.bytedance.common.c;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static a f26747a;

    public static class a {
        static {
            Covode.recordClassIndex(15777);
        }

        public void a(WebSettings webSettings, int i2) {
        }

        public void a(WebView webView) {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static class b extends a {
        static {
            Covode.recordClassIndex(15778);
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.common.c.d.a
        public final void a(WebView webView) {
            if (webView != null) {
                try {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.bytedance.common.c.d.a
        public final void a(WebSettings webSettings, int i2) {
            if (webSettings != null) {
                try {
                    webSettings.setMixedContentMode(i2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(15776);
        if (Build.VERSION.SDK_INT >= 21) {
            f26747a = new b((byte) 0);
        } else {
            f26747a = new a((byte) 0);
        }
    }

    public static void a(WebSettings webSettings, int i2) {
        f26747a.a(webSettings, i2);
    }
}
