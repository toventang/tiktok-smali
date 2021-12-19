package com.ss.android.ugc.aweme.gsonopt;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;
import java.lang.reflect.Field;

public abstract class a<T> extends v<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final f f99081a;

    static {
        Covode.recordClassIndex(63118);
    }

    /* access modifiers changed from: protected */
    public abstract b a(String str);

    /* access modifiers changed from: protected */
    public abstract T a();

    @Override // com.google.gson.v
    public void write(c cVar, T t) {
    }

    public a(f fVar) {
        this.f99081a = fVar;
    }

    @Override // com.google.gson.v
    public T read(com.google.gson.c.a aVar) {
        Field a2;
        if (aVar.f() == b.NULL) {
            aVar.k();
            return null;
        }
        T a3 = a();
        try {
            aVar.c();
            while (aVar.e()) {
                b a4 = a(aVar.h());
                if (a4 == null || !a4.f99084c) {
                    aVar.o();
                } else {
                    Object read = a4.f99085d.read(aVar);
                    if ((read != null || !a4.f99086e) && (a2 = a4.a(a3)) != null) {
                        a2.setAccessible(true);
                        a2.set(a3, read);
                    }
                }
            }
            aVar.d();
            return a3;
        } catch (IllegalStateException e2) {
            throw new t(e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }

    /* access modifiers changed from: protected */
    public final v a(Object obj, Class cls) {
        return ((w) obj).create(this.f99081a, com.google.gson.b.a.get(cls));
    }
}
