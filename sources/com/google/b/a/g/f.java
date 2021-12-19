package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.b.a.f.a.a.a.a.b;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Boolean f53628a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f53629b;

    /* renamed from: c  reason: collision with root package name */
    public static final Character f53630c;

    /* renamed from: d  reason: collision with root package name */
    public static final Byte f53631d;

    /* renamed from: e  reason: collision with root package name */
    public static final Short f53632e;

    /* renamed from: f  reason: collision with root package name */
    public static final Integer f53633f;

    /* renamed from: g  reason: collision with root package name */
    public static final Float f53634g;

    /* renamed from: h  reason: collision with root package name */
    public static final Long f53635h;

    /* renamed from: i  reason: collision with root package name */
    public static final Double f53636i;

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f53637j;

    /* renamed from: k  reason: collision with root package name */
    public static final BigDecimal f53638k;

    /* renamed from: l  reason: collision with root package name */
    public static final h f53639l;

    /* renamed from: m  reason: collision with root package name */
    private static final ConcurrentHashMap<Class<?>, Object> f53640m;

    static {
        Covode.recordClassIndex(33182);
        Boolean bool = new Boolean(true);
        f53628a = bool;
        String str = new String();
        f53629b = str;
        Character ch = new Character(0);
        f53630c = ch;
        Byte b2 = new Byte((byte) 0);
        f53631d = b2;
        Short sh = new Short((short) 0);
        f53632e = sh;
        Integer num = new Integer(0);
        f53633f = num;
        Float f2 = new Float(0.0f);
        f53634g = f2;
        Long l2 = new Long(0);
        f53635h = l2;
        Double d2 = new Double(0.0d);
        f53636i = d2;
        BigInteger bigInteger = new BigInteger("0");
        f53637j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        f53638k = bigDecimal;
        h hVar = new h(0);
        f53639l = hVar;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        f53640m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b2);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f2);
        concurrentHashMap.put(Long.class, l2);
        concurrentHashMap.put(Double.class, d2);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(h.class, hVar);
    }

    public static boolean a(Object obj) {
        if (obj == null || obj != f53640m.get(obj.getClass())) {
            return false;
        }
        return true;
    }

    public static <T> T a(Class<?> cls) {
        MethodCollector.i(3535);
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = f53640m;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (concurrentHashMap) {
                try {
                    t = concurrentHashMap.get(cls);
                    if (t == null) {
                        int i2 = 0;
                        if (cls.isArray()) {
                            Class<?> cls2 = cls;
                            do {
                                cls2 = cls2.getComponentType();
                                i2++;
                            } while (cls2.isArray());
                            t = (T) Array.newInstance(cls2, new int[i2]);
                        } else if (cls.isEnum()) {
                            i a2 = d.a(cls, false).a(null);
                            Object[] objArr = {cls};
                            if (a2 != null) {
                                t = (T) a2.b();
                            } else {
                                NullPointerException nullPointerException = new NullPointerException(b.a("enum missing constant with @NullValue annotation: %s", objArr));
                                MethodCollector.o(3535);
                                throw nullPointerException;
                            }
                        } else {
                            t = (T) n.a((Class) cls);
                        }
                        f53640m.put(cls, t);
                    }
                } finally {
                    MethodCollector.o(3535);
                }
            }
        }
        return t;
    }

    public static <T> T b(T t) {
        T t2;
        if (t == null || a((Type) t.getClass())) {
            return t;
        }
        if (t instanceof j) {
            return (T) t.clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof a) {
            t2 = (T) t.clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = t.toArray();
            a(array, array);
            return (T) Arrays.asList(array);
        } else {
            t2 = (T) n.a((Class) cls);
        }
        a((Object) t, (Object) t2);
        return t2;
    }

    public static boolean a(Type type) {
        if (!(type instanceof Class)) {
            return false;
        }
        Class cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == h.class || cls == Boolean.class) {
            return true;
        }
        return false;
    }

    public static Type a(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = n.a((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type a2 = n.a(list, (TypeVariable<?>) ((TypeVariable) type));
            if (a2 != null) {
                type = a2;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }

    public static Object a(Type type, String str) {
        Class cls;
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            cls = null;
        }
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(String.valueOf(cls));
                throw new IllegalArgumentException(new StringBuilder(valueOf.length() + 37).append("expected type Character/char but got ").append(valueOf).toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == h.class) {
                    return h.parseRfc3339(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    return d.a(cls, false).a(str).b();
                }
            }
        }
        String valueOf2 = String.valueOf(String.valueOf(type));
        throw new IllegalArgumentException(new StringBuilder(valueOf2.length() + 35).append("expected primitive class, but got: ").append(valueOf2).toString());
    }

    public static void a(Object obj, Object obj2) {
        boolean z;
        d dVar;
        Object a2;
        Class<?> cls = obj.getClass();
        boolean z2 = true;
        int i2 = 0;
        if (cls == obj2.getClass()) {
            z = true;
        } else {
            z = false;
        }
        b.a(z);
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z2 = false;
            }
            b.a(z2);
            for (Object obj3 : n.a(obj)) {
                Array.set(obj2, i2, b(obj3));
                i2++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object obj4 : collection) {
                collection2.add(b(obj4));
            }
        } else {
            boolean isAssignableFrom = j.class.isAssignableFrom(cls);
            if (isAssignableFrom) {
                dVar = ((j) obj).f53661i;
            } else if (!Map.class.isAssignableFrom(cls)) {
                dVar = d.a(cls, false);
            } else if (a.class.isAssignableFrom(cls)) {
                a aVar = (a) obj2;
                a aVar2 = (a) obj;
                int size = aVar2.size();
                while (i2 < size) {
                    aVar.a(i2, b(aVar2.a(i2)));
                    i2++;
                }
                return;
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), b(entry.getValue()));
                }
                return;
            }
            for (String str : dVar.f53624c) {
                i a3 = dVar.a(str);
                if (!a3.a() && ((!isAssignableFrom || !a3.f53657a) && (a2 = a3.a(obj)) != null)) {
                    a3.a(obj2, b(a2));
                }
            }
        }
    }
}
