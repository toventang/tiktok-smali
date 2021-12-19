package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.b;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public final class MapTypeAdapterFactory implements w {

    /* renamed from: a  reason: collision with root package name */
    final boolean f54747a;

    /* renamed from: b  reason: collision with root package name */
    private final c f54748b;

    static {
        Covode.recordClassIndex(33954);
    }

    final class a<K, V> extends v<Map<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        private final v<K> f54750b;

        /* renamed from: c  reason: collision with root package name */
        private final v<V> f54751c;

        /* renamed from: d  reason: collision with root package name */
        private final h<? extends Map<K, V>> f54752d;

        static {
            Covode.recordClassIndex(33955);
        }

        @Override // com.google.gson.v
        public final /* synthetic */ Object read(com.google.gson.c.a aVar) {
            b f2 = aVar.f();
            if (f2 == b.NULL) {
                aVar.k();
                return null;
            }
            Map map = (Map) this.f54752d.a();
            if (f2 == b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.e()) {
                    aVar.a();
                    K read = this.f54750b.read(aVar);
                    if (map.put(read, this.f54751c.read(aVar)) == null) {
                        aVar.b();
                    } else {
                        throw new t("duplicate key: ".concat(String.valueOf(read)));
                    }
                }
                aVar.b();
            } else {
                aVar.c();
                while (aVar.e()) {
                    e.f54868a.a(aVar);
                    K read2 = this.f54750b.read(aVar);
                    if (map.put(read2, this.f54751c.read(aVar)) != null) {
                        throw new t("duplicate key: ".concat(String.valueOf(read2)));
                    }
                }
                aVar.d();
            }
            return map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.gson.v<V> */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.google.gson.v<V> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(com.google.gson.c.c cVar, Object obj) {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                cVar.f();
            } else if (!MapTypeAdapterFactory.this.f54747a) {
                cVar.d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.a(String.valueOf(entry.getKey()));
                    this.f54751c.write(cVar, entry.getValue());
                }
                cVar.e();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z2 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    l jsonTree = this.f54750b.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if ((jsonTree instanceof i) || (jsonTree instanceof o)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 |= z;
                }
                if (z2) {
                    cVar.b();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.b();
                        k.a((l) arrayList.get(i2), cVar);
                        this.f54751c.write(cVar, arrayList2.get(i2));
                        cVar.c();
                        i2++;
                    }
                    cVar.c();
                    return;
                }
                cVar.d();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    l lVar = (l) arrayList.get(i2);
                    if (lVar instanceof r) {
                        r l2 = lVar.l();
                        if (l2.f54900a instanceof Number) {
                            str = String.valueOf(l2.b());
                        } else if (l2.f54900a instanceof Boolean) {
                            str = Boolean.toString(l2.h());
                        } else if (l2.f54900a instanceof String) {
                            str = l2.c();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (lVar instanceof n) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.a(str);
                    this.f54751c.write(cVar, arrayList2.get(i2));
                    i2++;
                }
                cVar.e();
            }
        }

        public a(f fVar, Type type, v<K> vVar, Type type2, v<V> vVar2, h<? extends Map<K, V>> hVar) {
            this.f54750b = new h(fVar, vVar, type);
            this.f54751c = new h(fVar, vVar2, type2);
            this.f54752d = hVar;
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z) {
        this.f54748b = cVar;
        this.f54747a = z;
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        Type[] actualTypeArguments;
        v<Boolean> vVar;
        Type type = aVar.type;
        if (!Map.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        Class<?> c2 = com.google.gson.internal.b.c(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type a2 = com.google.gson.internal.b.a(type, c2, (Class<?>) Map.class);
            actualTypeArguments = a2 instanceof ParameterizedType ? ((ParameterizedType) a2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            vVar = i.f54831f;
        } else {
            vVar = fVar.a((com.google.gson.b.a) com.google.gson.b.a.get(type2));
        }
        return new a(fVar, actualTypeArguments[0], vVar, actualTypeArguments[1], fVar.a((com.google.gson.b.a) com.google.gson.b.a.get(actualTypeArguments[1])), this.f54748b.a(aVar));
    }
}
