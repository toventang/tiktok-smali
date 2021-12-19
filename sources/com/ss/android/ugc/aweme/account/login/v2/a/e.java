package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class e {
    @c(a = "error_code")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f64235a;
    @c(a = "description")

    /* renamed from: b  reason: collision with root package name */
    public final String f64236b;
    @c(a = "login_name")

    /* renamed from: c  reason: collision with root package name */
    public final String f64237c;

    static {
        Covode.recordClassIndex(39574);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f64235a, eVar.f64235a) && l.a(this.f64236b, eVar.f64236b) && l.a(this.f64237c, eVar.f64237c);
    }

    public final int hashCode() {
        Integer num = this.f64235a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f64236b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f64237c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CommitUserNameData(error_code=" + this.f64235a + ", description=" + this.f64236b + ", login_name=" + this.f64237c + ")";
    }
}
