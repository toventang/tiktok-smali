package com.ss.android.ugc.tiktok.seclink.impl.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f149019a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final g f149020b = new g();

    private g() {
    }

    public static final class a {
        @c(a = "enabled")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f149021a;
        @c(a = "scenes")

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f149022b;
        @c(a = "tokens")

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f149023c;

        static {
            Covode.recordClassIndex(98153);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f149021a == aVar.f149021a && l.a(this.f149022b, aVar.f149022b) && l.a(this.f149023c, aVar.f149023c);
        }

        public final int hashCode() {
            boolean z = this.f149021a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            List<String> list = this.f149022b;
            int i6 = 0;
            int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
            List<String> list2 = this.f149023c;
            if (list2 != null) {
                i6 = list2.hashCode();
            }
            return hashCode + i6;
        }

        public final String toString() {
            return "SecLinkTokenConfig(enable=" + this.f149021a + ", allowScenes=" + this.f149022b + ", allowTokens=" + this.f149023c + ")";
        }

        public /* synthetic */ a() {
            this(new ArrayList(), new ArrayList());
        }

        private a(List<String> list, List<String> list2) {
            l.d(list, "");
            l.d(list2, "");
            this.f149021a = false;
            this.f149022b = list;
            this.f149023c = list2;
        }
    }

    static {
        Covode.recordClassIndex(98152);
    }

    public static a a() {
        try {
            SettingsManager a2 = SettingsManager.a();
            a aVar = f149019a;
            a aVar2 = (a) a2.a("seclink_token_config", a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f149019a;
        }
    }
}
