package com.ss.android.ugc.aweme.net.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f112217a;

    /* renamed from: b  reason: collision with root package name */
    private Object f112218b;

    static {
        Covode.recordClassIndex(72126);
    }

    private a() {
        try {
            Constructor<?> declaredConstructor = Class.forName("android.os.SystemProperties").getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            this.f112218b = declaredConstructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
    }

    public static a a() {
        MethodCollector.i(2793);
        if (f112217a == null) {
            synchronized (a.class) {
                try {
                    if (f112217a == null) {
                        f112217a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2793);
                    throw th;
                }
            }
        }
        a aVar = f112217a;
        MethodCollector.o(2793);
        return aVar;
    }

    public final String a(String str) {
        Object obj = this.f112218b;
        if (obj == null) {
            return "";
        }
        try {
            Method method = obj.getClass().getMethod("get", String.class);
            method.setAccessible(true);
            String str2 = (String) method.invoke(this.f112218b, str);
            if (str2 == null) {
                return "";
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }
}
