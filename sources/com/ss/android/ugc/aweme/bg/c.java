package com.ss.android.ugc.aweme.bg;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "label")

    /* renamed from: a  reason: collision with root package name */
    public final String f68663a;
    @com.google.gson.a.c(a = b.f37372a)

    /* renamed from: b  reason: collision with root package name */
    public final String f68664b;
    @com.google.gson.a.c(a = "background_image_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f68665c;

    static {
        Covode.recordClassIndex(42256);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f68663a, cVar.f68663a) && l.a(this.f68664b, cVar.f68664b) && l.a(this.f68665c, cVar.f68665c);
    }

    public final int hashCode() {
        String str = this.f68663a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f68664b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f68665c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "KproPopupButtonSetting(label=" + this.f68663a + ", color=" + this.f68664b + ", backGroundImageUrl=" + this.f68665c + ")";
    }
}
