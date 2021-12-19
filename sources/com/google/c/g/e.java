package com.google.c.g;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class e<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    final TypeVariable<?> f54132a;

    static {
        Covode.recordClassIndex(33572);
    }

    public final int hashCode() {
        return this.f54132a.hashCode();
    }

    public String toString() {
        return this.f54132a.toString();
    }

    protected e() {
        Type a2 = a();
        k.a(a2 instanceof TypeVariable, "%s should be a type variable.", a2);
        this.f54132a = (TypeVariable) a2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f54132a.equals(((e) obj).f54132a);
        }
        return false;
    }
}
