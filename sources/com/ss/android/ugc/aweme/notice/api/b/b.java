package com.ss.android.ugc.aweme.notice.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f112671a;

    /* renamed from: b  reason: collision with root package name */
    public final int f112672b;

    static {
        Covode.recordClassIndex(72408);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f112671a, bVar.f112671a) && this.f112672b == bVar.f112672b;
    }

    public final int hashCode() {
        String str = this.f112671a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f112672b;
    }

    public final String toString() {
        return "FollowRequestResEvent(uid=" + this.f112671a + ", type=" + this.f112672b + ")";
    }

    public b(String str, int i2) {
        l.d(str, "");
        this.f112671a = str;
        this.f112672b = i2;
    }
}
