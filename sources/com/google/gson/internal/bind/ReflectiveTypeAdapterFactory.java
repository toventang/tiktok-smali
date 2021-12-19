package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.d;
import com.google.gson.e;
import com.google.gson.f;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements w {

    /* renamed from: a  reason: collision with root package name */
    public final e f54753a;

    /* renamed from: b  reason: collision with root package name */
    private final c f54754b;

    /* renamed from: c  reason: collision with root package name */
    private final Excluder f54755c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f54756d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.gson.internal.a.b f54757e = com.google.gson.internal.a.b.f54738a;

    static {
        Covode.recordClassIndex(33957);
    }

    public static final class a<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        private final h<T> f54765a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, b> f54766b;

        static {
            Covode.recordClassIndex(33959);
        }

        @Override // com.google.gson.v
        public final T read(com.google.gson.c.a aVar) {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.k();
                return null;
            }
            T a2 = this.f54765a.a();
            try {
                aVar.c();
                while (aVar.e()) {
                    b bVar = this.f54766b.get(aVar.h());
                    if (bVar == null || !bVar.f54769j) {
                        aVar.o();
                    } else {
                        bVar.a(aVar, a2);
                    }
                }
                aVar.d();
                return a2;
            } catch (IllegalStateException e2) {
                throw new t(e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        a(h<T> hVar, Map<String, b> map) {
            this.f54765a = hVar;
            this.f54766b = map;
        }

        @Override // com.google.gson.v
        public final void write(com.google.gson.c.c cVar, T t) {
            if (t == null) {
                cVar.f();
                return;
            }
            cVar.d();
            try {
                for (b bVar : this.f54766b.values()) {
                    if (bVar.a(t)) {
                        cVar.a(bVar.f54767h);
                        bVar.a(cVar, t);
                    }
                }
                cVar.e();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new a(this.f54754b.a(aVar), a(fVar, aVar, cls));
    }

    private static List a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, Field field) {
        try {
            com.google.gson.a.c cVar = (com.google.gson.a.c) field.getAnnotation(com.google.gson.a.c.class);
            if (cVar == null) {
                return Collections.singletonList(reflectiveTypeAdapterFactory.f54753a.a(field));
            }
            String a2 = cVar.a();
            String[] b2 = cVar.b();
            if (b2.length == 0) {
                return Collections.singletonList(a2);
            }
            ArrayList arrayList = new ArrayList(b2.length + 1);
            arrayList.add(a2);
            for (String str : b2) {
                arrayList.add(str);
            }
            return arrayList;
        } catch (IncompatibleClassChangeError e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
            return Collections.singletonList(reflectiveTypeAdapterFactory.f54753a.a(field));
        }
    }

    private boolean a(Field field, boolean z) {
        List<com.google.gson.b> list;
        com.google.gson.a.a aVar;
        Excluder excluder = this.f54755c;
        Class<?> type = field.getType();
        if (excluder.a(type) || excluder.a(type, z) || (excluder.f54727c & field.getModifiers()) != 0 || ((excluder.f54726b != -1.0d && !excluder.a((d) field.getAnnotation(d.class), (com.google.gson.a.e) field.getAnnotation(com.google.gson.a.e.class))) || field.isSynthetic() || ((excluder.f54729e && ((aVar = (com.google.gson.a.a) field.getAnnotation(com.google.gson.a.a.class)) == null || (!z ? !aVar.b() : !aVar.a()))) || ((!excluder.f54728d && Excluder.c(field.getType())) || Excluder.b(field.getType()))))) {
            return false;
        }
        if (z) {
            list = excluder.f54730f;
        } else {
            list = excluder.f54731g;
        }
        if (!list.isEmpty()) {
            com.google.gson.c cVar = new com.google.gson.c(field);
            for (com.google.gson.b bVar : list) {
                if (bVar.shouldSkipField(cVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static abstract class b {

        /* renamed from: h  reason: collision with root package name */
        final String f54767h;

        /* renamed from: i  reason: collision with root package name */
        final boolean f54768i;

        /* renamed from: j  reason: collision with root package name */
        final boolean f54769j;

        static {
            Covode.recordClassIndex(33960);
        }

        /* access modifiers changed from: package-private */
        public abstract void a(com.google.gson.c.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void a(com.google.gson.c.c cVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract boolean a(Object obj);

        protected b(String str, boolean z, boolean z2) {
            this.f54767h = str;
            this.f54768i = z;
            this.f54769j = z2;
        }
    }

    private Map<String, b> a(final f fVar, com.google.gson.b.a<?> aVar, Class<?> cls) {
        Class<?> cls2;
        com.google.gson.b.a<?> aVar2;
        Field[] fieldArr;
        int i2;
        int i3;
        Type type;
        boolean z;
        final boolean z2;
        final v<?> a2;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type2 = aVar.type;
        Class<?> cls3 = cls;
        com.google.gson.b.a<?> aVar3 = aVar;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            int length = declaredFields.length;
            boolean z3 = false;
            int i4 = 0;
            while (i4 < length) {
                final Field field = declaredFields[i4];
                boolean a3 = reflectiveTypeAdapterFactory.a(field, true);
                boolean a4 = reflectiveTypeAdapterFactory.a(field, z3);
                if (a3 || a4) {
                    reflectiveTypeAdapterFactory.f54757e.a(field);
                    Type a5 = com.google.gson.internal.b.a(aVar3.type, cls3, field.getGenericType());
                    List a6 = a(reflectiveTypeAdapterFactory, field);
                    int size = a6.size();
                    aVar2 = aVar3;
                    b bVar = null;
                    int i5 = 0;
                    while (i5 < size) {
                        String str = (String) a6.get(i5);
                        if (i5 != 0) {
                            z = false;
                        } else {
                            z = a3;
                        }
                        final com.google.gson.b.a<?> aVar4 = com.google.gson.b.a.get(a5);
                        final boolean containsKey = j.f54887a.containsKey(aVar4.rawType);
                        com.google.gson.a.b bVar2 = (com.google.gson.a.b) field.getAnnotation(com.google.gson.a.b.class);
                        if (bVar2 != null) {
                            a2 = JsonAdapterAnnotationTypeAdapterFactory.a(reflectiveTypeAdapterFactory.f54754b, fVar, aVar4, bVar2);
                            if (a2 != null) {
                                z2 = true;
                            }
                            z2 = false;
                            a2 = fVar.a((com.google.gson.b.a) aVar4);
                        } else {
                            z2 = false;
                            a2 = fVar.a((com.google.gson.b.a) aVar4);
                        }
                        b bVar3 = (b) linkedHashMap.put(str, new b(str, z, a4) {
                            /* class com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(33958);
                            }

                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
                            public final boolean a(Object obj) {
                                if (this.f54768i && field.get(obj) != obj) {
                                    return true;
                                }
                                return false;
                            }

                            /* access modifiers changed from: package-private */
                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
                            public final void a(com.google.gson.c.a aVar, Object obj) {
                                Object read = a2.read(aVar);
                                if (read != null || !containsKey) {
                                    field.set(obj, read);
                                }
                            }

                            /* access modifiers changed from: package-private */
                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
                            public final void a(com.google.gson.c.c cVar, Object obj) {
                                v hVar;
                                Object obj2 = field.get(obj);
                                if (z2) {
                                    hVar = a2;
                                } else {
                                    hVar = new h(fVar, a2, aVar4.type);
                                }
                                hVar.write(cVar, obj2);
                            }
                        });
                        if (bVar == null) {
                            bVar = bVar3;
                        }
                        i5++;
                        reflectiveTypeAdapterFactory = this;
                        cls3 = cls3;
                        a3 = z;
                        type2 = type2;
                        length = length;
                        size = size;
                        a6 = a6;
                        field = field;
                        i4 = i4;
                        declaredFields = declaredFields;
                    }
                    i2 = i4;
                    i3 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    if (bVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.f54767h);
                    }
                } else {
                    i2 = i4;
                    i3 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    aVar2 = aVar3;
                }
                i4 = i2 + 1;
                reflectiveTypeAdapterFactory = this;
                aVar3 = aVar2;
                cls3 = cls2;
                type2 = type;
                length = i3;
                declaredFields = fieldArr;
                z3 = false;
            }
            aVar3 = com.google.gson.b.a.get(com.google.gson.internal.b.a(aVar3.type, cls3, cls3.getGenericSuperclass()));
            cls3 = aVar3.rawType;
            reflectiveTypeAdapterFactory = this;
        }
        return linkedHashMap;
    }

    public ReflectiveTypeAdapterFactory(c cVar, e eVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f54754b = cVar;
        this.f54753a = eVar;
        this.f54755c = excluder;
        this.f54756d = jsonAdapterAnnotationTypeAdapterFactory;
    }
}
