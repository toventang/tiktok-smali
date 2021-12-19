package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;

public final class v implements Serializable {
    @c(a = "default_verify_way")
    private final String default_verify_way;
    @c(a = "not_login_ticket")
    private final String not_login_ticket;
    @c(a = "verify_ticket")
    private final String verify_ticket;
    @c(a = "verify_ways")
    private final ArrayList<t> verify_ways;

    static {
        Covode.recordClassIndex(39483);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.twostep.v */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v copy$default(v vVar, String str, String str2, ArrayList arrayList, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vVar.verify_ticket;
        }
        if ((i2 & 2) != 0) {
            str2 = vVar.default_verify_way;
        }
        if ((i2 & 4) != 0) {
            arrayList = vVar.verify_ways;
        }
        if ((i2 & 8) != 0) {
            str3 = vVar.not_login_ticket;
        }
        return vVar.copy(str, str2, arrayList, str3);
    }

    public final String component1() {
        return this.verify_ticket;
    }

    public final String component2() {
        return this.default_verify_way;
    }

    public final ArrayList<t> component3() {
        return this.verify_ways;
    }

    public final String component4() {
        return this.not_login_ticket;
    }

    public final v copy(String str, String str2, ArrayList<t> arrayList, String str3) {
        return new v(str, str2, arrayList, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return l.a(this.verify_ticket, vVar.verify_ticket) && l.a(this.default_verify_way, vVar.default_verify_way) && l.a(this.verify_ways, vVar.verify_ways) && l.a(this.not_login_ticket, vVar.not_login_ticket);
    }

    public final int hashCode() {
        String str = this.verify_ticket;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.default_verify_way;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ArrayList<t> arrayList = this.verify_ways;
        int hashCode3 = (hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str3 = this.not_login_ticket;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "TwpStep2046Bean(verify_ticket=" + this.verify_ticket + ", default_verify_way=" + this.default_verify_way + ", verify_ways=" + this.verify_ways + ", not_login_ticket=" + this.not_login_ticket + ")";
    }

    public final String getDefault_verify_way() {
        return this.default_verify_way;
    }

    public final String getNot_login_ticket() {
        return this.not_login_ticket;
    }

    public final String getVerify_ticket() {
        return this.verify_ticket;
    }

    public final ArrayList<t> getVerify_ways() {
        return this.verify_ways;
    }

    public v(String str, String str2, ArrayList<t> arrayList, String str3) {
        this.verify_ticket = str;
        this.default_verify_way = str2;
        this.verify_ways = arrayList;
        this.not_login_ticket = str3;
    }
}
