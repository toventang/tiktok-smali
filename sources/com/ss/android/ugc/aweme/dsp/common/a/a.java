package com.ss.android.ugc.aweme.dsp.common.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f83278a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83279b;

    static {
        Covode.recordClassIndex(51921);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f83278a, aVar.f83278a) && this.f83279b == aVar.f83279b;
    }

    public final int hashCode() {
        List<String> list = this.f83278a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.f83279b;
    }

    public final String toString() {
        return "DspMusicCollectEvent(ids=" + this.f83278a + ", collectStatus=" + this.f83279b + ")";
    }

    public a(List<String> list, int i2) {
        l.d(list, "");
        this.f83278a = list;
        this.f83279b = i2;
    }
}
