package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f122063a;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final C3156a f122064b;

    /* renamed from: com.ss.android.ugc.aweme.setting.api.a$a  reason: collision with other inner class name */
    public static final class C3156a {
        @c(a = "error_code")

        /* renamed from: a  reason: collision with root package name */
        public final int f122065a;
        @c(a = "has_pwd")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f122066b;
        @c(a = "has_email")

        /* renamed from: c  reason: collision with root package name */
        public final boolean f122067c;

        static {
            Covode.recordClassIndex(80029);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3156a)) {
                return false;
            }
            C3156a aVar = (C3156a) obj;
            return this.f122065a == aVar.f122065a && this.f122066b == aVar.f122066b && this.f122067c == aVar.f122067c;
        }

        public final int hashCode() {
            int i2 = this.f122065a * 31;
            boolean z = this.f122066b;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            if (!this.f122067c) {
                i3 = 0;
            }
            return i7 + i3;
        }

        public final String toString() {
            return "Data(errorCode=" + this.f122065a + ", hasPwd=" + this.f122066b + ", hasEmail=" + this.f122067c + ")";
        }
    }

    static {
        Covode.recordClassIndex(80028);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f122063a, aVar.f122063a) && l.a(this.f122064b, aVar.f122064b);
    }

    public final int hashCode() {
        String str = this.f122063a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C3156a aVar = this.f122064b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AvailableWaysResponse(message=" + this.f122063a + ", data=" + this.f122064b + ")";
    }
}
