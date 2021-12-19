package com.ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "creator_plus_should_show")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f78405a;
    @c(a = "creator_plus_opt_in_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f78406b;
    @c(a = "creator_plus_congrats_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f78407c;

    static {
        Covode.recordClassIndex(48692);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f78405a == bVar.f78405a && l.a(this.f78406b, bVar.f78406b) && l.a(this.f78407c, bVar.f78407c);
    }

    public final int hashCode() {
        boolean z = this.f78405a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f78406b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f78407c;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "CPlusSettings(allowCreatorPlus=" + this.f78405a + ", creatorPlusOptInURL=" + this.f78406b + ", creatorPlusCongratsURL=" + this.f78407c + ")";
    }
}
