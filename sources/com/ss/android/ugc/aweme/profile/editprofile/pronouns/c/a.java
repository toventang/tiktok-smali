package com.ss.android.ugc.aweme.profile.editprofile.pronouns.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f116214a;

    /* renamed from: b  reason: collision with root package name */
    public final int f116215b;

    static {
        Covode.recordClassIndex(75000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f116214a, aVar.f116214a) && this.f116215b == aVar.f116215b;
    }

    public final int hashCode() {
        String str = this.f116214a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f116215b;
    }

    public final String toString() {
        return "KeywordWithSelectedPronounsNum(keyword=" + this.f116214a + ", num=" + this.f116215b + ")";
    }

    public a(String str, int i2) {
        l.d(str, "");
        this.f116214a = str;
        this.f116215b = i2;
    }
}
