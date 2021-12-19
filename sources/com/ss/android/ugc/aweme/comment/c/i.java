package com.ss.android.ugc.aweme.comment.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class i {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final int f71760a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public final String f71761b;
    @c(a = "body")

    /* renamed from: c  reason: collision with root package name */
    public final String f71762c;
    @c(a = "pin")

    /* renamed from: d  reason: collision with root package name */
    public final String f71763d;
    @c(a = "unpin")

    /* renamed from: e  reason: collision with root package name */
    public final String f71764e;

    static {
        Covode.recordClassIndex(44130);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f71760a == iVar.f71760a && l.a(this.f71761b, iVar.f71761b) && l.a(this.f71762c, iVar.f71762c) && l.a(this.f71763d, iVar.f71763d) && l.a(this.f71764e, iVar.f71764e);
    }

    public final int hashCode() {
        int i2 = this.f71760a * 31;
        String str = this.f71761b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f71762c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71763d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f71764e;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return hashCode3 + i3;
    }

    public final String toString() {
        return "PinNotice(type=" + this.f71760a + ", title=" + this.f71761b + ", body=" + this.f71762c + ", pin=" + this.f71763d + ", unpin=" + this.f71764e + ")";
    }

    private /* synthetic */ i() {
        this("", "", "", "");
    }

    private i(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f71760a = 0;
        this.f71761b = str;
        this.f71762c = str2;
        this.f71763d = str3;
        this.f71764e = str4;
    }
}
