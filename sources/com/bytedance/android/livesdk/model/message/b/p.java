package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.livesdkapi.depend.model.live.a.i;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class p {
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public Long f19293a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public i f19294b;

    static {
        Covode.recordClassIndex(11455);
    }

    public p(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l.a(this.f19293a, pVar.f19293a) && l.a(this.f19294b, pVar.f19294b);
    }

    public final int hashCode() {
        Long l2 = this.f19293a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        i iVar = this.f19294b;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BattleUserInfoWrapper(userId=" + this.f19293a + ", userInfo=" + this.f19294b + ")";
    }

    private p() {
        this.f19293a = null;
        this.f19294b = null;
    }

    private /* synthetic */ p(byte b2) {
        this();
    }
}
