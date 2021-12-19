package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class f {
    @c(a = "prompt_key")

    /* renamed from: a  reason: collision with root package name */
    public String f23083a;
    @c(a = "elems")

    /* renamed from: b  reason: collision with root package name */
    public List<g> f23084b;

    static {
        Covode.recordClassIndex(13673);
    }

    public f(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f23083a, fVar.f23083a) && l.a(this.f23084b, fVar.f23084b);
    }

    public final int hashCode() {
        String str = this.f23083a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<g> list = this.f23084b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BattlePrompt(promptKey=" + this.f23083a + ", promptElements=" + this.f23084b + ")";
    }

    private f() {
        this.f23083a = null;
        this.f23084b = null;
    }

    private /* synthetic */ f(byte b2) {
        this();
    }
}
