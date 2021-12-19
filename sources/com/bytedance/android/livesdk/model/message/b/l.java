package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.livesdkapi.depend.model.live.a.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class l {
    @c(a = "config")

    /* renamed from: a  reason: collision with root package name */
    public b f19280a;

    static {
        Covode.recordClassIndex(11450);
    }

    public l(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof l) && h.f.b.l.a(this.f19280a, ((l) obj).f19280a);
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.f19280a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BattleTaskStart(battleBonusConfig=" + this.f19280a + ")";
    }

    private l() {
        this.f19280a = null;
    }

    private /* synthetic */ l(byte b2) {
        this();
    }
}
