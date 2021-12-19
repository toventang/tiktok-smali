package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class aa implements Serializable {
    @c(a = "is_available")
    private final Boolean is_available;
    @c(a = "verify_way")
    private final String verify_way;

    static {
        Covode.recordClassIndex(39368);
    }

    public static /* synthetic */ aa copy$default(aa aaVar, String str, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aaVar.verify_way;
        }
        if ((i2 & 2) != 0) {
            bool = aaVar.is_available;
        }
        return aaVar.copy(str, bool);
    }

    public final String component1() {
        return this.verify_way;
    }

    public final Boolean component2() {
        return this.is_available;
    }

    public final aa copy(String str, Boolean bool) {
        return new aa(str, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return l.a(this.verify_way, aaVar.verify_way) && l.a(this.is_available, aaVar.is_available);
    }

    public final int hashCode() {
        String str = this.verify_way;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.is_available;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "VerifyWay(verify_way=" + this.verify_way + ", is_available=" + this.is_available + ")";
    }

    public final String getVerify_way() {
        return this.verify_way;
    }

    public final Boolean is_available() {
        return this.is_available;
    }

    public aa(String str, Boolean bool) {
        this.verify_way = str;
        this.is_available = bool;
    }
}
