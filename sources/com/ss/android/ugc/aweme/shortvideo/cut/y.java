package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class y<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public final int f126296a;

    /* renamed from: b  reason: collision with root package name */
    public final int f126297b;

    /* renamed from: c  reason: collision with root package name */
    public final DATA f126298c;

    static {
        Covode.recordClassIndex(82896);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f126296a == yVar.f126296a && this.f126297b == yVar.f126297b && l.a(this.f126298c, yVar.f126298c);
    }

    public final int hashCode() {
        int i2 = ((this.f126296a * 31) + this.f126297b) * 31;
        DATA data = this.f126298c;
        return i2 + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        return "VideoFrameData(width=" + this.f126296a + ", height=" + this.f126297b + ", data=" + ((Object) this.f126298c) + ")";
    }

    public y(int i2, int i3, DATA data) {
        this.f126296a = i2;
        this.f126297b = i3;
        this.f126298c = data;
    }
}
