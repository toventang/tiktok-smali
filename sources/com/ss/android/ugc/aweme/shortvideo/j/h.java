package com.ss.android.ugc.aweme.shortvideo.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f128593a;

    static {
        Covode.recordClassIndex(84313);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && l.a(this.f128593a, ((h) obj).f128593a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f128593a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "VideoEditBackRecordEvent(commerceData=" + this.f128593a + ")";
    }

    public h(String str) {
        this.f128593a = str;
    }
}
