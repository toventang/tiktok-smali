package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class s {
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public Long f19299a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public n f19300b;

    static {
        Covode.recordClassIndex(11458);
    }

    public s(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return l.a(this.f19299a, sVar.f19299a) && l.a(this.f19300b, sVar.f19300b);
    }

    public final int hashCode() {
        Long l2 = this.f19299a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        n nVar = this.f19300b;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UserArmiesWrapper(userId=" + this.f19299a + ", userArmies=" + this.f19300b + ")";
    }

    private s() {
        this.f19299a = null;
        this.f19300b = null;
    }

    private /* synthetic */ s(byte b2) {
        this();
    }
}
