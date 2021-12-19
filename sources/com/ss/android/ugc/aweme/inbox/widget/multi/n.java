package com.ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final o f104495a;

    /* renamed from: b  reason: collision with root package name */
    public final int f104496b;

    static {
        Covode.recordClassIndex(66911);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f104495a, nVar.f104495a) && this.f104496b == nVar.f104496b;
    }

    public final int hashCode() {
        o oVar = this.f104495a;
        return ((oVar != null ? oVar.hashCode() : 0) * 31) + this.f104496b;
    }

    public final String toString() {
        return "RedPoint(type=" + this.f104495a + ", unreadCount=" + this.f104496b + ")";
    }

    public /* synthetic */ n(o oVar) {
        this(oVar, 0);
    }

    public n(o oVar, int i2) {
        l.d(oVar, "");
        this.f104495a = oVar;
        this.f104496b = i2;
    }
}
