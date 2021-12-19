package com.bytedance.ies.powerlist.page.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f34346a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f34347b;

    static {
        Covode.recordClassIndex(20523);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f34346a, aVar.f34346a) && l.a(this.f34347b, aVar.f34347b);
    }

    public final int hashCode() {
        Object obj = this.f34346a;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f34347b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PageCursor(prev=" + this.f34346a + ", next=" + this.f34347b + ")";
    }

    public a(Object obj, Object obj2) {
        this.f34346a = obj;
        this.f34347b = obj2;
    }
}
