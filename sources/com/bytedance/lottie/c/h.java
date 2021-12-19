package com.bytedance.lottie.c;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;

public final class h<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f40654a;

    /* renamed from: b  reason: collision with root package name */
    public T f40655b;

    static {
        Covode.recordClassIndex(24933);
    }

    public final int hashCode() {
        int hashCode;
        T t = this.f40654a;
        int i2 = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        T t2 = this.f40655b;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f40654a) + " " + String.valueOf(this.f40655b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!a(eVar.f2397a, this.f40654a) || !a(eVar.f2398b, this.f40655b)) {
            return false;
        }
        return true;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
