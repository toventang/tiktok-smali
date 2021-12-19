package com.ss.android.ugc.aweme.specact.popup.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f134620a;

    /* renamed from: b  reason: collision with root package name */
    public final String f134621b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f134622c;

    /* renamed from: d  reason: collision with root package name */
    public final String f134623d;

    /* renamed from: e  reason: collision with root package name */
    public final int f134624e;

    static {
        Covode.recordClassIndex(87960);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f134620a, aVar.f134620a) && l.a(this.f134621b, aVar.f134621b) && this.f134622c == aVar.f134622c && l.a(this.f134623d, aVar.f134623d) && this.f134624e == aVar.f134624e;
    }

    public final int hashCode() {
        String str = this.f134620a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134621b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f134622c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        String str3 = this.f134623d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((i6 + i2) * 31) + this.f134624e;
    }

    public final String toString() {
        return "InAppPushParams(title=" + this.f134620a + ", content=" + this.f134621b + ", showButton=" + this.f134622c + ", url=" + this.f134623d + ", iconResId=" + this.f134624e + ")";
    }

    private a(String str, String str2, boolean z, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f134620a = str;
        this.f134621b = str2;
        this.f134622c = z;
        this.f134623d = str3;
        this.f134624e = -1;
    }

    public /* synthetic */ a(String str, String str2, boolean z, String str3, byte b2) {
        this(str, str2, z, str3);
    }
}
