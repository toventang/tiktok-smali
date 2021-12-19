package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class w implements Serializable {
    @c(a = "profile_key")
    private final String profile_key;
    @c(a = "sms_code_key")
    private final String sms_code_key;
    @c(a = "verify_ticket")
    private final String verify_ticket;

    static {
        Covode.recordClassIndex(39484);
    }

    public static /* synthetic */ w copy$default(w wVar, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wVar.verify_ticket;
        }
        if ((i2 & 2) != 0) {
            str2 = wVar.sms_code_key;
        }
        if ((i2 & 4) != 0) {
            str3 = wVar.profile_key;
        }
        return wVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.verify_ticket;
    }

    public final String component2() {
        return this.sms_code_key;
    }

    public final String component3() {
        return this.profile_key;
    }

    public final w copy(String str, String str2, String str3) {
        return new w(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return l.a(this.verify_ticket, wVar.verify_ticket) && l.a(this.sms_code_key, wVar.sms_code_key) && l.a(this.profile_key, wVar.profile_key);
    }

    public final int hashCode() {
        String str = this.verify_ticket;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sms_code_key;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.profile_key;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "TwpStep2067Bean(verify_ticket=" + this.verify_ticket + ", sms_code_key=" + this.sms_code_key + ", profile_key=" + this.profile_key + ")";
    }

    public final String getProfile_key() {
        return this.profile_key;
    }

    public final String getSms_code_key() {
        return this.sms_code_key;
    }

    public final String getVerify_ticket() {
        return this.verify_ticket;
    }

    public w(String str, String str2, String str3) {
        this.verify_ticket = str;
        this.sms_code_key = str2;
        this.profile_key = str3;
    }
}
