package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class t implements Serializable {
    @c(a = "email")
    private final String email;
    @c(a = "mobile")
    private final String mobile;
    @c(a = "password")
    private final String password;
    @c(a = "verify_way")
    private final String verify_way;

    static {
        Covode.recordClassIndex(39481);
    }

    public static /* synthetic */ t copy$default(t tVar, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tVar.verify_way;
        }
        if ((i2 & 2) != 0) {
            str2 = tVar.mobile;
        }
        if ((i2 & 4) != 0) {
            str3 = tVar.email;
        }
        if ((i2 & 8) != 0) {
            str4 = tVar.password;
        }
        return tVar.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.verify_way;
    }

    public final String component2() {
        return this.mobile;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.password;
    }

    public final t copy(String str, String str2, String str3, String str4) {
        return new t(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l.a(this.verify_way, tVar.verify_way) && l.a(this.mobile, tVar.mobile) && l.a(this.email, tVar.email) && l.a(this.password, tVar.password);
    }

    public final int hashCode() {
        String str = this.verify_way;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mobile;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.password;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "TwoStepVerifyWays(verify_way=" + this.verify_way + ", mobile=" + this.mobile + ", email=" + this.email + ", password=" + this.password + ")";
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getVerify_way() {
        return this.verify_way;
    }

    public t(String str, String str2, String str3, String str4) {
        this.verify_way = str;
        this.mobile = str2;
        this.email = str3;
        this.password = str4;
    }
}
