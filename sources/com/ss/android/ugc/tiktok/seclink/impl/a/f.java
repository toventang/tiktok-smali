package com.ss.android.ugc.tiktok.seclink.impl.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f149014a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final f f149015b = new f();

    private f() {
    }

    public static final class a {
        @c(a = "sync_firstjump_switch")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f149016a;
        @c(a = "sync_timeout")

        /* renamed from: b  reason: collision with root package name */
        public final long f149017b;
        @c(a = "sync_white_list")

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f149018c;

        static {
            Covode.recordClassIndex(98151);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f149016a == aVar.f149016a && this.f149017b == aVar.f149017b && l.a(this.f149018c, aVar.f149018c);
        }

        public final String toString() {
            return "SeclinkSwitch(enable=" + this.f149016a + ", timeout=" + this.f149017b + ", white_list=" + this.f149018c + ")";
        }

        public /* synthetic */ a() {
            this(new ArrayList());
        }

        public final int hashCode() {
            int i2;
            boolean z = this.f149016a;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            long j2 = this.f149017b;
            int i6 = ((i3 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            List<String> list = this.f149018c;
            if (list != null) {
                i2 = list.hashCode();
            } else {
                i2 = 0;
            }
            return i6 + i2;
        }

        private a(List<String> list) {
            l.d(list, "");
            this.f149016a = false;
            this.f149017b = 1000;
            this.f149018c = list;
        }
    }

    static {
        Covode.recordClassIndex(98150);
    }

    public static a a() {
        try {
            SettingsManager a2 = SettingsManager.a();
            a aVar = f149014a;
            a aVar2 = (a) a2.a("force_seclink_sync_firstjump", a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f149014a;
        }
    }
}
