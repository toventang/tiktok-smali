package com.bytedance.scene.d;

import com.bytedance.covode.number.Covode;

public final class e<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f42770a;

    /* renamed from: b  reason: collision with root package name */
    public final S f42771b;

    static {
        Covode.recordClassIndex(26262);
    }

    public final int hashCode() {
        return this.f42770a.hashCode() ^ this.f42771b.hashCode();
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f42770a) + " " + String.valueOf(this.f42771b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!b(eVar.f42770a, this.f42770a) || !b(eVar.f42771b, this.f42771b)) {
            return false;
        }
        return true;
    }

    private e(F f2, S s) {
        this.f42770a = f2;
        this.f42771b = s;
    }

    public static <A, B> e<A, B> a(A a2, B b2) {
        return new e<>(a2, b2);
    }

    private static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
