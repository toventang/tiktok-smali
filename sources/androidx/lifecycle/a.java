package androidx.lifecycle;

import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class a {

    /* renamed from: a  reason: collision with root package name */
    static a f3497a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, C0049a> f3498b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f3499c = new HashMap();

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f3502a;

        /* renamed from: b  reason: collision with root package name */
        final Method f3503b;

        static {
            Covode.recordClassIndex(1292);
        }

        public final int hashCode() {
            return (this.f3502a * 31) + this.f3503b.getName().hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3502a != bVar.f3502a || !this.f3503b.getName().equals(bVar.f3503b.getName())) {
                return false;
            }
            return true;
        }

        b(int i2, Method method) {
            this.f3502a = i2;
            this.f3503b = method;
            method.setAccessible(true);
        }
    }

    static {
        Covode.recordClassIndex(1290);
    }

    a() {
    }

    private static Method[] c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final C0049a b(Class<?> cls) {
        C0049a aVar = this.f3498b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Class<?> cls) {
        Boolean bool = this.f3499c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method method : c2) {
            if (method.getAnnotation(v.class) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f3499c.put(cls, false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static class C0049a {

        /* renamed from: a  reason: collision with root package name */
        final Map<i.a, List<b>> f3500a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, i.a> f3501b;

        static {
            Covode.recordClassIndex(1291);
        }

        C0049a(Map<b, i.a> map) {
            this.f3501b = map;
            for (Map.Entry<b, i.a> entry : map.entrySet()) {
                i.a value = entry.getValue();
                List<b> list = this.f3500a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3500a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        static void a(List<b> list, m mVar, i.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    try {
                        int i2 = bVar.f3502a;
                        if (i2 == 0) {
                            bVar.f3503b.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            bVar.f3503b.invoke(obj, mVar);
                        } else if (i2 == 2) {
                            bVar.f3503b.invoke(obj, mVar, aVar);
                        }
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                }
            }
        }
    }

    private C0049a a(Class<?> cls, Method[] methodArr) {
        int i2;
        C0049a b2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b2 = b(superclass)) == null)) {
            hashMap.putAll(b2.f3501b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, i.a> entry : b(cls2).f3501b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            v vVar = (v) method.getAnnotation(v.class);
            if (vVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(m.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                i.a a2 = vVar.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(i.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a2 == i.a.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i2, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0049a aVar = new C0049a(hashMap);
        this.f3498b.put(cls, aVar);
        this.f3499c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private static void a(Map<b, i.a> map, b bVar, i.a aVar, Class<?> cls) {
        i.a aVar2 = map.get(bVar);
        if (aVar2 == null) {
            map.put(bVar, aVar);
        } else if (aVar != aVar2) {
            throw new IllegalArgumentException("Method " + bVar.f3503b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        }
    }
}
