package com.bytedance.ies.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0724a f33131a = new C0724a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f33132b = new a();

    private a() {
    }

    /* renamed from: com.bytedance.ies.c.a.a$a  reason: collision with other inner class name */
    public static final class C0724a {
        @c(a = "enabled")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f33133a;
        @c(a = "force_https")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33134b;
        @c(a = "domains_intercept")

        /* renamed from: c  reason: collision with root package name */
        public final boolean f33135c;
        @c(a = "domains")

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f33136d;

        static {
            Covode.recordClassIndex(19794);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0724a)) {
                return false;
            }
            C0724a aVar = (C0724a) obj;
            return this.f33133a == aVar.f33133a && this.f33134b == aVar.f33134b && this.f33135c == aVar.f33135c && l.a(this.f33136d, aVar.f33136d);
        }

        public final int hashCode() {
            boolean z = this.f33133a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            boolean z2 = this.f33134b;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            if (!this.f33135c) {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 31;
            List<String> list = this.f33136d;
            return i11 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "LynxSecConfig(enable=" + this.f33133a + ", forceHttps=" + this.f33134b + ", intercept=" + this.f33135c + ", whiteList=" + this.f33136d + ")";
        }

        public /* synthetic */ C0724a() {
            this(new ArrayList());
        }

        private C0724a(List<String> list) {
            l.d(list, "");
            this.f33133a = false;
            this.f33134b = false;
            this.f33135c = false;
            this.f33136d = list;
        }
    }

    static {
        Covode.recordClassIndex(19793);
    }

    public static C0724a a() {
        try {
            SettingsManager a2 = SettingsManager.a();
            C0724a aVar = f33131a;
            C0724a aVar2 = (C0724a) a2.a("lynx_sec_loadurl", C0724a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f33131a;
        }
    }
}
