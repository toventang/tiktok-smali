package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    final Object f159847a;

    /* renamed from: b  reason: collision with root package name */
    final t f159848b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f159849c = true;

    static {
        Covode.recordClassIndex(106495);
    }

    public final int hashCode() {
        return this.f159847a.hashCode() + this.f159848b.f159832h.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f159847a != vVar.f159847a || !this.f159848b.equals(vVar.f159848b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    v(Object obj, t tVar) {
        this.f159847a = obj;
        this.f159848b = tVar;
    }
}
