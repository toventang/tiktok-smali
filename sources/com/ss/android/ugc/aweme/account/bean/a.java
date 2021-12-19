package com.ss.android.ugc.aweme.account.bean;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f62889a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62890b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f62891c;

    static {
        Covode.recordClassIndex(38746);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f62889a, aVar.f62889a) && l.a(this.f62890b, aVar.f62890b) && this.f62891c == aVar.f62891c;
    }

    public final int hashCode() {
        String str = this.f62889a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f62890b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f62891c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "AppBindRequest(platformName=" + this.f62889a + ", bindKey=" + this.f62890b + ", actionBool=" + this.f62891c + ")";
    }
}
