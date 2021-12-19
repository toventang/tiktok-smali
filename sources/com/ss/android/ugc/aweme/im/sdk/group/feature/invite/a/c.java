package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "error_code")

    /* renamed from: a  reason: collision with root package name */
    public Integer f102668a = null;
    @com.google.gson.a.c(a = "error_title")

    /* renamed from: b  reason: collision with root package name */
    public String f102669b = null;
    @com.google.gson.a.c(a = "error_message")

    /* renamed from: c  reason: collision with root package name */
    public String f102670c = null;

    static {
        Covode.recordClassIndex(65740);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f102668a, cVar.f102668a) && l.a(this.f102669b, cVar.f102669b) && l.a(this.f102670c, cVar.f102670c);
    }

    public final int hashCode() {
        Integer num = this.f102668a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f102669b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f102670c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "InviteError(errorCode=" + this.f102668a + ", errorTitle=" + this.f102669b + ", errorMessage=" + this.f102670c + ")";
    }

    private c() {
    }
}
