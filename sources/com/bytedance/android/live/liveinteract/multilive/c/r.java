package com.bytedance.android.live.liveinteract.multilive.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f11773a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11774b;

    static {
        Covode.recordClassIndex(6420);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f11773a, rVar.f11773a) && this.f11774b == rVar.f11774b;
    }

    public final int hashCode() {
        String str = this.f11773a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f11774b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "MultiLiveVideoStatus(interactId=" + this.f11773a + ", mute=" + this.f11774b + ")";
    }

    public r(String str, boolean z) {
        l.d(str, "");
        this.f11773a = str;
        this.f11774b = z;
    }
}
