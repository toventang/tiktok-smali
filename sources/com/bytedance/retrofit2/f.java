package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
public final class f extends c.a {

    /* renamed from: a  reason: collision with root package name */
    static final c.a f42504a = new f();

    f() {
    }

    static {
        Covode.recordClassIndex(26029);
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, q qVar) {
        if (w.a(type) != b.class) {
            return null;
        }
        final Type e2 = w.e(type);
        return new c<b<?>>() {
            /* class com.bytedance.retrofit2.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26030);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.retrofit2.c
            public final /* bridge */ /* synthetic */ b<?> a(b bVar) {
                return bVar;
            }

            @Override // com.bytedance.retrofit2.c
            public final Type a() {
                return e2;
            }
        };
    }
}
