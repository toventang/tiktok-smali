package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.google.gson.a.c;

public final class hd {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90204a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f90205b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f90206c;

    /* renamed from: d  reason: collision with root package name */
    public static final hd f90207d = new hd();

    private hd() {
    }

    public static final class a {
        @c(a = "enable_lynx")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f90208a = false;
        @c(a = "enable_retry")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f90209b = false;

        static {
            Covode.recordClassIndex(56584);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f90208a == aVar.f90208a && this.f90209b == aVar.f90209b;
        }

        public final int hashCode() {
            boolean z = this.f90208a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            if (!this.f90209b) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "Config(enableLynx=" + this.f90208a + ", enableRetry=" + this.f90209b + ")";
        }

        private a() {
        }
    }

    private static a a() {
        return (a) b.a().a(false, "use_lynx_for_favorite_hashtag_collection_2", a.class, f90204a);
    }

    static {
        boolean z;
        Covode.recordClassIndex(56583);
        a a2 = a();
        boolean z2 = false;
        if (a2 != null) {
            z = a2.f90208a;
        } else {
            z = false;
        }
        f90205b = z;
        a a3 = a();
        if (a3 != null) {
            z2 = a3.f90209b;
        }
        f90206c = z2;
    }
}
