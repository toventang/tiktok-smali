package com.bytedance.ies.bullet.service.popup.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f32868a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32869b;

    static {
        Covode.recordClassIndex(19633);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f32868a, hVar.f32868a) && this.f32869b == hVar.f32869b;
    }

    public final int hashCode() {
        String str = this.f32868a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f32869b;
    }

    public final String toString() {
        return "KeyboardStyle(mode=" + this.f32868a + ", distance=" + this.f32869b + ")";
    }

    public /* synthetic */ h() {
        this("center", 0);
    }

    public h(String str, int i2) {
        l.c(str, "");
        this.f32868a = str;
        this.f32869b = i2;
    }
}
