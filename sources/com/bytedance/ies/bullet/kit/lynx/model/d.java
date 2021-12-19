package com.bytedance.ies.bullet.kit.lynx.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f32377a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32378b;

    static {
        Covode.recordClassIndex(19028);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f32377a, dVar.f32377a) && l.a(this.f32378b, dVar.f32378b);
    }

    public final int hashCode() {
        String str = this.f32377a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32378b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LynxCommonData(containerID=" + this.f32377a + ", protocolVersion=" + this.f32378b + ")";
    }

    public /* synthetic */ d(String str) {
        this(str, "1.0");
    }

    private d(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f32377a = str;
        this.f32378b = str2;
    }
}
