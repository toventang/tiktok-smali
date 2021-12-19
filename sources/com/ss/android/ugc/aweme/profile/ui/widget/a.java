package com.ss.android.ugc.aweme.profile.ui.widget;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f117387a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f117388b = null;

    /* renamed from: c  reason: collision with root package name */
    public final String f117389c;

    /* renamed from: d  reason: collision with root package name */
    public final String f117390d;

    /* renamed from: e  reason: collision with root package name */
    public String f117391e;

    /* renamed from: f  reason: collision with root package name */
    public int f117392f;

    /* renamed from: g  reason: collision with root package name */
    public int f117393g;

    static {
        Covode.recordClassIndex(75848);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f117387a, aVar.f117387a) && l.a(this.f117388b, aVar.f117388b) && l.a(this.f117389c, aVar.f117389c) && l.a(this.f117390d, aVar.f117390d) && l.a(this.f117391e, aVar.f117391e) && this.f117392f == aVar.f117392f && this.f117393g == aVar.f117393g;
    }

    public final int hashCode() {
        String str = this.f117387a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f117388b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f117389c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f117390d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f117391e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return ((((hashCode4 + i2) * 31) + this.f117392f) * 31) + this.f117393g;
    }

    public final String toString() {
        return "ChainInfo(uniqueId=" + this.f117387a + ", nickname=" + this.f117388b + ", userId=" + this.f117389c + ", secUid=" + this.f117390d + ", aid=" + this.f117391e + ", privateStatus=" + this.f117392f + ", isPrivateAccount=" + this.f117393g + ")";
    }

    public a(String str, String str2) {
        this.f117389c = str;
        this.f117390d = str2;
        this.f117391e = null;
        this.f117392f = 0;
        this.f117393g = 0;
    }
}
