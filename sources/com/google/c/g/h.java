package com.google.c.g;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Type> f54167a = new HashSet();

    static {
        Covode.recordClassIndex(33600);
    }

    /* access modifiers changed from: package-private */
    public void a(Class<?> cls) {
    }

    /* access modifiers changed from: package-private */
    public void a(GenericArrayType genericArrayType) {
    }

    /* access modifiers changed from: package-private */
    public void a(ParameterizedType parameterizedType) {
    }

    /* access modifiers changed from: package-private */
    public void a(TypeVariable<?> typeVariable) {
    }

    /* access modifiers changed from: package-private */
    public void a(WildcardType wildcardType) {
    }

    h() {
    }

    public final void a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f54167a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        a((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        a((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        a((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        a((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        a((GenericArrayType) type);
                    } else {
                        throw new AssertionError("Unknown type: ".concat(String.valueOf(type)));
                    }
                } catch (Throwable th) {
                    this.f54167a.remove(type);
                    throw th;
                }
            }
        }
    }
}
