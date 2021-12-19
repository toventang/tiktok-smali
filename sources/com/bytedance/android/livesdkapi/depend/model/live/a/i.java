package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class i {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public a f23089a;

    static {
        Covode.recordClassIndex(13676);
    }

    public i(byte b2) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f23089a, ((i) obj).f23089a);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.f23089a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BattleUserInfo(user=" + this.f23089a + ")";
    }

    private /* synthetic */ i() {
        this((a) null);
    }

    public i(a aVar) {
        this.f23089a = aVar;
    }
}
