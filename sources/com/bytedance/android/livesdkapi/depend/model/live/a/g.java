package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class g {
    @c(a = "prompt_field")

    /* renamed from: a  reason: collision with root package name */
    public String f23085a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public String f23086b;

    static {
        Covode.recordClassIndex(13674);
    }

    public g(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f23085a, gVar.f23085a) && l.a(this.f23086b, gVar.f23086b);
    }

    public final int hashCode() {
        String str = this.f23085a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23086b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BattlePromptElem(promptFieldKey=" + this.f23085a + ", promptFieldValue=" + this.f23086b + ")";
    }

    private g() {
        this.f23085a = null;
        this.f23086b = null;
    }

    private /* synthetic */ g(byte b2) {
        this();
    }
}
