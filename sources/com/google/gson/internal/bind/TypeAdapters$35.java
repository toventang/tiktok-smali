package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;

/* access modifiers changed from: package-private */
public class TypeAdapters$35 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Class f54795a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f54796b;

    static {
        Covode.recordClassIndex(33973);
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f54795a.getName() + ",adapter=" + this.f54796b + "]";
    }

    TypeAdapters$35(Class cls, v vVar) {
        this.f54795a = cls;
        this.f54796b = vVar;
    }

    @Override // com.google.gson.w
    public final <T2> v<T2> create(f fVar, a<T2> aVar) {
        final Class<? super T> cls = aVar.rawType;
        if (!this.f54795a.isAssignableFrom(cls)) {
            return null;
        }
        return new v<T1>() {
            /* class com.google.gson.internal.bind.TypeAdapters$35.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33974);
            }

            @Override // com.google.gson.v
            public final T1 read(com.google.gson.c.a aVar) {
                T1 t1 = (T1) TypeAdapters$35.this.f54796b.read(aVar);
                if (t1 == null || cls.isInstance(t1)) {
                    return t1;
                }
                throw new t("Expected a " + cls.getName() + " but was " + t1.getClass().getName());
            }

            @Override // com.google.gson.v
            public final void write(c cVar, T1 t1) {
                TypeAdapters$35.this.f54796b.write(cVar, t1);
            }
        };
    }
}
