package com.bytedance.scene.d;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.c.g<String, Class<?>> f42772a = new androidx.c.g<>();

    static {
        Covode.recordClassIndex(26264);
    }

    public static boolean a(j jVar) {
        Class<?> cls = jVar.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return false;
        }
        int modifiers = cls.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
            return false;
        }
        if (cls.isMemberClass() && !Modifier.isStatic(modifiers)) {
            return false;
        }
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes().length > 0) {
                return false;
            }
        }
        return true;
    }

    public static class a extends RuntimeException {
        static {
            Covode.recordClassIndex(26265);
        }

        a(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static j a(Class<?> cls, Bundle bundle) {
        try {
            j jVar = (j) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(jVar.getClass().getClassLoader());
                jVar.r = bundle;
            }
            return jVar;
        } catch (InstantiationException e2) {
            throw new a("Unable to instantiate scene " + cls + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new a("Unable to instantiate scene " + cls + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new a("Unable to instantiate scene " + cls + ": could not find Scene constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new a("Unable to instantiate scene " + cls + ": calling Scene constructor caused an exception", e5);
        }
    }

    public static j a(Context context, String str, Bundle bundle) {
        androidx.c.g<String, Class<?>> gVar = f42772a;
        Class<?> cls = gVar.get(str);
        if (cls == null) {
            try {
                cls = context.getClassLoader().loadClass(str);
                gVar.put(str, cls);
            } catch (ClassNotFoundException e2) {
                throw new a("Unable to instantiate scene " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            }
        }
        return a(cls, bundle);
    }
}
