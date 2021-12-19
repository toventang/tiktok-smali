package com.ss.android.ugc.aweme.account.unbind;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f65463a;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final a f65464b;

    public static final class a {
        @c(a = "error_code")

        /* renamed from: a  reason: collision with root package name */
        public int f65465a;
        @c(a = "description")

        /* renamed from: b  reason: collision with root package name */
        public final String f65466b;

        static {
            Covode.recordClassIndex(40255);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f65465a == aVar.f65465a && l.a(this.f65466b, aVar.f65466b);
        }

        public final int hashCode() {
            int i2 = this.f65465a * 31;
            String str = this.f65466b;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Data(errorCode=" + this.f65465a + ", description=" + this.f65466b + ")";
        }
    }

    static {
        Covode.recordClassIndex(40254);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f65463a, dVar.f65463a) && l.a(this.f65464b, dVar.f65464b);
    }

    public final int hashCode() {
        String str = this.f65463a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.f65464b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UnbindResponse(message=" + this.f65463a + ", data=" + this.f65464b + ")";
    }
}
