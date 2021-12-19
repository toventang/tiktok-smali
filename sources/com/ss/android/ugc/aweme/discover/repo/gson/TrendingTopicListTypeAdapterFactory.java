package com.ss.android.ugc.aweme.discover.repo.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;
import com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public final class TrendingTopicListTypeAdapterFactory implements w {

    /* renamed from: a  reason: collision with root package name */
    private int f82018a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f82019b = false;

    static {
        Covode.recordClassIndex(51053);
    }

    public TrendingTopicListTypeAdapterFactory(int i2) {
        this.f82018a = i2;
    }

    static final class a<E> extends v<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final v<E> f82020a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f82021b = false;

        /* renamed from: c  reason: collision with root package name */
        private int f82022c = Integer.MAX_VALUE;

        static {
            Covode.recordClassIndex(51054);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Collection<E> read(com.google.gson.c.a aVar) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (aVar.f() == b.NULL) {
                aVar.k();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            aVar.a();
            int i2 = 0;
            Boolean bool = false;
            if (this.f82021b.booleanValue()) {
                while (aVar.e()) {
                    int i3 = this.f82022c;
                    if (i3 == Integer.MAX_VALUE) {
                        aVar.o();
                    } else {
                        if (i3 > i2) {
                            aVar.o();
                            i2++;
                        }
                        arrayList.add(this.f82020a.read(aVar));
                    }
                }
            } else {
                E read = this.f82020a.read(aVar);
                if (read instanceof TrendingTopic) {
                    bool = true;
                    i2 = 1;
                }
                arrayList.add(read);
                while (aVar.e()) {
                    if (!bool.booleanValue()) {
                        read = this.f82020a.read(aVar);
                        arrayList.add(read);
                    } else if (this.f82022c <= i2) {
                        aVar.o();
                    } else {
                        try {
                            read = this.f82020a.read(aVar);
                            if (i2 == this.f82022c - 1 && aVar.e() && (read instanceof LazyDeserializeItem)) {
                                read.setNeedToBeSupplied(true);
                            }
                        } catch (t e2) {
                            e2.printStackTrace();
                        }
                        arrayList.add(read);
                        i2++;
                    }
                }
            }
            aVar.b();
            System.currentTimeMillis();
            valueOf.longValue();
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
                this.f82020a.write(cVar, e2);
            }
            cVar.c();
        }

        public a(f fVar, Type type, v<E> vVar, int i2) {
            this.f82022c = i2;
            this.f82020a = new b(fVar, vVar, type);
        }
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        System.currentTimeMillis();
        Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a2 = com.google.gson.internal.b.a(type, (Class<?>) cls);
        if (!TrendingTopic.class.equals(a2)) {
            return null;
        }
        a aVar2 = new a(fVar, a2, fVar.a((com.google.gson.b.a) com.google.gson.b.a.get(a2)), this.f82018a);
        System.currentTimeMillis();
        return aVar2;
    }
}
