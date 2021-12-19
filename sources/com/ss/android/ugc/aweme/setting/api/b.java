package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f122068a;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final a f122069b;

    public static final class a {
        @c(a = "error_code")

        /* renamed from: a  reason: collision with root package name */
        public final int f122070a;
        @c(a = "safe")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f122071b;

        static {
            Covode.recordClassIndex(80031);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f122070a == aVar.f122070a && this.f122071b == aVar.f122071b;
        }

        public final int hashCode() {
            int i2 = this.f122070a * 31;
            boolean z = this.f122071b;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final String toString() {
            return "Data(errorCode=" + this.f122070a + ", isSafe=" + this.f122071b + ")";
        }
    }

    static {
        Covode.recordClassIndex(80030);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f122068a, bVar.f122068a) && l.a(this.f122069b, bVar.f122069b);
    }

    public final int hashCode() {
        String str = this.f122068a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.f122069b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SafeEnvResponse(message=" + this.f122068a + ", data=" + this.f122069b + ")";
    }
}
