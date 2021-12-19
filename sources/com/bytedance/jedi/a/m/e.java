package com.bytedance.jedi.a.m;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public final class e {

    /* renamed from: e  reason: collision with root package name */
    static Class<?> f39324e;

    /* renamed from: f  reason: collision with root package name */
    static Class<?> f39325f;

    /* renamed from: g  reason: collision with root package name */
    static Class<?> f39326g;

    /* renamed from: h  reason: collision with root package name */
    static Method f39327h;

    /* renamed from: i  reason: collision with root package name */
    static Method f39328i;

    /* renamed from: j  reason: collision with root package name */
    static Method f39329j;

    /* renamed from: a  reason: collision with root package name */
    public final int f39330a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39331b;

    /* renamed from: c  reason: collision with root package name */
    public final int f39332c;

    /* renamed from: d  reason: collision with root package name */
    public final int f39333d;

    /* renamed from: k  reason: collision with root package name */
    private final int f39334k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, b> f39335l = new IdentityHashMap();

    /* renamed from: m  reason: collision with root package name */
    private final Map<Object, Object> f39336m = new IdentityHashMap();
    private final Map<Class<?>, a> n = new IdentityHashMap();
    private final Deque<Object> o = new ArrayDeque(16384);
    private long p;
    private long q;

    public interface d {
        static {
            Covode.recordClassIndex(24131);
        }

        int a();

        int b();

        int c();

        int d();

        int e();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f39342a = new d() {
            /* class com.bytedance.jedi.a.m.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(24127);
            }

            @Override // com.bytedance.jedi.a.m.e.d
            public final int a() {
                return 40;
            }

            @Override // com.bytedance.jedi.a.m.e.d
            public final int b() {
                return 24;
            }

            @Override // com.bytedance.jedi.a.m.e.d
            public final int c() {
                return 8;
            }

            @Override // com.bytedance.jedi.a.m.e.d
            public final int d() {
                return 8;
            }

            @Override // com.bytedance.jedi.a.m.e.d
            public final int e() {
                return 8;
            }
        };

        static {
            Covode.recordClassIndex(24130);
        }
    }

    static {
        Covode.recordClassIndex(24125);
        try {
            f39324e = Class.forName("java.lang.management.ManagementFactory");
            f39325f = Class.forName("java.lang.management.MemoryPoolMXBean");
            f39326g = Class.forName("java.lang.management.MemoryUsage");
            f39327h = f39324e.getMethod("getMemoryPoolMXBeans", new Class[0]);
            f39328i = f39325f.getMethod("getUsage", new Class[0]);
            f39329j = f39326g.getMethod("getMax", new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f39337a;

        static {
            Covode.recordClassIndex(24128);
        }

        a(Object[] objArr) {
            this.f39337a = objArr;
        }

        public final void a(e eVar) {
            Object[] objArr = this.f39337a;
            for (Object obj : objArr) {
                if (obj != null) {
                    eVar.b(obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(Object obj) {
        if (obj != null) {
            this.o.addLast(obj);
        }
    }

    public final b a(Class<?> cls) {
        b bVar = this.f39335l.get(cls);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(cls);
        this.f39335l.put(cls, bVar2);
        return bVar2;
    }

    private void d(Object obj) {
        Class<?> cls = obj.getClass();
        Class<?> componentType = cls.getComponentType();
        int length = Array.getLength(obj);
        if (componentType.isPrimitive()) {
            a(cls, length, b(componentType));
            return;
        }
        a(cls, length, (long) this.f39332c);
        if (length == 0) {
            return;
        }
        if (length != 1) {
            c(new a((Object[]) obj));
        } else {
            c(Array.get(obj, 0));
        }
    }

    public final void b(Object obj) {
        if (!this.f39336m.containsKey(obj)) {
            Class<?> cls = obj.getClass();
            if (cls == a.class) {
                ((a) obj).a(this);
                return;
            }
            this.f39336m.put(obj, obj);
            if (cls.isArray()) {
                d(obj);
            } else {
                a(cls).a(obj, this);
            }
        }
    }

    public e(d dVar) {
        Objects.requireNonNull(dVar);
        this.f39334k = dVar.a();
        this.f39330a = dVar.b();
        this.f39331b = dVar.c();
        this.f39332c = dVar.d();
        this.f39333d = dVar.e();
    }

    public static long b(Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Byte.TYPE) {
            return 1;
        }
        if (cls == Character.TYPE || cls == Short.TYPE) {
            return 2;
        }
        if (cls == Integer.TYPE || cls == Float.TYPE) {
            return 4;
        }
        if (cls == Long.TYPE || cls == Double.TYPE) {
            return 8;
        }
        throw new AssertionError("Encountered unexpected primitive type " + cls.getName());
    }

    public final synchronized long[] a(Object obj) {
        MethodCollector.i(349);
        this.n.clear();
        while (true) {
            try {
                b(obj);
                if (this.o.isEmpty()) {
                } else {
                    if (this.q == 0) {
                        this.q = this.p;
                    }
                    obj = this.o.removeFirst();
                }
            } finally {
                this.f39336m.clear();
                this.o.clear();
                this.p = 0;
                this.q = 0;
                MethodCollector.o(349);
            }
        }
        return new long[]{this.p, this.q};
    }

    static long a(long j2, int i2) {
        long j3 = (long) i2;
        return (((j2 + j3) - 1) / j3) * j3;
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: b  reason: collision with root package name */
        private final long f39339b;

        /* renamed from: c  reason: collision with root package name */
        private final long f39340c;

        /* renamed from: d  reason: collision with root package name */
        private final Field[] f39341d;

        static {
            Covode.recordClassIndex(24129);
        }

        /* access modifiers changed from: package-private */
        public final void a(Object obj, e eVar) {
            eVar.a(obj.getClass(), this.f39339b);
            b(obj, eVar);
        }

        private void b(Object obj, e eVar) {
            Field[] fieldArr = this.f39341d;
            for (Field field : fieldArr) {
                try {
                    eVar.c(field.get(obj));
                } catch (IllegalAccessException e2) {
                    AssertionError assertionError = new AssertionError("Unexpected denial of access to ".concat(String.valueOf(field)));
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            }
        }

        public b(Class<?> cls) {
            long j2;
            LinkedList linkedList = new LinkedList();
            Field[] declaredFields = cls.getDeclaredFields();
            long j3 = 0;
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    Class<?> type = field.getType();
                    if (type.isPrimitive()) {
                        j2 = e.b(type);
                    } else {
                        field.setAccessible(true);
                        linkedList.add(field);
                        j2 = (long) e.this.f39332c;
                    }
                    j3 += j2;
                }
            }
            Class<? super Object> superclass = cls.getSuperclass();
            if (!(superclass == null || superclass == Object.class)) {
                b a2 = e.this.a((Class<?>) superclass);
                j3 += e.a(a2.f39340c, e.this.f39333d);
                linkedList.addAll(Arrays.asList(a2.f39341d));
            }
            this.f39340c = j3;
            this.f39339b = e.a(((long) e.this.f39330a) + j3, e.this.f39331b);
            this.f39341d = (Field[]) linkedList.toArray(new Field[linkedList.size()]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Class<?> cls, long j2) {
        a aVar = this.n.get(cls);
        if (aVar == null) {
            aVar = new a(cls);
            this.n.put(cls, aVar);
        }
        aVar.a(j2);
        this.p += j2;
    }

    private void a(Class<?> cls, int i2, long j2) {
        a(cls, a(((long) this.f39334k) + (((long) i2) * j2), this.f39331b));
    }
}
