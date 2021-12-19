package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import h.f.b.l;

public final class g {
    @c(a = "bar_image")

    /* renamed from: a  reason: collision with root package name */
    public String f134425a;
    @c(a = "text")

    /* renamed from: b  reason: collision with root package name */
    public String f134426b;
    @c(a = b.f37372a)

    /* renamed from: c  reason: collision with root package name */
    public String f134427c;

    static {
        Covode.recordClassIndex(87881);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f134425a, gVar.f134425a) && l.a(this.f134426b, gVar.f134426b) && l.a(this.f134427c, gVar.f134427c);
    }

    public final int hashCode() {
        String str = this.f134425a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134426b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f134427c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ProgressBar(barImage=" + this.f134425a + ", text=" + this.f134426b + ", color=" + this.f134427c + ")";
    }

    public /* synthetic */ g() {
        this("", "", "");
    }

    private g(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f134425a = str;
        this.f134426b = str2;
        this.f134427c = str3;
    }
}
