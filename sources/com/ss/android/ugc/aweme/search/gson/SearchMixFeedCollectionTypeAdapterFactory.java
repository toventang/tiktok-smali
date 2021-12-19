package com.ss.android.ugc.aweme.search.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public final class SearchMixFeedCollectionTypeAdapterFactory implements w {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f121128a;

    static {
        Covode.recordClassIndex(78906);
    }

    static final class a<E> extends v<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final v<E> f121129a;

        static {
            Covode.recordClassIndex(78907);
        }

        @Override // com.google.gson.v
        public final /* synthetic */ Object read(com.google.gson.c.a aVar) {
            if (aVar.f() == b.NULL) {
                aVar.k();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            aVar.a();
            int i2 = 3;
            boolean z = SearchMixFeedCollectionTypeAdapterFactory.f121128a;
            boolean z2 = false;
            int i3 = 0;
            while (aVar.e()) {
                if (!z || !z2 || arrayList.size() < i2) {
                    E read = this.f121129a.read(aVar);
                    if (read instanceof h) {
                        E e2 = read;
                        if (arrayList.isEmpty() && e2.getFeedType() == 65280) {
                            i2 = 4;
                        }
                        if (z && arrayList.size() == i2 - 1 && aVar.e()) {
                            e2.r = true;
                        }
                        z2 = true;
                    }
                    arrayList.add(read);
                } else {
                    aVar.o();
                }
                i3++;
            }
            aVar.b();
            if (!arrayList.isEmpty()) {
                for (E e3 : arrayList) {
                    if (e3 instanceof h) {
                        e3.t = i3;
                    }
                }
            }
            return arrayList;
        }

        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.f();
                return;
            }
            cVar.b();
            for (E e2 : collection) {
                this.f121129a.write(cVar, e2);
            }
            cVar.c();
        }

        a(f fVar, Type type, v<E> vVar) {
            this.f121129a = new a(fVar, vVar, type);
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
        if (!h.class.equals(a2)) {
            return null;
        }
        return new a(fVar, a2, fVar.a((com.google.gson.b.a) com.google.gson.b.a.get(a2)));
    }
}
