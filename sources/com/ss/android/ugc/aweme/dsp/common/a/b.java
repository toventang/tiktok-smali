package com.ss.android.ugc.aweme.dsp.common.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f83280a;

    static {
        Covode.recordClassIndex(51922);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f83280a, ((b) obj).f83280a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f83280a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UserIdUpdateEvent(userId=" + this.f83280a + ")";
    }

    public b(String str) {
        this.f83280a = str;
    }
}
