package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class h {
    @c(a = "config")

    /* renamed from: a  reason: collision with root package name */
    public b f23087a;
    @c(a = "status")

    /* renamed from: b  reason: collision with root package name */
    public c f23088b;

    static {
        Covode.recordClassIndex(13675);
    }

    public h(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f23087a, hVar.f23087a) && l.a(this.f23088b, hVar.f23088b);
    }

    public final int hashCode() {
        b bVar = this.f23087a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        c cVar = this.f23088b;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BattleTask(battleBonusConfig=" + this.f23087a + ", battleBonusStatus=" + this.f23088b + ")";
    }

    private h() {
        this.f23087a = null;
        this.f23088b = null;
    }

    private /* synthetic */ h(byte b2) {
        this();
    }
}
