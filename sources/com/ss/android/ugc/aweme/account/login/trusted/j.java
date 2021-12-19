package com.ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class j {
    @c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f63724a = null;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final a f63725b = null;

    static {
        Covode.recordClassIndex(39291);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f63724a, jVar.f63724a) && l.a(this.f63725b, jVar.f63725b);
    }

    public final int hashCode() {
        String str = this.f63724a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.f63725b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TrustedUsersResponse(message=" + this.f63724a + ", data=" + this.f63725b + ")";
    }

    public static final class a {
        @c(a = "trust_users")

        /* renamed from: a  reason: collision with root package name */
        public final List<h> f63726a = null;

        static {
            Covode.recordClassIndex(39292);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f63726a, ((a) obj).f63726a);
            }
            return true;
        }

        public final int hashCode() {
            List<h> list = this.f63726a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Data(records=" + this.f63726a + ")";
        }

        private a() {
        }
    }

    private j() {
    }
}
