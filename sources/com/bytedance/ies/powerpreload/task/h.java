package com.bytedance.ies.powerpreload.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.d;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public f<?> f34565a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<? extends d> f34566b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34567c;

    static {
        Covode.recordClassIndex(20680);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f34566b, hVar.f34566b) && l.a(this.f34567c, hVar.f34567c);
    }

    public final int hashCode() {
        Class<? extends d> cls = this.f34566b;
        int i2 = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        String str = this.f34567c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TaskWrapper(preload=" + this.f34566b + ", key=" + this.f34567c + ")";
    }

    public final void a(f<?> fVar) {
        f<?> fVar2 = this.f34565a;
        if (fVar2 != null) {
            fVar2.f34555e = true;
        }
        this.f34565a = fVar;
    }

    public h(Class<? extends d> cls, String str) {
        l.c(cls, "");
        this.f34566b = cls;
        this.f34567c = str;
    }

    public final boolean a(Class<? extends d> cls, String str) {
        if (cls == null) {
            if (str == null || str.length() <= 0 || !l.a((Object) str, (Object) this.f34567c)) {
                return false;
            }
            return true;
        } else if (!l.a(this.f34566b, cls) || !l.a((Object) this.f34567c, (Object) str)) {
            return false;
        } else {
            return true;
        }
    }
}
