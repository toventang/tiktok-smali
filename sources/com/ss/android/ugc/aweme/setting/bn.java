package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class bn {
    @c(a = "light")

    /* renamed from: a  reason: collision with root package name */
    public final String f122096a;
    @c(a = "dark")

    /* renamed from: b  reason: collision with root package name */
    public final String f122097b;

    static {
        Covode.recordClassIndex(80060);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return l.a(this.f122096a, bnVar.f122096a) && l.a(this.f122097b, bnVar.f122097b);
    }

    public final int hashCode() {
        String str = this.f122096a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f122097b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PrivacyUrls(lightUrl=" + this.f122096a + ", darkUrl=" + this.f122097b + ")";
    }
}
