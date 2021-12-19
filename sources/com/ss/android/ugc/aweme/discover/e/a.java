package com.ss.android.ugc.aweme.discover.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.l.m;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f80942a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final String f80943b;

    static {
        Covode.recordClassIndex(50320);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f80942a == aVar.f80942a && l.a(this.f80943b, aVar.f80943b);
    }

    public final int hashCode() {
        int i2 = this.f80942a * 31;
        String str = this.f80943b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CancelMixRequestEvent(code=" + this.f80942a + ", reason=" + this.f80943b + ")";
    }

    public final b a() {
        if (((Boolean) m.f121435b.getValue()).booleanValue()) {
            c.a(this);
        }
        return this;
    }

    public a(String str) {
        this.f80943b = str;
    }
}
