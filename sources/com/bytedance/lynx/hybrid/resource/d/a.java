package com.bytedance.lynx.hybrid.resource.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f41119a;

    /* renamed from: b  reason: collision with root package name */
    public String f41120b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f41121c;

    static {
        Covode.recordClassIndex(25201);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f41119a, aVar.f41119a) && l.a(this.f41120b, aVar.f41120b) && this.f41121c == aVar.f41121c;
    }

    public final int hashCode() {
        String str = this.f41119a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f41120b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f41121c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "ChannelBundleModel(channel=" + this.f41119a + ", bundlePath=" + this.f41120b + ", valid=" + this.f41121c + ")";
    }

    public final String a() {
        if (this.f41121c) {
            return this.f41119a;
        }
        return null;
    }

    public final String b() {
        if (this.f41121c) {
            return this.f41120b;
        }
        return null;
    }

    public a(String str, String str2, boolean z) {
        l.c(str, "");
        l.c(str2, "");
        this.f41119a = str;
        this.f41120b = str2;
        this.f41121c = z;
    }
}
