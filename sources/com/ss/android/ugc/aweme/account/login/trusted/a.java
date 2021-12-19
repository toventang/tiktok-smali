package com.ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f63689a = null;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final C1426a f63690b = null;

    static {
        Covode.recordClassIndex(39271);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f63689a, aVar.f63689a) && l.a(this.f63690b, aVar.f63690b);
    }

    public final int hashCode() {
        String str = this.f63689a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C1426a aVar = this.f63690b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LoginHistoryFeatureStateResponse(message=" + this.f63689a + ", data=" + this.f63690b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.a$a  reason: collision with other inner class name */
    public static final class C1426a {
        @c(a = "user_device_record_status")

        /* renamed from: a  reason: collision with root package name */
        public final int f63691a = 0;

        static {
            Covode.recordClassIndex(39272);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C1426a) && this.f63691a == ((C1426a) obj).f63691a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f63691a;
        }

        public final String toString() {
            return "Data(status=" + this.f63691a + ")";
        }

        private C1426a() {
        }
    }

    private a() {
    }
}
