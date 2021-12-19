package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.c.b;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.d;
import com.google.gson.internal.bind.e;
import com.google.gson.internal.bind.g;
import com.google.gson.internal.bind.i;
import com.google.gson.internal.c;
import com.google.gson.internal.j;
import com.google.gson.internal.k;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class f {
    private static final com.google.gson.b.a<?> r = com.google.gson.b.a.get(Object.class);

    /* renamed from: a  reason: collision with root package name */
    final List<w> f54693a;

    /* renamed from: b  reason: collision with root package name */
    public final Excluder f54694b;

    /* renamed from: c  reason: collision with root package name */
    public final e f54695c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Type, h<?>> f54696d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f54697e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f54698f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f54699g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f54700h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f54701i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f54702j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f54703k;

    /* renamed from: l  reason: collision with root package name */
    final String f54704l;

    /* renamed from: m  reason: collision with root package name */
    final int f54705m;
    final int n;
    final u o;
    final List<w> p;
    final List<w> q;
    private final ThreadLocal<Map<com.google.gson.b.a<?>, a<?>>> s;
    private final Map<com.google.gson.b.a<?>, v<?>> t;
    private final c u;
    private final JsonAdapterAnnotationTypeAdapterFactory v;

    /* access modifiers changed from: package-private */
    public static class a<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        v<T> f54710a;

        static {
            Covode.recordClassIndex(33935);
        }

        a() {
        }

        @Override // com.google.gson.v
        public final T read(com.google.gson.c.a aVar) {
            v<T> vVar = this.f54710a;
            if (vVar != null) {
                return vVar.read(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.v
        public final void write(com.google.gson.c.c cVar, T t) {
            v<T> vVar = this.f54710a;
            if (vVar != null) {
                vVar.write(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final <T> v<T> a(com.google.gson.b.a<T> aVar) {
        v<T> vVar = (v<T>) this.t.get(aVar == null ? r : aVar);
        if (vVar != null) {
            return vVar;
        }
        Map<com.google.gson.b.a<?>, a<?>> map = this.s.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.s.set(map);
            z = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (w wVar : this.f54693a) {
                v<T> create = wVar.create(this, aVar);
                if (create != null) {
                    if (aVar3.f54710a == null) {
                        aVar3.f54710a = create;
                        this.t.put(aVar, create);
                        return create;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle ".concat(String.valueOf(aVar)));
        } finally {
            map.remove(aVar);
            if (z) {
                this.s.remove();
            }
        }
    }

    public final <T> v<T> a(w wVar, com.google.gson.b.a<T> aVar) {
        if (!this.f54693a.contains(wVar)) {
            wVar = this.v;
        }
        boolean z = false;
        for (w wVar2 : this.f54693a) {
            if (z) {
                v<T> create = wVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (wVar2 == wVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(aVar)));
    }

    public final <T> v<T> a(Class<T> cls) {
        return a((com.google.gson.b.a) com.google.gson.b.a.get((Class) cls));
    }

    public final l a(Object obj) {
        if (obj == null) {
            return n.f54897a;
        }
        return a(obj, obj.getClass());
    }

    public final l a(Object obj, Type type) {
        d dVar = new d();
        a(obj, type, dVar);
        return dVar.a();
    }

    public final void a(Object obj, Type type, com.google.gson.c.c cVar) {
        v a2 = a((com.google.gson.b.a) com.google.gson.b.a.get(type));
        boolean z = cVar.f54684b;
        cVar.f54684b = true;
        boolean z2 = cVar.f54685c;
        cVar.f54685c = this.f54700h;
        boolean z3 = cVar.f54686d;
        cVar.f54686d = this.f54697e;
        try {
            a2.write(cVar, obj);
            cVar.f54684b = z;
            cVar.f54685c = z2;
            cVar.f54686d = z3;
        } catch (IOException e2) {
            throw new m(e2);
        } catch (AssertionError e3) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
        } catch (Throwable th) {
            cVar.f54684b = z;
            cVar.f54685c = z2;
            cVar.f54686d = z3;
            throw th;
        }
    }

    public final String a(l lVar) {
        StringWriter stringWriter = new StringWriter();
        a(lVar, stringWriter);
        return stringWriter.toString();
    }

    public final <T> T a(String str, Class<T> cls) {
        return (T) j.a(cls).cast(a(str, (Type) cls));
    }

    public final <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) a((Reader) new StringReader(str), type);
    }

    public final <T> T a(Reader reader, Class<T> cls) {
        com.google.gson.c.a a2 = a(reader);
        Object a3 = a(a2, (Type) cls);
        a(a3, a2);
        return (T) j.a(cls).cast(a3);
    }

    public final <T> T a(com.google.gson.c.a aVar, Type type) {
        boolean z = aVar.f54668a;
        boolean z2 = true;
        aVar.f54668a = true;
        try {
            aVar.f();
            z2 = false;
            T read = a((com.google.gson.b.a) com.google.gson.b.a.get(type)).read(aVar);
            aVar.f54668a = z;
            return read;
        } catch (EOFException e2) {
            if (z2) {
                aVar.f54668a = z;
                return null;
            }
            throw new t(e2);
        } catch (IllegalStateException e3) {
            throw new t(e3);
        } catch (IOException e4) {
            throw new t(e4);
        } catch (AssertionError e5) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e5.getMessage(), e5);
        } catch (Throwable th) {
            aVar.f54668a = z;
            throw th;
        }
    }

    public final <T> T a(l lVar, Class<T> cls) {
        return (T) j.a(cls).cast(a(lVar, (Type) cls));
    }

    public final <T> T a(l lVar, Type type) {
        if (lVar == null) {
            return null;
        }
        return (T) a((com.google.gson.c.a) new com.google.gson.internal.bind.c(lVar), type);
    }

    static {
        Covode.recordClassIndex(33929);
    }

    public f() {
        this(Excluder.f54725a, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, u.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public final String toString() {
        return "{serializeNulls:" + this.f54697e + ",factories:" + this.f54693a + ",instanceCreators:" + this.u + "}";
    }

    public final String b(Object obj) {
        if (obj == null) {
            return a((l) n.f54897a);
        }
        return b(obj, obj.getClass());
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final com.google.gson.c.a a(Reader reader) {
        com.google.gson.c.a aVar = new com.google.gson.c.a(reader);
        aVar.f54668a = this.f54702j;
        return aVar;
    }

    public final com.google.gson.c.c a(Writer writer) {
        MethodCollector.i(6558);
        if (this.f54699g) {
            writer.write(")]}'\n");
        }
        com.google.gson.c.c cVar = new com.google.gson.c.c(writer);
        if (this.f54701i) {
            cVar.c("  ");
        }
        cVar.f54686d = this.f54697e;
        MethodCollector.o(6558);
        return cVar;
    }

    private <T> T a(Reader reader, Type type) {
        com.google.gson.c.a a2 = a(reader);
        T t2 = (T) a(a2, type);
        a(t2, a2);
        return t2;
    }

    public final String b(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    private void a(l lVar, Appendable appendable) {
        try {
            a(lVar, a(k.a(appendable)));
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    private void a(l lVar, com.google.gson.c.c cVar) {
        boolean z = cVar.f54684b;
        cVar.f54684b = true;
        boolean z2 = cVar.f54685c;
        cVar.f54685c = this.f54700h;
        boolean z3 = cVar.f54686d;
        cVar.f54686d = this.f54697e;
        try {
            k.a(lVar, cVar);
            cVar.f54684b = z;
            cVar.f54685c = z2;
            cVar.f54686d = z3;
        } catch (IOException e2) {
            throw new m(e2);
        } catch (AssertionError e3) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
        } catch (Throwable th) {
            cVar.f54684b = z;
            cVar.f54685c = z2;
            cVar.f54686d = z3;
            throw th;
        }
    }

    private static void a(Object obj, com.google.gson.c.a aVar) {
        if (obj != null) {
            try {
                if (aVar.f() != b.END_DOCUMENT) {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (com.google.gson.c.d e2) {
                throw new t(e2);
            } catch (IOException e3) {
                throw new m(e3);
            }
        }
    }

    private void a(Object obj, Type type, Appendable appendable) {
        try {
            a(obj, type, a(k.a(appendable)));
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    f(Excluder excluder, e eVar, Map<Type, h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, u uVar, String str, int i2, int i3, List<w> list, List<w> list2, List<w> list3) {
        final v r5;
        v r0;
        v r02;
        this.s = new ThreadLocal<>();
        this.t = new ConcurrentHashMap();
        this.f54694b = excluder;
        this.f54695c = eVar;
        this.f54696d = map;
        c cVar = new c(map);
        this.u = cVar;
        this.f54697e = z;
        this.f54698f = z2;
        this.f54699g = z3;
        this.f54700h = z4;
        this.f54701i = z5;
        this.f54702j = z6;
        this.f54703k = z7;
        this.o = uVar;
        this.f54704l = str;
        this.f54705m = i2;
        this.n = i3;
        this.p = list;
        this.q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(i.Y);
        arrayList.add(e.f54816a);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(i.D);
        arrayList.add(i.f54838m);
        arrayList.add(i.f54832g);
        arrayList.add(i.f54834i);
        arrayList.add(i.f54836k);
        if (uVar == u.DEFAULT) {
            r5 = i.t;
        } else {
            r5 = new v<Number>() {
                /* class com.google.gson.f.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(33932);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.gson.v
                public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
                    if (aVar.f() != b.NULL) {
                        return Long.valueOf(aVar.m());
                    }
                    aVar.k();
                    return null;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
                @Override // com.google.gson.v
                public final /* synthetic */ void write(com.google.gson.c.c cVar, Number number) {
                    if (number == null) {
                        cVar.f();
                    } else {
                        cVar.b(number.toString());
                    }
                }
            };
        }
        arrayList.add(i.a(Long.TYPE, Long.class, r5));
        Class cls = Double.TYPE;
        if (z7) {
            r0 = i.v;
        } else {
            r0 = new v<Number>() {
                /* class com.google.gson.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33930);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.gson.v
                public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
                    if (aVar.f() != b.NULL) {
                        return Double.valueOf(aVar.l());
                    }
                    aVar.k();
                    return null;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
                @Override // com.google.gson.v
                public final /* synthetic */ void write(com.google.gson.c.c cVar, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar.f();
                        return;
                    }
                    f.a(number2.doubleValue());
                    cVar.a(number2);
                }
            };
        }
        arrayList.add(i.a(cls, Double.class, r0));
        Class cls2 = Float.TYPE;
        if (z7) {
            r02 = i.u;
        } else {
            r02 = new v<Number>() {
                /* class com.google.gson.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(33931);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.gson.v
                public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
                    if (aVar.f() != b.NULL) {
                        return Float.valueOf((float) aVar.l());
                    }
                    aVar.k();
                    return null;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
                @Override // com.google.gson.v
                public final /* synthetic */ void write(com.google.gson.c.c cVar, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar.f();
                        return;
                    }
                    f.a((double) number2.floatValue());
                    cVar.a(number2);
                }
            };
        }
        arrayList.add(i.a(cls2, Float.class, r02));
        arrayList.add(i.x);
        arrayList.add(i.o);
        arrayList.add(i.q);
        arrayList.add(i.a(AtomicLong.class, new v<AtomicLong>() {
            /* class com.google.gson.f.AnonymousClass4 */

            static {
                Covode.recordClassIndex(33933);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ AtomicLong read(com.google.gson.c.a aVar) {
                return new AtomicLong(((Number) r5.read(aVar)).longValue());
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(com.google.gson.c.c cVar, AtomicLong atomicLong) {
                r5.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe()));
        arrayList.add(i.a(AtomicLongArray.class, new v<AtomicLongArray>() {
            /* class com.google.gson.f.AnonymousClass5 */

            static {
                Covode.recordClassIndex(33934);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ AtomicLongArray read(com.google.gson.c.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(Long.valueOf(((Number) r5.read(aVar)).longValue()));
                }
                aVar.b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(com.google.gson.c.c cVar, AtomicLongArray atomicLongArray) {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                cVar.b();
                int length = atomicLongArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    r5.write(cVar, Long.valueOf(atomicLongArray2.get(i2)));
                }
                cVar.c();
            }
        }.nullSafe()));
        arrayList.add(i.s);
        arrayList.add(i.z);
        arrayList.add(i.F);
        arrayList.add(i.H);
        arrayList.add(i.a(BigDecimal.class, i.B));
        arrayList.add(i.a(BigInteger.class, i.C));
        arrayList.add(i.J);
        arrayList.add(i.L);
        arrayList.add(i.P);
        arrayList.add(i.R);
        arrayList.add(i.W);
        arrayList.add(i.N);
        arrayList.add(i.f54829d);
        arrayList.add(com.google.gson.internal.bind.b.f54803a);
        arrayList.add(i.U);
        arrayList.add(g.f54821a);
        arrayList.add(com.google.gson.internal.bind.f.f54819a);
        arrayList.add(i.S);
        arrayList.add(com.google.gson.internal.bind.a.f54799a);
        arrayList.add(i.f54827b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.v = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(i.Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, eVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f54693a = Collections.unmodifiableList(arrayList);
    }
}
