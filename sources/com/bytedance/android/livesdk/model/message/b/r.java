package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class r {
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public Long f19297a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public Boolean f19298b;

    static {
        Covode.recordClassIndex(11457);
    }

    public r(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f19297a, rVar.f19297a) && l.a(this.f19298b, rVar.f19298b);
    }

    public final int hashCode() {
        Long l2 = this.f19297a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        Boolean bool = this.f19298b;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SupportedActionsWrapper(actionType=" + this.f19297a + ", switch=" + this.f19298b + ")";
    }

    private r() {
        this.f19297a = null;
        this.f19298b = null;
    }

    private /* synthetic */ r(byte b2) {
        this();
    }
}
