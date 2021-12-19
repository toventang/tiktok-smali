package com.bytedance.common.utility.collection;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class e<T> extends WeakReference<T> {

    /* renamed from: a  reason: collision with root package name */
    int f26929a;

    static {
        Covode.recordClassIndex(15895);
    }

    public final int hashCode() {
        return this.f26929a;
    }

    public e(T t) {
        super(t);
        int hashCode;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        this.f26929a = hashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        Object obj2 = super.get();
        Object obj3 = ((e) obj).get();
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj2 == obj3) {
            return true;
        }
        return false;
    }
}
