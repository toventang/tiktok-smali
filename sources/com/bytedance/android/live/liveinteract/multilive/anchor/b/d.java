package com.bytedance.android.live.liveinteract.multilive.anchor.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11596a;

    /* renamed from: b  reason: collision with root package name */
    public String f11597b;

    static {
        Covode.recordClassIndex(6297);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11596a == dVar.f11596a && l.a(this.f11597b, dVar.f11597b);
    }

    public final int hashCode() {
        boolean z = this.f11596a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f11597b;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OpenCameraDialogInfo(dialogShowing=" + this.f11596a + ", source=" + this.f11597b + ")";
    }

    public d(boolean z, String str) {
        l.d(str, "");
        this.f11596a = z;
        this.f11597b = str;
    }
}
