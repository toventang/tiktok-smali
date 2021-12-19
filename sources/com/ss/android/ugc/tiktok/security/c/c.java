package com.ss.android.ugc.tiktok.security.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f149051a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final c f149052b = new c();

    private c() {
    }

    public static final class a {
        @com.google.gson.a.c(a = "enabled")

        /* renamed from: a  reason: collision with root package name */
        public boolean f149053a;

        static {
            Covode.recordClassIndex(98176);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.f149053a == ((a) obj).f149053a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f149053a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "HttpsGuardConfig(enable=" + this.f149053a + ")";
        }

        private a() {
            this.f149053a = false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(98175);
    }

    public static a a() {
        try {
            SettingsManager a2 = SettingsManager.a();
            a aVar = f149051a;
            a aVar2 = (a) a2.a("webview_loadurl_force_https", a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f149051a;
        }
    }
}
