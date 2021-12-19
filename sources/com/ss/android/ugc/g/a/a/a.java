package com.ss.android.ugc.g.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.g.a.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f145578a;

    /* renamed from: b  reason: collision with root package name */
    public final b f145579b;

    static {
        Covode.recordClassIndex(95624);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f145578a != aVar.f145578a || !l.a(this.f145579b, aVar.f145579b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f145578a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        b bVar = this.f145579b;
        return i5 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "DetectResult(needNextStep=" + this.f145578a + ", state=" + this.f145579b + ")";
    }

    public a(boolean z, b bVar) {
        l.c(bVar, "");
        this.f145578a = z;
        this.f145579b = bVar;
    }
}
