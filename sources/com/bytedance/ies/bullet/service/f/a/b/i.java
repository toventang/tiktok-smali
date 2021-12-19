package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.List;

public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?>> f32701a = new ArrayList();

    static {
        Covode.recordClassIndex(19447);
    }

    /* JADX DEBUG: Type inference failed for r2v0. Raw type applied. Possible types: java.lang.Class<T>, java.lang.Class<R> */
    @Override // com.bytedance.ies.bullet.service.f.a.b.f
    public final <T> void a(d<T> dVar) {
        l.c(dVar, "");
        for (T t : this.f32701a) {
            Class cls = (Class<T>) t.f32702a;
            if (cls != null) {
                T t2 = t.f32703b;
                if (t2 != null) {
                    dVar.a(cls, t2);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f32702a;

        /* renamed from: b  reason: collision with root package name */
        public final T f32703b;

        static {
            Covode.recordClassIndex(19448);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f32702a, aVar.f32702a) && l.a(this.f32703b, aVar.f32703b);
        }

        public final int hashCode() {
            Class<T> cls = this.f32702a;
            int i2 = 0;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            T t = this.f32703b;
            if (t != null) {
                i2 = t.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "ParamsItem(inputType=" + this.f32702a + ", input=" + ((Object) this.f32703b) + ")";
        }

        public a(Class<T> cls, T t) {
            l.c(cls, "");
            this.f32702a = cls;
            this.f32703b = t;
        }
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.f
    public final <T> void a(Class<T> cls, T t) {
        l.c(cls, "");
        a<?> aVar = new a<>(cls, t);
        if (!this.f32701a.contains(aVar)) {
            this.f32701a.add(aVar);
        }
    }
}
