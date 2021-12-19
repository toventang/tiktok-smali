package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "category_key")
    private final String key;
    @c(a = "reason_text")
    private final String reason;
    @c(a = "toast_text")
    private final String toast;

    static {
        Covode.recordClassIndex(46166);
    }

    public d() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dVar.key;
        }
        if ((i2 & 2) != 0) {
            str2 = dVar.reason;
        }
        if ((i2 & 4) != 0) {
            str3 = dVar.toast;
        }
        return dVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.reason;
    }

    public final String component3() {
        return this.toast;
    }

    public final d copy(String str, String str2, String str3) {
        return new d(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.key, dVar.key) && l.a(this.reason, dVar.reason) && l.a(this.toast, dVar.toast);
    }

    public final int hashCode() {
        String str = this.key;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.reason;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.toast;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AdDislikeReasonModel(key=" + this.key + ", reason=" + this.reason + ", toast=" + this.toast + ")";
    }

    public final String getKey() {
        return this.key;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getToast() {
        return this.toast;
    }

    public d(String str, String str2, String str3) {
        this.key = str;
        this.reason = str2;
        this.toast = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
