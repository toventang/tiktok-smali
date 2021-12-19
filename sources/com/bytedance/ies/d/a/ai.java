package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class ai {

    /* renamed from: a  reason: collision with root package name */
    public final String f33211a;

    static {
        Covode.recordClassIndex(19833);
    }

    public int hashCode() {
        return this.f33211a.hashCode();
    }

    private ai(String str) {
        this.f33211a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ai) || obj == null) {
            return false;
        }
        ai aiVar = (ai) obj;
        if (!l.a(aiVar.getClass(), getClass())) {
            return false;
        }
        return l.a((Object) this.f33211a, (Object) aiVar.f33211a);
    }

    public /* synthetic */ ai(String str, byte b2) {
        this(str);
    }
}
