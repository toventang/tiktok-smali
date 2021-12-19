package com.bytedance.o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f41687a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<e, Map<?, p<?>>> f41688b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<d, List<p<?>>> f41689c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<r, Set<p<?>>> f41690d;

    /* renamed from: e  reason: collision with root package name */
    public final c f41691e = new c();

    /* renamed from: f  reason: collision with root package name */
    public final d f41692f = new d();

    /* renamed from: g  reason: collision with root package name */
    public final b f41693g = new b();

    /* renamed from: h  reason: collision with root package name */
    private final f f41694h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<q, p<?>> f41695i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<? extends Object>, Object<?, ?>> f41696j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<q, a> f41697k = new LinkedHashMap();

    /* renamed from: l  reason: collision with root package name */
    private final Map<q, Object> f41698l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private final Map<q, Object> f41699m = new HashMap();

    static {
        Covode.recordClassIndex(25516);
    }

    public final void a() {
        for (q qVar : this.f41695i.keySet()) {
            a(qVar.f41737a, qVar.f41738b);
        }
        for (d dVar : this.f41689c.keySet()) {
            b bVar = this.f41693g;
            d dVar2 = new d(dVar.f41684a);
            q a2 = q.a(dVar2, null);
            ArrayList arrayList = new ArrayList();
            for (p<?> pVar : f.this.f41689c.get(dVar2)) {
                arrayList.add(f.this.a(a2, new k(pVar)));
            }
            Collections.unmodifiableList(arrayList);
        }
        for (r rVar : this.f41690d.keySet()) {
            this.f41692f.a(rVar.f41740a);
        }
        for (e eVar : this.f41688b.keySet()) {
            this.f41691e.a(eVar.f41685a, eVar.f41686b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f41707a;

        static {
            Covode.recordClassIndex(25520);
        }

        a(String str) {
            this.f41707a = str;
        }
    }

    public class b {
        static {
            Covode.recordClassIndex(25521);
        }

        public b() {
        }
    }

    public class c {
        static {
            Covode.recordClassIndex(25522);
        }

        public c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        public final <K, V> Map<K, V> a(Class<K> cls, Class<V> cls2) {
            e eVar = new e(cls, cls2);
            q a2 = q.a(eVar, null);
            HashMap hashMap = new HashMap();
            for (Map.Entry<?, p<?>> entry : f.this.f41688b.get(eVar).entrySet()) {
                hashMap.put(entry.getKey(), f.this.a(a2, new l(entry)));
            }
            return Collections.unmodifiableMap(hashMap);
        }
    }

    public class d {
        static {
            Covode.recordClassIndex(25523);
        }

        public d() {
        }

        public final <T> Set<T> a(Class<T> cls) {
            r rVar = new r(cls);
            q a2 = q.a(rVar, null);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (p<?> pVar : f.this.f41690d.get(rVar)) {
                linkedHashSet.add(f.this.a(a2, new m(pVar)));
            }
            return Collections.unmodifiableSet(linkedHashSet);
        }
    }

    public final <T> T a(Class<T> cls) {
        return (T) a((Type) cls, (String) null);
    }

    public final <T> T b(Class<T> cls) {
        return (T) b(cls, null);
    }

    public final <T> T c(Class<T> cls) {
        return (T) b(cls, null);
    }

    public final <T> p<T> a(q qVar) {
        f fVar = this;
        do {
            p<?> pVar = fVar.f41695i.get(qVar);
            if (pVar != null) {
                return (p<T>) pVar;
            }
            fVar = fVar.f41694h;
        } while (fVar != null);
        return null;
    }

    public final <T> T a(Class<T> cls, String str) {
        return (T) a((Type) cls, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.o.f */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T b(Type type, String str) {
        c hVar;
        if (type != f.class) {
            q a2 = q.a(type, str);
            if (this.f41687a) {
                hVar = new g(this, a2);
            } else {
                hVar = new h(a(a2));
            }
            return (T) a(a2, hVar);
        } else if (TextUtils.isEmpty(str)) {
            return this;
        } else {
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        }
    }

    public final <T> b<T> c(Type type, String str) {
        b<T> d2 = d(type, str);
        if (d2 != null) {
            return d2;
        }
        throw new com.bytedance.o.a.d(com.a.a("Dependency not found %s", new Object[]{q.a(type, str).toString()}));
    }

    public final <T> b<T> d(final Type type, final String str) {
        if (type == f.class) {
            if (TextUtils.isEmpty(str)) {
                return new b<T>() {
                    /* class com.bytedance.o.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(25517);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.o.b
                    public final T b() {
                        return (T) f.this;
                    }
                };
            }
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        } else if (this.f41687a) {
            return new b<T>() {
                /* class com.bytedance.o.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(25518);
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.o.b
                public final T b() {
                    q a2 = q.a(type, str);
                    return (T) f.this.a(a2, new i(this, a2));
                }
            };
        } else {
            final q a2 = q.a(type, str);
            final p<T> a3 = a(a2);
            if (a3 == null) {
                return null;
            }
            return new b<T>() {
                /* class com.bytedance.o.f.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(25519);
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.o.b
                public final T b() {
                    T t = (T) f.this.a(a2, new j(a3));
                    if (t != null) {
                        return t;
                    }
                    throw new com.bytedance.o.a.b("impossible");
                }
            };
        }
    }

    public final <T> T a(Type type, String str) {
        T t = (T) b(type, str);
        if (t != null) {
            return t;
        }
        if (this.f41697k.size() > 0) {
            Set<q> keySet = this.f41697k.keySet();
            StringBuilder sb = new StringBuilder();
            Iterator<q> it = keySet.iterator();
            while (it.hasNext()) {
                sb.append(it.next().a() + "\n ╚> ");
            }
            sb.append(q.a(type, str).a());
            throw new com.bytedance.o.a.d(com.a.a("Dependency not found: \n %s", new Object[]{sb.toString()}));
        }
        throw new com.bytedance.o.a.d(com.a.a("Dependency not found %s", new Object[]{type.toString()}));
    }

    public final synchronized <T> T a(q qVar, c<p<T>> cVar) {
        T t;
        MethodCollector.i(9040);
        if (!this.f41687a || (t = (T) this.f41699m.get(qVar)) == null) {
            T t2 = (T) this.f41698l.get(qVar);
            if (t2 != null) {
                MethodCollector.o(9040);
                return t2;
            }
            p<T> a2 = cVar.a();
            if (a2 == null) {
                MethodCollector.o(9040);
                return null;
            } else if (this.f41697k.containsKey(qVar)) {
                Set<q> keySet = this.f41697k.keySet();
                StringBuilder sb = new StringBuilder();
                for (q qVar2 : keySet) {
                    sb.append(qVar2.a() + " " + this.f41697k.get(qVar2).f41707a + "\n ╚> ");
                }
                sb.append(qVar.a());
                com.bytedance.o.a.a aVar = new com.bytedance.o.a.a(com.a.a("circle dependency: \n %s", new Object[]{sb.toString()}));
                MethodCollector.o(9040);
                throw aVar;
            } else {
                if (a2 instanceof s) {
                    this.f41697k.put(qVar, new a("singleton"));
                } else {
                    this.f41697k.put(qVar, new a(""));
                }
                T t3 = a2.get(this);
                if (t3 == null) {
                    NullPointerException nullPointerException = new NullPointerException("Provider should return nonnull value ".concat(String.valueOf(a2)));
                    MethodCollector.o(9040);
                    throw nullPointerException;
                } else if (!this.f41698l.containsKey(qVar)) {
                    if (a2 instanceof s) {
                        this.f41698l.put(qVar, t3);
                    }
                    a2.executeOnCreate(t3, this);
                    if (a2 instanceof s) {
                        this.f41698l.remove(qVar);
                        if (this.f41687a) {
                            this.f41699m.put(qVar, t3);
                        }
                    }
                    this.f41697k.remove(qVar);
                    MethodCollector.o(9040);
                    return t3;
                } else {
                    com.bytedance.o.a.b bVar = new com.bytedance.o.a.b("Why duplicate key!!!");
                    MethodCollector.o(9040);
                    throw bVar;
                }
            }
        } else {
            MethodCollector.o(9040);
            return t;
        }
    }

    public f(f fVar, boolean z, n... nVarArr) {
        this.f41694h = fVar;
        this.f41687a = z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        int i2 = 0;
        do {
            n nVar = nVarArr[0];
            for (Map.Entry<q, p<?>> entry : nVar.f41720a.entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                } else {
                    throw new com.bytedance.o.a.c("duplicate already contain " + entry.getKey().a() + " " + entry.getValue());
                }
            }
            for (Map.Entry<Class<? extends Object>, Object<?, ?>> entry2 : nVar.f41721b.entrySet()) {
                if (!linkedHashMap2.containsKey(entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                } else {
                    throw new com.bytedance.o.a.c("duplicate already contain " + entry2.getKey() + " " + entry2.getValue());
                }
            }
            for (Map.Entry<e, Map<?, p<?>>> entry3 : nVar.f41722c.entrySet()) {
                if (!linkedHashMap3.containsKey(entry3.getKey())) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                } else {
                    throw new com.bytedance.o.a.c("duplicate already contain " + entry3.getKey() + " " + entry3.getValue());
                }
            }
            for (Map.Entry<d, List<p<?>>> entry4 : nVar.f41724e.entrySet()) {
                if (!linkedHashMap4.containsKey(entry4.getKey())) {
                    linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                } else {
                    throw new com.bytedance.o.a.c("duplicate already contain " + entry4.getKey() + " " + entry4.getValue());
                }
            }
            for (Map.Entry<r, Set<p<?>>> entry5 : nVar.f41723d.entrySet()) {
                if (!linkedHashMap5.containsKey(entry5.getKey())) {
                    linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                } else {
                    throw new com.bytedance.o.a.c("duplicate already contain " + entry5.getKey() + " " + entry5.getValue());
                }
            }
            i2++;
        } while (i2 <= 0);
        this.f41695i = Collections.unmodifiableMap(linkedHashMap);
        this.f41696j = Collections.unmodifiableMap(linkedHashMap2);
        this.f41688b = Collections.unmodifiableMap(linkedHashMap3);
        this.f41689c = Collections.unmodifiableMap(linkedHashMap4);
        this.f41690d = Collections.unmodifiableMap(linkedHashMap5);
    }
}
