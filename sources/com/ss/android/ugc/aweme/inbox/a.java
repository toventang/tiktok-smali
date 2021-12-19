package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f104009a;

    /* renamed from: b  reason: collision with root package name */
    public final int f104010b;

    /* renamed from: c  reason: collision with root package name */
    public final int f104011c;

    static {
        Covode.recordClassIndex(66614);
    }

    public static a a(b bVar, int i2, int i3) {
        l.d(bVar, "");
        return new a(bVar, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f104009a, aVar.f104009a) && this.f104010b == aVar.f104010b && this.f104011c == aVar.f104011c;
    }

    public final int hashCode() {
        b bVar = this.f104009a;
        return ((((bVar != null ? bVar.hashCode() : 0) * 31) + this.f104010b) * 31) + this.f104011c;
    }

    public final String toString() {
        return "AdapterChangeInfo(type=" + this.f104009a + ", start=" + this.f104010b + ", itemCount=" + this.f104011c + ")";
    }

    public /* synthetic */ a() {
        this(b.INSERT, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private a(b bVar, int i2, int i3) {
        l.d(bVar, "");
        this.f104009a = bVar;
        this.f104010b = i2;
        this.f104011c = i3;
    }
}
