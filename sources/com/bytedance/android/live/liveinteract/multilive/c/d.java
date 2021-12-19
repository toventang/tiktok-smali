package com.bytedance.android.live.liveinteract.multilive.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f11758a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11759b;

    static {
        Covode.recordClassIndex(6406);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f11758a, dVar.f11758a) && this.f11759b == dVar.f11759b;
    }

    public final int hashCode() {
        String str = this.f11758a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f11759b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "MultiLiveAudioStatus(interactId=" + this.f11758a + ", mute=" + this.f11759b + ")";
    }

    public d(String str, boolean z) {
        l.d(str, "");
        this.f11758a = str;
        this.f11759b = z;
    }
}
