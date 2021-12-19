package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;

public final class c {
    @com.google.gson.a.c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f122072a;
    @com.google.gson.a.c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final a f122073b;

    static {
        Covode.recordClassIndex(80032);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f122072a, cVar.f122072a) && l.a(this.f122073b, cVar.f122073b);
    }

    public final int hashCode() {
        String str = this.f122072a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.f122073b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UnbindValidateResponse(message=" + this.f122072a + ", data=" + this.f122073b + ")";
    }

    public static final class a {
        @com.google.gson.a.c(a = "error_code")

        /* renamed from: a  reason: collision with root package name */
        public int f122074a = 0;
        @com.google.gson.a.c(a = "extra_eligible_login_methods")

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<String> f122075b = null;

        static {
            Covode.recordClassIndex(80033);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f122074a == aVar.f122074a && l.a(this.f122075b, aVar.f122075b);
        }

        public final int hashCode() {
            int i2 = this.f122074a * 31;
            ArrayList<String> arrayList = this.f122075b;
            return i2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final String toString() {
            return "Data(errorCode=" + this.f122074a + ", extraEligibleLoginMethod=" + this.f122075b + ")";
        }

        private a() {
        }
    }
}
