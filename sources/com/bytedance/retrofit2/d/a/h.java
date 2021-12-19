package com.bytedance.retrofit2.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.q;
import com.bytedance.retrofit2.u;
import com.bytedance.retrofit2.w;
import f.a.aa;
import f.a.ab;
import f.a.b;
import f.a.n;
import f.a.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class h extends c.a {

    /* renamed from: a  reason: collision with root package name */
    private final aa f42502a = null;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f42503b;

    static {
        Covode.recordClassIndex(26026);
    }

    public static h a() {
        return new h(false);
    }

    public h(boolean z) {
        this.f42503b = z;
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, q qVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        Class<?> a2 = w.a(type);
        if (a2 == b.class) {
            return new g(Void.class, this.f42502a, this.f42503b, false, true, false, false, false, true);
        }
        if (a2 == f.a.h.class) {
            z = true;
        } else {
            z = false;
        }
        if (a2 == ab.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a2 == n.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a2 != t.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z) {
                str = "Flowable";
            } else if (z2) {
                str = "Single";
            } else if (z3) {
                str = "Maybe";
            } else {
                str = "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type a3 = w.a(0, (ParameterizedType) type);
        Class<?> a4 = w.a(a3);
        if (a4 == u.class) {
            if (a3 instanceof ParameterizedType) {
                a3 = w.a(0, (ParameterizedType) a3);
                z4 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (a4 != e.class) {
            z4 = false;
            z5 = true;
            return new g(a3, this.f42502a, this.f42503b, z4, z5, z, z2, z3, false);
        } else if (a3 instanceof ParameterizedType) {
            a3 = w.a(0, (ParameterizedType) a3);
            z4 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z5 = false;
        return new g(a3, this.f42502a, this.f42503b, z4, z5, z, z2, z3, false);
    }
}
