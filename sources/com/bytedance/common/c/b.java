package com.bytedance.common.c;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f26745a = new C0574b((byte) 0);

    public static class a {
        static {
            Covode.recordClassIndex(15771);
        }

        public String a(Context context) {
            return null;
        }

        public void a(WebSettings webSettings, boolean z) {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.common.c.b$b  reason: collision with other inner class name */
    static class C0574b extends a {
        static {
            Covode.recordClassIndex(15772);
        }

        private C0574b() {
            super((byte) 0);
        }

        /* synthetic */ C0574b(byte b2) {
            this();
        }

        @Override // com.bytedance.common.c.b.a
        public final String a(Context context) {
            try {
                return WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.bytedance.common.c.b.a
        public final void a(WebSettings webSettings, boolean z) {
            try {
                webSettings.setMediaPlaybackRequiresUserGesture(z);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(15770);
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void a(WebSettings webSettings, boolean z) {
        f26745a.a(webSettings, z);
    }
}
