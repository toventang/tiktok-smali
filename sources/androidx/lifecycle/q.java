package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class<?>, Integer> f3541a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends e>>> f3542b = new HashMap();

    static {
        Covode.recordClassIndex(1333);
    }

    private static boolean d(Class<?> cls) {
        if (cls == null || !l.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    private static int b(Class<?> cls) {
        Integer num = f3541a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int c2 = c(cls);
        f3541a.put(cls, Integer.valueOf(c2));
        return c2;
    }

    static k a(Object obj) {
        boolean z = obj instanceof k;
        boolean z2 = obj instanceof d;
        if (z) {
            if (z2) {
                return new FullLifecycleObserverAdapter((d) obj, (k) obj);
            }
        } else if (z2) {
            return new FullLifecycleObserverAdapter((d) obj, null);
        } else {
            if (!z) {
                Class<?> cls = obj.getClass();
                if (b(cls) != 2) {
                    return new ReflectiveGenericLifecycleObserver(obj);
                }
                List<Constructor<? extends e>> list = f3542b.get(cls);
                if (list.size() == 1) {
                    return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
                }
                e[] eVarArr = new e[list.size()];
                for (int i2 = 0; i2 < list.size(); i2++) {
                    eVarArr[i2] = a(list.get(i2), obj);
                }
                return new CompositeGeneratedAdaptersObserver(eVarArr);
            }
        }
        return (k) obj;
    }

    private static int c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends e> a2 = a(cls);
        if (a2 != null) {
            f3542b.put(cls, Collections.singletonList(a2));
            return 2;
        } else if (a.f3497a.a(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (d(superclass)) {
                if (b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3542b.get(superclass));
            }
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> cls2 : interfaces) {
                if (d(cls2)) {
                    if (b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3542b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3542b.put(cls, arrayList);
            return 2;
        }
    }

    private static Constructor<? extends e> a(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String str2 = canonicalName.replace(".", "_") + "_LifecycleAdapter";
            if (!str.isEmpty()) {
                str2 = str + "." + str2;
            }
            Constructor declaredConstructor = Class.forName(str2).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static e a(Constructor<? extends e> constructor, Object obj) {
        try {
            return (e) constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
