package com.ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "code")

    /* renamed from: a  reason: collision with root package name */
    public final int f105898a;
    @c(a = "text")

    /* renamed from: b  reason: collision with root package name */
    public final String f105899b;
    @c(a = "img")

    /* renamed from: c  reason: collision with root package name */
    public final String f105900c;

    static {
        Covode.recordClassIndex(67772);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f105898a == aVar.f105898a && l.a(this.f105899b, aVar.f105899b) && l.a(this.f105900c, aVar.f105900c);
    }

    public final int hashCode() {
        int i2 = this.f105898a * 31;
        String str = this.f105899b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f105900c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "KMVideoReportReason(code=" + this.f105898a + ", text=" + this.f105899b + ", img=" + this.f105900c + ")";
    }

    private /* synthetic */ a() {
        this("", "");
    }

    private a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f105898a = -1;
        this.f105899b = str;
        this.f105900c = str2;
    }
}
