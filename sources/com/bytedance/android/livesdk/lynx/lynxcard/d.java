package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f18793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18794b;

    static {
        Covode.recordClassIndex(11127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f18793a, dVar.f18793a) && this.f18794b == dVar.f18794b;
    }

    public final int hashCode() {
        String str = this.f18793a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f18794b;
    }

    public final String toString() {
        return "LynxCard(containerId=" + this.f18793a + ", priority=" + this.f18794b + ")";
    }

    public d(String str, int i2) {
        l.d(str, "");
        this.f18793a = str;
        this.f18794b = i2;
    }
}
