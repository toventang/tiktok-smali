package com.bytedance.ugc.ugcwidget;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class UGCServiceManager {
    private static a callback;
    private static final Map<Class, Object> implMap = new ConcurrentHashMap();

    public interface a {
        static {
            Covode.recordClassIndex(27966);
        }

        Map<Class, Class> a();
    }

    static {
        Covode.recordClassIndex(27965);
    }

    public static void setCallback(a aVar) {
        callback = aVar;
    }

    private static <T> Constructor<T> checkClass(Class<T> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isAbstract(modifiers)) {
            throw new RuntimeException("UGCServiceManager DO NOT support abstract class with " + cls.getName());
        } else if (!Modifier.isInterface(modifiers)) {
            try {
                return cls.getConstructor(new Class[0]);
            } catch (Throwable unused) {
                throw new RuntimeException("UGCServiceManager NO matched public constructor found with" + cls.getName());
            }
        } else {
            throw new RuntimeException("UGCServiceManager DO NOT support interface class with " + cls.getName());
        }
    }

    public static <T> T getService(Class<T> cls) {
        Map<Class, Class> map;
        Map<Class, Object> map2 = implMap;
        T t = (T) map2.get(cls);
        if (t == null) {
            Constructor checkClass = checkClass(cls);
            a aVar = callback;
            Class cls2 = null;
            if (aVar != null) {
                map = aVar.a();
            } else {
                map = null;
            }
            if (map != null) {
                cls2 = map.get(cls);
            }
            if (cls2 != null) {
                checkClass = checkClass(cls2);
                if (!cls.isAssignableFrom(cls2)) {
                    throw new RuntimeException("UGCServiceManager " + cls2.getName() + " DO NOT IMPLEMENT " + cls.getName());
                }
            }
            try {
                t = (T) checkClass.newInstance(new Object[0]);
                map2.put(cls, t);
            } catch (Throwable th) {
                throw new RuntimeException("UGCServiceManager UNKNOWN exception found with " + cls.getName(), th);
            }
        }
        return t;
    }
}
