package com.ss.android.ugc.aweme.tools.beauty.b.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f138887a;

    /* renamed from: b  reason: collision with root package name */
    public final String f138888b;

    /* renamed from: c  reason: collision with root package name */
    public final String f138889c;

    /* renamed from: d  reason: collision with root package name */
    public final String f138890d;

    /* renamed from: e  reason: collision with root package name */
    public final String f138891e;

    /* renamed from: f  reason: collision with root package name */
    public final int f138892f;

    /* renamed from: g  reason: collision with root package name */
    public final int f138893g;

    /* renamed from: h  reason: collision with root package name */
    public final int f138894h;

    /* renamed from: i  reason: collision with root package name */
    public final String f138895i;

    static {
        Covode.recordClassIndex(90818);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f138887a == aVar.f138887a && l.a(this.f138888b, aVar.f138888b) && l.a(this.f138889c, aVar.f138889c) && l.a(this.f138890d, aVar.f138890d) && l.a(this.f138891e, aVar.f138891e) && this.f138892f == aVar.f138892f && this.f138893g == aVar.f138893g && this.f138894h == aVar.f138894h && l.a(this.f138895i, aVar.f138895i);
    }

    public final int hashCode() {
        int i2 = this.f138887a * 31;
        String str = this.f138888b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f138889c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f138890d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f138891e;
        int hashCode4 = (((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f138892f) * 31) + this.f138893g) * 31) + this.f138894h) * 31;
        String str5 = this.f138895i;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return hashCode4 + i3;
    }

    public final String toString() {
        return "LocalBeauty(iconResId=" + this.f138887a + ", effectId=" + this.f138888b + ", resourceId=" + this.f138889c + ", name=" + this.f138890d + ", unzipPath=" + this.f138891e + ", min=" + this.f138892f + ", default=" + this.f138893g + ", max=" + this.f138894h + ", tag=" + this.f138895i + ")";
    }

    private a(int i2, String str, String str2, String str3, String str4, int i3, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f138887a = i2;
        this.f138888b = str;
        this.f138889c = str2;
        this.f138890d = str3;
        this.f138891e = str4;
        this.f138892f = 0;
        this.f138893g = i3;
        this.f138894h = 100;
        this.f138895i = str5;
    }

    public /* synthetic */ a(int i2, String str, String str2, String str3, String str4, int i3, String str5, byte b2) {
        this(i2, str, str2, str3, str4, i3, str5);
    }
}
