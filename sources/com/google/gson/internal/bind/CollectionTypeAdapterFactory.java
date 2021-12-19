package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.b;
import com.google.gson.f;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.v;
import com.google.gson.w;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements w {

    /* renamed from: a  reason: collision with root package name */
    private final c f54743a;

    static {
        Covode.recordClassIndex(33950);
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f54743a = cVar;
    }

    static final class a<E> extends v<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final v<E> f54744a;

        /* renamed from: b  reason: collision with root package name */
        private final h<? extends Collection<E>> f54745b;

        static {
            Covode.recordClassIndex(33951);
        }

        @Override // com.google.gson.v
        public final /* synthetic */ Object read(com.google.gson.c.a aVar) {
            if (aVar.f() == b.NULL) {
                aVar.k();
                return null;
            }
            Collection collection = (Collection) this.f54745b.a();
            aVar.a();
            while (aVar.e()) {
                collection.add(this.f54744a.read(aVar));
            }
            aVar.b();
            return collection;
        }

        @Override // com.google.gson.v
        public final /* synthetic */ void write(com.google.gson.c.c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.f();
                return;
            }
            cVar.b();
            for (E e2 : collection) {
                this.f54744a.write(cVar, e2);
            }
            cVar.c();
        }

        public a(f fVar, Type type, v<E> vVar, h<? extends Collection<E>> hVar) {
            this.f54744a = new h(fVar, vVar, type);
            this.f54745b = hVar;
        }
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a2 = com.google.gson.internal.b.a(type, (Class<?>) cls);
        return new a(fVar, a2, fVar.a((com.google.gson.b.a) com.google.gson.b.a.get(a2)), this.f54743a.a(aVar));
    }
}
